package com.kosho.ssql.elasticsearch.sharding.meta;

import java.util.Properties;

/**
 * 分片策略
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingStrategy {
    /**
     * 分片字段
     */
    private String shardingColumn;

    /**
     * 分片算法
     */
    private String shardingAlgorithm;

    /**
     * 分片额外属性
     */
    private Properties properties;

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

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
