 grammar B314; 

import B314Words;

type : scalar | array  ;
scalar: BOOLEAN | INTEGER | SQUARE  ;
array: scalar CROCHET_OUVERT DIGIT (DIGIT)* (VIRGULE DIGIT (DIGIT)*)? CROCHET_FERME ;

exprD : entier      
        | LATITUDE | LONGITUDE | GRID_SIZE  
        |(MAP | RADIO | AMMO | FRUITS | SODA ) COUNT    
        | LIFE      
        | TRUE |FALSE   
        | ENNEMI IS (NORTH | SOUTH | EAST | WEST)  
        | GRAAL IS (NORTH | SOUTH | EAST | WEST)    
        | DIRT| ROCK | VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | NEARBY CROCHET_OUVERT exprD VIRGULE exprD CROCHET_FERME
        | exprG   
        | ID PAR_OUVERT (exprD (VIRGULE exprD)*)? PAR_FERME   
        | PAR_OUVERT exprD PAR_FERME    
        | NOT exprD 
        | exprD op=(AND|OR) exprD  
        | exprD op=(INF | SUP | EGALE) exprD    
        | exprD op=(PLUS |MOINS) exprD      
        | exprD op=(MUL|DIV|DIV_ENT) exprD  
        ;
        
exprG : ID | ID CROCHET_OUVERT exprD (VIRGULE exprD)? CROCHET_FERME ; 
entier : (MOINS)? DIGIT(DIGIT)*  ;

instruction : SKIPPPP           
              | IF exprD THEN (instruction)+ DONE     
              | IF exprD THEN (instruction)+ ELSE (instruction)+ DONE  
              | WHILE exprD DO (instruction)+ DONE  
              | SET exprG TO exprD  
              | COMPUTE exprD   
              | NEXT action     
              ;



action : MOVE (NORTH | SOUTH | EAST | WEST)     
        | SHOOT (NORTH | SOUTH | EAST | WEST)   
        | USE(MAP | RADIO | FRUITS | SODA)      
        | DO NOTHING   
        ;

programme: START (varDecl POINtVIRGULE | fctDecl)* TSTART (clauseWhen)* clauseDefault  ;
 
fctDecl : ID AS FUNCTION PAR_OUVERT (varDecl (VIRGULE varDecl)*)?PAR_FERME DEUXPOINTS (scalar | VOID)(DLOCAL(varDecl POINtVIRGULE)+)? DO (instruction)+ DONE    ;

varDecl : ID AS type   ;

clauseWhen: WHEN exprD (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE   ;
clauseDefault: BYDEF (DLOCAL (varDecl POINtVIRGULE)+)? DO (instruction)+ DONE  ; 
 commentaire: COMMENTOPEN (POINT Espace*)COMMENTCLOSE   ; 