package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;

/**
 * Where表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class WhereWalker extends AbstractSsql2EqlAstWalker {
    public WhereWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {

    }
}
