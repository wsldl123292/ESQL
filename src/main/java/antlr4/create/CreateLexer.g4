lexer grammar CreateLexer;

CREATE
   : 'create' | 'CREATE'
   ;

NUMBER_OF_SHARDS:'number_of_shards' | 'NUMBER_OF_SHARDS';


NUMBER_OF_REPLICAS:'number_of_replicas' | 'NUMBER_OF_REPLICAS';


COLON
   : ':'
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

TABLE:'table';