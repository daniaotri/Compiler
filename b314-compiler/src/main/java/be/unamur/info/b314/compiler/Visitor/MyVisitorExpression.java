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
    
    	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprNot(B314Parser.ExprNotContext ctx) { 
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEnprNearby(B314Parser.EnprNearbyContext ctx) { 
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDexprG(B314Parser.ExprDexprGContext ctx) { 
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEnvInt(B314Parser.ExprEnvIntContext ctx) { 
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprAndOr(B314Parser.ExprAndOrContext ctx) { 
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprPar(B314Parser.ExprParContext ctx) { 
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEnvCase(B314Parser.ExprEnvCaseContext ctx) { 
            
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEntier(B314Parser.ExprEntierContext ctx) { 
            
            return visitChildren(ctx);
        }
    
    
}
