package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.core.dsl.semantic.limit.Limit;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;

/**
 * Limit表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class LimitWalker extends AbstractSsql2EqlAstWalker {
    public LimitWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {
        Limit limit = ssql.getLimit();

        if (limit == null) {
            eqlResult.setFrom(0);
            eqlResult.setSize(context.getSsql2EqlParams().getDefaultLimit());
            return;
        }

        if (limit.getStart() != null) {
            eqlResult.setFrom(limit.getStart());
        }

        if (limit.getLimit() != null) {
            eqlResult.setSize(Math.min(limit.getLimit(), context.getSsql2EqlParams().getMaxLimit()));
        }
    }
}
