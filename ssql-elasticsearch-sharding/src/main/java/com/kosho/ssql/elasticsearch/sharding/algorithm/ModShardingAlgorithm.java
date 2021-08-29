package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.google.common.collect.Range;
import com.kosho.ssql.core.spi.Spi;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;
import org.apache.commons.lang3.Validate;

import java.util.List;
import java.util.Optional;

/**
 * Mod分片算法
 *
 * @author Kosho
 * @since 2021-08-29
 */
@Spi("Mod")
public class ModShardingAlgorithm implements ShardingAlgorithm {
    @Override
    public Optional<ShardingTable> doPreciseSharding(ShardingTableRule shardingTableRule, Comparable<?> shardingValue) {
        Validate.isTrue(shardingValue instanceof Number, "Mod sharding need number sharding value but " + shardingValue.getClass().getName());

        List<ShardingTable> shardingTables = shardingTableRule.getShardingTables();
        long longValue = ((Number) shardingValue).longValue();
        int index = (int) (Math.abs(longValue) % shardingTables.size());
        return Optional.of(shardingTables.get(index));
    }

    @Override
    public List<ShardingTable> doRangeSharding(ShardingTableRule shardingTableRule, Range<Comparable<?>> shardingRange) {
        // All table
        return shardingTableRule.getShardingTables();
    }
}
