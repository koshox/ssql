package com.kosho.ssql.elasticsearch.sharding;

import com.google.common.base.Suppliers;
import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.elasticsearch.sharding.condition.ShardingConditionParser;
import com.kosho.ssql.elasticsearch.sharding.condition.ShardingConditionParserFactory;
import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingConditions;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingRuleManager;
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

    public ShardingRouteResult route(Ssql ssql) {
        ShardingConditionParser<Ssql> conditionParser = ShardingConditionParserFactory.getSsqlConditionParser(ssql);
        ShardingConditions shardingConditions = conditionParser.parse(ssql);

        // 分片条件为False，不再路由
        if (shardingConditions.isAlwaysFalse()) {
            return ShardingRouteResult.empty();
        }

        // 分片条件为空，返回所有分片
        ShardingTableRule shardingTableRule = ShardingRuleManager.getInstance().getRule(ssql);
        if (shardingConditions.isEmpty()) {
            return ShardingRouteResult.of(shardingTableRule.getShardingTables());
        }

        ShardingConditionRouter conditionRouter = ShardingConditionRouterFactory.getSsqlShardingConditionRouter(ssql);
        return conditionRouter.route(shardingConditions, shardingTableRule);
    }
}
