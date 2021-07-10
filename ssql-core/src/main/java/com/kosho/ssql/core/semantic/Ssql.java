package com.kosho.ssql.core.semantic;

import com.kosho.ssql.core.semantic.from.From;
import com.kosho.ssql.core.semantic.group.GroupBy;
import com.kosho.ssql.core.semantic.limit.Limit;
import com.kosho.ssql.core.semantic.order.OrderBy;
import com.kosho.ssql.core.semantic.select.Select;
import com.kosho.ssql.core.semantic.where.Where;

/**
 * Ssql表达式
 *
 * @author Kosho
 * @since 2021-7-10
 */
public class Ssql {
    private Select select;

    private From from;

    private Where where;

    private GroupBy groupBy;

    private OrderBy orderBy;

    private Limit limit;

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }

    public GroupBy getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        String ssqlStr = select + " " + from;

        if (where != null) {
            ssqlStr = ssqlStr + " " + where;
        }

        if (groupBy != null) {
            ssqlStr = ssqlStr + " " + groupBy;
        }

        if (orderBy != null) {
            ssqlStr = ssqlStr + " " + orderBy;
        }

        if (limit != null) {
            ssqlStr = ssqlStr + " " + limit;
        }

        return ssqlStr;
    }
}
