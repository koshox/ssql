package com.kosho.ssql.elasticsearch.sharding.condition;

import com.google.common.collect.Range;
import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;
import com.kosho.ssql.elasticsearch.sharding.condition.predicate.AndPredicate;
import com.kosho.ssql.elasticsearch.sharding.condition.predicate.OrPredicate;
import com.kosho.ssql.elasticsearch.sharding.condition.value.*;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingRuleManager;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Query分片条件解析
 *
 * @author Kosho
 * @since 2021-08-27
 */
class SsqlQueryShardingConditionParser implements ShardingConditionParser<Ssql> {
    static final ShardingConditionParser<Ssql> INSTANCE = new SsqlQueryShardingConditionParser();

    @Override
    public ShardingConditions parse(Ssql ssql) {
        if (ssql.getWhere() == null || ssql.getWhere().getExpression() == null) {
            return ShardingConditions.empty();
        }

        ShardingTableRule rule = ShardingRuleManager.getInstance().getRule(ssql);
        if (rule == null) {
            return ShardingConditions.empty();
        }

        OrPredicate orPredicate = ShardingExpressionExtractor.extract(ssql.getWhere().getExpression());
        List<ShardingCondition> shardingConditions = parse(orPredicate, rule);
        return new ShardingConditions(shardingConditions);
    }

    private List<ShardingCondition> parse(OrPredicate orPredicate, ShardingTableRule rule) {
        List<ShardingCondition> result = new ArrayList<>();
        for (AndPredicate andPredicate : orPredicate.getAndPredicates()) {
            List<ShardingCondition> shardingConditions = parse(andPredicate, rule);
            if (CollectionUtils.isEmpty(shardingConditions)) {
                return Collections.emptyList();
            }

            ShardingCondition mergedCondition = merge(shardingConditions, rule);
            result.add(mergedCondition);
        }

        return result;
    }

    private List<ShardingCondition> parse(AndPredicate andPredicate, ShardingTableRule rule) {
        List<ShardingCondition> shardingConditions = new ArrayList<>();
        String shardingColumn = rule.getShardingStrategy().getShardingColumn();

        for (OperationExpression expression : andPredicate.getExpressions()) {
            Optional<String> expressionColumn = ShardingColumnExtractor.extract(expression);
            if (!expressionColumn.isPresent() || !expressionColumn.get().equals(shardingColumn)) {
                continue;
            }

            Optional<ShardingCondition> shardingCondition = ShardingConditionFactory.create(expression, shardingColumn);
            shardingCondition.ifPresent(shardingConditions::add);
        }

        return shardingConditions;
    }

    private ShardingCondition merge(List<ShardingCondition> shardingConditions, ShardingTableRule rule) {
        String shardingColumn = rule.getShardingStrategy().getShardingColumn();
        List<Comparable<?>> listValue = null;
        Range<Comparable<?>> rangeValue = null;

        for (ShardingCondition condition : shardingConditions) {
            if (condition instanceof ListShardingCondition) {
                listValue = mergeListShardingValues(((ListShardingCondition) condition).getValues(), listValue);
                if (CollectionUtils.isEmpty(listValue)) {
                    return new AlwaysFalseShardingCondition(shardingColumn);
                }
            } else if (condition instanceof RangeShardingCondition) {
                try {
                    rangeValue = mergeRangeShardingValues(((RangeShardingCondition) condition).getRange(), rangeValue);
                } catch (IllegalArgumentException e) {
                    return new AlwaysFalseShardingCondition(shardingColumn);
                }
            }
        }

        if (listValue == null) {
            return new RangeShardingCondition(shardingColumn, rangeValue);
        }

        if (rangeValue == null) {
            return new ListShardingCondition(shardingColumn, listValue);
        }

        listValue = mergeListAndRangeShardingValues(listValue, rangeValue);
        if (CollectionUtils.isEmpty(listValue)) {
            return new AlwaysFalseShardingCondition(shardingColumn);
        }

        return new ListShardingCondition(shardingColumn, listValue);
    }

    private List<Comparable<?>> mergeListShardingValues(List<Comparable<?>> leftValues, List<Comparable<?>> rightValues) {
        if (rightValues == null) {
            return leftValues;
        }

        List<Comparable<?>> result = new ArrayList<>(leftValues);
        result.retainAll(rightValues);
        return result;
    }

    private Range<Comparable<?>> mergeRangeShardingValues(Range<Comparable<?>> leftRange, Range<Comparable<?>> rightRange) {
        if (rightRange == null) {
            return leftRange;
        }

        return leftRange.intersection(rightRange);
    }

    private List<Comparable<?>> mergeListAndRangeShardingValues(List<Comparable<?>> listValue, Range<Comparable<?>> rangeValue) {
        List<Comparable<?>> result = new ArrayList<>();
        for (Comparable<?> item : listValue) {
            if (rangeValue.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }
}
