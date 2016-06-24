lexer grammar SearchLexer;

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

NOT
   : 'not' | 'NOT'
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


BETWEEN
   : 'between' | 'BETWEEN'
   ;


REGEXP
   : 'regexp' | 'REGEXP'
   ;


LIMIT
  : 'limit' | 'LIMIT'
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
   : 'order'|'ORDER'
   ;


GROUP
   : 'group'|'GROUP'
   ;


BY
   : 'by'|'BY'
   ;
