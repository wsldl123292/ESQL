parser grammar SelectParser;

options
   { tokenVocab = SearchLexer; }
stat
   : select_clause
   ;

select_clause
   : SELECT column_list_clause FROM table_references limit_case?
   ;

table_name
   : ID
   ;

table_type
   : ID
   ;

limit_case
   : LIMIT limit_expr
   ;

limit_expr
   : ID COMMA ID
   ;

column_name
   : ID
   ;

column_list_clause
   : ALL_FIELDS | column_name ( COMMA column_name )*
   ;


table_references
   : table_name DOT table_type ( ( COMMA table_name DOT table_type ))*
   ;