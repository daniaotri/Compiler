lexer grammar B314Words;


//Identifications appartenant au langage

//1.Programme

START: 'declare and retain';
TSTART: 'when your turn';

//2. VarDecl

AS: 'as';
ID: LETTER (LETTER | DIGIT)* ;

///Par rapport aux grosses structures///

//3. Déclaration de fonction

FUNCTION: 'function';
DLOCAL: 'declare local';
DONE: 'done';
DO: 'do';

//4.Clause when

WHEN:'when' ;

//5. Clause Default

BYDEF: 'by default'; 

///Par rapport aux sous-structures/expressions

IF: 'if';
THEN: 'then';
WHILE: 'while';
SET: 'set';
COMPUTE: 'compute';
ELSE: 'else';
TO: 'to';
SKIPPPP:'skip';

///Par rapport aux définitions de types///==TYPE VARIABLES VALEURS puis OPERATIONS

BOOLEAN: 'boolean';
INTEGER: 'integer';
SQUARE: 'square';
VOID: 'void';

//Les variables d'environnements ENTIERES

LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRID_SIZE: 'grid size';
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

///Symboles standarts///

CROCHET_OUVERT: '[';
CROCHET_FERME: ']';

VIRGULE: ',';
DEUXPOINTS: ':';
POINtVIRGULE: ';';

PAR_OUVERT: '(';
PAR_FERME: ')';








NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;
