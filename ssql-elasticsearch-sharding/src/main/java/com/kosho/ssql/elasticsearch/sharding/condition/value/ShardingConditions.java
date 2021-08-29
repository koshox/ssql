package com.kosho.ssql.elasticsearch.sharding.condition.value;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * 分片条件集合
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingConditions {
    private final List<ShardingCondition> conditions;

    public ShardingConditions(List<ShardingCondition> conditions) {
        this.conditions = conditions;
    }

    public static ShardingConditions empty() {
        return new ShardingConditions(Collections.emptyList());
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(conditions);
    }

    public boolean isAlwaysFalse() {
        if (CollectionUtils.isEmpty(conditions)) {
            return false;
        }

        for (ShardingCondition condition : conditions) {
            if (!(condition instanceof AlwaysFalseShardingCondition)) {
                return false;
            }
        }

        return true;
    }

    public List<ShardingCondition> getConditions() {
        return conditions;
    }
}
