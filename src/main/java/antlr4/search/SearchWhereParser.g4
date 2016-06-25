parser grammar SearchWhereParser;

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

right_element
   : element
   ;

left_element
   : element
   ;

target_element
   : element
   ;

between_op
   : BETWEEN
   ;

is_or_is_not
   : IS | IS NOT
   ;



simple_expression
   : left_element relational_op=(EQ | LTH | GTH | NOT_EQ | LET | GET | LIKE) right_element               #baseExp
   | target_element between_op LPAREN left_element COMMA left_element RPAREN                             #betweenExp
   | target_element is_or_is_not NULL                                                                    #isExp
   ;