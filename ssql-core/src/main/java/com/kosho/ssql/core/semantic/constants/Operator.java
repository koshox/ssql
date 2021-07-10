package com.kosho.ssql.core.semantic.constants;

/**
 * 操作符
 *
 * @author Kosho
 * @since 2021-07-10
 */
public enum Operator {
    EQ("="),

    NEQ("!="),

    GT(">"),

    GTE(">="),

    LT("<"),

    LTE("<="),

    LIKE("like"),

    NOT_LIKE("not like"),

    IS_NULL("is null"),

    IS_NOT_NULL("is not null");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
