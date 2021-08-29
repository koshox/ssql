package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.kosho.ssql.core.spi.Spi;

/**
 * 数字区间分片算法
 *
 * @author Kosho
 * @since 2021-08-27
 */
@Spi("NumberInterval")
public class NumberIntervalShardingAlgorithm extends AbstractIntervalShardingAlgorithm {
    @Override
    protected Long determineShardingValueNum(Comparable<?> shardingValue) {
        try {
            return Long.parseLong(shardingValue.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
