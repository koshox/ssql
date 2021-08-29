package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.google.common.collect.Range;
import com.kosho.ssql.core.spi.Spi;
import com.kosho.ssql.core.spi.SpiLoader;
import com.kosho.ssql.elasticsearch.sharding.algorithm.hash.Hasher;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;

import java.util.List;
import java.util.Optional;

/**
 * Hash分片算法
 *
 * @author Kosho
 * @since 2021-08-29
 */
@Spi("HashMod")
public class HashModShardingAlgorithm implements ShardingAlgorithm {
    private Hasher hasher = SpiLoader.of(Hasher.class).loadHighestPriority();

    @Override
    public Optional<ShardingTable> doPreciseSharding(ShardingTableRule shardingTableRule, Comparable<?> shardingValue) {
        List<ShardingTable> shardingTables = shardingTableRule.getShardingTables();
        int hash = hasher.hash(shardingValue.toString());
        int index = Math.abs(hash) % shardingTables.size();
        return Optional.of(shardingTables.get(index));
    }

    @Override
    public List<ShardingTable> doRangeSharding(ShardingTableRule shardingTableRule, Range<Comparable<?>> shardingRange) {
        // All table
        return shardingTableRule.getShardingTables();
    }
}
