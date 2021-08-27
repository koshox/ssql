package com.kosho.ssql.core.dsl.semantic.constants;

import com.kosho.ssql.core.exception.SsqlException;

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

    public static ArithOperator from(String arithOp) {
        for (ArithOperator arithOperator : ArithOperator.values()) {
            if (arithOperator.getOperator().equals(arithOp)) {
                return arithOperator;
            }
        }

        throw new SsqlException("Unsupported arith operator: " + arithOp);
    }
}
