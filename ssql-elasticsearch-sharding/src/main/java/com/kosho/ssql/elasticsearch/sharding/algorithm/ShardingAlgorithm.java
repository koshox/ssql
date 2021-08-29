package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.google.common.collect.Range;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;

import java.util.List;
import java.util.Optional;

/**
 * 分片算法
 *
 * @author Kosho
 * @since 2021-08-27
 */
public interface ShardingAlgorithm {
    Optional<ShardingTable> doPreciseSharding(List<ShardingTable> shardingTables, Comparable<?> shardingValue);

    List<ShardingTable> doRangeSharding(List<ShardingTable> shardingTables, Range<Comparable<?>> shardingRange);
}
