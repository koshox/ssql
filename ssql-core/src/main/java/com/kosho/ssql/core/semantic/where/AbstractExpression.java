package com.kosho.ssql.core.semantic.where;

/**
 * 抽象表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public abstract class AbstractExpression implements Expression {
    protected boolean bracketed;

    @Override
    public boolean isBracketed() {
        return bracketed;
    }

    @Override
    public void setBracketed(boolean bracketed) {
        this.bracketed = bracketed;
    }
}
