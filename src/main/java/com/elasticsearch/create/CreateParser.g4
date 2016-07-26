parser grammar CreateParser;

options
   { tokenVocab = CreateLexer; }
stat
   : create_clause
   ;

create_clause
   : CREATE index_clause shards? replicas?
   ;

index_clause: INDEX index_name;

index_name
   : (ID)*(INT)*
   ;

shards
   : NUMBER_OF_SHARDS INT
   ;

replicas
   : NUMBER_OF_REPLICAS INT
   ;