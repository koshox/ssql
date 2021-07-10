package com.kosho.ssql.core.semantic.order;

import com.kosho.ssql.core.semantic.SsqlSegment;
import com.kosho.ssql.core.semantic.constants.SegmentType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * OrderBy表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class OrderBy implements SsqlSegment {
    private List<OrderItem> orderItems;

    public OrderBy(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public SegmentType type() {
        return SegmentType.ORDER_BY;
    }

    @Override
    public String toString() {
        return "order by " + orderItems.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
