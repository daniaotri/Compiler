
grammar B314; 

import B314Words;

type: scalar       #typeScalar
    | array     #typeArray
    ;
       
scalar: BOOLEAN     #scalarBoolean
        | INTEGER   #scalarInteger
        | SQUARE    #scalarSquare
        ;

array: scalar CROCHET_OUVERT taille1=NUMBER (VIRGULE taille2=NUMBER)? CROCHET_FERME 
     ;

varDecl: ID AS type
        ;

exprD: exprEnt                 #exprDInteger
      | exprBool               #exprDBoolean
      | exprCase               #exprDCase
      | exprG                  #exprDG
      ;

exprEnt: entier                                                   #exprEntEntier
        | environnementInt                                         #exprEntEnvironnement
        | exprInt=ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME        #exprEntFonction
        | exprEnt op=(MUL|DIV|DIV_ENT) exprEnt             #exprEntMulDivEntEnt
        | exprEnt op=(MUL|DIV|DIV_ENT) exprG             #exprEntMulDivEntGauhe
        | exprG op=(MUL|DIV|DIV_ENT) exprEnt             #exprEntMulDivGauheEnt
        | expr3=exprG op=(MUL|DIV|DIV_ENT) expr4=exprG             #exprEntMulDivGaucheGauhe
        | exprEnt op=(PLUS|MOINS) exprEnt             #exprEntPlusMoinsEntEnt
        | exprEnt op=(PLUS|MOINS) exprG             #exprEntPlusMoinsEntGauhe
        | exprG op=(PLUS|MOINS) exprEnt             #exprEntPlusMoinsGauheEnt
        | expr3=exprG op=(PLUS|MOINS) expr4=exprG             #exprEntPlusMoinsGaucheGauhe
        | PAR_OUVERT exprEnt PAR_FERME                               #exprEntParennthese
        ;

exprCase: exprSquare=ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME         #exprCaseFonction
        | environnementCase                                         #exprCaseEnvironnement
        | NEARBY CROCHET_OUVERT exprEnt VIRGULE exprEnt CROCHET_FERME   #exprCaseNearbyEntEnt
        | NEARBY CROCHET_OUVERT exprEnt VIRGULE exprG CROCHET_FERME   #exprCaseNearbyEntG
        | NEARBY CROCHET_OUVERT exprG VIRGULE exprEnt CROCHET_FERME   #exprCaseNearbyGEnt
        | NEARBY CROCHET_OUVERT taille1=exprG VIRGULE taille2=exprG CROCHET_FERME   #exprCaseNearbyGG
        | PAR_OUVERT exprCase PAR_FERME                               #exprCaseParennthese
        ;

exprBool: TRUE                                                      #exprBoolTrue
         | FALSE                                                    #exprBoolFalse
         | exprBoolean=ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME        #exprBoolFonction
         | environnementBool                                        #exprBoolEnvironnement
         | exprEnt EGALE exprEnt                                 #exprBoolEgaleInteger
         | exprBool EGALE exprBool                               #exprBoolEgaleBoolean
         | exprCase EGALE exprCase                               #exprBoolEgaleCase
         | expr3=exprG EGALE expr4=exprG                        #exprBoolEgaleGaucheGauche
         | exprG EGALE exprEnt                      #exprBoolEgaleGaucheEnt
         | exprG EGALE exprBool                     #exprBoolEgaleGaucheBool
         | exprG EGALE exprCase                     #exprBoolEgaleGaucheCase
         | exprEnt EGALE exprG                      #exprBoolEgaleEntGauche
         | exprBool EGALE exprG                     #exprBoolEgaleBoolGauche
         | exprCase EGALE exprG                     #exprBoolEgaleCaseGauche
         | exprEnt op=(INF|SUP) exprEnt                           #exprBoolInfSupEnt
         | exprEnt op=(INF|SUP) expr2=exprG                             #exprBoolInfSupEntGauche
         | expr1=exprG op=(INF|SUP) exprEnt                               #exprBoolInfSupGEnt
         | expr1=exprG op=(INF|SUP) expr2=exprG                               #exprBoolInfSupGG
         | exprBool op=(AND|OR) exprBool                         #exprBoolAndOrBoolBool
         | exprBool op=(AND|OR) exprG                         #exprBoolAndOrBoolGauche
         | exprG op=(AND|OR) exprBool                         #exprBoolAndOrGaucheBool
         | expr5=exprG op=(AND|OR) expr6=exprG                         #exprBoolAndOrGaucheGauche
         | NOT exprBool                                                 #exprBoolNot
         | NOT exprG                                                    #exprBoolNotGauche
         | PAR_OUVERT exprBool PAR_FERME                               #exprBoolParennthese
         ;

