package com.kosho.ssql.core.semantic.value;

import com.kosho.ssql.core.semantic.constants.ValueType;

/**
 * 变量Value
 *
 * @author Kosho
 * @since 2021-07-14
 */
public class VarValue implements Value {
    private String name;

    public VarValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ValueType type() {
        return ValueType.VAR;
    }

    @Override
    public String toString() {
        return "$" + name;
    }
}
