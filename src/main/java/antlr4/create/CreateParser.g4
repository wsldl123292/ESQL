parser grammar CreateParser;

options
   { tokenVocab = CreateLexer; }
stat
   : create_clause
   ;

create_clause
   : CREATE INDEX index_name shards? replicas?
   ;

index_name
   : (ID)*(INT)*
   ;

shards
   : NUMBER_OF_SHARDS INT
   ;

replicas
   : NUMBER_OF_REPLICAS INT
   ;