package com.kosho.ssql.elasticsearch.sharding.condition.value;


import com.google.common.collect.Range;

/**
 * 区间分片条件
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class RangeShardingCondition extends AbstractShardingCondition {
    private final Range<Comparable<?>> range;

    public RangeShardingCondition(String shardingColumn, Range<Comparable<?>> range) {
        super(shardingColumn);
        this.range = range;
    }

    public Range<Comparable<?>> getRange() {
        return range;
    }
}
