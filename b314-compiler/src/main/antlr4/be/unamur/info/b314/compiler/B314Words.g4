lexer grammar B314Words;


//Identifications appartenant au langage

BOOLEAN: 'boolean';
INTEGER: 'integer';
SQUARE: 'square';
NEARBY: 'nearby';
VOID: 'void';

START: 'declare and retain';
DLOCAL: 'declare local';
TSTART: 'when your turn';
WHEN:'when' ;
DO: 'do';
DONE: 'done';
BYDEF: 'by default'; 
AS: 'as';
FUNCTION: 'function';



//symboles relatifs aux expressions

IF: 'if';
THEN: 'then';
WHILE: 'while';
SET: 'set';
COMPUTE: 'compute';
ELSE: 'else';
TO: 'to';

//Symboles relatifs aux actions

MOVE: 'move';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
SHOOT: 'shoot';
USE: 'use';
NOTHING: 'nothing';

//Symboles standarts

CROCHET_OUVERT: '[';
CROCHET_FERME: ']';

VIRGULE: ',';
DEUXPOINTS: ':';
POINtVIRGULE: ';';

PAR_OUVERT: '(';
PAR_FERME: ')';

//Définition des opérateurs

NOT: 'not';
AND: 'and';
OR: 'or';
INF: '<';
SUP: '>';
EGALE: '=';
PLUS: '+';
MOINS: '-';
MUL: '*';
DIV: '/';
DIV_ENT: '%';


//Identifiants entiers appartenant au langage

LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRID_SIZE: 'grid size';
COUNT: 'count';
LIFE: 'life';

// Identifiants booléens appartenant au langage

TRUE: 'true';
FALSE: 'false';
IS: 'is';

GRAAL: 'graal';

//Identifiants Case appartenant au langage

DIRT: 'dirt';
ROCK: 'rock';
VINES: 'vines'; 
ZOMBIE: 'zombie'; 
PLAYER: 'player';
ENNEMI: 'ennemi';
MAP: 'map';
RADIO: 'radio';
AMMO: 'ammo';
FRUITS: 'fruits';
SODA: 'soda';


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

