package com.kosho.ssql.core.semantic.value;

import com.kosho.ssql.core.semantic.constants.ValueType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 列表Value
 *
 * @author Kosho
 * @since 2021-07-14
 */
public class ListValue implements Value {
    private List<Value> values;

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public List<Value> getValues() {
        return values;
    }

    @Override
    public ValueType type() {
        return ValueType.LIST;
    }

    @Override
    public String toString() {
        if (values == null) {
            return "";
        }

        return "(" + values.stream().map(Object::toString).collect(Collectors.joining(", ")) + ")";
    }
}
