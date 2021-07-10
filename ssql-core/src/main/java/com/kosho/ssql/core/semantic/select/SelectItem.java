package com.kosho.ssql.core.semantic.select;

import com.kosho.ssql.core.semantic.value.Value;

/**
 * Select元素
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class SelectItem {
    private String alias;

    private Value field;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Value getField() {
        return field;
    }

    public void setField(Value field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return alias == null ? field.toString() : field + " as " + alias;
    }
}
