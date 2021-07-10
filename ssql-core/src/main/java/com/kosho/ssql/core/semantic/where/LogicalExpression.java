package com.kosho.ssql.core.semantic.where;

import com.kosho.ssql.core.semantic.constants.ExpressionType;
import com.kosho.ssql.core.semantic.constants.LogicalRelation;

/**
 * 逻辑表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class LogicalExpression extends AbstractExpression{
    private Expression left;

    private LogicalRelation relation;

    private Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public LogicalRelation getRelation() {
        return relation;
    }

    public void setRelation(LogicalRelation relation) {
        this.relation = relation;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public ExpressionType type() {
        return ExpressionType.LOGICAL;
    }

    @Override
    public String toString() {
        return left + " " + relation + " " + right;
    }
}
