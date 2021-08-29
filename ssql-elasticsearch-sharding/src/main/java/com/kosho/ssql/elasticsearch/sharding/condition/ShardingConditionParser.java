package com.kosho.ssql.elasticsearch.sharding.condition;

import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingConditions;

/**
 * 分片条件解析器
 *
 * @author Kosho
 * @since 2021-08-27
 */
public interface ShardingConditionParser<T> {
    ShardingConditions parse(T context);
}
