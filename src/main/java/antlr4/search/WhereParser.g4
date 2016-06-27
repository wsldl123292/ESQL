parser grammar WhereParser;

options
   { tokenVocab = SearchLexer; }

stat
   : where_clause
   ;


where_clause
   : WHERE expression
   ;

expression
   : LPAREN expression RPAREN       #parenExp
   | expression AND expression      #andExp
   | expression OR expression       #orExp
   | simple_expression              #exp
   ;

element
   : ID | INT
   ;

between_op
   : BETWEEN
   ;

is_or_is_not
   : IS | IS NOT
   ;



simple_expression
   : element relational_op=(EQ | LTH | GTH | NOT_EQ | LET | GET | LIKE) (QUOTE ID QUOTE | INT)    #baseExp
   | element between_op LPAREN INT COMMA INT RPAREN                                               #betweenExp
   | element is_or_is_not NULL                                                                    #isExp
   ;