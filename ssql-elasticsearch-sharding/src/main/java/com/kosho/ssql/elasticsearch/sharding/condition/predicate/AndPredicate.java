package com.kosho.ssql.elasticsearch.sharding.condition.predicate;

import com.google.common.base.Joiner;
import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * And Predicate
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class AndPredicate {
    private final List<OperationExpression> expressions = new ArrayList<>();

    public void add(OperationExpression expression) {
        this.expressions.add(expression);
    }

    public void addAll(List<OperationExpression> expressions) {
        this.expressions.addAll(expressions);
    }

    public List<OperationExpression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        return Joiner.on(" and ").join(expressions);
    }
}
