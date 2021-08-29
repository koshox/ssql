package com.kosho.ssql.elasticsearch.sharding.condition.value;

import java.util.Collections;
import java.util.List;

/**
 * 固定值分片条件
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ListShardingCondition extends AbstractShardingCondition {
    private final List<Comparable<?>> values;

    public ListShardingCondition(String shardingColumn, Comparable<?> expressionValue) {
        super(shardingColumn);
        this.values = Collections.singletonList(expressionValue);
    }

    public ListShardingCondition(String shardingColumn, List<Comparable<?>> values) {
        super(shardingColumn);
        this.values = values;
    }

    public List<Comparable<?>> getValues() {
        return values;
    }
}
