package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;

/**
 * GroupBy表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class GroupByWalker extends AbstractSsql2EqlAstWalker {
    public GroupByWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {
        // TODO
    }
}
