package com.kosho.ssql.core.semantic.value;

import com.kosho.ssql.core.semantic.constants.ValueType;

/**
 * 布尔Value
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class BooleanValue implements Value {
    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public ValueType type() {
        return ValueType.BOOLEAN;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
