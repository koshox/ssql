// Generated from by ANTLR 4.9.1
package com.kosho.ssql.core.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SsqlParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            SPACE = 1, COMMENT = 2, LINE_COMMENT = 3, SELECT = 4, DISTINCT = 5, FROM = 6, WHERE = 7,
            ORDER = 8, GROUP = 9, HAVING = 10, NULLS = 11, FIRST = 12, LAST = 13, ASC = 14, DESC = 15,
            BY = 16, AS = 17, AND = 18, OR = 19, NOT = 20, IS = 21, LIKE = 22, CONTAINS = 23, BETWEEN = 24,
            EXISTS = 25, LIMIT = 26, TRUE = 27, FALSE = 28, EMPTY = 29, NULL = 30, STAR = 31, DIV = 32,
            MOD = 33, PLUS = 34, MINUS = 35, EQ = 36, EQS = 37, NOT_EQ = 38, GT = 39, GTE = 40, LT = 41,
            LTE = 42, IN = 43, DOT = 44, LBKT = 45, RBKT = 46, COMMA = 47, SEMI = 48, AT_SIGN = 49,
            SINGLE_QUOTE = 50, DOUBLE_QUOTE = 51, REVERSE_QUOTE = 52, COLON = 53, DOLLAR = 54,
            SQUOTE_STRING = 55, DQUOTE_STRING = 56, RQUOTE_STRING = 57, INTEGER = 58, DECIMAL = 59,
            ID = 60;
    public static final int
            RULE_ssql = 0, RULE_selectStatement = 1, RULE_selectClause = 2, RULE_selectColumns = 3,
            RULE_selectColumn = 4, RULE_fromClause = 5, RULE_tableRefs = 6, RULE_tableRef = 7,
            RULE_whereClause = 8, RULE_expression = 9, RULE_predicateExpr = 10, RULE_groupByClause = 11,
            RULE_havingClause = 12, RULE_orderByClause = 13, RULE_orderByExpr = 14,
            RULE_sort = 15, RULE_orderNullsExpr = 16, RULE_limitClause = 17, RULE_fieldAtom = 18,
            RULE_valueAtom = 19, RULE_arithExpr = 20, RULE_simpleValueAtom = 21, RULE_listValue = 22,
            RULE_varValue = 23, RULE_fieldValue = 24, RULE_functionExpr = 25, RULE_functionArgs = 26,
            RULE_argAtom = 27, RULE_identifierValue = 28, RULE_constant = 29, RULE_stringLiteral = 30,
            RULE_numberLiteral = 31, RULE_booleanLiteral = 32, RULE_comparisonOperator = 33;

    private static String[] makeRuleNames() {
        return new String[]{
                "ssql", "selectStatement", "selectClause", "selectColumns", "selectColumn",
                "fromClause", "tableRefs", "tableRef", "whereClause", "expression", "predicateExpr",
                "groupByClause", "havingClause", "orderByClause", "orderByExpr", "sort",
                "orderNullsExpr", "limitClause", "fieldAtom", "valueAtom", "arithExpr",
                "simpleValueAtom", "listValue", "varValue", "fieldValue", "functionExpr",
                "functionArgs", "argAtom", "identifierValue", "constant", "stringLiteral",
                "numberLiteral", "booleanLiteral", "comparisonOperator"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, "'*'", "'/'", "'%'", "'+'",
                "'-'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", null, "'.'",
                "'('", "')'", "','", "';'", "'@'", "'''", "'\"'", "'`'", "':'", "'$'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "SPACE", "COMMENT", "LINE_COMMENT", "SELECT", "DISTINCT", "FROM",
                "WHERE", "ORDER", "GROUP", "HAVING", "NULLS", "FIRST", "LAST", "ASC",
                "DESC", "BY", "AS", "AND", "OR", "NOT", "IS", "LIKE", "CONTAINS", "BETWEEN",
                "EXISTS", "LIMIT", "TRUE", "FALSE", "EMPTY", "NULL", "STAR", "DIV", "MOD",
                "PLUS", "MINUS", "EQ", "EQS", "NOT_EQ", "GT", "GTE", "LT", "LTE", "IN",
                "DOT", "LBKT", "RBKT", "COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE", "DOUBLE_QUOTE",
                "REVERSE_QUOTE", "COLON", "DOLLAR", "SQUOTE_STRING", "DQUOTE_STRING",
                "RQUOTE_STRING", "INTEGER", "DECIMAL", "ID"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "SsqlParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public SsqlParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class SsqlContext extends ParserRuleContext {
        public SelectStatementContext selectStatement() {
            return getRuleContext(SelectStatementContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SsqlParser.EOF, 0);
        }

        public TerminalNode SEMI() {
            return getToken(SsqlParser.SEMI, 0);
        }

        public SsqlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ssql;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor) return ((SsqlParserVisitor<? extends T>) visitor).visitSsql(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SsqlContext ssql() throws RecognitionException {
        SsqlContext _localctx = new SsqlContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_ssql);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                selectStatement();
                setState(70);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SEMI) {
                    {
                        setState(69);
                        match(SEMI);
                    }
                }

                setState(72);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectStatementContext extends ParserRuleContext {
        public SelectStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectStatement;
        }

        public SelectStatementContext() {
        }

        public void copyFrom(SelectStatementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BracketedSelectStatementContext extends SelectStatementContext {
        public TerminalNode LBKT() {
            return getToken(SsqlParser.LBKT, 0);
        }

        public SelectStatementContext selectStatement() {
            return getRuleContext(SelectStatementContext.class, 0);
        }

        public TerminalNode RBKT() {
            return getToken(SsqlParser.RBKT, 0);
        }

        public BracketedSelectStatementContext(SelectStatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitBracketedSelectStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SimpleSelectStatementContext extends SelectStatementContext {
        public SelectClauseContext selectClause() {
            return getRuleContext(SelectClauseContext.class, 0);
        }

        public FromClauseContext fromClause() {
            return getRuleContext(FromClauseContext.class, 0);
        }

        public WhereClauseContext whereClause() {
            return getRuleContext(WhereClauseContext.class, 0);
        }

        public GroupByClauseContext groupByClause() {
            return getRuleContext(GroupByClauseContext.class, 0);
        }

        public OrderByClauseContext orderByClause() {
            return getRuleContext(OrderByClauseContext.class, 0);
        }

        public LimitClauseContext limitClause() {
            return getRuleContext(LimitClauseContext.class, 0);
        }

        public SimpleSelectStatementContext(SelectStatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSimpleSelectStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectStatementContext selectStatement() throws RecognitionException {
        SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_selectStatement);
        int _la;
        try {
            setState(92);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SELECT:
                    _localctx = new SimpleSelectStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(74);
                    selectClause();
                    setState(75);
                    fromClause();
                    setState(77);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == WHERE) {
                        {
                            setState(76);
                            whereClause();
                        }
                    }

                    setState(80);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == GROUP) {
                        {
                            setState(79);
                            groupByClause();
                        }
                    }

                    setState(83);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ORDER) {
                        {
                            setState(82);
                            orderByClause();
                        }
                    }

                    setState(86);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == LIMIT) {
                        {
                            setState(85);
                            limitClause();
                        }
                    }

                }
                break;
                case LBKT:
                    _localctx = new BracketedSelectStatementContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(88);
                    match(LBKT);
                    setState(89);
                    selectStatement();
                    setState(90);
                    match(RBKT);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectClauseContext extends ParserRuleContext {
        public TerminalNode SELECT() {
            return getToken(SsqlParser.SELECT, 0);
        }

        public SelectColumnsContext selectColumns() {
            return getRuleContext(SelectColumnsContext.class, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(SsqlParser.DISTINCT, 0);
        }

        public SelectClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSelectClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectClauseContext selectClause() throws RecognitionException {
        SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_selectClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(94);
                match(SELECT);
                setState(96);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DISTINCT) {
                    {
                        setState(95);
                        match(DISTINCT);
                    }
                }

                setState(98);
                selectColumns();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectColumnsContext extends ParserRuleContext {
        public SelectColumnsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectColumns;
        }

        public SelectColumnsContext() {
        }

        public void copyFrom(SelectColumnsContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SelectAllContext extends SelectColumnsContext {
        public TerminalNode STAR() {
            return getToken(SsqlParser.STAR, 0);
        }

        public SelectAllContext(SelectColumnsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSelectAll(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelectSpecialColumnsContext extends SelectColumnsContext {
        public List<SelectColumnContext> selectColumn() {
            return getRuleContexts(SelectColumnContext.class);
        }

        public SelectColumnContext selectColumn(int i) {
            return getRuleContext(SelectColumnContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SsqlParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SsqlParser.COMMA, i);
        }

        public SelectSpecialColumnsContext(SelectColumnsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSelectSpecialColumns(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectColumnsContext selectColumns() throws RecognitionException {
        SelectColumnsContext _localctx = new SelectColumnsContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_selectColumns);
        int _la;
        try {
            setState(109);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case STAR:
                    _localctx = new SelectAllContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(100);
                    match(STAR);
                }
                break;
                case TRUE:
                case FALSE:
                case NULL:
                case MINUS:
                case LBKT:
                case DOLLAR:
                case SQUOTE_STRING:
                case DQUOTE_STRING:
                case INTEGER:
                case DECIMAL:
                case ID:
                    _localctx = new SelectSpecialColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(101);
                    selectColumn();
                    setState(106);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(102);
                                match(COMMA);
                                setState(103);
                                selectColumn();
                            }
                        }
                        setState(108);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectColumnContext extends ParserRuleContext {
        public ValueAtomContext column;
        public IdentifierValueContext alias;

        public ValueAtomContext valueAtom() {
            return getRuleContext(ValueAtomContext.class, 0);
        }

        public IdentifierValueContext identifierValue() {
            return getRuleContext(IdentifierValueContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SsqlParser.AS, 0);
        }

        public SelectColumnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectColumn;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSelectColumn(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectColumnContext selectColumn() throws RecognitionException {
        SelectColumnContext _localctx = new SelectColumnContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_selectColumn);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(111);
                ((SelectColumnContext) _localctx).column = valueAtom();
                setState(116);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DQUOTE_STRING) | (1L << ID))) != 0)) {
                    {
                        setState(113);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == AS) {
                            {
                                setState(112);
                                match(AS);
                            }
                        }

                        setState(115);
                        ((SelectColumnContext) _localctx).alias = identifierValue();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FromClauseContext extends ParserRuleContext {
        public TerminalNode FROM() {
            return getToken(SsqlParser.FROM, 0);
        }

        public TableRefsContext tableRefs() {
            return getRuleContext(TableRefsContext.class, 0);
        }

        public FromClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fromClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitFromClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FromClauseContext fromClause() throws RecognitionException {
        FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_fromClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(118);
                match(FROM);
                setState(119);
                tableRefs();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableRefsContext extends ParserRuleContext {
        public List<TableRefContext> tableRef() {
            return getRuleContexts(TableRefContext.class);
        }

        public TableRefContext tableRef(int i) {
            return getRuleContext(TableRefContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(SsqlParser.COMMA, 0);
        }

        public TableRefsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableRefs;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitTableRefs(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableRefsContext tableRefs() throws RecognitionException {
        TableRefsContext _localctx = new TableRefsContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_tableRefs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                tableRef();
                setState(124);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(122);
                        match(COMMA);
                        setState(123);
                        tableRef();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableRefContext extends ParserRuleContext {
        public IdentifierValueContext table;
        public IdentifierValueContext alias;

        public List<IdentifierValueContext> identifierValue() {
            return getRuleContexts(IdentifierValueContext.class);
        }

        public IdentifierValueContext identifierValue(int i) {
            return getRuleContext(IdentifierValueContext.class, i);
        }

        public TerminalNode AS() {
            return getToken(SsqlParser.AS, 0);
        }

        public TableRefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableRef;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitTableRef(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableRefContext tableRef() throws RecognitionException {
        TableRefContext _localctx = new TableRefContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_tableRef);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(126);
                ((TableRefContext) _localctx).table = identifierValue();
                setState(131);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DQUOTE_STRING) | (1L << ID))) != 0)) {
                    {
                        setState(128);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == AS) {
                            {
                                setState(127);
                                match(AS);
                            }
                        }

                        setState(130);
                        ((TableRefContext) _localctx).alias = identifierValue();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhereClauseContext extends ParserRuleContext {
        public TerminalNode WHERE() {
            return getToken(SsqlParser.WHERE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public WhereClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whereClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitWhereClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhereClauseContext whereClause() throws RecognitionException {
        WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_whereClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(133);
                match(WHERE);
                setState(134);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public ExpressionContext() {
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class PredicatedExprContext extends ExpressionContext {
        public PredicateExprContext predicateExpr() {
            return getRuleContext(PredicateExprContext.class, 0);
        }

        public PredicatedExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitPredicatedExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LogicExprContext extends ExpressionContext {
        public ExpressionContext left;
        public Token operator;
        public ExpressionContext right;

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(SsqlParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(SsqlParser.OR, 0);
        }

        public LogicExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitLogicExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BracketedExprContext extends ExpressionContext {
        public TerminalNode LBKT() {
            return getToken(SsqlParser.LBKT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RBKT() {
            return getToken(SsqlParser.RBKT, 0);
        }

        public BracketedExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitBracketedExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 18;
        enterRecursionRule(_localctx, 18, RULE_expression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        _localctx = new BracketedExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(137);
                        match(LBKT);
                        setState(138);
                        expression(0);
                        setState(139);
                        match(RBKT);
                    }
                    break;
                    case 2: {
                        _localctx = new PredicatedExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(141);
                        predicateExpr();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(152);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(150);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                                case 1: {
                                    _localctx = new LogicExprContext(new ExpressionContext(_parentctx, _parentState));
                                    ((LogicExprContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(144);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(145);
                                    ((LogicExprContext) _localctx).operator = match(AND);
                                    setState(146);
                                    ((LogicExprContext) _localctx).right = expression(5);
                                }
                                break;
                                case 2: {
                                    _localctx = new LogicExprContext(new ExpressionContext(_parentctx, _parentState));
                                    ((LogicExprContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(147);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(148);
                                    ((LogicExprContext) _localctx).operator = match(OR);
                                    setState(149);
                                    ((LogicExprContext) _localctx).right = expression(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(154);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PredicateExprContext extends ParserRuleContext {
        public PredicateExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicateExpr;
        }

        public PredicateExprContext() {
        }

        public void copyFrom(PredicateExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BinaryComparisonPredicateContext extends PredicateExprContext {
        public FieldAtomContext fieldAtom() {
            return getRuleContext(FieldAtomContext.class, 0);
        }

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public ValueAtomContext valueAtom() {
            return getRuleContext(ValueAtomContext.class, 0);
        }

        public BinaryComparisonPredicateContext(PredicateExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitBinaryComparisonPredicate(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InPredicateContext extends PredicateExprContext {
        public FieldAtomContext fieldAtom() {
            return getRuleContext(FieldAtomContext.class, 0);
        }

        public TerminalNode IN() {
            return getToken(SsqlParser.IN, 0);
        }

        public ListValueContext listValue() {
            return getRuleContext(ListValueContext.class, 0);
        }

        public VarValueContext varValue() {
            return getRuleContext(VarValueContext.class, 0);
        }

        public InPredicateContext(PredicateExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitInPredicate(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IsNullPredicateContext extends PredicateExprContext {
        public FieldAtomContext fieldAtom() {
            return getRuleContext(FieldAtomContext.class, 0);
        }

        public TerminalNode IS() {
            return getToken(SsqlParser.IS, 0);
        }

        public TerminalNode NULL() {
            return getToken(SsqlParser.NULL, 0);
        }

        public TerminalNode NOT() {
            return getToken(SsqlParser.NOT, 0);
        }

        public IsNullPredicateContext(PredicateExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitIsNullPredicate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PredicateExprContext predicateExpr() throws RecognitionException {
        PredicateExprContext _localctx = new PredicateExprContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_predicateExpr);
        int _la;
        try {
            setState(172);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    _localctx = new IsNullPredicateContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(155);
                    fieldAtom();
                    setState(156);
                    match(IS);
                    setState(158);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(157);
                            match(NOT);
                        }
                    }

                    setState(160);
                    match(NULL);
                }
                break;
                case 2:
                    _localctx = new BinaryComparisonPredicateContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(162);
                    fieldAtom();
                    setState(163);
                    comparisonOperator();
                    setState(164);
                    valueAtom();
                }
                break;
                case 3:
                    _localctx = new InPredicateContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(166);
                    fieldAtom();
                    setState(167);
                    match(IN);
                    setState(170);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LBKT: {
                            setState(168);
                            listValue();
                        }
                        break;
                        case DOLLAR: {
                            setState(169);
                            varValue();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GroupByClauseContext extends ParserRuleContext {
        public TerminalNode GROUP() {
            return getToken(SsqlParser.GROUP, 0);
        }

        public TerminalNode BY() {
            return getToken(SsqlParser.BY, 0);
        }

        public List<ValueAtomContext> valueAtom() {
            return getRuleContexts(ValueAtomContext.class);
        }

        public ValueAtomContext valueAtom(int i) {
            return getRuleContext(ValueAtomContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SsqlParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SsqlParser.COMMA, i);
        }

        public HavingClauseContext havingClause() {
            return getRuleContext(HavingClauseContext.class, 0);
        }

        public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_groupByClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitGroupByClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GroupByClauseContext groupByClause() throws RecognitionException {
        GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_groupByClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(174);
                match(GROUP);
                setState(175);
                match(BY);
                setState(176);
                valueAtom();
                setState(181);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(177);
                            match(COMMA);
                            setState(178);
                            valueAtom();
                        }
                    }
                    setState(183);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(185);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == HAVING) {
                    {
                        setState(184);
                        havingClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HavingClauseContext extends ParserRuleContext {
        public TerminalNode HAVING() {
            return getToken(SsqlParser.HAVING, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public HavingClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_havingClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitHavingClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HavingClauseContext havingClause() throws RecognitionException {
        HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_havingClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(187);
                match(HAVING);
                setState(188);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderByClauseContext extends ParserRuleContext {
        public TerminalNode ORDER() {
            return getToken(SsqlParser.ORDER, 0);
        }

        public TerminalNode BY() {
            return getToken(SsqlParser.BY, 0);
        }

        public List<OrderByExprContext> orderByExpr() {
            return getRuleContexts(OrderByExprContext.class);
        }

        public OrderByExprContext orderByExpr(int i) {
            return getRuleContext(OrderByExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SsqlParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SsqlParser.COMMA, i);
        }

        public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderByClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitOrderByClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderByClauseContext orderByClause() throws RecognitionException {
        OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_orderByClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(190);
                match(ORDER);
                setState(191);
                match(BY);
                setState(192);
                orderByExpr();
                setState(197);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(193);
                            match(COMMA);
                            setState(194);
                            orderByExpr();
                        }
                    }
                    setState(199);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderByExprContext extends ParserRuleContext {
        public IdentifierValueContext field;
        public SortContext order;

        public IdentifierValueContext identifierValue() {
            return getRuleContext(IdentifierValueContext.class, 0);
        }

        public OrderNullsExprContext orderNullsExpr() {
            return getRuleContext(OrderNullsExprContext.class, 0);
        }

        public SortContext sort() {
            return getRuleContext(SortContext.class, 0);
        }

        public OrderByExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderByExpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitOrderByExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderByExprContext orderByExpr() throws RecognitionException {
        OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_orderByExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                ((OrderByExprContext) _localctx).field = identifierValue();
                setState(202);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(201);
                        ((OrderByExprContext) _localctx).order = sort();
                    }
                }

                setState(205);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == NULLS) {
                    {
                        setState(204);
                        orderNullsExpr();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SortContext extends ParserRuleContext {
        public TerminalNode ASC() {
            return getToken(SsqlParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SsqlParser.DESC, 0);
        }

        public SortContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sort;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor) return ((SsqlParserVisitor<? extends T>) visitor).visitSort(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SortContext sort() throws RecognitionException {
        SortContext _localctx = new SortContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_sort);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(207);
                _la = _input.LA(1);
                if (!(_la == ASC || _la == DESC)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderNullsExprContext extends ParserRuleContext {
        public Token value;

        public TerminalNode NULLS() {
            return getToken(SsqlParser.NULLS, 0);
        }

        public TerminalNode FIRST() {
            return getToken(SsqlParser.FIRST, 0);
        }

        public TerminalNode LAST() {
            return getToken(SsqlParser.LAST, 0);
        }

        public OrderNullsExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderNullsExpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitOrderNullsExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderNullsExprContext orderNullsExpr() throws RecognitionException {
        OrderNullsExprContext _localctx = new OrderNullsExprContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_orderNullsExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(209);
                match(NULLS);
                setState(210);
                ((OrderNullsExprContext) _localctx).value = _input.LT(1);
                _la = _input.LA(1);
                if (!(_la == FIRST || _la == LAST)) {
                    ((OrderNullsExprContext) _localctx).value = (Token) _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LimitClauseContext extends ParserRuleContext {
        public Token offset;
        public Token size;

        public TerminalNode LIMIT() {
            return getToken(SsqlParser.LIMIT, 0);
        }

        public List<TerminalNode> INTEGER() {
            return getTokens(SsqlParser.INTEGER);
        }

        public TerminalNode INTEGER(int i) {
            return getToken(SsqlParser.INTEGER, i);
        }

        public TerminalNode COMMA() {
            return getToken(SsqlParser.COMMA, 0);
        }

        public LimitClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_limitClause;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitLimitClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LimitClauseContext limitClause() throws RecognitionException {
        LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_limitClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                match(LIMIT);
                setState(215);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                    case 1: {
                        setState(213);
                        ((LimitClauseContext) _localctx).offset = match(INTEGER);
                        setState(214);
                        match(COMMA);
                    }
                    break;
                }
                setState(217);
                ((LimitClauseContext) _localctx).size = match(INTEGER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldAtomContext extends ParserRuleContext {
        public ArithExprContext arithExpr() {
            return getRuleContext(ArithExprContext.class, 0);
        }

        public FieldAtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldAtom;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitFieldAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FieldAtomContext fieldAtom() throws RecognitionException {
        FieldAtomContext _localctx = new FieldAtomContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_fieldAtom);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(219);
                arithExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ValueAtomContext extends ParserRuleContext {
        public ArithExprContext arithExpr() {
            return getRuleContext(ArithExprContext.class, 0);
        }

        public ValueAtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_valueAtom;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitValueAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueAtomContext valueAtom() throws RecognitionException {
        ValueAtomContext _localctx = new ValueAtomContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_valueAtom);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(221);
                arithExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArithExprContext extends ParserRuleContext {
        public ArithExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arithExpr;
        }

        public ArithExprContext() {
        }

        public void copyFrom(ArithExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class NegativeArithExprContext extends ArithExprContext {
        public TerminalNode MINUS() {
            return getToken(SsqlParser.MINUS, 0);
        }

        public ArithExprContext arithExpr() {
            return getRuleContext(ArithExprContext.class, 0);
        }

        public NegativeArithExprContext(ArithExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitNegativeArithExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FourOpArithExprContext extends ArithExprContext {
        public ArithExprContext left;
        public Token operator;
        public ArithExprContext right;

        public List<ArithExprContext> arithExpr() {
            return getRuleContexts(ArithExprContext.class);
        }

        public ArithExprContext arithExpr(int i) {
            return getRuleContext(ArithExprContext.class, i);
        }

        public TerminalNode STAR() {
            return getToken(SsqlParser.STAR, 0);
        }

        public TerminalNode DIV() {
            return getToken(SsqlParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(SsqlParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SsqlParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SsqlParser.MINUS, 0);
        }

        public FourOpArithExprContext(ArithExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitFourOpArithExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SimpleValueArithExprContext extends ArithExprContext {
        public SimpleValueAtomContext simpleValueAtom() {
            return getRuleContext(SimpleValueAtomContext.class, 0);
        }

        public SimpleValueArithExprContext(ArithExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSimpleValueArithExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BracketedArithExprContext extends ArithExprContext {
        public TerminalNode LBKT() {
            return getToken(SsqlParser.LBKT, 0);
        }

        public ArithExprContext arithExpr() {
            return getRuleContext(ArithExprContext.class, 0);
        }

        public TerminalNode RBKT() {
            return getToken(SsqlParser.RBKT, 0);
        }

        public BracketedArithExprContext(ArithExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitBracketedArithExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArithExprContext arithExpr() throws RecognitionException {
        return arithExpr(0);
    }

    private ArithExprContext arithExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ArithExprContext _localctx = new ArithExprContext(_ctx, _parentState);
        ArithExprContext _prevctx = _localctx;
        int _startState = 40;
        enterRecursionRule(_localctx, 40, RULE_arithExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                    case 1: {
                        _localctx = new BracketedArithExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(224);
                        match(LBKT);
                        setState(225);
                        arithExpr(0);
                        setState(226);
                        match(RBKT);
                    }
                    break;
                    case 2: {
                        _localctx = new SimpleValueArithExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(228);
                        simpleValueAtom();
                    }
                    break;
                    case 3: {
                        _localctx = new NegativeArithExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(229);
                        match(MINUS);
                        setState(230);
                        arithExpr(1);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(241);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(239);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                                case 1: {
                                    _localctx = new FourOpArithExprContext(new ArithExprContext(_parentctx, _parentState));
                                    ((FourOpArithExprContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
                                    setState(233);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(234);
                                    ((FourOpArithExprContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((FourOpArithExprContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(235);
                                    ((FourOpArithExprContext) _localctx).right = arithExpr(6);
                                }
                                break;
                                case 2: {
                                    _localctx = new FourOpArithExprContext(new ArithExprContext(_parentctx, _parentState));
                                    ((FourOpArithExprContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
                                    setState(236);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(237);
                                    ((FourOpArithExprContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((FourOpArithExprContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(238);
                                    ((FourOpArithExprContext) _localctx).right = arithExpr(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(243);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class SimpleValueAtomContext extends ParserRuleContext {
        public FieldValueContext fieldValue() {
            return getRuleContext(FieldValueContext.class, 0);
        }

        public IdentifierValueContext identifierValue() {
            return getRuleContext(IdentifierValueContext.class, 0);
        }

        public VarValueContext varValue() {
            return getRuleContext(VarValueContext.class, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public FunctionExprContext functionExpr() {
            return getRuleContext(FunctionExprContext.class, 0);
        }

        public SimpleValueAtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simpleValueAtom;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitSimpleValueAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SimpleValueAtomContext simpleValueAtom() throws RecognitionException {
        SimpleValueAtomContext _localctx = new SimpleValueAtomContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_simpleValueAtom);
        try {
            setState(249);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(244);
                    fieldValue();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(245);
                    identifierValue();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(246);
                    varValue();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(247);
                    constant();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(248);
                    functionExpr();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ListValueContext extends ParserRuleContext {
        public TerminalNode LBKT() {
            return getToken(SsqlParser.LBKT, 0);
        }

        public List<ValueAtomContext> valueAtom() {
            return getRuleContexts(ValueAtomContext.class);
        }

        public ValueAtomContext valueAtom(int i) {
            return getRuleContext(ValueAtomContext.class, i);
        }

        public TerminalNode RBKT() {
            return getToken(SsqlParser.RBKT, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SsqlParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SsqlParser.COMMA, i);
        }

        public ListValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listValue;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitListValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ListValueContext listValue() throws RecognitionException {
        ListValueContext _localctx = new ListValueContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_listValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(251);
                match(LBKT);
                setState(252);
                valueAtom();
                setState(257);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(253);
                            match(COMMA);
                            setState(254);
                            valueAtom();
                        }
                    }
                    setState(259);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(260);
                match(RBKT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VarValueContext extends ParserRuleContext {
        public TerminalNode DOLLAR() {
            return getToken(SsqlParser.DOLLAR, 0);
        }

        public TerminalNode ID() {
            return getToken(SsqlParser.ID, 0);
        }

        public VarValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varValue;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitVarValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VarValueContext varValue() throws RecognitionException {
        VarValueContext _localctx = new VarValueContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_varValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                match(DOLLAR);
                setState(263);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldValueContext extends ParserRuleContext {
        public IdentifierValueContext owner;
        public IdentifierValueContext name;

        public List<IdentifierValueContext> identifierValue() {
            return getRuleContexts(IdentifierValueContext.class);
        }

        public IdentifierValueContext identifierValue(int i) {
            return getRuleContext(IdentifierValueContext.class, i);
        }

        public TerminalNode DOT() {
            return getToken(SsqlParser.DOT, 0);
        }

        public FieldValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldValue;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitFieldValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FieldValueContext fieldValue() throws RecognitionException {
        FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_fieldValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(268);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                    case 1: {
                        setState(265);
                        ((FieldValueContext) _localctx).owner = identifierValue();
                        setState(266);
                        match(DOT);
                    }
                    break;
                }
                setState(270);
                ((FieldValueContext) _localctx).name = identifierValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionExprContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(SsqlParser.ID, 0);
        }

        public TerminalNode LBKT() {
            return getToken(SsqlParser.LBKT, 0);
        }

        public TerminalNode RBKT() {
            return getToken(SsqlParser.RBKT, 0);
        }

        public FunctionArgsContext functionArgs() {
            return getRuleContext(FunctionArgsContext.class, 0);
        }

        public FunctionExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionExpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitFunctionExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionExprContext functionExpr() throws RecognitionException {
        FunctionExprContext _localctx = new FunctionExprContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_functionExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(272);
                match(ID);
                setState(273);
                match(LBKT);
                setState(275);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MINUS) | (1L << LBKT) | (1L << DOLLAR) | (1L << SQUOTE_STRING) | (1L << DQUOTE_STRING) | (1L << INTEGER) | (1L << DECIMAL) | (1L << ID))) != 0)) {
                    {
                        setState(274);
                        functionArgs();
                    }
                }

                setState(277);
                match(RBKT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionArgsContext extends ParserRuleContext {
        public List<ArgAtomContext> argAtom() {
            return getRuleContexts(ArgAtomContext.class);
        }

        public ArgAtomContext argAtom(int i) {
            return getRuleContext(ArgAtomContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SsqlParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SsqlParser.COMMA, i);
        }

        public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionArgs;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitFunctionArgs(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionArgsContext functionArgs() throws RecognitionException {
        FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_functionArgs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(279);
                argAtom();
                setState(284);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(280);
                            match(COMMA);
                            setState(281);
                            argAtom();
                        }
                    }
                    setState(286);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArgAtomContext extends ParserRuleContext {
        public ArgAtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argAtom;
        }

        public ArgAtomContext() {
        }

        public void copyFrom(ArgAtomContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ArgArithExprAtomContext extends ArgAtomContext {
        public ValueAtomContext valueAtom() {
            return getRuleContext(ValueAtomContext.class, 0);
        }

        public ArgArithExprAtomContext(ArgAtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitArgArithExprAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArgExpressionAtomContext extends ArgAtomContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ArgExpressionAtomContext(ArgAtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitArgExpressionAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArgAtomContext argAtom() throws RecognitionException {
        ArgAtomContext _localctx = new ArgAtomContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_argAtom);
        try {
            setState(289);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                case 1:
                    _localctx = new ArgExpressionAtomContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(287);
                    expression(0);
                }
                break;
                case 2:
                    _localctx = new ArgArithExprAtomContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(288);
                    valueAtom();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentifierValueContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(SsqlParser.ID, 0);
        }

        public TerminalNode DQUOTE_STRING() {
            return getToken(SsqlParser.DQUOTE_STRING, 0);
        }

        public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierValue;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitIdentifierValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierValueContext identifierValue() throws RecognitionException {
        IdentifierValueContext _localctx = new IdentifierValueContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_identifierValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                _la = _input.LA(1);
                if (!(_la == DQUOTE_STRING || _la == ID)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstantContext extends ParserRuleContext {
        public TerminalNode NULL() {
            return getToken(SsqlParser.NULL, 0);
        }

        public StringLiteralContext stringLiteral() {
            return getRuleContext(StringLiteralContext.class, 0);
        }

        public NumberLiteralContext numberLiteral() {
            return getRuleContext(NumberLiteralContext.class, 0);
        }

        public BooleanLiteralContext booleanLiteral() {
            return getRuleContext(BooleanLiteralContext.class, 0);
        }

        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitConstant(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_constant);
        try {
            setState(297);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NULL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(293);
                    match(NULL);
                }
                break;
                case SQUOTE_STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(294);
                    stringLiteral();
                }
                break;
                case MINUS:
                case INTEGER:
                case DECIMAL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(295);
                    numberLiteral();
                }
                break;
                case TRUE:
                case FALSE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(296);
                    booleanLiteral();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StringLiteralContext extends ParserRuleContext {
        public TerminalNode SQUOTE_STRING() {
            return getToken(SsqlParser.SQUOTE_STRING, 0);
        }

        public StringLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stringLiteral;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitStringLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StringLiteralContext stringLiteral() throws RecognitionException {
        StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_stringLiteral);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(299);
                match(SQUOTE_STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NumberLiteralContext extends ParserRuleContext {
        public Token literal;

        public TerminalNode INTEGER() {
            return getToken(SsqlParser.INTEGER, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SsqlParser.MINUS, 0);
        }

        public TerminalNode DECIMAL() {
            return getToken(SsqlParser.DECIMAL, 0);
        }

        public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_numberLiteral;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitNumberLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NumberLiteralContext numberLiteral() throws RecognitionException {
        NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_numberLiteral);
        int _la;
        try {
            setState(309);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(302);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == MINUS) {
                        {
                            setState(301);
                            match(MINUS);
                        }
                    }

                    setState(304);
                    ((NumberLiteralContext) _localctx).literal = match(INTEGER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(306);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == MINUS) {
                        {
                            setState(305);
                            match(MINUS);
                        }
                    }

                    setState(308);
                    ((NumberLiteralContext) _localctx).literal = match(DECIMAL);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BooleanLiteralContext extends ParserRuleContext {
        public TerminalNode TRUE() {
            return getToken(SsqlParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(SsqlParser.FALSE, 0);
        }

        public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_booleanLiteral;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitBooleanLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
        BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_booleanLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                _la = _input.LA(1);
                if (!(_la == TRUE || _la == FALSE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ComparisonOperatorContext extends ParserRuleContext {
        public TerminalNode EQ() {
            return getToken(SsqlParser.EQ, 0);
        }

        public TerminalNode GT() {
            return getToken(SsqlParser.GT, 0);
        }

        public TerminalNode GTE() {
            return getToken(SsqlParser.GTE, 0);
        }

        public TerminalNode LT() {
            return getToken(SsqlParser.LT, 0);
        }

        public TerminalNode LTE() {
            return getToken(SsqlParser.LTE, 0);
        }

        public TerminalNode NOT_EQ() {
            return getToken(SsqlParser.NOT_EQ, 0);
        }

        public TerminalNode IS() {
            return getToken(SsqlParser.IS, 0);
        }

        public TerminalNode NOT() {
            return getToken(SsqlParser.NOT, 0);
        }

        public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparisonOperator;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SsqlParserVisitor)
                return ((SsqlParserVisitor<? extends T>) visitor).visitComparisonOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
        ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_comparisonOperator);
        try {
            setState(324);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(313);
                    match(EQ);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(314);
                    match(GT);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(315);
                    match(GTE);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(316);
                    match(LT);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(317);
                    match(LTE);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(318);
                    match(LT);
                    setState(319);
                    match(GT);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(320);
                    match(NOT_EQ);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(321);
                    match(IS);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(322);
                    match(IS);
                    setState(323);
                    match(NOT);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 9:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
            case 20:
                return arithExpr_sempred((ArithExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 4);
            case 1:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private boolean arithExpr_sempred(ArithExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 5);
            case 3:
                return precpred(_ctx, 4);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0149\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\3\2\3\2\5\2I\n\2\3\2\3\2\3\3\3\3\3\3\5\3P\n\3\3\3\5" +
                    "\3S\n\3\3\3\5\3V\n\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\5\4" +
                    "c\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\5\5p\n\5\3\6\3\6" +
                    "\5\6t\n\6\3\6\5\6w\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\5\t" +
                    "\u0083\n\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13" +
                    "\5\13\u0091\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16" +
                    "\13\u009c\13\13\3\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\5\f\u00ad\n\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00b6" +
                    "\n\r\f\r\16\r\u00b9\13\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\17\3\17\3" +
                    "\17\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13\17\3\20\3\20\5\20\u00cd" +
                    "\n\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23" +
                    "\u00da\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\3\26\3\26\5\26\u00ea\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f2\n" +
                    "\26\f\26\16\26\u00f5\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u00fc\n\27\3" +
                    "\30\3\30\3\30\3\30\7\30\u0102\n\30\f\30\16\30\u0105\13\30\3\30\3\30\3" +
                    "\31\3\31\3\31\3\32\3\32\3\32\5\32\u010f\n\32\3\32\3\32\3\33\3\33\3\33" +
                    "\5\33\u0116\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u011d\n\34\f\34\16\34\u0120" +
                    "\13\34\3\35\3\35\5\35\u0124\n\35\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u012c" +
                    "\n\37\3 \3 \3!\5!\u0131\n!\3!\3!\5!\u0135\n!\3!\5!\u0138\n!\3\"\3\"\3" +
                    "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0147\n#\3#\2\4\24*$\2\4\6\b\n\f\16" +
                    "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\3\2\20\21\3\2" +
                    "\16\17\3\2!#\3\2$%\4\2::>>\3\2\35\36\2\u015c\2F\3\2\2\2\4^\3\2\2\2\6`" +
                    "\3\2\2\2\bo\3\2\2\2\nq\3\2\2\2\fx\3\2\2\2\16{\3\2\2\2\20\u0080\3\2\2\2" +
                    "\22\u0087\3\2\2\2\24\u0090\3\2\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32" +
                    "\u00bd\3\2\2\2\34\u00c0\3\2\2\2\36\u00ca\3\2\2\2 \u00d1\3\2\2\2\"\u00d3" +
                    "\3\2\2\2$\u00d6\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*\u00e9\3\2\2\2," +
                    "\u00fb\3\2\2\2.\u00fd\3\2\2\2\60\u0108\3\2\2\2\62\u010e\3\2\2\2\64\u0112" +
                    "\3\2\2\2\66\u0119\3\2\2\28\u0123\3\2\2\2:\u0125\3\2\2\2<\u012b\3\2\2\2" +
                    ">\u012d\3\2\2\2@\u0137\3\2\2\2B\u0139\3\2\2\2D\u0146\3\2\2\2FH\5\4\3\2" +
                    "GI\7\62\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LM\5\6\4" +
                    "\2MO\5\f\7\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5\30\r\2RQ\3\2" +
                    "\2\2RS\3\2\2\2SU\3\2\2\2TV\5\34\17\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY\5" +
                    "$\23\2XW\3\2\2\2XY\3\2\2\2Y_\3\2\2\2Z[\7/\2\2[\\\5\4\3\2\\]\7\60\2\2]" +
                    "_\3\2\2\2^L\3\2\2\2^Z\3\2\2\2_\5\3\2\2\2`b\7\6\2\2ac\7\7\2\2ba\3\2\2\2" +
                    "bc\3\2\2\2cd\3\2\2\2de\5\b\5\2e\7\3\2\2\2fp\7!\2\2gl\5\n\6\2hi\7\61\2" +
                    "\2ik\5\n\6\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2" +
                    "\2of\3\2\2\2og\3\2\2\2p\t\3\2\2\2qv\5(\25\2rt\7\23\2\2sr\3\2\2\2st\3\2" +
                    "\2\2tu\3\2\2\2uw\5:\36\2vs\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xy\7\b\2\2yz\5" +
                    "\16\b\2z\r\3\2\2\2{~\5\20\t\2|}\7\61\2\2}\177\5\20\t\2~|\3\2\2\2~\177" +
                    "\3\2\2\2\177\17\3\2\2\2\u0080\u0085\5:\36\2\u0081\u0083\7\23\2\2\u0082" +
                    "\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\5:" +
                    "\36\2\u0085\u0082\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u0088" +
                    "\7\t\2\2\u0088\u0089\5\24\13\2\u0089\23\3\2\2\2\u008a\u008b\b\13\1\2\u008b" +
                    "\u008c\7/\2\2\u008c\u008d\5\24\13\2\u008d\u008e\7\60\2\2\u008e\u0091\3" +
                    "\2\2\2\u008f\u0091\5\26\f\2\u0090\u008a\3\2\2\2\u0090\u008f\3\2\2\2\u0091" +
                    "\u009a\3\2\2\2\u0092\u0093\f\6\2\2\u0093\u0094\7\24\2\2\u0094\u0099\5" +
                    "\24\13\7\u0095\u0096\f\5\2\2\u0096\u0097\7\25\2\2\u0097\u0099\5\24\13" +
                    "\6\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098" +
                    "\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009a\3\2\2\2\u009d" +
                    "\u009e\5&\24\2\u009e\u00a0\7\27\2\2\u009f\u00a1\7\26\2\2\u00a0\u009f\3" +
                    "\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7 \2\2\u00a3" +
                    "\u00af\3\2\2\2\u00a4\u00a5\5&\24\2\u00a5\u00a6\5D#\2\u00a6\u00a7\5(\25" +
                    "\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\5&\24\2\u00a9\u00ac\7-\2\2\u00aa\u00ad" +
                    "\5.\30\2\u00ab\u00ad\5\60\31\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2" +
                    "\u00ad\u00af\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a8" +
                    "\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\7\22\2\2\u00b2" +
                    "\u00b7\5(\25\2\u00b3\u00b4\7\61\2\2\u00b4\u00b6\5(\25\2\u00b5\u00b3\3" +
                    "\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8" +
                    "\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5\32\16\2\u00bb\u00ba\3" +
                    "\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7\f\2\2\u00be" +
                    "\u00bf\5\24\13\2\u00bf\33\3\2\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\7\22" +
                    "\2\2\u00c2\u00c7\5\36\20\2\u00c3\u00c4\7\61\2\2\u00c4\u00c6\5\36\20\2" +
                    "\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8" +
                    "\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\5:\36\2\u00cb" +
                    "\u00cd\5 \21\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2" +
                    "\2\2\u00ce\u00d0\5\"\22\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0" +
                    "\37\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2!\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4" +
                    "\u00d5\t\3\2\2\u00d5#\3\2\2\2\u00d6\u00d9\7\34\2\2\u00d7\u00d8\7<\2\2" +
                    "\u00d8\u00da\7\61\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db" +
                    "\3\2\2\2\u00db\u00dc\7<\2\2\u00dc%\3\2\2\2\u00dd\u00de\5*\26\2\u00de\'" +
                    "\3\2\2\2\u00df\u00e0\5*\26\2\u00e0)\3\2\2\2\u00e1\u00e2\b\26\1\2\u00e2" +
                    "\u00e3\7/\2\2\u00e3\u00e4\5*\26\2\u00e4\u00e5\7\60\2\2\u00e5\u00ea\3\2" +
                    "\2\2\u00e6\u00ea\5,\27\2\u00e7\u00e8\7%\2\2\u00e8\u00ea\5*\26\3\u00e9" +
                    "\u00e1\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00f3\3\2" +
                    "\2\2\u00eb\u00ec\f\7\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00f2\5*\26\b\u00ee" +
                    "\u00ef\f\6\2\2\u00ef\u00f0\t\5\2\2\u00f0\u00f2\5*\26\7\u00f1\u00eb\3\2" +
                    "\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3" +
                    "\u00f4\3\2\2\2\u00f4+\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fc\5\62\32" +
                    "\2\u00f7\u00fc\5:\36\2\u00f8\u00fc\5\60\31\2\u00f9\u00fc\5<\37\2\u00fa" +
                    "\u00fc\5\64\33\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3" +
                    "\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc-\3\2\2\2\u00fd\u00fe" +
                    "\7/\2\2\u00fe\u0103\5(\25\2\u00ff\u0100\7\61\2\2\u0100\u0102\5(\25\2\u0101" +
                    "\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2" +
                    "\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\60\2\2\u0107" +
                    "/\3\2\2\2\u0108\u0109\78\2\2\u0109\u010a\7>\2\2\u010a\61\3\2\2\2\u010b" +
                    "\u010c\5:\36\2\u010c\u010d\7.\2\2\u010d\u010f\3\2\2\2\u010e\u010b\3\2" +
                    "\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5:\36\2\u0111" +
                    "\63\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0115\7/\2\2\u0114\u0116\5\66\34" +
                    "\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118" +
                    "\7\60\2\2\u0118\65\3\2\2\2\u0119\u011e\58\35\2\u011a\u011b\7\61\2\2\u011b" +
                    "\u011d\58\35\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2" +
                    "\2\2\u011e\u011f\3\2\2\2\u011f\67\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0124" +
                    "\5\24\13\2\u0122\u0124\5(\25\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2" +
                    "\u01249\3\2\2\2\u0125\u0126\t\6\2\2\u0126;\3\2\2\2\u0127\u012c\7 \2\2" +
                    "\u0128\u012c\5> \2\u0129\u012c\5@!\2\u012a\u012c\5B\"\2\u012b\u0127\3" +
                    "\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c" +
                    "=\3\2\2\2\u012d\u012e\79\2\2\u012e?\3\2\2\2\u012f\u0131\7%\2\2\u0130\u012f" +
                    "\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0138\7<\2\2\u0133" +
                    "\u0135\7%\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2" +
                    "\2\2\u0136\u0138\7=\2\2\u0137\u0130\3\2\2\2\u0137\u0134\3\2\2\2\u0138" +
                    "A\3\2\2\2\u0139\u013a\t\7\2\2\u013aC\3\2\2\2\u013b\u0147\7&\2\2\u013c" +
                    "\u0147\7)\2\2\u013d\u0147\7*\2\2\u013e\u0147\7+\2\2\u013f\u0147\7,\2\2" +
                    "\u0140\u0141\7+\2\2\u0141\u0147\7)\2\2\u0142\u0147\7(\2\2\u0143\u0147" +
                    "\7\27\2\2\u0144\u0145\7\27\2\2\u0145\u0147\7\26\2\2\u0146\u013b\3\2\2" +
                    "\2\u0146\u013c\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u013f" +
                    "\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146" +
                    "\u0144\3\2\2\2\u0147E\3\2\2\2*HORUX^blosv~\u0082\u0085\u0090\u0098\u009a" +
                    "\u00a0\u00ac\u00ae\u00b7\u00bb\u00c7\u00cc\u00cf\u00d9\u00e9\u00f1\u00f3" +
                    "\u00fb\u0103\u010e\u0115\u011e\u0123\u012b\u0130\u0134\u0137\u0146";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}