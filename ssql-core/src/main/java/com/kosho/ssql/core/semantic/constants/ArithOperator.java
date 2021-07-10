package com.kosho.ssql.core.semantic.constants;

/**
 * 算数操作符
 *
 * @author Kosho
 * @since 2021-07-10
 */
public enum ArithOperator {
    PLUS("+"),

    MINUS("-"),

    MULT("*"),

    DIV("/"),

    MOD("%");

    private final String operator;

    ArithOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return operator;
    }
}
