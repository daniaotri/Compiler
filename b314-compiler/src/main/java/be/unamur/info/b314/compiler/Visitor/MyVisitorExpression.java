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
    String[] Stack = new String[2];
    int stackPointer = 0;

	@Override public Object visitExprDexprG(B314Parser.ExprDexprGContext ctx) { return visitChildren(ctx); }
        @Override public Object visitFunctionCall(B314Parser.FunctionCallContext ctx) { return visitChildren(ctx); }
        

	@Override 
        public Object visitExprEnvInt(B314Parser.ExprEnvIntContext ctx) { 
            Stack[stackPointer]= TypeExpression.INTEGER.name();
            stackPointer++;            
            return null;
        }
        // le type de ExprD depend du type de l'expression entre ()
	@Override 
        public Object visitExprPar(B314Parser.ExprParContext ctx) {             
            return visitChildren(ctx); }

	@Override 
        public Object visitExprEnvCase(B314Parser.ExprEnvCaseContext ctx) { 
            Stack[stackPointer]= TypeExpression.CASE.name();
            stackPointer++;            
            return null; 
        }

	@Override 
        public Object visitExprEntier(B314Parser.ExprEntierContext ctx) { 
            Stack[stackPointer]= TypeExpression.INTEGER.name();
            stackPointer++;      
            return null; 
        }
	

	@Override 
        public Object visitExprEnvBool(B314Parser.ExprEnvBoolContext ctx) { 
            Stack[stackPointer]= TypeExpression.BOOLEAN.name();
            stackPointer++;            
            return null; 
        }
        @Override 
        public Object visitExprOp(B314Parser.ExprOpContext ctx) {
            int localStackPointer=stackPointer;
            String[] LocalStack = new String[2];
            
            for(int i=0;i==stackPointer;i++){
                LocalStack[i]= new String(Stack[i]);
            }            
            stackPointer=0;
            visitChildren(ctx);
            String nomOperation = ctx.op.toString();
            if(visitType(Stack,nomOperation)){
                //OK, CONTINUER                
                stackPointer= localStackPointer;
                for(int i=0;i==stackPointer;i++){
                    Stack[i]= new String(LocalStack[i]);
                }                
                //Ajout du résultat dans la pile                
                Stack[stackPointer]= new String(TypeExpression.INTEGER.name());
                stackPointer++;
            }
            return null; 
        }

        private Boolean visitType (String[] pile, String operation){            
            Boolean result = false;
            if(operation.equals("not")) result = pile[0].equals(TypeExpression.BOOLEAN.name());
            if(operation.equals("plus")) result = pile[0].equals(TypeExpression.INTEGER.name()) && pile[1].equals(TypeExpression.INTEGER.name());
            if(operation.equals("moins")) result = pile[0].equals(TypeExpression.INTEGER.name()) && pile[1].equals(TypeExpression.INTEGER.name());
            if(operation.equals("mul")) result = pile[0].equals(TypeExpression.INTEGER.name()) && pile[1].equals(TypeExpression.INTEGER.name());
            if(operation.equals("div")) result = pile[0].equals(TypeExpression.INTEGER.name()) && pile[1].equals(TypeExpression.INTEGER.name());
            if(operation.equals("divEnt")) result = pile[0].equals(TypeExpression.INTEGER.name()) && pile[1].equals(TypeExpression.INTEGER.name());
            if(operation.equals("sup")) result = pile[0].equals(TypeExpression.BOOLEAN.name()) && pile[1].equals(TypeExpression.BOOLEAN.name());
            if(operation.equals("inf")) result = pile[0].equals(TypeExpression.BOOLEAN.name()) && pile[1].equals(TypeExpression.BOOLEAN.name());
            if(operation.equals("egale")) result = pile[0].equals(TypeExpression.BOOLEAN.name()) && pile[1].equals(TypeExpression.BOOLEAN.name());
            return result;
        }
        @Override 
        public Object visitSkipppp(B314Parser.SkippppContext ctx) {    
            return null; 
        }
        @Override 
        public Object visitIf(B314Parser.IfContext ctx) {             
            return visitChildren(ctx); 
        }

	@Override 
        public Object visitIfthenelse(B314Parser.IfthenelseContext ctx) { 
            return visitChildren(ctx); 
        }

	@Override 
        public Object visitWhile(B314Parser.WhileContext ctx) { 
            return visitChildren(ctx); 
        }

	@Override 
        public Object visitAffectation(B314Parser.AffectationContext ctx) { 
            return visitChildren(ctx); 
        }

        
	@Override 
        public Object visitCompute(B314Parser.ComputeContext ctx) { 
            return visitChildren(ctx); 
        }

	@Override 
        public Object visitNextAction(B314Parser.NextActionContext ctx) { 
            return visitAction(ctx.action());
        }
}
