package com.kosho.ssql.core.semantic.constants;

import com.kosho.ssql.core.exception.SsqlException;

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

    public static Operator from(String cmpOp) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol().equals(cmpOp)) {
                return operator;
            }
        }

        throw new SsqlException("Unsupported operator: " + cmpOp);
    }
}
