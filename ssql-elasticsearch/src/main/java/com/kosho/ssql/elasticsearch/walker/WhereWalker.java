package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.core.semantic.constants.Operator;
import com.kosho.ssql.core.semantic.value.*;
import com.kosho.ssql.core.semantic.where.Expression;
import com.kosho.ssql.core.semantic.where.LogicalExpression;
import com.kosho.ssql.core.semantic.where.OperationExpression;
import com.kosho.ssql.core.semantic.where.Where;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Where表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class WhereWalker extends AbstractSsql2EqlAstWalker {
    public WhereWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {
        Where where = ssql.getWhere();
        if (where == null) {
            eqlResult.setCondition(QueryBuilders.matchAllQuery());
            return;
        }

        QueryBuilder condition = walkExpression(where.getExpression());
        eqlResult.setCondition(condition);
    }

    private QueryBuilder walkExpression(Expression expression) {
        switch (expression.type()) {
            case LOGICAL:
                return walkLogicalExpression((LogicalExpression) expression);

            case OPERATION:
                return walkOperationExpression((OperationExpression) expression);

            default:
                throw unsupportedSemanticEx(expression);
        }
    }

    private QueryBuilder walkLogicalExpression(LogicalExpression expression) {
        QueryBuilder left = walkExpression(expression.getLeft());
        QueryBuilder right = walkExpression(expression.getRight());

        switch (expression.getRelation()) {
            case AND:
                return mergeAndCondition(left, right);

            case OR:
                return mergeOrCondition(left, right);

            default:
                throw unsupportedSemanticEx(expression);
        }
    }

    private QueryBuilder walkOperationExpression(OperationExpression expression) {
        Operator operator = expression.getOperator();
        String fieldName = walkExpressionField(expression.getField());
        Object targetValue = walkExpressionValue(expression.getValue());
        switch (operator) {
            case EQ:
                return QueryBuilders.termQuery(fieldName, targetValue);

            case NEQ:
                return QueryBuilders.boolQuery().mustNot(QueryBuilders.termQuery(fieldName, targetValue));

            case GT:
                return QueryBuilders.rangeQuery(fieldName).gt(targetValue);

            case GTE:
                return QueryBuilders.rangeQuery(fieldName).gte(targetValue);

            case LT:
                return QueryBuilders.rangeQuery(fieldName).lt(targetValue);

            case LTE:
                return QueryBuilders.rangeQuery(fieldName).gte(targetValue);

            case IS_NULL:
                return QueryBuilders.boolQuery().mustNot(QueryBuilders.existsQuery(fieldName));

            case IS_NOT_NULL:
                return QueryBuilders.existsQuery(fieldName);

            case LIKE:
                return QueryBuilders.wildcardQuery(fieldName, escapeLike(targetValue.toString()));

            case NOT_LIKE:
                return QueryBuilders.boolQuery().mustNot(QueryBuilders.wildcardQuery(fieldName, escapeLike(targetValue.toString())));

            case IN:
                return QueryBuilders.termsQuery(fieldName, (List) targetValue);

            default:
                throw unsupportedSemanticEx(expression);
        }
    }

    private String walkExpressionField(Value field) {
        switch (field.type()) {
            case STRING:
                return resolveField(((StringValue) field).getValue());

            case IDENTIFIER:
                return resolveField(((IdentifierValue) field).getValue());

            case FIELD:
                return resolveField(((FieldValue) field).getValue().getValue());

            default:
                throw unsupportedSemanticEx(field);
        }
    }

    private Object walkExpressionValue(Value value) {
        if (value == null) {
            return null;
        }

        switch (value.type()) {
            case STRING:
                return ((StringValue) value).getValue();

            case BOOLEAN:
                return ((BooleanValue) value).getValue();

            case NUMBER:
                String numberStr = value.toString();
                if (numberStr.indexOf('.') > 0) {
                    return Double.parseDouble(numberStr);
                }

                return Long.valueOf(numberStr);

            case LIST:
                return ((ListValue) value).getValues().stream()
                        .map(this::walkExpressionValue)
                        .collect(Collectors.toList());

            default:
                throw unsupportedSemanticEx(value);
        }
    }

    private QueryBuilder mergeAndCondition(QueryBuilder left, QueryBuilder right) {
        BoolQueryBuilder leftBool = null;
        BoolQueryBuilder rightBool = null;

        if (left instanceof BoolQueryBuilder) {
            leftBool = (BoolQueryBuilder) left;
        }

        if (right instanceof BoolQueryBuilder) {
            rightBool = (BoolQueryBuilder) right;
        }

        BoolQueryBuilder mergedQuery = QueryBuilders.boolQuery();

        if (leftBool != null && leftBool.should().isEmpty() && rightBool != null && rightBool.should().isEmpty()) {
            leftBool.must().forEach(mergedQuery::must);
            leftBool.mustNot().forEach(mergedQuery::mustNot);
            rightBool.must().forEach(mergedQuery::must);
            rightBool.mustNot().forEach(mergedQuery::mustNot);
            return mergedQuery;
        }

        if (leftBool != null && leftBool.should().isEmpty() && (rightBool == null || !rightBool.should().isEmpty())) {
            leftBool.must().forEach(mergedQuery::must);
            leftBool.mustNot().forEach(mergedQuery::mustNot);
            mergedQuery.must(right);
            return mergedQuery;
        }

        if (rightBool != null && rightBool.should().isEmpty() && (leftBool == null || !leftBool.should().isEmpty())) {
            rightBool.must().forEach(mergedQuery::must);
            rightBool.mustNot().forEach(mergedQuery::mustNot);
            mergedQuery.must(left);
            return mergedQuery;
        }

        return mergedQuery.must(left).must(right);
    }

    private QueryBuilder mergeOrCondition(QueryBuilder left, QueryBuilder right) {
        BoolQueryBuilder leftBool = null;
        BoolQueryBuilder rightBool = null;

        if (left instanceof BoolQueryBuilder) {
            leftBool = (BoolQueryBuilder) left;
        }

        if (right instanceof BoolQueryBuilder) {
            rightBool = (BoolQueryBuilder) right;
        }

        BoolQueryBuilder mergedQuery = QueryBuilders.boolQuery();

        if (leftBool != null && !leftBool.should().isEmpty() && rightBool != null && !rightBool.should().isEmpty()) {
            leftBool.should().forEach(mergedQuery::must);
            rightBool.should().forEach(mergedQuery::must);
            return mergedQuery;
        }

        if (leftBool != null && !leftBool.should().isEmpty() && (rightBool == null || rightBool.should().isEmpty())) {
            leftBool.should().forEach(mergedQuery::should);
            mergedQuery.should(right);
            return mergedQuery;
        }

        if (rightBool != null && !rightBool.should().isEmpty() && (leftBool == null || leftBool.should().isEmpty())) {
            rightBool.should().forEach(mergedQuery::should);
            mergedQuery.should(left);
            return mergedQuery;
        }

        return mergedQuery.should(left).should(right);
    }

    private String escapeLike(String targetValue) {
        return targetValue.replaceAll("%", "*").replaceAll("_", "?");
    }
}
