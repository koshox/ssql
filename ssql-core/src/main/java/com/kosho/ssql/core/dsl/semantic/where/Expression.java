package com.kosho.ssql.core.dsl.semantic.where;

import com.kosho.ssql.core.dsl.semantic.constants.ExpressionType;

/**
 * 表达式接口
 *
 * @author Kosho
 * @since 2021-07-10
 */
public interface Expression {
    ExpressionType type();

    boolean isBracketed();

    void setBracketed(boolean bracketed);
}
