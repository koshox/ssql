package com.kosho.ssql.elasticsearch.sharding;

import com.google.common.base.Suppliers;
import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.elasticsearch.sharding.condition.ShardingConditionParser;
import com.kosho.ssql.elasticsearch.sharding.condition.ShardingConditionParserFactory;
import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingConditions;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingRuleManager;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;
import com.kosho.ssql.elasticsearch.sharding.route.ShardingConditionRouter;
import com.kosho.ssql.elasticsearch.sharding.route.ShardingConditionRouterFactory;
import com.kosho.ssql.elasticsearch.sharding.route.ShardingRouteResult;

import java.util.function.Supplier;

/**
 * Ssql编译Eql分片路由
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class Ssql2EqlShardingRouter {
    private static final Supplier<Ssql2EqlShardingRouter> INSTANCE = Suppliers.memoize(Ssql2EqlShardingRouter::new);

    private Ssql2EqlShardingRouter() {}

    public static Ssql2EqlShardingRouter getInstance() {
        return INSTANCE.get();
    }

    /**
     * ssql表达式分片路由
     *
     * @param ssql ssql表达式
     * @return 路由结果
     */
    public ShardingRouteResult route(Ssql ssql) {
        ShardingTableRule shardingTableRule = ShardingRuleManager.getInstance().getRule(ssql);
        if (shardingTableRule == null) {
            String tableName = ssql.getFrom().getTables().get(0).getName();
            ShardingTable shardingTable = new ShardingTable();
            shardingTable.setTableName(tableName);
            return ShardingRouteResult.of(shardingTable);
        }

        ShardingConditionParser<Ssql> conditionParser = ShardingConditionParserFactory.getSsqlConditionParser(ssql);
        ShardingConditions shardingConditions = conditionParser.parse(ssql);

        ShardingConditionRouter conditionRouter = ShardingConditionRouterFactory.getSsqlShardingConditionRouter(ssql);
        return conditionRouter.route(shardingConditions, shardingTableRule);
    }
}
