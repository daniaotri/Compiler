
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
        | exprEnt  (MUL|DIV|DIV_ENT) exprEnt             #exprEntMulDivEntEnt
        | exprEnt  (MUL|DIV|DIV_ENT) (exprG|appelDeFonction)            #exprEntMulDivEntGauhe
        | (exprG|appelDeFonction)  (MUL|DIV|DIV_ENT) exprEnt             #exprEntMulDivGauheEnt
        | (exprG|appelDeFonction)  (MUL|DIV|DIV_ENT) (exprG|appelDeFonction)             #exprEntMulDivGaucheGauhe
        | exprEnt  (PLUS|MOINS) exprEnt             #exprEntPlusMoinsEntEnt
        | exprEnt  (PLUS|MOINS) (exprG|appelDeFonction)             #exprEntPlusMoinsEntGauhe
        | (exprG|appelDeFonction)  (PLUS|MOINS) exprEnt             #exprEntPlusMoinsGauheEnt
        | (exprG|appelDeFonction)  (PLUS|MOINS) (exprG|appelDeFonction)             #exprEntPlusMoinsGaucheGauhe
        | PAR_OUVERT exprEnt PAR_FERME                               #exprEntParennthese
        ;

exprBool: TRUE                                                      #exprBoolTrue
         | FALSE                                                    #exprBoolFalse
         | environnementBool                                        #exprBoolEnvironnement
         | exprEnt EGALE (exprG|appelDeFonction)                    #exprBoolEgaleEntG
         | (exprG|appelDeFonction) EGALE exprEnt                    #exprBoolEgaleGEnt
         | exprCase EGALE (exprG|appelDeFonction)                    #exprBoolEgaleCaseG
         | (exprG|appelDeFonction) EGALE exprCase                    #exprBoolEgaleGCase
         | (exprG|appelDeFonction) EGALE (exprG|appelDeFonction)                    #exprBoolEgaleGG
         | exprEnt EGALE exprEnt                                                    #exprBoolEgaleEntEnt
         | exprCase EGALE exprCase                                                    #exprBoolEgaleCaseCase
         | exprBool EGALE exprBool                               #exprBoolEgaleBoolean
         | (appelDeFonction|exprG) EGALE exprBool                     #exprBoolEgaleGaucheBool
         | exprBool EGALE (appelDeFonction|exprG)                     #exprBoolEgaleBoolGauche
         | (exprEnt|appelDeFonction|exprG)  (INF|SUP) (exprEnt|appelDeFonction|exprG)                          #exprBoolInfSupEnt
         | exprBool  (AND|OR) exprBool                         #exprBoolAndOrBoolBool
         | exprBool  (AND|OR) (exprG|appelDeFonction)                         #exprBoolAndOrBoolGauche
         | (exprG|appelDeFonction)  (AND|OR) exprBool                         #exprBoolAndOrGaucheBool
         | (exprG|appelDeFonction)  (AND|OR) (exprG|appelDeFonction)                         #exprBoolAndOrGaucheGauche
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
      | ID CROCHET_OUVERT exprEnt (VIRGULE (appelDeFonction|exprG) )? CROCHET_FERME      #exprGTableauEntFonct
      | ID CROCHET_OUVERT (appelDeFonction|exprG) (VIRGULE exprEnt)? CROCHET_FERME      #exprGTableauFonctEnt
      | ID CROCHET_OUVERT (appelDeFonction|exprG) (VIRGULE (appelDeFonction|exprG) )? CROCHET_FERME      #exprGTableauFonctFonct
      | ID CROCHET_OUVERT exprEnt (VIRGULE exprEnt )? CROCHET_FERME      #exprGTableauEntEnt
      ;

entier: (MOINS)?NUMBER  
       ;

appelDeFonction: ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME;

instruction: SKIPPPP                                                   #skipppp
             | IF (exprBool|exprG|appelDeFonction) THEN instruction+ DONE                       #if
             | IF (exprBool|exprG|appelDeFonction)  THEN instruction+ ELSE instruction+ DONE   #ifthenelse
             | WHILE (exprBool|exprG|appelDeFonction)  DO instruction+ DONE                      #while
             | SET exprG TO exprEnt                                      #affectationGaucheDroite
             | SET exprG TO exprBool                                      #affectationGaucheDroiteBool 
             | SET exprG TO exprCase                                      #affectationGaucheDroiteCase 
             | SET exprG TO exprG                                      #affectationGaucheDroiteGauche 
             | SET exprG TO appelDeFonction                                      #affectationGaucheDroiteFonction 
             | COMPUTE exprD                                        #compute
             | NEXT action                                             #nextAction
             ;



action: MOVE (NORTH | SOUTH | EAST | WEST)     
        | SHOOT (NORTH | SOUTH | EAST | WEST)   
        | USE(MAP | RADIO | FRUITS | SODA)      
        | DO NOTHING   
        ;

programme: DECLARE AND RETAIN progDecl WHEN YOUR TURN (clauseWhen)* clauseDefault (clauseWhen)?
         ;

progDecl: (varDecl POINtVIRGULE | fctDecl)*
        ;
 
fctDecl: ID AS FUNCTION PAR_OUVERT paramDecl PAR_FERME DEUXPOINTS fctType (DECLARE LOCAL(varDecl POINtVIRGULE)+)? DO (instruction)+ DONE   
        ;

fctType: scalar                                     #fctTypeScalar
       | VOID                                      #fctTypeVoid
       ;

paramDecl: (varDecl (VIRGULE varDecl)*)?
         ;


clauseWhen: WHEN (exprBool|exprG|appelDeFonction) (DECLARE LOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE  
          ;

clauseDefault: BY DEFAULT (DECLARE LOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE 
             ; 

 


 