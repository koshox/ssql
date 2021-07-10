parser grammar SsqlParser;

@header {package com.kosho.ssql.core.parser;}

options {
    tokenVocab=SsqlLexer;
}

ssql: selectStatement EOF;

selectStatement: simpleSelectStatement | bracketedSelectStatement;

simpleSelectStatement: selectClause fromClause whereClause? groupByClause? orderByClause? limitClause?;

bracketedSelectStatement: LBKT simpleSelectStatement RBKT | LBKT bracketedSelectStatement RBKT;

selectClause: SELECT DISTINCT? selectColumns;

selectColumns
    : STAR                               #selectAll
    | selectColumn (COMMA selectColumn)* #selectSpecialColumns
    ;

selectColumn: column=valueAtom (AS? alias=identifierValue)?;

fromClause: FROM tableRefs;

tableRefs: tableRef (COMMA tableRef)?;

tableRef: table=identifierValue (AS? alias=identifierValue)?;

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
    ;

groupByClause: GROUP BY valueAtom (COMMA valueAtom)* havingClause?;

havingClause: HAVING expression;

orderByClause: ORDER BY orderByExpr (COMMA orderByExpr)*;

orderByExpr: field=identifierValue order=sort? orderNullsExpr?;

sort: ASC | DESC;

orderNullsExpr: NULLS value=(FIRST | LAST);

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
    | constant
    | functionExpr
    ;

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