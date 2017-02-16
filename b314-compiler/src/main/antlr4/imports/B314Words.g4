lexer grammar B314Words;

//words

VIRGULE : ',';
CROCHET_OUVERT : '[';
CROCHET_FERME : ']';
BOOLEAN : 'boolean';
INTEGER : 'integer';
SQUARE : 'square';

PAR_OUVERT: '(';
PAR_FERME: ')';
LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRID_SIZE: 'grid size';
MAP: 'map';
RADIO: 'radio';
AMMO: 'ammo';
FRUITS: 'fruits';
SODA: 'soda';
COUNT: 'count';
LIFE: 'life';

PLUS: '+';
MOINS: '-';
MUL: '*';
DIV: '/';
DIV_ENT: '%';

TRUE: 'true';
FALSE: 'false';
ENNEMI: 'ennemi';
IS: 'is';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
GRAAL: 'graal';

AND: 'and';
OR: 'or';
NOT: 'not';
INF: '<';
SUP: '>';
EGALE: '=';

DIRT: 'dirt';
ROCK: 'rock';
VINES: 'vines';
ZOMBIE: 'zombie';
PLAYER: 'player';
NEARBY: 'nearby';

START: 'declare and retain';
DLOCAL: 'declare local';
TSTART: 'when your turn';
WHEN:'when' ;
DO: 'do';
DONE: 'done';
BYDEF: 'by default'; 
POINtVIRGULE: ';';
COMMENTOPEN: '/*';
COMMENTCLOSE: '*/';
POINT: '.';
Espace: ' ';

SKIPPPP : 'skip';
IF : 'if';
THEN : 'then';
WHILE : 'while';
SET : 'set';
TO : 'to';
COMPUTE : 'compute';
NEXT : 'next';
MOVE : 'move';
SHOOT : 'shoot';
USE : 'use';
NOTHING : 'nothing';
ELSE : 'else';

AS: 'as';
FUNCTION : 'function';
VOID : 'void';
DEUXPOINTS : ':';


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
