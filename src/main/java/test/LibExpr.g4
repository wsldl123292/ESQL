grammar LibExpr; // Rename to distinguish from original
/** The start rule; begin parsing here. */
stat
   : select_clause
   ;

select_clause
   : SELECT column_list_clause FROM table_references where_clause? orderby_case? limit_case?
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

orderby_case
   : ORDER BY column_name order=(ASC|DESC)
   ;

   where_clause
      : WHERE expression
      ;


   expression
      : LPAREN expression RPAREN       #parenExp
      | expression AND expression      #andExp
      | expression OR expression       #orExp
      | simple_expression            #exp
      ;

   right_element
      : QUOTES (ID)* QUOTES | INT
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




      SELECT
         : 'select' | 'SELECT'
         ;


      FROM
         : 'from' | 'FROM'
         ;


      WHERE
         : 'where' | 'WHERE'
         ;


      AND
         : 'and' | '&&' | 'AND'
         ;


      OR
         : 'or' | '||' | 'OR'
         ;


      IS
         : 'is' | 'IS'
         ;

      NOT
         : 'not' | 'NOT'
         ;
      NULL
         : 'null' | 'NULL'
         ;


      LIKE
         : 'like' | 'LIKE'
         ;


      IN
         : 'in' | 'IN'
         ;


      EXISTS
         : 'exists' | 'EXISTS'
         ;


      ALL
         : 'all' | 'ALL'
         ;


      BETWEEN
         : 'between' | 'BETWEEN'
         ;


      REGEXP
         : 'regexp' | 'REGEXP'
         ;


      LIMIT
        : 'limit' | 'LIMIT'
        ;


      COLON
         : ':'
         ;


      ALL_FIELDS
         : '*'
         ;


      EQ
         : '='
         ;


      LTH
         : '<'
         ;


      GTH
         : '>'
         ;


      NOT_EQ
         : '!='
         ;


      LET
         : '<='
         ;


      GET
         : '>='
         ;


      SEMI
         : ';'
         ;


      ORDER
         : 'order'|'ORDER'
         ;


      GROUP
         : 'group'|'GROUP'
         ;


      BY
         : 'by'|'BY'
         ;


      ASC
         : 'asc'|'ASC'
         ;

      DESC
         : 'desc'|'DESC'
         ;


      QUOTES
         : '\''
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

         NEGATION
            : '~'
            ;


         VERTBAR
            : '|'
            ;

         TRUE
            : 'true' | 'TRUE'
            ;


         FALSE
            : 'false' | 'FALSE'
            ;

         ANY_STRING_CHAR
            : ~' '
            ;

            ErrorCharacter : '\'\'' ;