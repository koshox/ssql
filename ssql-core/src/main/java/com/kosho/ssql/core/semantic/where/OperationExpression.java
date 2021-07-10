package com.kosho.ssql.core.semantic.where;

import com.kosho.ssql.core.semantic.constants.ExpressionType;
import com.kosho.ssql.core.semantic.constants.Operator;
import com.kosho.ssql.core.semantic.value.Value;

/**
 * 运算表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class OperationExpression extends AbstractExpression {
    private Value field;

    private Operator operator;

    private Value value;

    public Value getField() {
        return field;
    }

    public void setField(Value field) {
        this.field = field;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public ExpressionType type() {
        return ExpressionType.OPERATION;
    }

    @Override
    public String toString() {
        if (!bracketed) {
            return field.toString() + " " + operator + (value == null? "":" " + value.toString());
        }

        return "(" +  field.toString() + " " + operator + (value == null? "":" " + value.toString()) +")";
    }
}
