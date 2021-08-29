package com.kosho.ssql.elasticsearch.sharding.meta;

import com.google.common.collect.Range;

import java.util.Objects;

/**
 * 分片表
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingTable {
    /**
     * 表名
     */
    private String tableName;

    /**
     * 分片值
     */
    private String shardingValue;

    /**
     * 分片下界
     */
    private Long lowerShardingValue;

    /**
     * 分片上界
     */
    private Long upperShardingValue;

    private transient Range<Long> shardingRange;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getShardingValue() {
        return shardingValue;
    }

    public void setShardingValue(String shardingValue) {
        this.shardingValue = shardingValue;
    }

    public Long getLowerShardingValue() {
        return lowerShardingValue;
    }

    public void setLowerShardingValue(Long lowerShardingValue) {
        this.lowerShardingValue = lowerShardingValue;
    }

    public Long getUpperShardingValue() {
        return upperShardingValue;
    }

    public void setUpperShardingValue(Long upperShardingValue) {
        this.upperShardingValue = upperShardingValue;
    }

    public Range<Long> buildShardingRange() {
        if (shardingRange != null) {
            return shardingRange;
        }

        shardingRange = Range.closedOpen(lowerShardingValue, upperShardingValue);
        return shardingRange;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ShardingTable that = (ShardingTable) obj;
        return Objects.equals(tableName, that.tableName) &&
                Objects.equals(shardingValue, that.shardingValue) &&
                Objects.equals(lowerShardingValue, that.lowerShardingValue) &&
                Objects.equals(upperShardingValue, that.upperShardingValue) &&
                Objects.equals(shardingRange, that.shardingRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, shardingValue, lowerShardingValue, upperShardingValue, shardingRange);
    }
}
