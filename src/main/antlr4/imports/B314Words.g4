lexer grammar B314Words;

// les types des données ( fonctions et variables)
BOOLEAN: 'boolean';
INTEGER: 'integer';
SQUARE: 'square';
VOID: 'void';

///Symboles standarts///

CROCHET_OUVERT: '[';
CROCHET_FERME: ']';

VIRGULE: ',';
DEUXPOINTS: ':';
POINtVIRGULE: ';';

PAR_OUVERT: '(';
PAR_FERME: ')';

//Declaration des variables//

AS: 'as';

//Les variables d'environnements ENTIERES

LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRID: 'grid';
SIZE: 'size';
COUNT: 'count';
LIFE: 'life';

//Les variables d'environnements CASE

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

//Tableau prédéfini

NEARBY: 'nearby';

//Valeurs prédéfinies

TRUE: 'true';
FALSE: 'false';

//Attributs booléen

IS: 'is';
GRAAL: 'graal';

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


///Symboles relatifs aux actions///

MOVE: 'move';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
SHOOT: 'shoot';
USE: 'use';
NOTHING: 'nothing';
NEXT: 'next';

//Programme

RETAIN: 'retain';
WHEN: 'when';
YOUR: 'your';
TURN: 'turn';
// Déclaration de fonction

FUNCTION: 'function';
DECLARE: 'declare';
LOCAL: 'local';
DONE: 'done';
DO: 'do';

// Clause Default

BY: 'by';
DEFAULT: 'default'; 

///Par rapport aux sous-structures/expressions

IF: 'if';
THEN: 'then';
WHILE: 'while';
SET: 'set';
COMPUTE: 'compute';
ELSE: 'else';
TO: 'to';
SKIPPPP: 'skip';

ID: LETTER (LETTER | DIGIT)* ;
NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;