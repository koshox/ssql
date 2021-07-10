package com.kosho.ssql.core.semantic.constants;

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
