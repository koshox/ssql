package com.kosho.ssql.elasticsearch.sharding.condition.value;

/**
 * 分片条件
 *
 * @author Kosho
 * @since 2021-08-27
 */
public interface ShardingCondition {
    /**
     * 获取分片字段
     *
     * @return 分片字段
     */
    String getShardingColumn();
}
