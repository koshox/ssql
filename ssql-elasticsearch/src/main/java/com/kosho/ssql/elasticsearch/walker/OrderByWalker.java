package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;

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

    }
}
