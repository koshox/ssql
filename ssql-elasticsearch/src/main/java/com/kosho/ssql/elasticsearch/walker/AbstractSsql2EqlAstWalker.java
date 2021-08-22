package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.exception.SsqlException;
import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import com.kosho.ssql.elasticsearch.Ssql2EqlRewriter;

/**
 * 抽象Ssql2Eql表达式遍历者
 *
 * @author Kosho
 * @since 2021-07-16
 */
public abstract class AbstractSsql2EqlAstWalker implements Ssql2EqlAstWalker {
    protected final Ssql2EqlContext context;

    protected AbstractSsql2EqlAstWalker(Ssql2EqlContext context) {
        this.context = context;
    }

    protected String resolveField(String fieldName) {
        Ssql2EqlRewriter rewriter = context.getSsql2EqlParams().getRewriter();
        if (rewriter != null) {
            return rewriter.rewriteFieldName(fieldName);
        }

        return fieldName;
    }

    protected void unsupportedSemantic(Object semantic) {
        throw new SsqlException("Unsupported semantic: " + semantic.toString());
    }

    protected Exception unsupportedSemanticEx(Object semantic) {
        return new SsqlException("Unsupported semantic: " + semantic.toString());
    }
}
