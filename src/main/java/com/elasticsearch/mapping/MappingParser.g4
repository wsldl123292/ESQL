parser grammar MappingParser;

options
   { tokenVocab = MappingLexer; }

mapping_clause
   : ADD index_clause type_clause RPAREN source_clause? LPAREN
   ;

index_clause: MAPPING index_name;

type_clause: TYPE index_name;

index_name
   : (ID)*(INT)*
   ;

source_clause: SOURCE COLON RPAREN ENABLED (TRUE|FALSE) LPAREN;