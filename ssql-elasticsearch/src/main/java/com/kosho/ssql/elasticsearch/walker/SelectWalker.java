package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.dsl.semantic.Ssql;
import com.kosho.ssql.core.dsl.semantic.select.Select;
import com.kosho.ssql.core.dsl.semantic.select.SelectItem;
import com.kosho.ssql.core.dsl.semantic.value.Value;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;

/**
 * Select表达式遍历
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class SelectWalker extends AbstractSsql2EqlAstWalker {
    public SelectWalker(Ssql2EqlContext context) {
        super(context);
    }

    @Override
    public void walk(Ssql ssql) {
        Select select = ssql.getSelect();

        if (select == null) {
            return;
        }

        if (select.isStar()) {
            eqlResult.setFetchSource(true);
            return;
        }

        select.getSelectItems().forEach(this::walkSelectItem);
        if (!eqlResult.getIncludes().isEmpty()) {
            eqlResult.setFetchSource(true);
        }
    }

    private void walkSelectItem(SelectItem selectItem) {
        String alias = selectItem.getAlias();
        Value field = selectItem.getField();

        if (alias != null) {
            context.getSelectAliases().put(alias, field.toString());
        }

        String fieldName = walkField(field);
        eqlResult.getIncludes().add(fieldName);
    }
}
