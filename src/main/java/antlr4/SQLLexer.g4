lexer grammar SQLLexer;

import CommonLexer;

SELECT
   : 'select' | 'SELECT'
   ;


FROM
   : 'from' | 'FROM'
   ;


WHERE
   : 'where' | 'WHERE'
   ;


AND
   : 'and' | '&&' | 'AND'
   ;


OR
   : 'or' | '||' | 'OR'
   ;


IS
   : 'is' | 'IS'
   ;


NULL
   : 'null' | 'NULL'
   ;


LIKE
   : 'like' | 'LIKE'
   ;


IN
   : 'in' | 'IN'
   ;


EXISTS
   : 'exists' | 'EXISTS'
   ;


ALL
   : 'all' | 'ALL'
   ;


TRUE
   : 'true' | 'TRUE'
   ;


FALSE
   : 'false' | 'FALSE'
   ;


BETWEEN
   : 'between' | 'BETWEEN'
   ;


REGEXP
   : 'regexp' | 'REGEXP'
   ;


LIMIT
  : 'limit' | 'LIMIT'
  ;


NEGATION
   : '~'
   ;


VERTBAR
   : '|'
   ;


/*BITAND
   : '&'
   ;*/


/*POWER_OP
   : '^'
   ;*/


/*BINARY
   : 'binary'
   ;*/


/*SHIFT_LEFT
   : '<<'
   ;*/


/*SHIFT_RIGHT
   : '>>'
   ;*/


/*ESCAPE
   : 'escape'
   ;*/


/*ASTERISK
   : '*'
   ;*/



RBRACK
   : ']'
   ;


LBRACK
   : '['
   ;


COLON
   : ':'
   ;


ALL_FIELDS
   : '*'
   ;


EQ
   : '='
   ;


LTH
   : '<'
   ;


GTH
   : '>'
   ;


NOT_EQ
   : '!='
   ;


NOT
   : 'not'
   ;


LET
   : '<='
   ;


GET
   : '>='
   ;


SEMI
   : ';'
   ;


ORDER
   : 'order'
   ;


GROUP
   : 'group'
   ;


BY
   : 'by'
   ;
