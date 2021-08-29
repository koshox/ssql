package com.kosho.ssql.elasticsearch.sharding.route;

import com.kosho.ssql.core.dsl.semantic.Ssql;

/**
 * 分片条件路由工厂
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingConditionRouterFactory {
    public static ShardingConditionRouter getSsqlShardingConditionRouter(Ssql ssql) {
        return StandardShardingConditionRouter.INSTANCE;
    }
}
