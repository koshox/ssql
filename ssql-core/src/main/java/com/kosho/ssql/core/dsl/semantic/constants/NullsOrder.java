package com.kosho.ssql.core.dsl.semantic.constants;

/**
 * Nulls排序类型
 *
 * @author Kosho
 * @since 2021-07-10
 */
public enum NullsOrder {
    LAST("last"),

    FIRST("first");

    private final String value;

    NullsOrder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "nulls " + value;
    }
}
