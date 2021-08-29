package com.kosho.ssql.elasticsearch.sharding.condition.value;

/**
 * False分片条件
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class AlwaysFalseShardingCondition extends AbstractShardingCondition {
    public AlwaysFalseShardingCondition(String shardingColumn) {
        super(shardingColumn);
    }
}
