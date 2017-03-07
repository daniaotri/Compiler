/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.Visitor;

import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;


/**
 *
 * @author jessi
 */
public class MyVisitorExpression extends B314BaseVisitor<Object>{
    
    enum TypeExpression{
    INTEGER,
    BOOLEAN,
    CASE
    }
    
    String TypeGlobal;
    String[] Stack = new String[2];
    int stackPointer = 0;
    
    	@Override public Object visitExprNot(B314Parser.ExprNotContext ctx) {             
            return visitChildren(ctx); 
        }


	@Override public Object visitExprDexprG(B314Parser.ExprDexprGContext ctx) { return visitChildren(ctx); }

	@Override 
        public Object visitExprEnvInt(B314Parser.ExprEnvIntContext ctx) { 
            Stack[stackPointer]= TypeExpression.INTEGER.name();
            stackPointer++;            
            return null;
        }
	@Override 
        public Object visitExprAndOr(B314Parser.ExprAndOrContext ctx) {             
            return visitChildren(ctx); 
        }

	@Override public Object visitExprPar(B314Parser.ExprParContext ctx) { return visitChildren(ctx); }

	@Override 
        public Object visitExprEnvCase(B314Parser.ExprEnvCaseContext ctx) { 
            Stack[stackPointer]= TypeExpression.CASE.name();
            stackPointer++;
            
            return visitEnvironnementCase(ctx.environnementCase()); 
        }

	@Override 
        public Object visitExprEntier(B314Parser.ExprEntierContext ctx) { 
            TypeGlobal = TypeExpression.INTEGER.name();
            Stack[stackPointer]= TypeExpression.INTEGER.name();
            stackPointer++;
            
            return null; 
        }
	@Override public Object visitFunctionCall(B314Parser.FunctionCallContext ctx) { 
            
            return visitChildren(ctx); 
        }

	@Override public Object visitExprInfSupEg(B314Parser.ExprInfSupEgContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEnvBool(B314Parser.ExprEnvBoolContext ctx) { 
            Stack[stackPointer]= TypeExpression.BOOLEAN.name();
            stackPointer++;
            
            return visitEnvironnementBool(ctx.environnementBool()); 
        }

	@Override 
        public Object visitExprMulDiv(B314Parser.ExprMulDivContext ctx) {
            visitChildren(ctx);
            
            return null; }

	@Override public Object visitExprPlusMoins(B314Parser.ExprPlusMoinsContext ctx) {
            int localStackPointer=stackPointer;
            String[] LocalStack = new String[2];
            
            for(int i=0;i==stackPointer;i++){
                LocalStack[i]= new String(Stack[i]);
            }
            
            stackPointer=0;
            visitChildren(ctx);
            if(Stack[0].equals(TypeExpression.INTEGER.name()) && Stack[1].equals(TypeExpression.INTEGER.name())){
                //OK, CONTINUER
                
                stackPointer= localStackPointer;
                for(int i=0;i==stackPointer;i++){
                    Stack[i]= new String(LocalStack[i]);
                }
                
                //Ajout du résultat dans la pile
                
                Stack[stackPointer]= new String(TypeExpression.INTEGER.name());
                stackPointer++;
                   
            }else{
                //KO
            }
                        
            return null;
        }

	@Override
        public Object visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { 
            TypeGlobal = TypeExpression.INTEGER.name();
            return null; 
        }
	@Override 
        public Object visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { 
            TypeGlobal = TypeExpression.BOOLEAN.name();
            return null; 
        }
	@Override 
        public Object visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) {
            TypeGlobal = TypeExpression.CASE.name();
            return null;
        }

}
