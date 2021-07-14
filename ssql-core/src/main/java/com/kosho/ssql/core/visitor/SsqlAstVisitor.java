package com.kosho.ssql.core.visitor;

import com.kosho.ssql.core.parser.SsqlParser;
import com.kosho.ssql.core.parser.SsqlParserBaseVisitor;
import com.kosho.ssql.core.semantic.Ssql;
import com.kosho.ssql.core.semantic.arith.ArithExpression;
import com.kosho.ssql.core.semantic.constants.*;
import com.kosho.ssql.core.semantic.from.From;
import com.kosho.ssql.core.semantic.from.Table;
import com.kosho.ssql.core.semantic.group.GroupBy;
import com.kosho.ssql.core.semantic.group.Having;
import com.kosho.ssql.core.semantic.limit.Limit;
import com.kosho.ssql.core.semantic.order.OrderBy;
import com.kosho.ssql.core.semantic.order.OrderItem;
import com.kosho.ssql.core.semantic.select.Select;
import com.kosho.ssql.core.semantic.select.SelectItem;
import com.kosho.ssql.core.semantic.value.*;
import com.kosho.ssql.core.semantic.where.Expression;
import com.kosho.ssql.core.semantic.where.LogicalExpression;
import com.kosho.ssql.core.semantic.where.OperationExpression;
import com.kosho.ssql.core.semantic.where.Where;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Ssql AST访问者
 *
 * @author Kosho
 * @since 2021-7-10
 */
@SuppressWarnings({"unchecked"})
public class SsqlAstVisitor extends SsqlParserBaseVisitor<Object> {
    public static final SsqlAstVisitor INSTANCE = new SsqlAstVisitor();

    @Override
    public Object visitSsql(SsqlParser.SsqlContext ctx) {
        return visit(ctx.selectStatement());
    }

    @Override
    public Object visitSimpleSelectStatement(SsqlParser.SimpleSelectStatementContext ctx) {
        Ssql ssql = new Ssql();
        if (ctx.selectClause() != null) {
            ssql.setSelect((Select) visitSelectClause(ctx.selectClause()));
        }

        if (ctx.fromClause() != null) {
            ssql.setFrom((From) visitFromClause(ctx.fromClause()));
        }

        if (ctx.whereClause() != null) {
            ssql.setWhere((Where) visitWhereClause(ctx.whereClause()));
        }

        if (ctx.groupByClause() != null) {
            ssql.setGroupBy((GroupBy) visitGroupByClause(ctx.groupByClause()));
        }

        if (ctx.orderByClause() != null) {
            ssql.setOrderBy((OrderBy) visitOrderByClause(ctx.orderByClause()));
        }

        if (ctx.limitClause() != null) {
            ssql.setLimit((Limit) visitLimitClause(ctx.limitClause()));
        }

        return ssql;
    }

    @Override
    public Object visitBracketedSelectStatement(SsqlParser.BracketedSelectStatementContext ctx) {
        return visit(ctx.selectStatement());
    }

    @Override
    public Object visitSelectClause(SsqlParser.SelectClauseContext ctx) {
        Select select = new Select();
        if (ctx.DISTINCT() != null) {
            select.setDistinct(true);
        }

        Object selects = visit(ctx.selectColumns());
        if (selects instanceof String) {
            select.setStar(true);
            return select;
        }

        select.setSelectItems((List<SelectItem>) selects);
        return select;
    }

    @Override
    public Object visitSelectAll(SsqlParser.SelectAllContext ctx) {
        return "*";
    }

    @Override
    public Object visitSelectSpecialColumns(SsqlParser.SelectSpecialColumnsContext ctx) {
        List<SelectItem> selectItems = new ArrayList<>();
        for (SsqlParser.SelectColumnContext column : ctx.selectColumn()) {
            SelectItem selectItem = (SelectItem) visitSelectColumn(column);
            selectItems.add(selectItem);
        }

        return selectItems;
    }

    @Override
    public Object visitSelectColumn(SsqlParser.SelectColumnContext ctx) {
        SelectItem selectItem = new SelectItem();
        selectItem.setField((Value) visit(ctx.column));
        if (ctx.alias != null) {
            String alias = visit(ctx.alias).toString();
            selectItem.setAlias(alias);
        }

        return selectItem;
    }

    @Override
    public Object visitFromClause(SsqlParser.FromClauseContext ctx) {
        From from = new From();
        from.setTables((List<Table>) visitTableRefs(ctx.tableRefs()));
        return from;
    }

    @Override
    public Object visitTableRefs(SsqlParser.TableRefsContext ctx) {
        ArrayList<Table> tables = new ArrayList<>();
        for (SsqlParser.TableRefContext tableRefContext : ctx.tableRef()) {
            tables.add((Table) visitTableRef(tableRefContext));
        }

        return tables;
    }

