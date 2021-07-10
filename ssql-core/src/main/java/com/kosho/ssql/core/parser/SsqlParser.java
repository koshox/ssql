// Generated from F:/my-git-proj/ssql/ssql-core/src/main/resources/antlr4\SsqlParser.g4 by ANTLR 4.9.1
package com.kosho.ssql.core.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, COMMENT=2, LINE_COMMENT=3, SELECT=4, DISTINCT=5, FROM=6, WHERE=7, 
		ORDER=8, GROUP=9, HAVING=10, NULLS=11, FIRST=12, LAST=13, ASC=14, DESC=15, 
		BY=16, AS=17, AND=18, OR=19, NOT=20, IS=21, IN=22, LIKE=23, CONTAINS=24, 
		BETWEEN=25, EXISTS=26, LIMIT=27, TRUE=28, FALSE=29, EMPTY=30, NULL=31, 
		STAR=32, DIV=33, MOD=34, PLUS=35, MINUS=36, EQ=37, EQS=38, NOT_EQ=39, 
		GT=40, GTE=41, LT=42, LTE=43, AND_SYB=44, OR_SYB=45, DOT=46, LBKT=47, 
		RBKT=48, COMMA=49, SEMI=50, AT_SIGN=51, SINGLE_QUOTE=52, DOUBLE_QUOTE=53, 
		REVERSE_QUOTE=54, COLON=55, SQUOTE_STRING=56, DQUOTE_STRING=57, RQUOTE_STRING=58, 
		INTEGER=59, DECIMAL=60, ID=61;
	public static final int
		RULE_ssql = 0, RULE_selectStatment = 1, RULE_bracketedSelectStatment = 2, 
		RULE_simpleSelectStatment = 3, RULE_selectClause = 4, RULE_selectColumns = 5, 
		RULE_selectColumn = 6, RULE_fromClause = 7, RULE_tableRefs = 8, RULE_tableRef = 9, 
		RULE_whereClause = 10, RULE_expression = 11, RULE_predicateExpr = 12, 
		RULE_groupByClause = 13, RULE_havingClause = 14, RULE_orderByClause = 15, 
		RULE_orderByExpr = 16, RULE_sort = 17, RULE_orderNullsExpr = 18, RULE_limitClause = 19, 
		RULE_fieldAtom = 20, RULE_valueAtom = 21, RULE_arithExpr = 22, RULE_simpleValueAtom = 23, 
		RULE_fieldValue = 24, RULE_functionExpr = 25, RULE_functionArgs = 26, 
		RULE_argAtom = 27, RULE_identifierValue = 28, RULE_constant = 29, RULE_stringLiteral = 30, 
		RULE_numberLiteral = 31, RULE_booleanLiteral = 32, RULE_comparisonOperator = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"ssql", "selectStatment", "bracketedSelectStatment", "simpleSelectStatment", 
			"selectClause", "selectColumns", "selectColumn", "fromClause", "tableRefs", 
			"tableRef", "whereClause", "expression", "predicateExpr", "groupByClause", 
			"havingClause", "orderByClause", "orderByExpr", "sort", "orderNullsExpr", 
			"limitClause", "fieldAtom", "valueAtom", "arithExpr", "simpleValueAtom", 
			"fieldValue", "functionExpr", "functionArgs", "argAtom", "identifierValue", 
			"constant", "stringLiteral", "numberLiteral", "booleanLiteral", "comparisonOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", 
			"'||'", "'.'", "'('", "')'", "','", "';'", "'@'", "'''", "'\"'", "'`'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "COMMENT", "LINE_COMMENT", "SELECT", "DISTINCT", "FROM", 
			"WHERE", "ORDER", "GROUP", "HAVING", "NULLS", "FIRST", "LAST", "ASC", 
			"DESC", "BY", "AS", "AND", "OR", "NOT", "IS", "IN", "LIKE", "CONTAINS", 
			"BETWEEN", "EXISTS", "LIMIT", "TRUE", "FALSE", "EMPTY", "NULL", "STAR", 
			"DIV", "MOD", "PLUS", "MINUS", "EQ", "EQS", "NOT_EQ", "GT", "GTE", "LT", 
			"LTE", "AND_SYB", "OR_SYB", "DOT", "LBKT", "RBKT", "COMMA", "SEMI", "AT_SIGN", 
			"SINGLE_QUOTE", "DOUBLE_QUOTE", "REVERSE_QUOTE", "COLON", "SQUOTE_STRING", 
			"DQUOTE_STRING", "RQUOTE_STRING", "INTEGER", "DECIMAL", "ID"
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
	public String getGrammarFileName() { return "SsqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SsqlContext extends ParserRuleContext {
		public SelectStatmentContext selectStatment() {
			return getRuleContext(SelectStatmentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SsqlParser.EOF, 0); }
		public SsqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ssql; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSsql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SsqlContext ssql() throws RecognitionException {
		SsqlContext _localctx = new SsqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ssql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			selectStatment();
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatmentContext extends ParserRuleContext {
		public SimpleSelectStatmentContext simpleSelectStatment() {
			return getRuleContext(SimpleSelectStatmentContext.class,0);
		}
		public BracketedSelectStatmentContext bracketedSelectStatment() {
			return getRuleContext(BracketedSelectStatmentContext.class,0);
		}
		public SelectStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSelectStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatmentContext selectStatment() throws RecognitionException {
		SelectStatmentContext _localctx = new SelectStatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectStatment);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				simpleSelectStatment();
				}
				break;
			case LBKT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				bracketedSelectStatment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketedSelectStatmentContext extends ParserRuleContext {
		public TerminalNode LBKT() { return getToken(SsqlParser.LBKT, 0); }
		public SimpleSelectStatmentContext simpleSelectStatment() {
			return getRuleContext(SimpleSelectStatmentContext.class,0);
		}
		public TerminalNode RBKT() { return getToken(SsqlParser.RBKT, 0); }
		public BracketedSelectStatmentContext bracketedSelectStatment() {
			return getRuleContext(BracketedSelectStatmentContext.class,0);
		}
		public BracketedSelectStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedSelectStatment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitBracketedSelectStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketedSelectStatmentContext bracketedSelectStatment() throws RecognitionException {
		BracketedSelectStatmentContext _localctx = new BracketedSelectStatmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bracketedSelectStatment);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(LBKT);
				setState(76);
				simpleSelectStatment();
				setState(77);
				match(RBKT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(LBKT);
				setState(80);
				bracketedSelectStatment();
				setState(81);
				match(RBKT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleSelectStatmentContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SimpleSelectStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectStatment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSimpleSelectStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectStatmentContext simpleSelectStatment() throws RecognitionException {
		SimpleSelectStatmentContext _localctx = new SimpleSelectStatmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleSelectStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			selectClause();
			setState(86);
			fromClause();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(87);
				whereClause();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(90);
				groupByClause();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(93);
				orderByClause();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(96);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SsqlParser.SELECT, 0); }
		public SelectColumnsContext selectColumns() {
			return getRuleContext(SelectColumnsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SsqlParser.DISTINCT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(SELECT);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(100);
				match(DISTINCT);
				}
			}

			setState(103);
			selectColumns();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnsContext extends ParserRuleContext {
		public SelectColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumns; }
	 
		public SelectColumnsContext() { }
		public void copyFrom(SelectColumnsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectColumnsContext {
		public TerminalNode STAR() { return getToken(SsqlParser.STAR, 0); }
		public SelectAllContext(SelectColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSepcialColumnsContext extends SelectColumnsContext {
		public List<SelectColumnContext> selectColumn() {
			return getRuleContexts(SelectColumnContext.class);
		}
		public SelectColumnContext selectColumn(int i) {
			return getRuleContext(SelectColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SsqlParser.COMMA, i);
		}
		public SelectSepcialColumnsContext(SelectColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSelectSepcialColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnsContext selectColumns() throws RecognitionException {
		SelectColumnsContext _localctx = new SelectColumnsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectColumns);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(STAR);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case MINUS:
			case LBKT:
			case SQUOTE_STRING:
			case DQUOTE_STRING:
			case INTEGER:
			case DECIMAL:
			case ID:
				_localctx = new SelectSepcialColumnsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				selectColumn();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(107);
					match(COMMA);
					setState(108);
					selectColumn();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnContext extends ParserRuleContext {
		public ValueAtomContext column;
		public IdentifierValueContext alias;
		public ValueAtomContext valueAtom() {
			return getRuleContext(ValueAtomContext.class,0);
		}
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public TerminalNode AS() { return getToken(SsqlParser.AS, 0); }
		public SelectColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSelectColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnContext selectColumn() throws RecognitionException {
		SelectColumnContext _localctx = new SelectColumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((SelectColumnContext)_localctx).column = valueAtom();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DQUOTE_STRING) | (1L << ID))) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(117);
					match(AS);
					}
				}

				setState(120);
				((SelectColumnContext)_localctx).alias = identifierValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SsqlParser.FROM, 0); }
		public TableRefsContext tableRefs() {
			return getRuleContext(TableRefsContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FROM);
			setState(124);
			tableRefs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRefsContext extends ParserRuleContext {
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SsqlParser.COMMA, 0); }
		public TableRefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRefs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitTableRefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefsContext tableRefs() throws RecognitionException {
		TableRefsContext _localctx = new TableRefsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableRefs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			tableRef();
			{
			setState(127);
			match(COMMA);
			setState(128);
			tableRef();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
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
			return getRuleContext(IdentifierValueContext.class,i);
		}
		public TerminalNode AS() { return getToken(SsqlParser.AS, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitTableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((TableRefContext)_localctx).table = identifierValue();
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(131);
				match(AS);
				}
			}

			setState(134);
			((TableRefContext)_localctx).alias = identifierValue();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SsqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHERE);
			setState(137);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicatedExprContext extends ExpressionContext {
		public PredicateExprContext predicateExpr() {
			return getRuleContext(PredicateExprContext.class,0);
		}
		public PredicatedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitPredicatedExpr(this);
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
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SsqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SsqlParser.OR, 0); }
		public LogicExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedExprContext extends ExpressionContext {
		public TerminalNode LBKT() { return getToken(SsqlParser.LBKT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBKT() { return getToken(SsqlParser.RBKT, 0); }
		public BracketedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitBracketedExpr(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(140);
				match(LBKT);
				setState(141);
				expression(0);
				setState(142);
				match(RBKT);
				}
				break;
			case 2:
				{
				_localctx = new PredicatedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				predicateExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExprContext(new ExpressionContext(_parentctx, _parentState));
						((LogicExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						((LogicExprContext)_localctx).operator = match(AND);
						setState(149);
						((LogicExprContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicExprContext(new ExpressionContext(_parentctx, _parentState));
						((LogicExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						((LogicExprContext)_localctx).operator = match(OR);
						setState(152);
						((LogicExprContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateExprContext extends ParserRuleContext {
		public PredicateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateExpr; }
	 
		public PredicateExprContext() { }
		public void copyFrom(PredicateExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinarycomparisonPredicateContext extends PredicateExprContext {
		public FieldAtomContext fieldAtom() {
			return getRuleContext(FieldAtomContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueAtomContext valueAtom() {
			return getRuleContext(ValueAtomContext.class,0);
		}
		public BinarycomparisonPredicateContext(PredicateExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitBinarycomparisonPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNullPredicateContext extends PredicateExprContext {
		public FieldAtomContext fieldAtom() {
			return getRuleContext(FieldAtomContext.class,0);
		}
		public TerminalNode IS() { return getToken(SsqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SsqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SsqlParser.NOT, 0); }
		public IsNullPredicateContext(PredicateExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitIsNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateExprContext predicateExpr() throws RecognitionException {
		PredicateExprContext _localctx = new PredicateExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predicateExpr);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IsNullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				fieldAtom();
				setState(159);
				match(IS);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(160);
					match(NOT);
					}
				}

				setState(163);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new BinarycomparisonPredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				fieldAtom();
				setState(166);
				comparisonOperator();
				setState(167);
				valueAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SsqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SsqlParser.BY, 0); }
		public List<ValueAtomContext> valueAtom() {
			return getRuleContexts(ValueAtomContext.class);
		}
		public ValueAtomContext valueAtom(int i) {
			return getRuleContext(ValueAtomContext.class,i);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SsqlParser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(GROUP);
			setState(172);
			match(BY);
			setState(173);
			valueAtom();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(175);
				valueAtom();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			havingClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SsqlParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(HAVING);
			setState(184);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SsqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SsqlParser.BY, 0); }
		public List<OrderByExprContext> orderByExpr() {
			return getRuleContexts(OrderByExprContext.class);
		}
		public OrderByExprContext orderByExpr(int i) {
			return getRuleContext(OrderByExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SsqlParser.COMMA, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ORDER);
			setState(187);
			match(BY);
			setState(188);
			orderByExpr();
			{
			setState(189);
			match(COMMA);
			setState(190);
			orderByExpr();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByExprContext extends ParserRuleContext {
		public IdentifierValueContext field;
		public SortContext order;
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public OrderNullsExprContext orderNullsExpr() {
			return getRuleContext(OrderNullsExprContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitOrderByExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((OrderByExprContext)_localctx).field = identifierValue();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(193);
				((OrderByExprContext)_localctx).order = sort();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(196);
				orderNullsExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SsqlParser.DESC, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderNullsExprContext extends ParserRuleContext {
		public Token value;
		public TerminalNode NULLS() { return getToken(SsqlParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(SsqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SsqlParser.LAST, 0); }
		public OrderNullsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderNullsExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitOrderNullsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderNullsExprContext orderNullsExpr() throws RecognitionException {
		OrderNullsExprContext _localctx = new OrderNullsExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_orderNullsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(NULLS);
			setState(202);
			((OrderNullsExprContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==LAST) ) {
				((OrderNullsExprContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public Token offset;
		public Token size;
		public List<TerminalNode> INTEGER() { return getTokens(SsqlParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SsqlParser.INTEGER, i);
		}
		public TerminalNode COMMA() { return getToken(SsqlParser.COMMA, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(204);
				((LimitClauseContext)_localctx).offset = match(INTEGER);
				setState(205);
				match(COMMA);
				}
				break;
			}
			setState(208);
			((LimitClauseContext)_localctx).size = match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAtomContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public FieldAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitFieldAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAtomContext fieldAtom() throws RecognitionException {
		FieldAtomContext _localctx = new FieldAtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			arithExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueAtomContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public ValueAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitValueAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueAtomContext valueAtom() throws RecognitionException {
		ValueAtomContext _localctx = new ValueAtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_valueAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			arithExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithExprContext extends ParserRuleContext {
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
	 
		public ArithExprContext() { }
		public void copyFrom(ArithExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegativeArithExprContext extends ArithExprContext {
		public TerminalNode MINUS() { return getToken(SsqlParser.MINUS, 0); }
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public NegativeArithExprContext(ArithExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitNegativeArithExpr(this);
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
			return getRuleContext(ArithExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SsqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SsqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SsqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SsqlParser.MINUS, 0); }
		public FourOpArithExprContext(ArithExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitFourOpArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleValueArithExprContext extends ArithExprContext {
		public SimpleValueAtomContext simpleValueAtom() {
			return getRuleContext(SimpleValueAtomContext.class,0);
		}
		public SimpleValueArithExprContext(ArithExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSimpleValueArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedArithExprContext extends ArithExprContext {
		public TerminalNode LBKT() { return getToken(SsqlParser.LBKT, 0); }
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public TerminalNode RBKT() { return getToken(SsqlParser.RBKT, 0); }
		public BracketedArithExprContext(ArithExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitBracketedArithExpr(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_arithExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedArithExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(215);
				match(LBKT);
				setState(216);
				arithExpr(0);
				setState(217);
				match(RBKT);
				}
				break;
			case 2:
				{
				_localctx = new SimpleValueArithExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				simpleValueAtom();
				}
				break;
			case 3:
				{
				_localctx = new NegativeArithExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(MINUS);
				setState(221);
				arithExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new FourOpArithExprContext(new ArithExprContext(_parentctx, _parentState));
						((FourOpArithExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(224);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(225);
						((FourOpArithExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((FourOpArithExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						((FourOpArithExprContext)_localctx).right = arithExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new FourOpArithExprContext(new ArithExprContext(_parentctx, _parentState));
						((FourOpArithExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(227);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(228);
						((FourOpArithExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((FourOpArithExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						((FourOpArithExprContext)_localctx).right = arithExpr(5);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleValueAtomContext extends ParserRuleContext {
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public SimpleValueAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleValueAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitSimpleValueAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleValueAtomContext simpleValueAtom() throws RecognitionException {
		SimpleValueAtomContext _localctx = new SimpleValueAtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_simpleValueAtom);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				fieldValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				identifierValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				functionExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
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
			return getRuleContext(IdentifierValueContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SsqlParser.DOT, 0); }
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitFieldValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(241);
				((FieldValueContext)_localctx).owner = identifierValue();
				setState(242);
				match(DOT);
				}
				break;
			}
			setState(246);
			((FieldValueContext)_localctx).name = identifierValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SsqlParser.ID, 0); }
		public TerminalNode LBKT() { return getToken(SsqlParser.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(SsqlParser.RBKT, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitFunctionExpr(this);
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
			setState(248);
			match(ID);
			setState(249);
			match(LBKT);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MINUS) | (1L << LBKT) | (1L << SQUOTE_STRING) | (1L << DQUOTE_STRING) | (1L << INTEGER) | (1L << DECIMAL) | (1L << ID))) != 0)) {
				{
				setState(250);
				functionArgs();
				}
			}

			setState(253);
			match(RBKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<ArgAtomContext> argAtom() {
			return getRuleContexts(ArgAtomContext.class);
		}
		public ArgAtomContext argAtom(int i) {
			return getRuleContext(ArgAtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SsqlParser.COMMA, i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitFunctionArgs(this);
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
			setState(255);
			argAtom();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				argAtom();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgAtomContext extends ParserRuleContext {
		public ArgAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argAtom; }
	 
		public ArgAtomContext() { }
		public void copyFrom(ArgAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgArithExprAtomContext extends ArgAtomContext {
		public ValueAtomContext valueAtom() {
			return getRuleContext(ValueAtomContext.class,0);
		}
		public ArgArithExprAtomContext(ArgAtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitArgArithExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgExpressionAtomContext extends ArgAtomContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgExpressionAtomContext(ArgAtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitArgExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgAtomContext argAtom() throws RecognitionException {
		ArgAtomContext _localctx = new ArgAtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argAtom);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ArgExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArgArithExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				valueAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SsqlParser.ID, 0); }
		public TerminalNode DQUOTE_STRING() { return getToken(SsqlParser.DQUOTE_STRING, 0); }
		public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitIdentifierValue(this);
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
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==DQUOTE_STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(SsqlParser.NULL, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(NULL);
				}
				break;
			case SQUOTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				stringLiteral();
				}
				break;
			case MINUS:
			case INTEGER:
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				numberLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode SQUOTE_STRING() { return getToken(SsqlParser.SQUOTE_STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(SQUOTE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public Token literal;
		public TerminalNode INTEGER() { return getToken(SsqlParser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(SsqlParser.MINUS, 0); }
		public TerminalNode DECIMAL() { return getToken(SsqlParser.DECIMAL, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numberLiteral);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(277);
					match(MINUS);
					}
				}

				setState(280);
				((NumberLiteralContext)_localctx).literal = match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(281);
					match(MINUS);
					}
				}

				setState(284);
				((NumberLiteralContext)_localctx).literal = match(DECIMAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SsqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SsqlParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
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
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SsqlParser.EQ, 0); }
		public TerminalNode GT() { return getToken(SsqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SsqlParser.GTE, 0); }
		public TerminalNode LT() { return getToken(SsqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SsqlParser.LTE, 0); }
		public TerminalNode NOT_EQ() { return getToken(SsqlParser.NOT_EQ, 0); }
		public TerminalNode IS() { return getToken(SsqlParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SsqlParser.NOT, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlParserVisitor ) return ((SsqlParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comparisonOperator);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(GTE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(LT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(LTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				match(LT);
				setState(295);
				match(GT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				match(NOT_EQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(IS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				match(IS);
				setState(299);
				match(NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 22:
			return arithExpr_sempred((ArithExprContext)_localctx, predIndex);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0131\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\5\5[\n\5\3\5\5\5^\n\5\3\5\5\5a\n\5\3\5\5"+
		"\5d\n\5\3\6\3\6\5\6h\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13"+
		"\7\5\7u\n\7\3\b\3\b\5\by\n\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\5\13\u0087\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0094\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f"+
		"\13\r\3\16\3\16\3\16\5\16\u00a4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ac\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u00c5\n\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\5\25\u00d1\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00e1\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u00e9\n\30\f\30\16\30\u00ec\13\30\3\31\3\31\3\31\3\31\5\31\u00f2\n\31"+
		"\3\32\3\32\3\32\5\32\u00f7\n\32\3\32\3\32\3\33\3\33\3\33\5\33\u00fe\n"+
		"\33\3\33\3\33\3\34\3\34\3\34\7\34\u0105\n\34\f\34\16\34\u0108\13\34\3"+
		"\35\3\35\5\35\u010c\n\35\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0114\n\37"+
		"\3 \3 \3!\5!\u0119\n!\3!\3!\5!\u011d\n!\3!\5!\u0120\n!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u012f\n#\3#\2\4\30.$\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\3\2\20\21\3\2\16\17"+
		"\3\2\"$\3\2%&\4\2;;??\3\2\36\37\2\u013c\2F\3\2\2\2\4K\3\2\2\2\6U\3\2\2"+
		"\2\bW\3\2\2\2\ne\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20}\3\2\2\2\22\u0080\3"+
		"\2\2\2\24\u0084\3\2\2\2\26\u008a\3\2\2\2\30\u0093\3\2\2\2\32\u00ab\3\2"+
		"\2\2\34\u00ad\3\2\2\2\36\u00b9\3\2\2\2 \u00bc\3\2\2\2\"\u00c2\3\2\2\2"+
		"$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00d0\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3"+
		"\2\2\2.\u00e0\3\2\2\2\60\u00f1\3\2\2\2\62\u00f6\3\2\2\2\64\u00fa\3\2\2"+
		"\2\66\u0101\3\2\2\28\u010b\3\2\2\2:\u010d\3\2\2\2<\u0113\3\2\2\2>\u0115"+
		"\3\2\2\2@\u011f\3\2\2\2B\u0121\3\2\2\2D\u012e\3\2\2\2FG\5\4\3\2GH\7\2"+
		"\2\3H\3\3\2\2\2IL\5\b\5\2JL\5\6\4\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7"+
		"\61\2\2NO\5\b\5\2OP\7\62\2\2PV\3\2\2\2QR\7\61\2\2RS\5\6\4\2ST\7\62\2\2"+
		"TV\3\2\2\2UM\3\2\2\2UQ\3\2\2\2V\7\3\2\2\2WX\5\n\6\2XZ\5\20\t\2Y[\5\26"+
		"\f\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\34\17\2]\\\3\2\2\2]^\3\2\2\2^"+
		"`\3\2\2\2_a\5 \21\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5(\25\2cb\3\2\2\2"+
		"cd\3\2\2\2d\t\3\2\2\2eg\7\6\2\2fh\7\7\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2"+
		"\2ij\5\f\7\2j\13\3\2\2\2ku\7\"\2\2lq\5\16\b\2mn\7\63\2\2np\5\16\b\2om"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tk\3\2\2\2t"+
		"l\3\2\2\2u\r\3\2\2\2v{\5,\27\2wy\7\23\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2"+
		"\2z|\5:\36\2{x\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}~\7\b\2\2~\177\5\22\n\2\177"+
		"\21\3\2\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\63\2\2\u0082\u0083\5\24"+
		"\13\2\u0083\23\3\2\2\2\u0084\u0086\5:\36\2\u0085\u0087\7\23\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5:"+
		"\36\2\u0089\25\3\2\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5\30\r\2\u008c"+
		"\27\3\2\2\2\u008d\u008e\b\r\1\2\u008e\u008f\7\61\2\2\u008f\u0090\5\30"+
		"\r\2\u0090\u0091\7\62\2\2\u0091\u0094\3\2\2\2\u0092\u0094\5\32\16\2\u0093"+
		"\u008d\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u009d\3\2\2\2\u0095\u0096\f\6"+
		"\2\2\u0096\u0097\7\24\2\2\u0097\u009c\5\30\r\7\u0098\u0099\f\5\2\2\u0099"+
		"\u009a\7\25\2\2\u009a\u009c\5\30\r\6\u009b\u0095\3\2\2\2\u009b\u0098\3"+
		"\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\31\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5*\26\2\u00a1\u00a3\7\27\2"+
		"\2\u00a2\u00a4\7\26\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\7!\2\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\5*\26"+
		"\2\u00a8\u00a9\5D#\2\u00a9\u00aa\5,\27\2\u00aa\u00ac\3\2\2\2\u00ab\u00a0"+
		"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae"+
		"\u00af\7\22\2\2\u00af\u00b4\5,\27\2\u00b0\u00b1\7\63\2\2\u00b1\u00b3\5"+
		",\27\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5\36"+
		"\20\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\5\30\r\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\5\"\22"+
		"\2\u00bf\u00c0\7\63\2\2\u00c0\u00c1\5\"\22\2\u00c1!\3\2\2\2\u00c2\u00c4"+
		"\5:\36\2\u00c3\u00c5\5$\23\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c8\5&\24\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8#\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca%\3\2\2\2\u00cb\u00cc\7\r"+
		"\2\2\u00cc\u00cd\t\3\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf\u00d1"+
		"\7\63\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d3\7=\2\2\u00d3)\3\2\2\2\u00d4\u00d5\5.\30\2\u00d5+\3\2\2\2"+
		"\u00d6\u00d7\5.\30\2\u00d7-\3\2\2\2\u00d8\u00d9\b\30\1\2\u00d9\u00da\7"+
		"\61\2\2\u00da\u00db\5.\30\2\u00db\u00dc\7\62\2\2\u00dc\u00e1\3\2\2\2\u00dd"+
		"\u00e1\5\60\31\2\u00de\u00df\7&\2\2\u00df\u00e1\5.\30\3\u00e0\u00d8\3"+
		"\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00ea\3\2\2\2\u00e2"+
		"\u00e3\f\7\2\2\u00e3\u00e4\t\4\2\2\u00e4\u00e9\5.\30\b\u00e5\u00e6\f\6"+
		"\2\2\u00e6\u00e7\t\5\2\2\u00e7\u00e9\5.\30\7\u00e8\u00e2\3\2\2\2\u00e8"+
		"\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb/\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f2\5\62\32\2\u00ee\u00f2"+
		"\5:\36\2\u00ef\u00f2\5<\37\2\u00f0\u00f2\5\64\33\2\u00f1\u00ed\3\2\2\2"+
		"\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\61"+
		"\3\2\2\2\u00f3\u00f4\5:\36\2\u00f4\u00f5\7\60\2\2\u00f5\u00f7\3\2\2\2"+
		"\u00f6\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9"+
		"\5:\36\2\u00f9\63\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb\u00fd\7\61\2\2\u00fc"+
		"\u00fe\5\66\34\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0100\7\62\2\2\u0100\65\3\2\2\2\u0101\u0106\58\35\2\u0102"+
		"\u0103\7\63\2\2\u0103\u0105\58\35\2\u0104\u0102\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\67\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010c\5\30\r\2\u010a\u010c\5,\27\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010a\3\2\2\2\u010c9\3\2\2\2\u010d\u010e\t\6\2\2\u010e;\3"+
		"\2\2\2\u010f\u0114\7!\2\2\u0110\u0114\5> \2\u0111\u0114\5@!\2\u0112\u0114"+
		"\5B\"\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114=\3\2\2\2\u0115\u0116\7:\2\2\u0116?\3\2\2\2\u0117"+
		"\u0119\7&\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0120\7=\2\2\u011b\u011d\7&\2\2\u011c\u011b\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\7>\2\2\u011f\u0118\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u0120A\3\2\2\2\u0121\u0122\t\7\2\2\u0122C\3\2\2\2\u0123"+
		"\u012f\7\'\2\2\u0124\u012f\7*\2\2\u0125\u012f\7+\2\2\u0126\u012f\7,\2"+
		"\2\u0127\u012f\7-\2\2\u0128\u0129\7,\2\2\u0129\u012f\7*\2\2\u012a\u012f"+
		"\7)\2\2\u012b\u012f\7\27\2\2\u012c\u012d\7\27\2\2\u012d\u012f\7\26\2\2"+
		"\u012e\u0123\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0126"+
		"\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u012a\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012fE\3\2\2\2$KUZ]`cgqtx{\u0086\u0093"+
		"\u009b\u009d\u00a3\u00ab\u00b4\u00c4\u00c7\u00d0\u00e0\u00e8\u00ea\u00f1"+
		"\u00f6\u00fd\u0106\u010b\u0113\u0118\u011c\u011f\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}