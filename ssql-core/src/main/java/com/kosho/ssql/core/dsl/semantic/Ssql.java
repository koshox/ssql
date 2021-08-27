package com.kosho.ssql.core.dsl.semantic;

import com.kosho.ssql.core.dsl.parser.SsqlErrorListener;
import com.kosho.ssql.core.dsl.parser.SsqlLexer;
import com.kosho.ssql.core.dsl.parser.SsqlParser;
import com.kosho.ssql.core.dsl.semantic.from.From;
import com.kosho.ssql.core.dsl.semantic.group.GroupBy;
import com.kosho.ssql.core.dsl.semantic.limit.Limit;
import com.kosho.ssql.core.dsl.semantic.order.OrderBy;
import com.kosho.ssql.core.dsl.semantic.select.Select;
import com.kosho.ssql.core.dsl.semantic.where.Where;
import com.kosho.ssql.core.dsl.visitor.SsqlAstVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Map;

/**
 * Ssql表达式
 *
 * @author Kosho
 * @since 2021-7-10
 */
public class Ssql {
    private Select select;

    private From from;

    private Where where;

    private GroupBy groupBy;

    private OrderBy orderBy;

    private Limit limit;

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }

    public GroupBy getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        String ssqlStr = select + " " + from;

        if (where != null) {
            ssqlStr = ssqlStr + " " + where;
        }

        if (groupBy != null) {
            ssqlStr = ssqlStr + " " + groupBy;
        }

        if (orderBy != null) {
            ssqlStr = ssqlStr + " " + orderBy;
        }

        if (limit != null) {
            ssqlStr = ssqlStr + " " + limit;
        }

        return ssqlStr;
    }

    /**
     * 编译为Ssql表达式
     *
     * @param ssqlStr ssql字符串
     * @return Ssql表达式
     */
    public static Ssql compile(String ssqlStr) {
        SsqlLexer lexer = new SsqlLexer(CharStreams.fromString(ssqlStr));
        SsqlParser parser = new SsqlParser(new CommonTokenStream(lexer));
        parser.addErrorListener(SsqlErrorListener.INSTANCE);
        SsqlParser.SsqlContext context = parser.ssql();
        return (Ssql) SsqlAstVisitor.INSTANCE.visit(context);
    }

    /**
     * 编译为Ssql表达式
     *
     * @param ssqlStr Ssql字符串
     * @param params  Ssql参数
     * @return Ssql表达式
     */
    public static Ssql compile(String ssqlStr, Map<String, Object> params) {
        Ssql ssql = compile(ssqlStr);
        new SsqlVarReplacer(params).replaceVar(ssql);
        return ssql;
    }
}
