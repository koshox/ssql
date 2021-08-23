package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.core.semantic.from.From;
import com.kosho.ssql.core.semantic.from.Table;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import com.kosho.ssql.elasticsearch.Ssql2EqlRewriter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * From表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class FromWalker extends AbstractSsql2EqlAstWalker {
    public FromWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {
        From from = ssql.getFrom();
        if (from == null) {
            return;
        }

        if (CollectionUtils.isEmpty(from.getTables()) || from.getTables().size() > 1) {
            // Only support one table now
            unsupportedSemantic(from);
        }

        Table table = from.getTables().get(0);
        context.setTableName(table.getName());
        context.setTableAlias(table.getAlias());

        Ssql2EqlRewriter rewriter = context.getRewriter();
        if (rewriter == null) {
            eqlResult.getIndices().add(table.getName());
            return;
        }

        List<String> indices = rewriter.rewriteTableName(table.getName());
        eqlResult.getIndices().addAll(indices);
    }
}
