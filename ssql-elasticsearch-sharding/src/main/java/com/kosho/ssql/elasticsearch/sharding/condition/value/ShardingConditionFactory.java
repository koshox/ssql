package com.kosho.ssql.elasticsearch.sharding.condition.value;

import com.google.common.collect.Range;
import com.kosho.ssql.core.dsl.semantic.value.*;
import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 分片条件工厂
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingConditionFactory {
    /**
     * 根据Operation表达式构建分片条件
     *
     * @param expression     表达式
     * @param shardingColumn 分片字段
     * @return 分片条件
     */
    public static Optional<ShardingCondition> create(OperationExpression expression, String shardingColumn) {
        switch (expression.getOperator()) {
            case EQ:
            case GT:
            case LT:
            case GTE:
            case LTE:
                return createComparableCondition(expression, shardingColumn);

            case IN:
                return createInCondition(expression, shardingColumn);

            default:
                return Optional.empty();
        }
    }

    private static Optional<ShardingCondition> createComparableCondition(OperationExpression expression, String shardingColumn) {
        Optional<Comparable<?>> optionalExpressionValue = optComparableValue(expression.getValue());
        if (!optionalExpressionValue.isPresent()) {
            return Optional.empty();
        }

        Comparable<?> expressionValue = optionalExpressionValue.get();
        switch (expression.getOperator()) {
            case EQ:
                return Optional.of(new ListShardingCondition(shardingColumn, expressionValue));

            case GT:
                return Optional.of(new RangeShardingCondition(shardingColumn, Range.greaterThan(expressionValue)));

            case GTE:
                return Optional.of(new RangeShardingCondition(shardingColumn, Range.atLeast(expressionValue)));

            case LT:
                return Optional.of(new RangeShardingCondition(shardingColumn, Range.lessThan(expressionValue)));

            case LTE:
                return Optional.of(new RangeShardingCondition(shardingColumn, Range.atMost(expressionValue)));

            default:
                return Optional.empty();
        }
    }

    private static Optional<ShardingCondition> createInCondition(OperationExpression expression, String shardingColumn) {
        ListValue listValue = (ListValue) expression.getValue();
        List<Comparable<?>> conditionValues = listValue.getValues().stream()
                .map(ShardingConditionFactory::optComparableValue)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        if (conditionValues.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(new ListShardingCondition(shardingColumn, conditionValues));
    }

    private static Optional<Comparable<?>> optComparableValue(Value value) {
        Comparable<?> result = null;
        switch (value.type()) {
            case STRING:
                String text = ((StringValue) value).getValue();
                if (StringUtils.isNotEmpty(text)) {
                    result = text;
                }
                break;

            case NUMBER:
                NumberValue numberValue = (NumberValue) value;
                if (numberValue.getValue().contains(".")) {
                    result = Double.parseDouble(numberValue.toString());
                } else {
                    result = Long.parseLong(numberValue.toString());
                }
                break;

            case BOOLEAN:
                result = ((BooleanValue) value).getValue();
                break;
        }

        return Optional.ofNullable(result);
    }
}
