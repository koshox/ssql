package com.kosho.ssql.elasticsearch.sharding.meta;

/**
 * 分片策略
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingStrategy {
    private String shardingColumn;

    private String shardingAlgorithm;

    private int numberOfShards;

    public String getShardingColumn() {
        return shardingColumn;
    }

    public void setShardingColumn(String shardingColumn) {
        this.shardingColumn = shardingColumn;
    }

    public String getShardingAlgorithm() {
        return shardingAlgorithm;
    }

    public void setShardingAlgorithm(String shardingAlgorithm) {
        this.shardingAlgorithm = shardingAlgorithm;
    }

    public int getNumberOfShards() {
        return numberOfShards;
    }

    public void setNumberOfShards(int numberOfShards) {
        this.numberOfShards = numberOfShards;
    }
}
