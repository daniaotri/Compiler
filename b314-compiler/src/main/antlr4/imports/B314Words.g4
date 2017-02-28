lexer grammar B314Words;


// Identifiers

ID: LETTER (LETTER | DIGIT)* ;

NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;
START: 'declare and retain';
DLOCAL: 'declare local';
TSTART: 'when your turn';
WHEN:'when' ;
DO: 'do';
DONE: 'done';
BYDEF: 'by default'; 