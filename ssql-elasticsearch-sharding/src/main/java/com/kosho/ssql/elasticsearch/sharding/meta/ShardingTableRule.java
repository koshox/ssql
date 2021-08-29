package com.kosho.ssql.elasticsearch.sharding.meta;

import java.util.List;

/**
 * 分片表规则
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingTableRule {
    private String logicalTableName;

    private List<ShardingTable> shardingTables;

    private ShardingStrategy shardingStrategy;

    public String getLogicalTableName() {
        return logicalTableName;
    }

    public void setLogicalTableName(String logicalTableName) {
        this.logicalTableName = logicalTableName;
    }

    public List<ShardingTable> getShardingTables() {
        return shardingTables;
    }

    public void setShardingTables(List<ShardingTable> shardingTables) {
        this.shardingTables = shardingTables;
    }

    public ShardingStrategy getShardingStrategy() {
        return shardingStrategy;
    }

    public void setShardingStrategy(ShardingStrategy shardingStrategy) {
        this.shardingStrategy = shardingStrategy;
    }
}
