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
        Ssql2EqlResult ssql2EqlResult = context.getSsql2EqlResult();

        if (limit == null) {
            ssql2EqlResult.setFrom(0);
            ssql2EqlResult.setSize(context.getSsql2EqlParams().getDefaultLimit());
            return;
        }

        ssql2EqlResult.setFrom(limit.getLimit());
        ssql2EqlResult.setSize(Math.min(limit.getLimit(), context.getSsql2EqlParams().getMaxLimit()));
    }
}
