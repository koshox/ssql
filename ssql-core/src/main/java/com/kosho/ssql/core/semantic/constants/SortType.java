package com.kosho.ssql.core.semantic.constants;

/**
 * 排序顺序
 *
 * @author Kosho
 * @since 2021-07-10
 */
public enum SortType {
    ASC("asc"),

    DESC("desc");

    private final String type;

    SortType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
