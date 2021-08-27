package com.kosho.ssql.core.dsl.semantic.value;

import com.kosho.ssql.core.dsl.semantic.constants.ValueType;

/**
 * 字符串Value
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class StringValue implements Value {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public ValueType type() {
        return ValueType.STRING;
    }

    @Override
    public String toString() {
        return "'" + value + "'";
    }
}
