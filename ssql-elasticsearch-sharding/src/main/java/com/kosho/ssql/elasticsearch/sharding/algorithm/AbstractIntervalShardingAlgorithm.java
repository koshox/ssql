package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.utils.RangeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 抽象区间分片算法
 *
 * @author Kosho
 * @since 2021-08-27
 */
public abstract class AbstractIntervalShardingAlgorithm implements ShardingAlgorithm {
    @Override
    public Optional<ShardingTable> doPreciseSharding(List<ShardingTable> shardingTables, Comparable<?> shardingValue) {
        Long shardingValueNum = determineShardingValueNum(shardingValue);
        if (shardingValueNum == null) {
            return Optional.empty();
        }

        for (ShardingTable shardingTable : shardingTables) {
            Long lowerShardingValue = shardingTable.getLowerShardingValue();
            Long upperShardingValue = shardingTable.getUpperShardingValue();
            if (shardingValueNum >= lowerShardingValue && shardingValueNum < upperShardingValue) {
                return Optional.of(shardingTable);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<ShardingTable> doRangeSharding(List<ShardingTable> shardingTables, Range<Comparable<?>> shardingRange) {
        List<ShardingTable> results = new ArrayList<>();
        Range<Long> shardingValueRange = determineShardingValueRange(shardingRange);
        for (ShardingTable shardingTable : shardingTables) {
            Range<Long> shardingTableRange = shardingTable.buildShardingRange();
            if (RangeUtils.isCloseConnected(shardingValueRange, shardingTableRange)) {
                results.add(shardingTable);
            }
        }

        return results;
    }

    protected abstract Long determineShardingValueNum(Comparable<?> shardingValue);

    protected Range<Long> determineShardingValueRange(Range<Comparable<?>> shardingRange) {
        if (shardingRange.hasLowerBound()) {
            Comparable<?> lowerEndpoint = shardingRange.lowerEndpoint();
            BoundType lowerBoundType = shardingRange.lowerBoundType();
            Long lowerShardingNum = determineShardingValueNum(lowerEndpoint.toString());

            if (lowerShardingNum == null) {
                return invalidRange();
            }

            if (shardingRange.hasUpperBound()) {
                Comparable<?> upperEndpoint = shardingRange.upperEndpoint();
                BoundType upperBoundType = shardingRange.upperBoundType();
                Long upperShardingNum = determineShardingValueNum(upperEndpoint.toString());

                if (upperShardingNum == null) {
                    return invalidRange();
                }

                return Range.range(lowerShardingNum, lowerBoundType, upperShardingNum, upperBoundType);
            } else {
                return Range.downTo(lowerShardingNum, lowerBoundType);
            }
        } else {
            if (shardingRange.hasUpperBound()) {
                Comparable<?> upperEndpoint = shardingRange.upperEndpoint();
                BoundType upperBoundType = shardingRange.upperBoundType();
                Long upperShardingNum = determineShardingValueNum(upperEndpoint.toString());

                if (upperShardingNum == null) {
                    return invalidRange();
                }

                return Range.upTo(upperShardingNum, upperBoundType);
            } else {
                // Unreachable
                return Range.all();
            }
        }
    }

    private Range<Long> invalidRange() {
        return Range.singleton(Long.MIN_VALUE);
    }
}