    @Override
    public Object visitTableRef(SsqlParser.TableRefContext ctx) {
        Table table = new Table();
        table.setName(visit(ctx.table).toString());

        if (ctx.alias != null) {
            table.setAlias(visit(ctx.alias).toString());
        }

        return table;
    }

    @Override
    public Object visitWhereClause(SsqlParser.WhereClauseContext ctx) {
        Where where = new Where();
        where.setExpression((Expression) visit(ctx.expression()));
        return where;
    }

    @Override
    public Object visitLogicExpr(SsqlParser.LogicExprContext ctx) {
        LogicalExpression logicalExpression = new LogicalExpression();
        logicalExpression.setLeft((Expression) visit(ctx.left));
        logicalExpression.setRelation(ctx.AND() != null ? LogicalRelation.AND : LogicalRelation.OR);
        logicalExpression.setRight((Expression) visit(ctx.right));
        return logicalExpression;
    }

    @Override
    public Object visitBracketedExpr(SsqlParser.BracketedExprContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        expression.setBracketed(true);
        return expression;
    }

    @Override
    public Object visitIsNullPredicate(SsqlParser.IsNullPredicateContext ctx) {
        OperationExpression expression = new OperationExpression();
        expression.setField((Value) visit(ctx.fieldAtom()));
        expression.setOperator(ctx.NOT() != null ? Operator.IS_NOT_NULL : Operator.IS_NULL);
        return expression;
    }

    @Override
    public Object visitBinaryComparisonPredicate(SsqlParser.BinaryComparisonPredicateContext ctx) {
        OperationExpression expression = new OperationExpression();
        expression.setField((Value) visit(ctx.fieldAtom()));
        expression.setOperator(Operator.from(ctx.comparisonOperator().getText()));
        expression.setValue((Value) visit(ctx.valueAtom()));
        return expression;
    }

    @Override
    public Object visitInPredicate(SsqlParser.InPredicateContext ctx) {
        OperationExpression expression = new OperationExpression();
        expression.setField((Value) visit(ctx.fieldAtom()));
        expression.setOperator(Operator.IN);
        expression.setValue((Value) (ctx.listValue() != null ? visit(ctx.listValue()) : visit(ctx.varValue())));
        return expression;
    }

    @Override
    public Object visitGroupByClause(SsqlParser.GroupByClauseContext ctx) {
        GroupBy groupBy = new GroupBy();
        List<Value> groupItems = new ArrayList<>();
        groupBy.setGroupItems(groupItems);
        for (SsqlParser.ValueAtomContext valueAtomContext : ctx.valueAtom()) {
            groupItems.add((Value) visit(valueAtomContext.arithExpr()));
        }

        if (ctx.havingClause() != null) {
            groupBy.setHaving((Having) visitHavingClause(ctx.havingClause()));
        }

        return groupBy;
    }

    @Override
    public Object visitHavingClause(SsqlParser.HavingClauseContext ctx) {
        Having having = new Having();
        having.setExpression((Expression) visit(ctx.expression()));
        return having;
    }

    @Override
    public Object visitOrderByClause(SsqlParser.OrderByClauseContext ctx) {
        OrderBy orderBy = new OrderBy();
        List<OrderItem> orderItems = new ArrayList<>();
        orderBy.setOrderItems(orderItems);
        for (SsqlParser.OrderByExprContext orderByExprContext : ctx.orderByExpr()) {
            orderItems.add((OrderItem) visitOrderByExpr(orderByExprContext));
        }

        return orderBy;
    }

    @Override
    public Object visitOrderByExpr(SsqlParser.OrderByExprContext ctx) {
        OrderItem orderItem = new OrderItem();
        orderItem.setField((Value) visit(ctx.field));

        if (ctx.sort() != null) {
            orderItem.setSort((SortType) visitSort(ctx.sort()));
        }

        if (ctx.orderNullsExpr() != null) {
            orderItem.setNullsOrder((NullsOrder) visitOrderNullsExpr(ctx.orderNullsExpr()));
        }

        return orderItem;
    }

    @Override
    public Object visitSort(SsqlParser.SortContext ctx) {
        String sort = ctx.getText().toLowerCase();
        if (SortType.ASC.getType().equals(sort)) {
            return SortType.ASC;
        }

        return SortType.DESC;
    }

    @Override
    public Object visitOrderNullsExpr(SsqlParser.OrderNullsExprContext ctx) {
        if (ctx.FIRST() != null) {
            return NullsOrder.FIRST;
        }

        return NullsOrder.LAST;
    }

