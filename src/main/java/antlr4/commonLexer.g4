lexer grammar CommonLexer;

ID
   : ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\u4e00' .. '\u9fa5' | '-' | '0' .. '9' )+
   ;


INT
   : '0' .. '9'+
   ;


NEWLINE
   : '\r'? '\n' -> skip
   ;


WS
   : ( ' ' | '\t' | '\n' | '\r' )+ -> skip
   ;



RPAREN
   : ')'
   ;


LPAREN
   : '('
   ;


INDEX
   : 'index'
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