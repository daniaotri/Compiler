/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.Visitor;
import java.util.*;

import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;
import be.unamur.info.b314.compiler.B314Parser.InstructionContext;
import be.unamur.info.b314.compiler.scope.Scope;
import be.unamur.info.b314.compiler.main.Main;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


//import org.antlr.v4.runtime.ParserRuleContext;



//=======
import java.util.ArrayList;
import java.util.Iterator;

//import java.util.logging.Logger;

import org.antlr.v4.runtime.ParserRuleContext;
//import org.slf4j.LoggerFactory;
//>>>>>>> 76fca761e9eb74f21c784f0f42aa9ac9dab0d190




/**
 * 
 * @author jessi
 */
public class PCodeVisitor extends B314BaseVisitor<Object>{
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    //private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private Scope Globalscope;
    private Scope Currentscope;
    private final PCodePrinter printer;
    private int position;
    private int LevelScope;
    





    public PCodeVisitor(Scope scope, PCodePrinter printer) {
        this.Globalscope = scope;
        this.printer = printer;

		position=1;

        this.Currentscope = scope;
	    this.position=1;
        this.LevelScope = 0;

        for(int i= 0; i<99;i++){



            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodePrinter.PCodeTypes.Int);

        }
    }


       
       
    
	@Override public Object visitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) {
		printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,1);
		       //printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
		return visitChildren(ctx);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public Object visitExprBoolNot(B314Parser.ExprBoolNotContext ctx) {
		printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
		return visitChildren(ctx);
	}

	@Override public Object visitCompute(B314Parser.ComputeContext ctx) { return null; }

	@Override public Object visitNextAction(B314Parser.NextActionContext ctx) {
            String nomAction = ctx.action().getText().toLowerCase().replace("\\s+","");
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, NextActions.valueOf(nomAction).getValue());
            printer.printSetTo(PCodePrinter.PCodeTypes.Int);
            


            //printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, NextAction.valueOf(nomAction).getValue());
                     return null;
	}
	@Override public Object visitAction(B314Parser.ActionContext ctx) { return null; }

	//Nath
	@Override
        public Object visitProgramme(B314Parser.ProgrammeContext ctx) {
	        LOG.error("Je passe ici ------------------------------------------------------");
            printer.printSetStackPointer(Globalscope.getChildren().size()+99);
            printer.printUnconditionalJump("Begin");
            printer.printDefineLabel("Begin");
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            printer.printPrin();
            //printer.printUnconditionalJump("byDefault");
            //super.visitProgramme(ctx);
            printer.printStop();
            return null;
	}

	@Override 
        public Object visitProgDecl(B314Parser.ProgDeclContext ctx) {
		//printer.printSetStackPointer();

		return null; }

	@Override public Object visitFctDecl(B314Parser.FctDeclContext ctx) { return null; }

	@Override public Object visitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { return null; }

	@Override public Object visitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { return null; }

	@Override public Object visitParamDecl(B314Parser.ParamDeclContext ctx) { return null; }

	@Override 
        public Object visitClauseWhen(B314Parser.ClauseWhenContext ctx) {



            String name = "clauseWhen"+position;

            position++;
            try{
                LOG.debug(name);
                Scope scope = Currentscope.WhoIsThisScope(name);
                LevelScope ++;
                Currentscope = scope;
                printer.printDefine(name);
                printer.printSetStackPointer(Currentscope.getChildren().size()+5);
                printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 0);
                printer.printSetTo(PCodePrinter.PCodeTypes.Int);
                List<InstructionContext> Instructions = ctx.instruction();
                for(int i = 0; i < Instructions.size();i++)
                    Instructions.get(i).accept(this);
                printer.printReturnFromFunction();
                LevelScope--;
                Currentscope = Currentscope.getParent();
            }catch(Exception ex){
                throw new RuntimeException();
            }
            return null;
	}



    @Override
        public Object visitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            String name = "clauseDefault";
            try{
                Scope scope = Currentscope.WhoIsThisScope(name);
                LevelScope ++;
                Currentscope = scope;
                printer.printDefine(name);
                printer.printSetStackPointer(Currentscope.getChildren().size());
                printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 0);
                printer.printSetTo(PCodePrinter.PCodeTypes.Int);
                List<InstructionContext> Instructions = ctx.instruction();
                for(int i = 0; i < Instructions.size();i++)
                    Instructions.get(i).accept(this);
                printer.printReturnFromFunction();
                LevelScope--;
                Currentscope = Currentscope.getParent();
            }catch(Exception ex){
                throw new RuntimeException();
            }
            return null;
	}


}
      
    
    
    
