lexer grammar MappingLexer;

ADD
   : 'add' | 'ADD'
   ;

MAPPING
  : 'mapping' | 'MAPPING'
  ;

TYPE:'type' | 'TYPE';


SOURCE:'_source'|'_SOURCE';

INDEX:'index'|'INDEX';

STORE:'store'|'STORE';

ENABLED:'enabled'|'ENABLED';

COLON: ':';

RPAREN: '{';


LPAREN: '}';

COMMA: ',';

TRUE: 'true' | 'TRUE';

FALSE: 'false' | 'FALSE';



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