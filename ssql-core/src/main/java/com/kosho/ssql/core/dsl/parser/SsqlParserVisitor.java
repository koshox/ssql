// Generated from by ANTLR 4.9.1
package com.kosho.ssql.core.dsl.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface SsqlParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link SsqlParser#ssql}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSsql(SsqlParser.SsqlContext ctx);

    /**
     * Visit a parse tree produced by the {@code simpleSelectStatement}
     * labeled alternative in {@link SsqlParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSimpleSelectStatement(SsqlParser.SimpleSelectStatementContext ctx);

    /**
     * Visit a parse tree produced by the {@code bracketedSelectStatement}
     * labeled alternative in {@link SsqlParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBracketedSelectStatement(SsqlParser.BracketedSelectStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#selectClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectClause(SsqlParser.SelectClauseContext ctx);

    /**
     * Visit a parse tree produced by the {@code selectAll}
     * labeled alternative in {@link SsqlParser#selectColumns}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectAll(SsqlParser.SelectAllContext ctx);

    /**
     * Visit a parse tree produced by the {@code selectSpecialColumns}
     * labeled alternative in {@link SsqlParser#selectColumns}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectSpecialColumns(SsqlParser.SelectSpecialColumnsContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#selectColumn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectColumn(SsqlParser.SelectColumnContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#fromClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFromClause(SsqlParser.FromClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#tableRefs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRefs(SsqlParser.TableRefsContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#tableRef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRef(SsqlParser.TableRefContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#whereClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhereClause(SsqlParser.WhereClauseContext ctx);

    /**
     * Visit a parse tree produced by the {@code predicatedExpr}
     * labeled alternative in {@link SsqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPredicatedExpr(SsqlParser.PredicatedExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code logicExpr}
     * labeled alternative in {@link SsqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogicExpr(SsqlParser.LogicExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code bracketedExpr}
     * labeled alternative in {@link SsqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBracketedExpr(SsqlParser.BracketedExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code isNullPredicate}
     * labeled alternative in {@link SsqlParser#predicateExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsNullPredicate(SsqlParser.IsNullPredicateContext ctx);

    /**
     * Visit a parse tree produced by the {@code binaryComparisonPredicate}
     * labeled alternative in {@link SsqlParser#predicateExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinaryComparisonPredicate(SsqlParser.BinaryComparisonPredicateContext ctx);

    /**
     * Visit a parse tree produced by the {@code inPredicate}
     * labeled alternative in {@link SsqlParser#predicateExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInPredicate(SsqlParser.InPredicateContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#groupByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupByClause(SsqlParser.GroupByClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#havingClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHavingClause(SsqlParser.HavingClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#orderByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderByClause(SsqlParser.OrderByClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#orderByExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderByExpr(SsqlParser.OrderByExprContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#sort}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSort(SsqlParser.SortContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#orderNullsExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderNullsExpr(SsqlParser.OrderNullsExprContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#limitClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLimitClause(SsqlParser.LimitClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#fieldAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldAtom(SsqlParser.FieldAtomContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#valueAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueAtom(SsqlParser.ValueAtomContext ctx);

    /**
     * Visit a parse tree produced by the {@code negativeArithExpr}
     * labeled alternative in {@link SsqlParser#arithExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNegativeArithExpr(SsqlParser.NegativeArithExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code fourOpArithExpr}
     * labeled alternative in {@link SsqlParser#arithExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFourOpArithExpr(SsqlParser.FourOpArithExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code simpleValueArithExpr}
     * labeled alternative in {@link SsqlParser#arithExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSimpleValueArithExpr(SsqlParser.SimpleValueArithExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code bracketedArithExpr}
     * labeled alternative in {@link SsqlParser#arithExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBracketedArithExpr(SsqlParser.BracketedArithExprContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#simpleValueAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSimpleValueAtom(SsqlParser.SimpleValueAtomContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#listValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitListValue(SsqlParser.ListValueContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#varValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarValue(SsqlParser.VarValueContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#fieldValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldValue(SsqlParser.FieldValueContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#functionExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionExpr(SsqlParser.FunctionExprContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#functionArgs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionArgs(SsqlParser.FunctionArgsContext ctx);

    /**
     * Visit a parse tree produced by the {@code argExpressionAtom}
     * labeled alternative in {@link SsqlParser#argAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgExpressionAtom(SsqlParser.ArgExpressionAtomContext ctx);

    /**
     * Visit a parse tree produced by the {@code argArithExprAtom}
     * labeled alternative in {@link SsqlParser#argAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgArithExprAtom(SsqlParser.ArgArithExprAtomContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#identifierValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierValue(SsqlParser.IdentifierValueContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstant(SsqlParser.ConstantContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#stringLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringLiteral(SsqlParser.StringLiteralContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#numberLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumberLiteral(SsqlParser.NumberLiteralContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanLiteral(SsqlParser.BooleanLiteralContext ctx);

    /**
     * Visit a parse tree produced by {@link SsqlParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparisonOperator(SsqlParser.ComparisonOperatorContext ctx);
}