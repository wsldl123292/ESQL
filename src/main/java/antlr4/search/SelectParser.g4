parser grammar SelectParser;

import WhereParser;

options
   { tokenVocab = SearchLexer; }
stat
   : select_clause
   ;

select_clause
   : SELECT column_list_clause FROM table_references where_clause? limit_case?
   ;

table_name
   : (ID)*(INT)*
   ;

table_type
   : (ID)*(INT)*
   ;

limit_case
   : LIMIT limit_expr
   ;

limit_expr
   : INT COMMA INT
   ;

column_name
   : (ID)*(INT)*
   ;

column_list_clause
   : ALL_FIELDS | column_name ( COMMA column_name )*
   ;


table_references
   : table_name DOT table_type ( ( COMMA table_name DOT table_type ))*
   ;