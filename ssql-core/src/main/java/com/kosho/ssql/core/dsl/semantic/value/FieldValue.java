package com.kosho.ssql.core.dsl.semantic.value;

import com.kosho.ssql.core.dsl.semantic.constants.ValueType;

/**
 * 字段Value
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class FieldValue implements Value {
    private IdentifierValue owner;

    private IdentifierValue value;

    public IdentifierValue getOwner() {
        return owner;
    }

    public IdentifierValue getValue() {
        return value;
    }

    public void setOwner(IdentifierValue owner) {
        this.owner = owner;
    }

    public void setValue(IdentifierValue value) {
        this.value = value;
    }

    @Override
    public ValueType type() {
        return ValueType.FIELD;
    }

    @Override
    public String toString() {
        return owner != null ? owner + "." + value : value.toString();
    }
}
