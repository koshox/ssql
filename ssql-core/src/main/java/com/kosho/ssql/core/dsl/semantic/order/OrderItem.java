package com.kosho.ssql.core.dsl.semantic.order;

import com.kosho.ssql.core.dsl.semantic.value.Value;
import com.kosho.ssql.core.dsl.semantic.constants.NullsOrder;
import com.kosho.ssql.core.dsl.semantic.constants.SortType;

/**
 * Order元素
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class OrderItem {
    private Value field;

    private SortType sort;

    private NullsOrder nullsOrder;

    public Value getField() {
        return field;
    }

    public void setField(Value field) {
        this.field = field;
    }

    public SortType getSort() {
        return sort;
    }

    public void setSort(SortType sort) {
        this.sort = sort;
    }

    public NullsOrder getNullsOrder() {
        return nullsOrder;
    }

    public void setNullsOrder(NullsOrder nullsOrder) {
        this.nullsOrder = nullsOrder;
    }

    @Override
    public String toString() {
        return field + (sort == null ? "" : " " + sort) + (nullsOrder == null ? "" : " " + nullsOrder);
    }
}
