package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.core.semantic.limit.Limit;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import com.kosho.ssql.elasticsearch.Ssql2EqlResult;

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

        eqlResult.setFrom(limit.getLimit());
        eqlResult.setSize(Math.min(limit.getLimit(), context.getSsql2EqlParams().getMaxLimit()));
    }
}
