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


right_element
   : INT
   ;

left_element
   : ID | INT
   ;

between_element
   : INT
   ;

is_or_is_not
   : IS | IS NOT
   ;



simple_expression
   : left_element relational_op=(EQ | LTH | GTH | NOT_EQ | LET | GET | LIKE) right_element               #baseExp
   | left_element BETWEEN LPAREN between_element COMMA between_element RPAREN                             #betweenExp
   | left_element is_or_is_not NULL                                                                    #isExp
   ;