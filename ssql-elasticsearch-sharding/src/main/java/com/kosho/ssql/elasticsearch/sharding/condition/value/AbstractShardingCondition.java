package com.kosho.ssql.elasticsearch.sharding.condition.value;

/**
 * 抽象分片条件
 *
 * @author Kosho
 * @since 2021-08-29
 */
public class AbstractShardingCondition implements ShardingCondition{
    protected String shardingColumn;

    public AbstractShardingCondition(String shardingColumn) {
        this.shardingColumn = shardingColumn;
    }

    @Override
    public String getShardingColumn() {
        return shardingColumn;
    }
}
