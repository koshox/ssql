lexer grammar SsqlLexer;

@header {package com.kosho.ssql.core.parser;}

channels {
    ERROR_CHANNEL
}

// SKIP
SPACE: [ \t\r\n]+ -> channel(HIDDEN);
COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: (
                  ('-- ' | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                  | '--' ('\r'? '\n' | EOF)
              ) -> channel(HIDDEN);

// KEYWORD
SELECT: S E L E C T;
DISTINCT:D I S T I N C T;

FROM: F R O M;
WHERE: W H E R E;
ORDER: O R D E R;
GROUP: G R O U P;
HAVING: H A V I N G;

NULLS: N U L L S;
FIRST: F I R S T;
LAST: L A S T;

ASC: A S C;
DESC: D E S C;

BY: B Y;
AS: A S;

AND: A N D;
OR: O R;
NOT: N O T;
IS: I S;
LIKE: L I K E;
CONTAINS: C O N T A I N S;
BETWEEN: B E T W E E N;
EXISTS: E X I S T S;
LIMIT: L I M I T;

TRUE: T R U E;
FALSE: F A L S E;
EMPTY: E M P T Y;
NULL: N U L L;

// ARITH OP
STAR: '*';
DIV: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';

// COMPARE OP
EQ: '=';
EQS: '==';
NOT_EQ: '!=';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
IN: I N;

// CONSTRUCTORS
DOT: '.';
LBKT: '(';
RBKT: ')';
COMMA: ',';
SEMI: ';';
AT_SIGN: '@';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
REVERSE_QUOTE: '`';
COLON: ':';
DOLLAR: '$';

// STRING
SQUOTE_STRING: '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
DQUOTE_STRING: '"' ('\\'. | '""' | ~('"' | '\\'))* '"';
RQUOTE_STRING: '`' ('\\'. | '``' | ~('`' | '\\'))* '`';

// NUMBER
INTEGER: DEG_DIGIT+;
DECIMAL: ('0' | [1-9] DEG_DIGIT*) (DOT DEG_DIGIT+)? ([eE] [+\-]? DEG_DIGIT+)?;

// ID
ID: [a-zA-Z0-9_]*? [a-zA-Z_]+? [a-zA-Z0-9_]*;

// FRAGMENT
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

fragment DEG_DIGIT: [0-9];