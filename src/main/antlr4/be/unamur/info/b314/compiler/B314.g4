
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
      | appelDeFonction        #exprDFonction
      |PAR_OUVERT appelDeFonction PAR_FERME                               #exprFonctionParennthese
      ;

exprEnt: entier                                                   #exprEntEntier
        | environnementInt                                         #exprEntEnvironnement
        | exprEnt op=(MUL|DIV|DIV_ENT) exprEnt             #exprEntMulDivEntEnt
        | exprEnt op=(MUL|DIV|DIV_ENT) (exprG|appelDeFonction)            #exprEntMulDivEntGauhe
        | (exprG|appelDeFonction) op=(MUL|DIV|DIV_ENT) exprEnt             #exprEntMulDivGauheEnt
        | (exprG|appelDeFonction) op=(MUL|DIV|DIV_ENT) (exprG|appelDeFonction)             #exprEntMulDivGaucheGauhe
        | exprEnt op=(PLUS|MOINS) exprEnt             #exprEntPlusMoinsEntEnt
        | exprEnt op=(PLUS|MOINS) (exprG|appelDeFonction)             #exprEntPlusMoinsEntGauhe
        | (exprG|appelDeFonction) op=(PLUS|MOINS) exprEnt             #exprEntPlusMoinsGauheEnt
        | (exprG|appelDeFonction) op=(PLUS|MOINS) (exprG|appelDeFonction)             #exprEntPlusMoinsGaucheGauhe
        | PAR_OUVERT exprEnt PAR_FERME                               #exprEntParennthese
        ;

exprBool: TRUE                                                      #exprBoolTrue
         | FALSE                                                    #exprBoolFalse
         | environnementBool                                        #exprBoolEnvironnement
         | (exprEnt|appelDeFonction|exprG|exprCase) EGALE (exprEnt|appelDeFonction|exprG|exprCase)                                 #exprBoolEgaleOther
         | exprBool EGALE exprBool                               #exprBoolEgaleBoolean
         | (exprEnt|appelDeFonction|exprG|exprCase) EGALE exprBool                     #exprBoolEgaleGaucheBool
         | exprBool EGALE (exprEnt|appelDeFonction|exprG|exprCase)                     #exprBoolEgaleBoolGauche
         | (exprEnt|appelDeFonction|exprG) op=(INF|SUP) (exprEnt|appelDeFonction|exprG)                          #exprBoolInfSupEnt
         | exprBool op=(AND|OR) exprBool                         #exprBoolAndOrBoolBool
         | exprBool op=(AND|OR) (exprG|appelDeFonction)                         #exprBoolAndOrBoolGauche
         | (exprG|appelDeFonction) op=(AND|OR) exprBool                         #exprBoolAndOrGaucheBool
         | (exprG|appelDeFonction) op=(AND|OR) (exprG|appelDeFonction)                         #exprBoolAndOrGaucheGauche
         | NOT exprBool                                                 #exprBoolNot
         | NOT (exprG|appelDeFonction)                                                    #exprBoolNotGauche
         | PAR_OUVERT exprBool PAR_FERME                               #exprBoolParennthese
         ;

exprCase: environnementCase                                         #exprCaseEnvironnement
        | NEARBY CROCHET_OUVERT (exprEnt|appelDeFonction|exprG) VIRGULE (exprEnt|appelDeFonction|exprG) CROCHET_FERME   #exprCaseNearby
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
      | ID CROCHET_OUVERT exprD (VIRGULE exprD)? CROCHET_FERME      #exprGTableau
      ;

entier: (MOINS)?NUMBER  
       ;

appelDeFonction: ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME;

instruction: SKIPPPP                                                   #skipppp
             | IF exprD THEN instruction+ DONE                       #if
             | IF exprD  THEN instruction+ ELSE instruction+ DONE   #ifthenelse
             | WHILE exprD  DO instruction+ DONE                      #while
             | SET exprG TO exprD                                      #affectationGaucheDroite
             | COMPUTE exprD                                         #compute
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

 


 