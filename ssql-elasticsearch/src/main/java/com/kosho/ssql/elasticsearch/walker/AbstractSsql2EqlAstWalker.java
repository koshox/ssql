package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.exception.SsqlException;
import com.kosho.ssql.core.dsl.semantic.value.FieldValue;
import com.kosho.ssql.core.dsl.semantic.value.IdentifierValue;
import com.kosho.ssql.core.dsl.semantic.value.StringValue;
import com.kosho.ssql.core.dsl.semantic.value.Value;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import com.kosho.ssql.elasticsearch.Ssql2EqlResult;
import com.kosho.ssql.elasticsearch.Ssql2EqlRewriter;
import org.apache.commons.lang3.StringUtils;

/**
 * 抽象Ssql2Eql表达式遍历者
 *
 * @author Kosho
 * @since 2021-07-16
 */
public abstract class AbstractSsql2EqlAstWalker implements Ssql2EqlAstWalker {
    protected final Ssql2EqlContext context;

    protected final Ssql2EqlResult eqlResult;

    protected AbstractSsql2EqlAstWalker(Ssql2EqlContext context) {
        this.context = context;
        this.eqlResult = context.getSsql2EqlResult();
    }

    protected String walkField(Value field) {
        switch (field.type()) {
            case STRING:
                return resolveFieldName(((StringValue) field).getValue());

            case IDENTIFIER:
                return resolveFieldName(((IdentifierValue) field).getValue());

            case FIELD:
                return resolveFieldName(((FieldValue) field).getValue().getValue());

            default:
                throw unsupportedSemanticEx(field);
        }
    }

    private String resolveFieldName(String fieldName) {
        if (context.getTableAlias() != null) {
            fieldName = StringUtils.removeStart(fieldName, context.getTableAlias() + ".");
        }

        if (context.getTableName() != null) {
            fieldName = StringUtils.removeStart(fieldName, context.getTableName() + ".");
        }

        Ssql2EqlRewriter rewriter = context.getSsql2EqlParams().getRewriter();
        if (rewriter != null) {
            return rewriter.rewriteFieldName(context, fieldName);
        }

        return fieldName;
    }

    protected void unsupportedSemantic(Object semantic) {
        throw new SsqlException("Unsupported semantic: " + semantic.toString());
    }

    protected SsqlException unsupportedSemanticEx(Object semantic) {
        return new SsqlException("Unsupported semantic: " + semantic.toString());
    }
}
