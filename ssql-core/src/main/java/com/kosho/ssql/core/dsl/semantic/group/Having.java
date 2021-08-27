package com.kosho.ssql.core.dsl.semantic.group;

import com.kosho.ssql.core.dsl.semantic.where.Expression;
import com.kosho.ssql.core.dsl.semantic.SsqlSegment;
import com.kosho.ssql.core.dsl.semantic.constants.SegmentType;

/**
 * Having表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class Having implements SsqlSegment {
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public SegmentType type() {
        return SegmentType.HAVING;
    }

    @Override
    public String toString() {
        return "having " + expression;
    }
}
