package com.kosho.ssql.core.semantic.value;

import com.kosho.ssql.core.semantic.constants.ValueType;

/**
 * 数字Value
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class NumberValue implements Value {
    private boolean negative;

    private String value;

    public boolean isNegative() {
        return negative;
    }

    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public ValueType type() {
        return ValueType.NUMBER;
    }

    @Override
    public String toString() {
        return negative ? "-" + value : value;
    }
}
