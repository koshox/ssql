package com.kosho.ssql.core.semantic.from;

/**
 * Table引用
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class Table {
    private String name;

    private String alias;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias != null ? name + " " + alias : name;
    }
}
