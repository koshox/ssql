package com.kosho.ssql.elasticsearch.sharding.condition;

import com.kosho.ssql.core.dsl.semantic.where.Expression;
import com.kosho.ssql.core.dsl.semantic.where.LogicalExpression;
import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;
import com.kosho.ssql.elasticsearch.sharding.condition.predicate.AndPredicate;
import com.kosho.ssql.elasticsearch.sharding.condition.predicate.OrPredicate;

/**
 * 分片表达式提取
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingExpressionExtractor {
    public static OrPredicate extract(Expression expression) {
        OrPredicate result = new OrPredicate();

        switch (expression.type()) {
            case LOGICAL:
                extractLogicalExpression((LogicalExpression) expression, result);
                break;

            case OPERATION:
                extractOperationExpression((OperationExpression) expression, result);
                break;
        }

        return result;
    }

    private static void extractLogicalExpression(LogicalExpression expression, OrPredicate result) {
        switch (expression.getRelation()) {
            case AND:
                extractAndExpression(expression, result);
                break;

            case OR:
                extractOrExpression(expression, result);
                break;
        }
    }

    private static void extractOperationExpression(OperationExpression expression, OrPredicate result) {
        AndPredicate andPredicate = new AndPredicate();
        andPredicate.add(expression);
        result.add(andPredicate);
    }

    private static void extractAndExpression(LogicalExpression expression, OrPredicate result) {
        OrPredicate leftPredicate = extract(expression.getLeft());
        OrPredicate rightPredicate = extract(expression.getRight());

        for (AndPredicate leftEach : leftPredicate.getAndPredicates()) {
            for (AndPredicate rightEach : rightPredicate.getAndPredicates()) {
                AndPredicate andPredicate = new AndPredicate();
                andPredicate.addAll(leftEach.getExpressions());
                andPredicate.addAll(rightEach.getExpressions());
                result.add(andPredicate);
            }
        }
    }

    private static void extractOrExpression(LogicalExpression expression, OrPredicate result) {
        OrPredicate leftPredicate = extract(expression.getLeft());
        OrPredicate rightPredicate = extract(expression.getRight());
        result.addAll(leftPredicate.getAndPredicates());
        result.addAll(rightPredicate.getAndPredicates());
    }
}
