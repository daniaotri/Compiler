
grammar B314;

import B314Words;

root : ID;

type : scalar | array  ;
scalar: BOOLEAN | INTEGER | SQUARE  ;
array: scalar CROCHET_OUVERT NUMBER (VIRGULE NUMBER)? CROCHET_FERME ;

exprD : exprEnt
        | exprBool 
        | exprCase
        | exprG
        | ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME  
        | PAR_OUVERT exprD PAR_FERME     
        ;

// On ne fusionne pas exprD avec exprBool, ExprCase et ExprEnt car ces 3 expressions peuvent être réutilisées exclusivement. (Charles Piraprez)

exprEnt : entier
          | exprEnt op=(PLUS |MOINS) exprEnt
          | exprEnt op=(MUL|DIV|DIV_ENT) exprEnt
          | LATITUDE | LONGITUDE | GRID_SIZE 
          | (MAP | RADIO | AMMO | FRUITS | SODA ) COUNT 
          | LIFE
          ;

// On sait que les opérations "*", "/" et "%" doivent être évalués avant "+" et "-". 
//Cela veut dire que PLUS et MOINS doivent être mis en premier pour former les branches suivantes de l'arbre syntaxique.
// Pour mieux comprendre, essayez de voir ce que ça donne avec  2*3+4*5. (Charles Piraprez)

exprBool: TRUE |FALSE
          | NOT exprD 
          | exprBool op=(AND|OR) exprBool 
          | exprEnt op=(INF | SUP) exprEnt 
          | exprEnt EGALE exprEnt 
          | ENNEMI IS (NORTH | SOUTH | EAST | WEST) 
          | GRAAL IS (NORTH | SOUTH | EAST | WEST) 
          ;

// Pour exprBool, les expressions contenant exprEnt sont mises après les expressions contenant exprBool parce que
// les expressions entières doivent être évaluées en premier et doivent donc être plus bas dans l'arbre syntaxique. (Charles Piraprez)


exprCase : DIRT| ROCK | VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | NEARBY CROCHET_OUVERT exprEnt VIRGULE exprEnt CROCHET_FERME;
        
exprG : ID | ID CROCHET_OUVERT exprD (VIRGULE exprD)? CROCHET_FERME    ; 

entier : (MOINS)? DIGIT(DIGIT)*  ;

instruction : SKIPPPP           
              | IF exprBool THEN (instruction)+ DONE     
              | IF exprBool THEN (instruction)+ ELSE (instruction)+ DONE  
              | WHILE exprBool DO (instruction)+ DONE  
              | SET exprG TO exprD  
              | COMPUTE exprD   
              | NEXT action     
              ;

// Dans le document, les encadrés indiquent "IF exprD ... " ainsi que "WHILE exprD"
// Ensuite, le document précise qu'il s'agit bien d'une expression booléenne. (Charles Piraprez)
               
action : MOVE (NORTH | SOUTH | EAST | WEST)     
        | SHOOT (NORTH | SOUTH | EAST | WEST)   
        | USE(MAP | RADIO | FRUITS | SODA)      
        | DO NOTHING   
        ;

fctDecl : ID AS FUNCTION PAR_OUVERT (varDecl (VIRGULE varDecl)*)?PAR_FERME DEUXPOINTS (scalar | VOID)(DLOCAL(varDecl POINtVIRGULE)+)? DO (instruction)+ DONE    ;

varDecl : ID AS type   ;

programme: START (varDecl POINtVIRGULE | fctDecl)* TSTART (clauseWhen)* clauseDefault  ;

clauseWhen: WHEN exprD (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE;

clauseDefault: BYDEF (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE  ; 

commentaire: COMMENTOPEN (POINT Espace*)COMMENTCLOSE   ; 
