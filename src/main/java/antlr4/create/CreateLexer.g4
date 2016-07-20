lexer grammar CreateLexer;

CREATE
   : 'create' | 'CREATE'
   ;


TABLE
   : 'table' | 'TABLE'
   ;

NUMBER_OF_SHARDS:'number_of_shards' | 'NUMBER_OF_SHARDS';

IS
   : 'is' | 'IS'
   ;

NOT
   : 'not' | 'NOT'
   ;

NULL
   : 'null' | 'NULL'
   ;


EXISTS
   : 'exists' | 'EXISTS'
   ;


ALL
   : 'all' | 'ALL'
   ;


COLON
   : ':'
   ;


ALL_FIELDS
   : '*'
   ;

SEMI
   : ';'
   ;



QUOTES
   : '\''
   ;


ID
  : ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\u4e00' .. '\u9fa5' | '-')+
  ;


INT
  : [0-9]+
  ;


NEWLINE
  : '\r'? '\n' -> skip
  ;


WS
  : [\t\r\n]+ -> skip
  ;



RPAREN
  : ')'
  ;


LPAREN
  : '('
  ;


INDEX
  : 'index' | 'INDEX'
  ;


KEY
  : 'key'
  ;


COMMA
  : ','
  ;

DOT
  : '.'
  ;

PARTITION
  : 'partition'
  ;


VERTBAR
  : '|'
  ;

TRUE
  : 'true' | 'TRUE'
  ;


FALSE
  : 'false' | 'FALSE'
  ;