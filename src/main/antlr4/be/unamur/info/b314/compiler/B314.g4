
grammar B314; 

import B314Words;

type : scalar       #typeScalar
        | array     #typeArray
        ;
       
scalar: BOOLEAN     #scalarBoolean
        | INTEGER   #scalarInteger
        | SQUARE    #scalarSquare
        ;

array: scalar CROCHET_OUVERT NUMBER (VIRGULE NUMBER)? CROCHET_FERME ;

varDecl : ID AS type;

exprD : exprEnt                 #exprDInteger
        |exprBool               #exprDBoolean
        |exprCase               #exprDCase
        |exprG                  #exprDG
        ;
exprEnt: entier                                                   #exprEntEntier
        |environnementInt                                         #exprEntEnvironnement
        |ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME        #exprEntFonction
        |expr1=exprEnt op=(MUL|DIV|DIV_ENT) expr2=exprEnt             #exprEntMulDiv
        |expr1=exprEnt op=(PLUS|MOINS) expr2=exprEnt                 #exprEntPlusMoins
        |PAR_OUVERT exprEnt PAR_FERME                               #exprEntParennthese
        ;

exprBool:TRUE                                                      #exprBoolTrue
         |FALSE                                                    #exprBoolFalse
         |ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME        #exprBoolFonction
         |environnementBool                                        #exprBoolEnvironnement
         |exprEnt EGALE exprEnt                             #exprBoolEgaleInteger
         |exprBool EGALE exprBool                             #exprBoolEgaleBoolean
         |exprCase EGALE exprCase                             #exprBoolEgaleCase
         |exprG EGALE exprG                             #exprBoolEgaleGauche
         |exprEnt op=(INF|SUP) exprEnt                #exprBoolInfSupEgale
         |exprBool op=(AND|OR) exprBool                       #exprBoolAndOr
         |NOT exprBool                                                 #exprBoolNot
         |PAR_OUVERT exprEnt PAR_FERME                               #exprBoolParennthese
         ;

exprCase :ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME         #exprCaseFonction
        | environnementCase                                         #exprCaseEnvironnement
        | NEARBY CROCHET_OUVERT exprEnt VIRGULE exprEnt CROCHET_FERME   #exprCaseNearby
        |PAR_OUVERT exprEnt PAR_FERME                               #exprCaseParennthese
        ;

environnementInt: LATITUDE
        | LONGITUDE
        | GRID_SIZE  
        |(MAP | RADIO | AMMO | FRUITS | SODA ) COUNT    
        | LIFE
        ;
environnementBool:  ENNEMI IS (NORTH | SOUTH | EAST | WEST)  
        | GRAAL IS (NORTH | SOUTH | EAST | WEST) 
        ;

environnementCase: DIRT
        | ROCK
        | VINES 
        | ZOMBIE 
        | PLAYER 
        | ENNEMI 
        | MAP 
        | RADIO 
        | AMMO 
        | FRUITS 
        | SODA
        ;
        
exprG : ID                                                              #exprGVariable
         | ID CROCHET_OUVERT exprD (VIRGULE exprD)? CROCHET_FERME      #exprGTableau
        ;

entier : (MOINS)?NUMBER  ;

instruction : SKIPPPP                                                   #skipppp
              | IF exprBool THEN (instruction)+ DONE                       #if
              | IF exprBool THEN (instruction)+ ELSE (instruction)+ DONE   #ifthenelse
              | WHILE exprBool DO (instruction)+ DONE                      #while
              | SET exprG TO exprD                                      #affectation
              | COMPUTE exprD                                           #compute
              | NEXT action                                             #nextAction
              ;



action : MOVE (NORTH | SOUTH | EAST | WEST)     
        | SHOOT (NORTH | SOUTH | EAST | WEST)   
        | USE(MAP | RADIO | FRUITS | SODA)      
        | DO NOTHING   
        ;

programme: START progDecl TSTART (clauseWhen)* clauseDefault  ;

progDecl: (varDecl POINtVIRGULE | fctDecl)*;
 
fctDecl : ID AS FUNCTION PAR_OUVERT paramDecl? PAR_FERME DEUXPOINTS fctType (DLOCAL(varDecl POINtVIRGULE)+)? DO (instruction)+ DONE    ;

fctType: scalar                                     #fctTypeScalar
        | VOID                                      #fctTypeVoid
        ;

paramDecl: (varDecl (VIRGULE varDecl)*);


clauseWhen: WHEN exprD (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE   ;

clauseDefault: BYDEF (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE  ; 

 


 