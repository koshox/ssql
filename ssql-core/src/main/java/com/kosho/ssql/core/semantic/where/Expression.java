package com.kosho.ssql.core.semantic.where;

import com.kosho.ssql.core.semantic.constants.ExpressionType;

/**
 * 表达式接口
 *
 * @author Kosho
 * @since 2021-07-10
 */
public interface Expression {
    ExpressionType type();
}
