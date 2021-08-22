package com.kosho.ssql.elasticsearch;

import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.core.semantic.SsqlVarReplacer;
import com.kosho.ssql.elasticsearch.walker.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Ssql表达式转换Elasticsearch Query DSL编译器
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class Ssql2EqlCompiler {
    private Ssql2EqlCompiler() {
    }

    public static Ssql2EqlResult compile(String ssqlStr) {
        Ssql ssql = Ssql.compile(ssqlStr);
        return compile(ssql, new Ssql2EqlParams());
    }

    public static Ssql2EqlResult compile(Ssql ssql) {
        return compile(ssql, new Ssql2EqlParams());
    }

    public static Ssql2EqlResult compile(String ssqlStr, Map<String, Object> params) {
        Ssql ssql = Ssql.compile(ssqlStr, params);
        return compile(ssql, new Ssql2EqlParams());
    }

    public static Ssql2EqlResult compile(Ssql ssql, Map<String, Object> params) {
        Ssql2EqlParams ssql2EqlParams = new Ssql2EqlParams();
        ssql2EqlParams.setParams(params);
        return compile(ssql, ssql2EqlParams);
    }

    public static Ssql2EqlResult compile(String ssqlStr, Ssql2EqlParams params) {
        Ssql ssql = Ssql.compile(ssqlStr);
        return compile(ssql, params);
    }

    public static Ssql2EqlResult compile(Ssql ssql, Ssql2EqlParams params) {
        if (params.getParams() != null) {
            new SsqlVarReplacer(params.getParams()).replaceVar(ssql);
        }

        Ssql2EqlContext context = new Ssql2EqlContext();
        context.setSsql2EqlParams(params);
        buildWalkerChain(context).forEach(walker -> walker.walk(ssql));
        return context.getSsql2EqlResult();
    }

    private static List<Ssql2EqlAstWalker> buildWalkerChain(Ssql2EqlContext context) {
        return Arrays.asList(
                new SelectWalker(context),
                new FromWalker(context),
                new WhereWalker(context),
                new GroupByWalker(context),
                new OrderByWalker(context),
                new LimitWalker(context));
    }
}
