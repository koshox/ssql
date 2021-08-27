parser grammar SsqlParser;

@header {package com.kosho.ssql.core.dsl.parser;}

options {
    tokenVocab=SsqlLexer;
}

// SSQL ROOT
ssql: selectStatement SEMI? EOF;

// SELECT
selectStatement
    : selectClause fromClause whereClause? groupByClause? orderByClause? limitClause? #simpleSelectStatement
    | LBKT selectStatement RBKT                                                       #bracketedSelectStatement;

selectClause: SELECT DISTINCT? selectColumns;

selectColumns
    : STAR                               #selectAll
    | selectColumn (COMMA selectColumn)* #selectSpecialColumns
    ;

selectColumn: column=valueAtom (AS? alias=identifierValue)?;

// FROM
fromClause: FROM tableRefs;

tableRefs: tableRef (COMMA tableRef)?;

tableRef: table=identifierValue (AS? alias=identifierValue)?;

// WHERE
whereClause: WHERE expression;

expression
    : left=expression operator=AND right=expression #logicExpr
    | left=expression operator=OR right=expression  #logicExpr
    | LBKT expression RBKT                          #bracketedExpr
    | predicateExpr                                 #predicatedExpr
    ;

predicateExpr
    : fieldAtom IS NOT? NULL                 #isNullPredicate
    | fieldAtom comparisonOperator valueAtom #binaryComparisonPredicate
    | fieldAtom IN (listValue | varValue)    #inPredicate
    ;

// GROUP BY
groupByClause: GROUP BY valueAtom (COMMA valueAtom)* havingClause?;

// HAVING
havingClause: HAVING expression;

// ORDER BY
orderByClause: ORDER BY orderByExpr (COMMA orderByExpr)*;

orderByExpr: field=identifierValue order=sort? orderNullsExpr?;

sort: ASC | DESC;

orderNullsExpr: NULLS value=(FIRST | LAST);

// LIMIT
limitClause: LIMIT (offset = INTEGER COMMA)? size = INTEGER;

fieldAtom: arithExpr;

valueAtom: arithExpr;

arithExpr
    : left=arithExpr operator=(STAR | DIV | MOD) right=arithExpr #fourOpArithExpr
    | left=arithExpr operator=(PLUS | MINUS) right=arithExpr     #fourOpArithExpr
    | LBKT arithExpr RBKT                                        #bracketedArithExpr
    | simpleValueAtom                                            #simpleValueArithExpr
    | MINUS arithExpr                                            #negativeArithExpr
    ;

simpleValueAtom
    : fieldValue
    | identifierValue
    | varValue
    | constant
    | functionExpr
    ;

listValue: LBKT valueAtom (COMMA valueAtom)* RBKT;

varValue: DOLLAR ID;

fieldValue: (owner=identifierValue DOT) ? name=identifierValue;

functionExpr: ID LBKT functionArgs? RBKT;

functionArgs: argAtom (COMMA argAtom)*;

argAtom
    : expression #argExpressionAtom
    | valueAtom  #argArithExprAtom
    ;

identifierValue: ID | DQUOTE_STRING;

constant: NULL | stringLiteral | numberLiteral | booleanLiteral;

stringLiteral: SQUOTE_STRING;

numberLiteral: MINUS? literal=INTEGER | MINUS? literal=DECIMAL;

booleanLiteral: TRUE | FALSE;

comparisonOperator: EQ | GT | GTE | LT | LTE | LT GT | NOT_EQ | IS | IS NOT;