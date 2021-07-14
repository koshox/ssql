package com.kosho.ssql.core.semantic.value;

import com.kosho.ssql.core.semantic.constants.ValueType;

/**
 * 标识符Value
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class IdentifierValue implements Value {
    private boolean quoted;

    private String value;

    public boolean isQuoted() {
        return quoted;
    }

    public void setQuoted(boolean quoted) {
        this.quoted = quoted;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public ValueType type() {
        return ValueType.IDENTIFIER;
    }

    @Override
    public String toString() {
        return quoted ? "\"" + value + "\"" : value;
    }
}
