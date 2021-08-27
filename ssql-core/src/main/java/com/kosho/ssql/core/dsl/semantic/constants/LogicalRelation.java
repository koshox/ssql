package com.kosho.ssql.core.dsl.semantic.constants;

public enum LogicalRelation {
    AND("and"),

    OR("or");

    private final String symbol;

    LogicalRelation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
