
grammar B314; 

import B314Words;

type : scalar    #typeScalar   
        | array  #typeArray   
        ;


scalar: BOOLEAN       #scalarBoolean  
        | INTEGER      #scalarInteger 
        | SQUARE        #scalarSquare
        ;         

array: scalar CROCHET_OUVERT NUMBER (VIRGULE NUMBER)? CROCHET_FERME ;

exprBool : environnementBool                                        #exprBoolEnvi
        | NOT exprBool                                                 #exprBoolNot
        | expr1=exprBool op=(AND|OR) expr2=exprBool                       #exprBoolAndOr
        | expr1=exprBool op=(INF|SUP|EGALE) expr2=exprBool                #exprBoolInfSupEgale
        ;
exprInt : entier                                                        #exprIntEntier
        | environnementInt                                              #exprIntEnv
        | expr1=exprInt op=(PLUS|MOINS) expr2=exprInt                   #exprIntPlusMoins
        | expr1=exprInt op=(MUL|DIV|DIV_ENT) expr2=exprInt              #exprIntMulDiv
        ;
exprCase:environnementCase                                          #exprCaseEnv
        | NEARBY CROCHET_OUVERT exprD VIRGULE exprD CROCHET_FERME   #exprCaseNearby
        ;
exprD : exprBool                                                    #exprDBool
        |exprInt                                                    #exprDInt
        |exprCase                                                   #exprDCas
        | exprG                                                     #exprDexprG
        | ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME         #FunctionCall
        | PAR_OUVERT exprD PAR_FERME                                #exprPar
        ;
environnementInt: LATITUDE
        | LONGITUDE
        | GRID_SIZE  
        |(MAP | RADIO | AMMO | FRUITS | SODA ) COUNT    
        | LIFE
        ;
environnementBool: TRUE
        |FALSE   
        | ENNEMI IS (NORTH | SOUTH | EAST | WEST)  
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
        
exprG : ID                                                              #variableExprG
         | ID CROCHET_OUVERT exprD (VIRGULE exprD)? CROCHET_FERME      #tableauExprG
        ;
entier : (MOINS)? DIGIT(DIGIT)*  ;

instruction : SKIPPPP                                                   #skipppp
              | IF exprD THEN (instruction)+ DONE                       #if
              | IF exprD THEN (instruction)+ ELSE (instruction)+ DONE   #ifthenelse
              | WHILE exprD DO (instruction)+ DONE                      #while
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

fctType: scalar    #fctTypeScalar
        | VOID      #fctTypeVoid
        ;

paramDecl: (varDecl (VIRGULE varDecl)*);

varDecl : ID AS typeOfVar=type;

clauseWhen: WHEN exprD (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE   ;

clauseDefault: BYDEF (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE  ; 

 


 