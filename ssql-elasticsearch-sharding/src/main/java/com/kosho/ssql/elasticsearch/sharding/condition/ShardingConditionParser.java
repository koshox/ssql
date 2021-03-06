package com.kosho.ssql.elasticsearch.sharding.condition;

import com.kosho.ssql.elasticsearch.sharding.condition.value.ShardingConditions;

/**
 * 分片条件解析器
 *
 * @author Kosho
 * @since 2021-08-27
 */
public interface ShardingConditionParser<T> {
    /**
     * 分片条件解析
     *
     * @param context 分片上下文
     * @return 分片条件
     */
    ShardingConditions parse(T context);
}