exprCase: exprSquare=ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME         #exprCaseFonction
        | environnementCase                                         #exprCaseEnvironnement
        | NEARBY CROCHET_OUVERT exprEnt VIRGULE exprEnt CROCHET_FERME   #exprCaseNearbyEntEnt
        | NEARBY CROCHET_OUVERT exprEnt VIRGULE exprG CROCHET_FERME   #exprCaseNearbyEntG
        | NEARBY CROCHET_OUVERT exprG VIRGULE exprEnt CROCHET_FERME   #exprCaseNearbyGEnt
        | NEARBY CROCHET_OUVERT taille1=exprG VIRGULE taille2=exprG CROCHET_FERME   #exprCaseNearbyGG
        | PAR_OUVERT exprCase PAR_FERME                               #exprCaseParennthese
        ;

environnementInt: LATITUDE
                | LONGITUDE
                | GRID SIZE  
                |(MAP | RADIO | AMMO | FRUITS | SODA ) COUNT    
                | LIFE
                ;

environnementBool: ENNEMI IS (NORTH | SOUTH | EAST | WEST)  
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
        
exprG: ID                                                              #exprGVariable
      | ID CROCHET_OUVERT t3=exprD (VIRGULE t4=exprD)? CROCHET_FERME      #exprGTableau
      //| ID CROCHET_OUVERT exprEnt (VIRGULE exprG)? CROCHET_FERME      #exprGTableauEntG
      //| ID CROCHET_OUVERT exprG (VIRGULE exprEnt)? CROCHET_FERME      #exprGTableauGEnt
      //| ID CROCHET_OUVERT t3=exprG (VIRGULE t4=exprG)? CROCHET_FERME      #exprGTableauGG
      ;

entier: (MOINS)?NUMBER  
       ;

instruction: SKIPPPP                                                   #skipppp
             | IF exprBool THEN instruction+ DONE                       #if
             | IF exprBool THEN instruction+ ELSE instruction+ DONE   #ifthenelse
             | WHILE exprBool DO instruction+ DONE                      #while
             | SET exprG TO exprG                                      #affectationGaucheGauche
             | SET exprG TO exprEnt                                      #affectationGaucheEnt
             | SET exprG TO exprBool                                      #affectationGaucheBool
             | SET exprG TO exprCase                                      #affectationGaucheCase
             | COMPUTE exprD                                           #compute
             | NEXT action                                             #nextAction
             ;



action: MOVE (NORTH | SOUTH | EAST | WEST)     
        | SHOOT (NORTH | SOUTH | EAST | WEST)   
        | USE(MAP | RADIO | FRUITS | SODA)      
        | DO NOTHING   
        ;

programme: DECLARE AND RETAIN progDecl WHEN YOUR TURN (clauseWhen)* clauseDefault 
         ;

progDecl: (varDecl POINtVIRGULE | fctDecl)*
        ;
 
fctDecl: ID AS FUNCTION PAR_OUVERT paramDecl? PAR_FERME DEUXPOINTS fctType (DECLARE LOCAL(varDecl POINtVIRGULE)+)? DO (instruction)+ DONE    
        ;

fctType: scalar                                     #fctTypeScalar
       | VOID                                      #fctTypeVoid
       ;

paramDecl: (varDecl (VIRGULE varDecl)*)
         ;


clauseWhen: WHEN exprD (DECLARE LOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE  
          ;

clauseDefault: BY DEFAULT (DECLARE LOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE 
             ; 

 


 