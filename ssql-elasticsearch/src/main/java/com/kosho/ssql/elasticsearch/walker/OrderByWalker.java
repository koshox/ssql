package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.core.dsl.semantic.constants.SortType;
import com.kosho.ssql.core.dsl.semantic.order.OrderBy;
import com.kosho.ssql.core.dsl.semantic.order.OrderItem;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;

/**
 * OrderBy表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class OrderByWalker extends AbstractSsql2EqlAstWalker {
    public OrderByWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {
        if (!eqlResult.isFetchSource()) {
            return;
        }

        OrderBy orderBy = ssql.getOrderBy();
        if (orderBy == null) {
            return;
        }

        orderBy.getOrderItems().forEach(this::walkOrderItem);
    }

    private void walkOrderItem(OrderItem orderItem) {
        String fieldName = walkField(orderItem.getField());
        SortOrder sortOrder = orderItem.getSort() != null && orderItem.getSort() == SortType.DESC
                ? SortOrder.DESC
                : SortOrder.ASC;
        FieldSortBuilder sortBuilder = SortBuilders.fieldSort(fieldName).order(sortOrder);
        eqlResult.getOrderBy().add(sortBuilder);
    }
}