    @Override
    public Object visitLimitClause(SsqlParser.LimitClauseContext ctx) {
        Limit limit = new Limit();
        if (ctx.offset != null) {
            limit.setStart(Integer.parseInt(ctx.offset.getText()));
        }

        limit.setLimit(Integer.parseInt(ctx.size.getText()));
        return limit;
    }

    @Override
    public Object visitFieldAtom(SsqlParser.FieldAtomContext ctx) {
        return visit(ctx.arithExpr());
    }

    @Override
    public Object visitValueAtom(SsqlParser.ValueAtomContext ctx) {
        return visit(ctx.arithExpr());
    }

    @Override
    public Object visitNegativeArithExpr(SsqlParser.NegativeArithExprContext ctx) {
        ArithExpression arithExpression = new ArithExpression();
        arithExpression.setOperator(ArithOperator.MINUS);
        arithExpression.setRight((Value) visit(ctx.arithExpr()));
        return arithExpression;
    }

    @Override
    public Object visitFourOpArithExpr(SsqlParser.FourOpArithExprContext ctx) {
        String arithOp = ctx.operator.getText().toLowerCase();
        ArithExpression arithExpression = new ArithExpression();
        arithExpression.setLeft((Value) visit(ctx.left));
        arithExpression.setOperator(ArithOperator.from(arithOp));
        arithExpression.setRight((Value) visit(ctx.right));
        return arithExpression;
    }

    @Override
    public Object visitBracketedArithExpr(SsqlParser.BracketedArithExprContext ctx) {
        ArithExpression arithExpression = (ArithExpression) visit(ctx.arithExpr());
        arithExpression.setBracketed(true);
        return arithExpression;
    }

    @Override
    public Object visitFieldValue(SsqlParser.FieldValueContext ctx) {
        FieldValue fieldValue = new FieldValue();
        if (ctx.owner != null) {
            fieldValue.setOwner((IdentifierValue) visitIdentifierValue(ctx.owner));
        }

        fieldValue.setValue((IdentifierValue) visitIdentifierValue(ctx.name));
        return fieldValue;
    }

    @Override
    public Object visitListValue(SsqlParser.ListValueContext ctx) {
        ListValue listValue = new ListValue();
        List<Value> values = new ArrayList<>();
        for (SsqlParser.ValueAtomContext valueAtom : ctx.valueAtom()) {
            Value value = (Value) visitValueAtom(valueAtom);
            values.add(value);
        }

        listValue.setValues(values);
        return listValue;
    }

    @Override
    public Object visitVarValue(SsqlParser.VarValueContext ctx) {
        return new VarValue(ctx.ID().getText());
    }

    // TODO add function
    @Override
    public Object visitFunctionExpr(SsqlParser.FunctionExprContext ctx) {
        return super.visitFunctionExpr(ctx);
    }

    @Override
    public Object visitFunctionArgs(SsqlParser.FunctionArgsContext ctx) {
        return super.visitFunctionArgs(ctx);
    }

    @Override
    public Object visitArgExpressionAtom(SsqlParser.ArgExpressionAtomContext ctx) {
        return super.visitArgExpressionAtom(ctx);
    }

    @Override
    public Object visitArgArithExprAtom(SsqlParser.ArgArithExprAtomContext ctx) {
        return super.visitArgArithExprAtom(ctx);
    }

    @Override
    public Object visitIdentifierValue(SsqlParser.IdentifierValueContext ctx) {
        IdentifierValue identifierValue = new IdentifierValue();
        if (ctx.ID() != null) {
            identifierValue.setValue(ctx.ID().getText());
            return identifierValue;
        }

        identifierValue.setValue(ctx.DQUOTE_STRING().getText());
        identifierValue.setQuoted(true);
        return identifierValue;
    }

    @Override
    public Object visitConstant(SsqlParser.ConstantContext ctx) {
        if (ctx.NULL() != null) {
            IdentifierValue value = new IdentifierValue();
            value.setValue("null");
            return value;
        }

        return super.visitConstant(ctx);
    }

    @Override
    public Object visitStringLiteral(SsqlParser.StringLiteralContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1);
        return new StringValue(text);
    }

    @Override
    public Object visitNumberLiteral(SsqlParser.NumberLiteralContext ctx) {
        NumberValue numberValue = new NumberValue();
        numberValue.setValue(ctx.getText());
        if (ctx.MINUS() != null) {
            numberValue.setNegative(true);
        }

        return numberValue;
    }

    @Override
    public Object visitBooleanLiteral(SsqlParser.BooleanLiteralContext ctx) {
        return new BooleanValue(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Object visitComparisonOperator(SsqlParser.ComparisonOperatorContext ctx) {
        return ctx.getText().toLowerCase(Locale.ENGLISH);
    }
}
