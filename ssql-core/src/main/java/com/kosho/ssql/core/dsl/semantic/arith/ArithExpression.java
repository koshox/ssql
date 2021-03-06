package com.kosho.ssql.core.dsl.semantic.arith;

import com.kosho.ssql.core.dsl.semantic.constants.ArithOperator;
import com.kosho.ssql.core.dsl.semantic.constants.ValueType;
import com.kosho.ssql.core.dsl.semantic.value.Value;

/**
 * 算数表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class ArithExpression implements Value {
    private Value left;

    private ArithOperator operator;

    private Value right;

    private boolean bracketed;

    public Value getLeft() {
        return left;
    }

    public void setLeft(Value left) {
        this.left = left;
    }

    public ArithOperator getOperator() {
        return operator;
    }

    public void setOperator(ArithOperator operator) {
        this.operator = operator;
    }

    public Value getRight() {
        return right;
    }

    public void setRight(Value right) {
        this.right = right;
    }

    public boolean isBracketed() {
        return bracketed;
    }

    public void setBracketed(boolean bracketed) {
        this.bracketed = bracketed;
    }

    @Override
    public ValueType type() {
        return ValueType.ARITH;
    }

    @Override
    public String toString() {
        if (!bracketed) {
            return left + " " + operator + " " + right;
        }

        return "(" + left + " " + operator + " " + right + ")";
    }
}
