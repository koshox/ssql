package com.kosho.ssql.core.dsl.semantic.where;

import com.kosho.ssql.core.dsl.semantic.SsqlSegment;
import com.kosho.ssql.core.dsl.semantic.constants.SegmentType;

/**
 * Where表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class Where implements SsqlSegment {
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public SegmentType type() {
        return SegmentType.WHERE;
    }

    @Override
    public String toString() {
        return "where " + expression;
    }
}
