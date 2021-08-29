package com.kosho.ssql.elasticsearch.sharding.route;

import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingConditions;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;

/**
 * 分片条件路由器
 *
 * @author Kosho
 * @since 2021-08-27
 */
public interface ShardingConditionRouter {
    ShardingRouteResult route(ShardingConditions shardingConditions, ShardingTableRule shardingTableRule);
}
