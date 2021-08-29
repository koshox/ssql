package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.google.common.collect.Range;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;

import java.util.List;
import java.util.Optional;

/**
 * 分片算法
 *
 * @author Kosho
 * @since 2021-08-27
 */
public interface ShardingAlgorithm {
    /**
     * 精确分片
     *
     * @param shardingTableRule 分片规则
     * @param shardingValue  分片值
     * @return 分片计算结果
     */
    Optional<ShardingTable> doPreciseSharding(ShardingTableRule shardingTableRule, Comparable<?> shardingValue);

    /**
     * 区间分片
     *
     * @param shardingTableRule 分片规则
     * @param shardingRange  分片区间
     * @return 分片计算结果
     */
    List<ShardingTable> doRangeSharding(ShardingTableRule shardingTableRule, Range<Comparable<?>> shardingRange);
}
