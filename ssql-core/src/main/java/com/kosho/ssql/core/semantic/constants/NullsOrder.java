package com.kosho.ssql.core.semantic.constants;

/**
 * Nulls排序类型
 *
 * @author Kosho
 * @since 2021-07-10
 */
public enum NullsOrder {
    NULLS_LAST("nulls last"),

    NULLS_FIRST("nulls first");

    private final String value;

    NullsOrder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
