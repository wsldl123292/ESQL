grammar LibExpr; // Rename to distinguish from original
/** The start rule; begin parsing here. */
stat
   : create_clause
   ;

create_clause
   : CREATE index_name shards? replicas?
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




 INDEX
    : 'index'
    ;



CREATE
   : 'create' | 'CREATE'
   ;

NUMBER_OF_SHARDS:'number_of_shards' | 'NUMBER_OF_SHARDS';


NUMBER_OF_REPLICAS:'number_of_replicas' | 'NUMBER_OF_REPLICAS';
