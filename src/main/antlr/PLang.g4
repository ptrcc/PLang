// generate java files:
// antlr4 PLang.g4 -o ../java/org/plang -package org.plang -visitor

grammar PLang;

// comments
COMMENT : '//' ~[\r\n]*    -> skip ;

// arithmetic
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EXP : '^' ;

// logical operators
NEQ : '<>' ;
GTE : '>=' ;
LTE : '<=' ;
GT  : '>' ;
LT  : '<' ;
EQ  : '==' ;
AND : 'and' | '&&' ;
OR  : 'or' | '||' ;

// keywords
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
DEF : 'def' ;

// brackets
ROUND_LEFT    : '(' ;
ROUND_RIGHT   : ')' ;
SQUARE_LEFT   : '[' ;
SQUARE_RIGHT  : ']' ;
CURLY_LEFT    : '{' ;
CURLY_RIGHT   : '}' ;


// boolean
TRUE : 'true' ;
FALSE : 'false' ;

// literals
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRINGLITERAL : '"' ~ ["\r\n]* '"' ;
ID : [a-zA-Z0-9_]+ ;

NEWLINE :'\r'? '\n' -> skip ;
WS : [ \t]+ -> skip ;
SEMI : ';' -> skip ;
SPACE : ' ' -> skip ;
COMMA : ',' ;

program: block EOF;

block : statement* ;

funcBlock: CURLY_LEFT block CURLY_RIGHT ;

statement
    : variable
    | variableAssignment
    | newVariableAssignment
    | if_
    | for_
    | functionCall
    | COMMENT
    | NEWLINE; // shouldn't be here.. but it is

stringLiteral : STRINGLITERAL ;
number : NUMBER ;
bool : TRUE | FALSE ;

id : ID ;

functionCall : id ROUND_LEFT (expr (COMMA expr)*)? ROUND_RIGHT ;

variable : DEF id ;
newVariableAssignment : DEF id '=' expr ;
variableAssignment : id '=' expr ;

// conditionals
if_ : IF expr funcBlock elseIf* else_? ;
elseIf : ELSE IF expr funcBlock ;
else_ : ELSE funcBlock ;

// loops
for_ : FOR expr funcBlock ;

expr
    : left=expr op=(MUL | DIV) right=expr
    | left=expr op=(ADD | SUB) right=expr
    | left=expr op=(LT | LTE | GTE | GT | EQ | NEQ) right=expr
    | left=expr op=( AND | OR ) right=expr
    | bool | number | stringLiteral | id ;