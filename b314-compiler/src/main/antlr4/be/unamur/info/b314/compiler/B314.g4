grammar B314;

import B314Words;

root: ID;
programme: START (vardecl ; | fctdecl)* TSTART (ClauseWhen)* ClauseDefault ;
ClauseWhen: WHEN ExprD (DLOCAL (vardecl ;)+)? DO (instruction)+ DONE ;
ClauseDefault: BYDEF (DLOCAL (vardecl ;)+)? DO (instruction)+ DONE ; 
