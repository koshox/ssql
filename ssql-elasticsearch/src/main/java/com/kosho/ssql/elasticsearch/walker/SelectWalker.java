package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.core.semantic.select.Select;
import com.kosho.ssql.core.semantic.select.SelectItem;
import com.kosho.ssql.core.semantic.value.FieldValue;
import com.kosho.ssql.core.semantic.value.IdentifierValue;
import com.kosho.ssql.core.semantic.value.Value;
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
            return;
        }

        select.getSelectItems().forEach(this::walk);
    }

    private void walk(SelectItem selectItem) {
        String alias = selectItem.getAlias();
        Value field = selectItem.getField();

        if (alias != null) {
            context.getSelectAliases().put(alias, field.toString());
        }

        walk(field);
    }

    private void walk(Value field) {
        String fieldName;
        switch (field.type()) {
            case FIELD:
                fieldName = ((FieldValue) field).getValue().getValue();
                walk(fieldName);
                break;

            case IDENTIFIER:
                fieldName =((IdentifierValue)field).getValue();
                walk(fieldName);
                break;

            default:
                unsupportedSemantic(field);
                break;
        }
    }

    private void walk(String fieldName) {
        fieldName = resolveField(fieldName);
        context.getSsql2EqlResult().getIncludes().add(fieldName);
    }
}
