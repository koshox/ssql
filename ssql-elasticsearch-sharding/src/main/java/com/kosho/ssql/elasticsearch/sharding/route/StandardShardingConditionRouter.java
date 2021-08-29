package com.kosho.ssql.elasticsearch.sharding.route;

import com.google.common.collect.Range;
import com.kosho.ssql.elasticsearch.sharding.algorithm.ShardingAlgorithm;
import com.kosho.ssql.elasticsearch.sharding.algorithm.ShardingAlgorithmFactory;
import com.kosho.ssql.elasticsearch.sharding.condition.value.ListShardingCondition;
import com.kosho.ssql.elasticsearch.sharding.condition.value.RangeShardingCondition;
import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingCondition;
import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingConditions;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 标准分片条件路由
 *
 * @author Kosho
 * @since 2021-08-27
 */
class StandardShardingConditionRouter implements ShardingConditionRouter {
    static ShardingConditionRouter INSTANCE = new StandardShardingConditionRouter();

    @Override
    public ShardingRouteResult route(ShardingConditions shardingConditions, ShardingTableRule shardingTableRule) {
        // 分片条件为False，不再路由
        if (shardingConditions.isAlwaysFalse()) {
            return ShardingRouteResult.empty();
        }

        // 分片条件为空，返回所有分片
        if (shardingConditions.isEmpty()) {
            return ShardingRouteResult.of(shardingTableRule.getShardingTables());
        }

        String algorithmName = shardingTableRule.getShardingStrategy().getShardingAlgorithm();
        ShardingAlgorithm shardingAlgorithm = ShardingAlgorithmFactory.getShardingAlgorithm(algorithmName);

        List<ShardingTable> result = new ArrayList<>();
        for (ShardingCondition condition : shardingConditions.getConditions()) {
            route(shardingTableRule, condition, result, shardingAlgorithm);
        }

        return ShardingRouteResult.of(result);
    }

    private void route(ShardingTableRule shardingTableRule, ShardingCondition condition, List<ShardingTable> result,
                       ShardingAlgorithm shardingAlgorithm) {
        if (condition instanceof ListShardingCondition) {
            routeByListCondition(shardingTableRule, (ListShardingCondition) condition, result, shardingAlgorithm);
        } else if (condition instanceof RangeShardingCondition) {
            routeByRangeCondition(shardingTableRule, (RangeShardingCondition) condition, result, shardingAlgorithm);
        }
    }

    private void routeByListCondition(ShardingTableRule shardingTableRule, ListShardingCondition condition,
                                      List<ShardingTable> result, ShardingAlgorithm shardingAlgorithm) {
        List<Comparable<?>> shardingValues = condition.getValues();
        for (Comparable<?> shardingValue : shardingValues) {
            Optional<ShardingTable> table = shardingAlgorithm.doPreciseSharding(shardingTableRule, shardingValue);
            table.ifPresent(result::add);
        }
    }

    private void routeByRangeCondition(ShardingTableRule shardingTableRule, RangeShardingCondition condition,
                                       List<ShardingTable> result, ShardingAlgorithm shardingAlgorithm) {
        Range<Comparable<?>> shardingRange = condition.getRange();
        List<ShardingTable> tables = shardingAlgorithm.doRangeSharding(shardingTableRule, shardingRange);
        result.addAll(tables);
    }
}
