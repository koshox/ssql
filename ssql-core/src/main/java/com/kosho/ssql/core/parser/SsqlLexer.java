// Generated from  by ANTLR 4.9.1
package com.kosho.ssql.core.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SsqlLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            SPACE = 1, COMMENT = 2, LINE_COMMENT = 3, SELECT = 4, DISTINCT = 5, FROM = 6, WHERE = 7,
            ORDER = 8, GROUP = 9, HAVING = 10, NULLS = 11, FIRST = 12, LAST = 13, ASC = 14, DESC = 15,
            BY = 16, AS = 17, AND = 18, OR = 19, NOT = 20, IS = 21, IN = 22, LIKE = 23, CONTAINS = 24,
            BETWEEN = 25, EXISTS = 26, LIMIT = 27, TRUE = 28, FALSE = 29, EMPTY = 30, NULL = 31,
            STAR = 32, DIV = 33, MOD = 34, PLUS = 35, MINUS = 36, EQ = 37, EQS = 38, NOT_EQ = 39,
            GT = 40, GTE = 41, LT = 42, LTE = 43, AND_SYB = 44, OR_SYB = 45, DOT = 46, LBKT = 47,
            RBKT = 48, COMMA = 49, SEMI = 50, AT_SIGN = 51, SINGLE_QUOTE = 52, DOUBLE_QUOTE = 53,
            REVERSE_QUOTE = 54, COLON = 55, SQUOTE_STRING = 56, DQUOTE_STRING = 57, RQUOTE_STRING = 58,
            INTEGER = 59, DECIMAL = 60, ID = 61;
    public static final int
            ERROR_CHANNEL = 2;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN", "ERROR_CHANNEL"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "SPACE", "COMMENT", "LINE_COMMENT", "SELECT", "DISTINCT", "FROM", "WHERE",
                "ORDER", "GROUP", "HAVING", "NULLS", "FIRST", "LAST", "ASC", "DESC",
                "BY", "AS", "AND", "OR", "NOT", "IS", "IN", "LIKE", "CONTAINS", "BETWEEN",
                "EXISTS", "LIMIT", "TRUE", "FALSE", "EMPTY", "NULL", "STAR", "DIV", "MOD",
                "PLUS", "MINUS", "EQ", "EQS", "NOT_EQ", "GT", "GTE", "LT", "LTE", "AND_SYB",
                "OR_SYB", "DOT", "LBKT", "RBKT", "COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE",
                "DOUBLE_QUOTE", "REVERSE_QUOTE", "COLON", "SQUOTE_STRING", "DQUOTE_STRING",
                "RQUOTE_STRING", "INTEGER", "DECIMAL", "ID", "A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z", "DEG_DIGIT"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
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
        return new String[]{
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


    public SsqlLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "SsqlLexer.g4";
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0247\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\6\2\u00b5\n\2\r\2\16\2\u00b6\3\2\3" +
                    "\2\3\3\3\3\3\3\3\3\7\3\u00bf\n\3\f\3\16\3\u00c2\13\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\4\3\4\3\4\3\4\5\4\u00cd\n\4\3\4\7\4\u00d0\n\4\f\4\16\4\u00d3\13\4" +
                    "\3\4\5\4\u00d6\n\4\3\4\3\4\5\4\u00da\n\4\3\4\3\4\3\4\3\4\5\4\u00e0\n\4" +
                    "\3\4\3\4\5\4\u00e4\n\4\5\4\u00e6\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b" +
                    "\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r" +
                    "\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20" +
                    "\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24" +
                    "\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30" +
                    "\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34" +
                    "\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3" +
                    "$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3" +
                    "-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64" +
                    "\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\79\u01be\n9\f9" +
                    "\169\u01c1\139\39\39\3:\3:\3:\3:\3:\3:\7:\u01cb\n:\f:\16:\u01ce\13:\3" +
                    ":\3:\3;\3;\3;\3;\3;\3;\7;\u01d8\n;\f;\16;\u01db\13;\3;\3;\3<\6<\u01e0" +
                    "\n<\r<\16<\u01e1\3=\3=\3=\7=\u01e7\n=\f=\16=\u01ea\13=\5=\u01ec\n=\3=" +
                    "\3=\6=\u01f0\n=\r=\16=\u01f1\5=\u01f4\n=\3=\3=\5=\u01f8\n=\3=\6=\u01fb" +
                    "\n=\r=\16=\u01fc\5=\u01ff\n=\3>\7>\u0202\n>\f>\16>\u0205\13>\3>\6>\u0208" +
                    "\n>\r>\16>\u0209\3>\7>\u020d\n>\f>\16>\u0210\13>\3?\3?\3@\3@\3A\3A\3B" +
                    "\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M" +
                    "\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y" +
                    "\3Y\5\u00c0\u0203\u0209\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25" +
                    "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32" +
                    "\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a" +
                    "\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}\2\177\2\u0081\2\u0083\2\u0085" +
                    "\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097" +
                    "\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9" +
                    "\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\3\2&\5\2\13\f\17\17\"\"\4\2\f\f\17" +
                    "\17\4\2))^^\4\2$$^^\4\2^^bb\3\2\63;\4\2GGgg\4\2--//\6\2\62;C\\aac|\5\2" +
                    "C\\aac|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KK" +
                    "kk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2" +
                    "TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\|" +
                    "|\3\2\62;\2\u0248\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13" +
                    "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2" +
                    "\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2" +
                    "!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3" +
                    "\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2" +
                    "\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E" +
                    "\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2" +
                    "\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2" +
                    "\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k" +
                    "\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2" +
                    "\2\2\2y\3\2\2\2\2{\3\2\2\2\3\u00b4\3\2\2\2\5\u00ba\3\2\2\2\7\u00e5\3\2" +
                    "\2\2\t\u00e9\3\2\2\2\13\u00f0\3\2\2\2\r\u00f9\3\2\2\2\17\u00fe\3\2\2\2" +
                    "\21\u0104\3\2\2\2\23\u010a\3\2\2\2\25\u0110\3\2\2\2\27\u0117\3\2\2\2\31" +
                    "\u011d\3\2\2\2\33\u0123\3\2\2\2\35\u0128\3\2\2\2\37\u012c\3\2\2\2!\u0131" +
                    "\3\2\2\2#\u0134\3\2\2\2%\u0137\3\2\2\2\'\u013b\3\2\2\2)\u013e\3\2\2\2" +
                    "+\u0142\3\2\2\2-\u0145\3\2\2\2/\u0148\3\2\2\2\61\u014d\3\2\2\2\63\u0156" +
                    "\3\2\2\2\65\u015e\3\2\2\2\67\u0165\3\2\2\29\u016b\3\2\2\2;\u0170\3\2\2" +
                    "\2=\u0176\3\2\2\2?\u017c\3\2\2\2A\u0181\3\2\2\2C\u0183\3\2\2\2E\u0185" +
                    "\3\2\2\2G\u0187\3\2\2\2I\u0189\3\2\2\2K\u018b\3\2\2\2M\u018d\3\2\2\2O" +
                    "\u0190\3\2\2\2Q\u0193\3\2\2\2S\u0195\3\2\2\2U\u0198\3\2\2\2W\u019a\3\2" +
                    "\2\2Y\u019d\3\2\2\2[\u01a0\3\2\2\2]\u01a3\3\2\2\2_\u01a5\3\2\2\2a\u01a7" +
                    "\3\2\2\2c\u01a9\3\2\2\2e\u01ab\3\2\2\2g\u01ad\3\2\2\2i\u01af\3\2\2\2k" +
                    "\u01b1\3\2\2\2m\u01b3\3\2\2\2o\u01b5\3\2\2\2q\u01b7\3\2\2\2s\u01c4\3\2" +
                    "\2\2u\u01d1\3\2\2\2w\u01df\3\2\2\2y\u01eb\3\2\2\2{\u0203\3\2\2\2}\u0211" +
                    "\3\2\2\2\177\u0213\3\2\2\2\u0081\u0215\3\2\2\2\u0083\u0217\3\2\2\2\u0085" +
                    "\u0219\3\2\2\2\u0087\u021b\3\2\2\2\u0089\u021d\3\2\2\2\u008b\u021f\3\2" +
                    "\2\2\u008d\u0221\3\2\2\2\u008f\u0223\3\2\2\2\u0091\u0225\3\2\2\2\u0093" +
                    "\u0227\3\2\2\2\u0095\u0229\3\2\2\2\u0097\u022b\3\2\2\2\u0099\u022d\3\2" +
                    "\2\2\u009b\u022f\3\2\2\2\u009d\u0231\3\2\2\2\u009f\u0233\3\2\2\2\u00a1" +
                    "\u0235\3\2\2\2\u00a3\u0237\3\2\2\2\u00a5\u0239\3\2\2\2\u00a7\u023b\3\2" +
                    "\2\2\u00a9\u023d\3\2\2\2\u00ab\u023f\3\2\2\2\u00ad\u0241\3\2\2\2\u00af" +
                    "\u0243\3\2\2\2\u00b1\u0245\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2" +
                    "\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7" +
                    "\u00b8\3\2\2\2\u00b8\u00b9\b\2\2\2\u00b9\4\3\2\2\2\u00ba\u00bb\7\61\2" +
                    "\2\u00bb\u00bc\7,\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd" +
                    "\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1" +
                    "\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\7\61" +
                    "\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\3\2\2\u00c7\6\3\2\2\2\u00c8\u00c9" +
                    "\7/\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cd\7\"\2\2\u00cb\u00cd\7%\2\2\u00cc" +
                    "\u00c8\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\n\3" +
                    "\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1" +
                    "\u00d2\3\2\2\2\u00d2\u00d9\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7\17" +
                    "\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7" +
                    "\u00da\7\f\2\2\u00d8\u00da\7\2\2\3\u00d9\u00d5\3\2\2\2\u00d9\u00d8\3\2" +
                    "\2\2\u00da\u00e6\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd\7/\2\2\u00dd\u00e3" +
                    "\3\2\2\2\u00de\u00e0\7\17\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2" +
                    "\u00e0\u00e1\3\2\2\2\u00e1\u00e4\7\f\2\2\u00e2\u00e4\7\2\2\3\u00e3\u00df" +
                    "\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00cc\3\2\2\2\u00e5" +
                    "\u00db\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\4\2\2\u00e8\b\3\2\2\2" +
                    "\u00e9\u00ea\5\u00a1Q\2\u00ea\u00eb\5\u0085C\2\u00eb\u00ec\5\u0093J\2" +
                    "\u00ec\u00ed\5\u0085C\2\u00ed\u00ee\5\u0081A\2\u00ee\u00ef\5\u00a3R\2" +
                    "\u00ef\n\3\2\2\2\u00f0\u00f1\5\u0083B\2\u00f1\u00f2\5\u008dG\2\u00f2\u00f3" +
                    "\5\u00a1Q\2\u00f3\u00f4\5\u00a3R\2\u00f4\u00f5\5\u008dG\2\u00f5\u00f6" +
                    "\5\u0097L\2\u00f6\u00f7\5\u0081A\2\u00f7\u00f8\5\u00a3R\2\u00f8\f\3\2" +
                    "\2\2\u00f9\u00fa\5\u0087D\2\u00fa\u00fb\5\u009fP\2\u00fb\u00fc\5\u0099" +
                    "M\2\u00fc\u00fd\5\u0095K\2\u00fd\16\3\2\2\2\u00fe\u00ff\5\u00a9U\2\u00ff" +
                    "\u0100\5\u008bF\2\u0100\u0101\5\u0085C\2\u0101\u0102\5\u009fP\2\u0102" +
                    "\u0103\5\u0085C\2\u0103\20\3\2\2\2\u0104\u0105\5\u0099M\2\u0105\u0106" +
                    "\5\u009fP\2\u0106\u0107\5\u0083B\2\u0107\u0108\5\u0085C\2\u0108\u0109" +
                    "\5\u009fP\2\u0109\22\3\2\2\2\u010a\u010b\5\u0089E\2\u010b\u010c\5\u009f" +
                    "P\2\u010c\u010d\5\u0099M\2\u010d\u010e\5\u00a5S\2\u010e\u010f\5\u009b" +
                    "N\2\u010f\24\3\2\2\2\u0110\u0111\5\u008bF\2\u0111\u0112\5}?\2\u0112\u0113" +
                    "\5\u00a7T\2\u0113\u0114\5\u008dG\2\u0114\u0115\5\u0097L\2\u0115\u0116" +
                    "\5\u0089E\2\u0116\26\3\2\2\2\u0117\u0118\5\u0097L\2\u0118\u0119\5\u00a5" +
                    "S\2\u0119\u011a\5\u0093J\2\u011a\u011b\5\u0093J\2\u011b\u011c\5\u00a1" +
                    "Q\2\u011c\30\3\2\2\2\u011d\u011e\5\u0087D\2\u011e\u011f\5\u008dG\2\u011f" +
                    "\u0120\5\u009fP\2\u0120\u0121\5\u00a1Q\2\u0121\u0122\5\u00a3R\2\u0122" +
                    "\32\3\2\2\2\u0123\u0124\5\u0093J\2\u0124\u0125\5}?\2\u0125\u0126\5\u00a1" +
                    "Q\2\u0126\u0127\5\u00a3R\2\u0127\34\3\2\2\2\u0128\u0129\5}?\2\u0129\u012a" +
                    "\5\u00a1Q\2\u012a\u012b\5\u0081A\2\u012b\36\3\2\2\2\u012c\u012d\5\u0083" +
                    "B\2\u012d\u012e\5\u0085C\2\u012e\u012f\5\u00a1Q\2\u012f\u0130\5\u0081" +
                    "A\2\u0130 \3\2\2\2\u0131\u0132\5\177@\2\u0132\u0133\5\u00adW\2\u0133\"" +
                    "\3\2\2\2\u0134\u0135\5}?\2\u0135\u0136\5\u00a1Q\2\u0136$\3\2\2\2\u0137" +
                    "\u0138\5}?\2\u0138\u0139\5\u0097L\2\u0139\u013a\5\u0083B\2\u013a&\3\2" +
                    "\2\2\u013b\u013c\5\u0099M\2\u013c\u013d\5\u009fP\2\u013d(\3\2\2\2\u013e" +
                    "\u013f\5\u0097L\2\u013f\u0140\5\u0099M\2\u0140\u0141\5\u00a3R\2\u0141" +
                    "*\3\2\2\2\u0142\u0143\5\u008dG\2\u0143\u0144\5\u00a1Q\2\u0144,\3\2\2\2" +
                    "\u0145\u0146\5\u008dG\2\u0146\u0147\5\u0097L\2\u0147.\3\2\2\2\u0148\u0149" +
                    "\5\u0093J\2\u0149\u014a\5\u008dG\2\u014a\u014b\5\u0091I\2\u014b\u014c" +
                    "\5\u0085C\2\u014c\60\3\2\2\2\u014d\u014e\5\u0081A\2\u014e\u014f\5\u0099" +
                    "M\2\u014f\u0150\5\u0097L\2\u0150\u0151\5\u00a3R\2\u0151\u0152\5}?\2\u0152" +
                    "\u0153\5\u008dG\2\u0153\u0154\5\u0097L\2\u0154\u0155\5\u00a1Q\2\u0155" +
                    "\62\3\2\2\2\u0156\u0157\5\177@\2\u0157\u0158\5\u0085C\2\u0158\u0159\5" +
                    "\u00a3R\2\u0159\u015a\5\u00a9U\2\u015a\u015b\5\u0085C\2\u015b\u015c\5" +
                    "\u0085C\2\u015c\u015d\5\u0097L\2\u015d\64\3\2\2\2\u015e\u015f\5\u0085" +
                    "C\2\u015f\u0160\5\u00abV\2\u0160\u0161\5\u008dG\2\u0161\u0162\5\u00a1" +
                    "Q\2\u0162\u0163\5\u00a3R\2\u0163\u0164\5\u00a1Q\2\u0164\66\3\2\2\2\u0165" +
                    "\u0166\5\u0093J\2\u0166\u0167\5\u008dG\2\u0167\u0168\5\u0095K\2\u0168" +
                    "\u0169\5\u008dG\2\u0169\u016a\5\u00a3R\2\u016a8\3\2\2\2\u016b\u016c\5" +
                    "\u00a3R\2\u016c\u016d\5\u009fP\2\u016d\u016e\5\u00a5S\2\u016e\u016f\5" +
                    "\u0085C\2\u016f:\3\2\2\2\u0170\u0171\5\u0087D\2\u0171\u0172\5}?\2\u0172" +
                    "\u0173\5\u0093J\2\u0173\u0174\5\u00a1Q\2\u0174\u0175\5\u0085C\2\u0175" +
                    "<\3\2\2\2\u0176\u0177\5\u0085C\2\u0177\u0178\5\u0095K\2\u0178\u0179\5" +
                    "\u009bN\2\u0179\u017a\5\u00a3R\2\u017a\u017b\5\u00adW\2\u017b>\3\2\2\2" +
                    "\u017c\u017d\5\u0097L\2\u017d\u017e\5\u00a5S\2\u017e\u017f\5\u0093J\2" +
                    "\u017f\u0180\5\u0093J\2\u0180@\3\2\2\2\u0181\u0182\7,\2\2\u0182B\3\2\2" +
                    "\2\u0183\u0184\7\61\2\2\u0184D\3\2\2\2\u0185\u0186\7\'\2\2\u0186F\3\2" +
                    "\2\2\u0187\u0188\7-\2\2\u0188H\3\2\2\2\u0189\u018a\7/\2\2\u018aJ\3\2\2" +
                    "\2\u018b\u018c\7?\2\2\u018cL\3\2\2\2\u018d\u018e\7?\2\2\u018e\u018f\7" +
                    "?\2\2\u018fN\3\2\2\2\u0190\u0191\7#\2\2\u0191\u0192\7?\2\2\u0192P\3\2" +
                    "\2\2\u0193\u0194\7@\2\2\u0194R\3\2\2\2\u0195\u0196\7@\2\2\u0196\u0197" +
                    "\7?\2\2\u0197T\3\2\2\2\u0198\u0199\7>\2\2\u0199V\3\2\2\2\u019a\u019b\7" +
                    ">\2\2\u019b\u019c\7?\2\2\u019cX\3\2\2\2\u019d\u019e\7(\2\2\u019e\u019f" +
                    "\7(\2\2\u019fZ\3\2\2\2\u01a0\u01a1\7~\2\2\u01a1\u01a2\7~\2\2\u01a2\\\3" +
                    "\2\2\2\u01a3\u01a4\7\60\2\2\u01a4^\3\2\2\2\u01a5\u01a6\7*\2\2\u01a6`\3" +
                    "\2\2\2\u01a7\u01a8\7+\2\2\u01a8b\3\2\2\2\u01a9\u01aa\7.\2\2\u01aad\3\2" +
                    "\2\2\u01ab\u01ac\7=\2\2\u01acf\3\2\2\2\u01ad\u01ae\7B\2\2\u01aeh\3\2\2" +
                    "\2\u01af\u01b0\7)\2\2\u01b0j\3\2\2\2\u01b1\u01b2\7$\2\2\u01b2l\3\2\2\2" +
                    "\u01b3\u01b4\7b\2\2\u01b4n\3\2\2\2\u01b5\u01b6\7<\2\2\u01b6p\3\2\2\2\u01b7" +
                    "\u01bf\7)\2\2\u01b8\u01b9\7^\2\2\u01b9\u01be\13\2\2\2\u01ba\u01bb\7)\2" +
                    "\2\u01bb\u01be\7)\2\2\u01bc\u01be\n\4\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01ba" +
                    "\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf" +
                    "\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7)" +
                    "\2\2\u01c3r\3\2\2\2\u01c4\u01cc\7$\2\2\u01c5\u01c6\7^\2\2\u01c6\u01cb" +
                    "\13\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u01cb\7$\2\2\u01c9\u01cb\n\5\2\2\u01ca" +
                    "\u01c5\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2" +
                    "\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce" +
                    "\u01cc\3\2\2\2\u01cf\u01d0\7$\2\2\u01d0t\3\2\2\2\u01d1\u01d9\7b\2\2\u01d2" +
                    "\u01d3\7^\2\2\u01d3\u01d8\13\2\2\2\u01d4\u01d5\7b\2\2\u01d5\u01d8\7b\2" +
                    "\2\u01d6\u01d8\n\6\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d6" +
                    "\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da" +
                    "\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7b\2\2\u01ddv\3\2\2\2\u01de" +
                    "\u01e0\5\u00b1Y\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01df" +
                    "\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2x\3\2\2\2\u01e3\u01ec\7\62\2\2\u01e4" +
                    "\u01e8\t\7\2\2\u01e5\u01e7\5\u00b1Y\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea" +
                    "\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea" +
                    "\u01e8\3\2\2\2\u01eb\u01e3\3\2\2\2\u01eb\u01e4\3\2\2\2\u01ec\u01f3\3\2" +
                    "\2\2\u01ed\u01ef\5]/\2\u01ee\u01f0\5\u00b1Y\2\u01ef\u01ee\3\2\2\2\u01f0" +
                    "\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2" +
                    "\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fe\3\2\2\2\u01f5" +
                    "\u01f7\t\b\2\2\u01f6\u01f8\t\t\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2" +
                    "\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\5\u00b1Y\2\u01fa\u01f9\3\2\2\2\u01fb" +
                    "\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2" +
                    "\2\2\u01fe\u01f5\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffz\3\2\2\2\u0200\u0202" +
                    "\t\n\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0204\3\2\2\2\u0203" +
                    "\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208\t\13" +
                    "\2\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u0209" +
                    "\u0207\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u020d\t\n\2\2\u020c\u020b\3\2" +
                    "\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f" +
                    "|\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\t\f\2\2\u0212~\3\2\2\2\u0213" +
                    "\u0214\t\r\2\2\u0214\u0080\3\2\2\2\u0215\u0216\t\16\2\2\u0216\u0082\3" +
                    "\2\2\2\u0217\u0218\t\17\2\2\u0218\u0084\3\2\2\2\u0219\u021a\t\b\2\2\u021a" +
                    "\u0086\3\2\2\2\u021b\u021c\t\20\2\2\u021c\u0088\3\2\2\2\u021d\u021e\t" +
                    "\21\2\2\u021e\u008a\3\2\2\2\u021f\u0220\t\22\2\2\u0220\u008c\3\2\2\2\u0221" +
                    "\u0222\t\23\2\2\u0222\u008e\3\2\2\2\u0223\u0224\t\24\2\2\u0224\u0090\3" +
                    "\2\2\2\u0225\u0226\t\25\2\2\u0226\u0092\3\2\2\2\u0227\u0228\t\26\2\2\u0228" +
                    "\u0094\3\2\2\2\u0229\u022a\t\27\2\2\u022a\u0096\3\2\2\2\u022b\u022c\t" +
                    "\30\2\2\u022c\u0098\3\2\2\2\u022d\u022e\t\31\2\2\u022e\u009a\3\2\2\2\u022f" +
                    "\u0230\t\32\2\2\u0230\u009c\3\2\2\2\u0231\u0232\t\33\2\2\u0232\u009e\3" +
                    "\2\2\2\u0233\u0234\t\34\2\2\u0234\u00a0\3\2\2\2\u0235\u0236\t\35\2\2\u0236" +
                    "\u00a2\3\2\2\2\u0237\u0238\t\36\2\2\u0238\u00a4\3\2\2\2\u0239\u023a\t" +
                    "\37\2\2\u023a\u00a6\3\2\2\2\u023b\u023c\t \2\2\u023c\u00a8\3\2\2\2\u023d" +
                    "\u023e\t!\2\2\u023e\u00aa\3\2\2\2\u023f\u0240\t\"\2\2\u0240\u00ac\3\2" +
                    "\2\2\u0241\u0242\t#\2\2\u0242\u00ae\3\2\2\2\u0243\u0244\t$\2\2\u0244\u00b0" +
                    "\3\2\2\2\u0245\u0246\t%\2\2\u0246\u00b2\3\2\2\2\35\2\u00b6\u00c0\u00cc" +
                    "\u00d1\u00d5\u00d9\u00df\u00e3\u00e5\u01bd\u01bf\u01ca\u01cc\u01d7\u01d9" +
                    "\u01e1\u01e8\u01eb\u01f1\u01f3\u01f7\u01fc\u01fe\u0203\u0209\u020e\3\2" +
                    "\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}