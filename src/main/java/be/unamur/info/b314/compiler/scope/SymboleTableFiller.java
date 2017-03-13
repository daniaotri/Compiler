 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/

package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



//@author jessi



public class SymboleTableFiller extends B314BaseListener {


    //definitions des types
	@Override public void enterTypeScalar(B314Parser.TypeScalarContext ctx) { }

	@Override public void exitTypeScalar(B314Parser.TypeScalarContext ctx) { }

	@Override public void enterTypeArray(B314Parser.TypeArrayContext ctx) { }

	@Override public void exitTypeArray(B314Parser.TypeArrayContext ctx) { }

	@Override public void enterScalarBoolean(B314Parser.ScalarBooleanContext ctx) { }

	@Override public void exitScalarBoolean(B314Parser.ScalarBooleanContext ctx) { }

	@Override public void enterScalarInteger(B314Parser.ScalarIntegerContext ctx) { }

	@Override public void exitScalarInteger(B314Parser.ScalarIntegerContext ctx) { }

	@Override public void enterScalarSquare(B314Parser.ScalarSquareContext ctx) { }

	@Override public void exitScalarSquare(B314Parser.ScalarSquareContext ctx) { }

	@Override public void enterArray(B314Parser.ArrayContext ctx) { }

	@Override public void exitArray(B314Parser.ArrayContext ctx) { }
        
        //declaration des variables

	@Override public void enterVarDecl(B314Parser.VarDeclContext ctx) { }

	@Override public void exitVarDecl(B314Parser.VarDeclContext ctx) { }
        
        //verifications des expressions

	@Override public void enterExprDInteger(B314Parser.ExprDIntegerContext ctx) { }

	@Override public void exitExprDInteger(B314Parser.ExprDIntegerContext ctx) { }

	@Override public void enterExprDBoolean(B314Parser.ExprDBooleanContext ctx) { }

	@Override public void exitExprDBoolean(B314Parser.ExprDBooleanContext ctx) { }

	@Override public void enterExprDCase(B314Parser.ExprDCaseContext ctx) { }

	@Override public void exitExprDCase(B314Parser.ExprDCaseContext ctx) { }

	@Override public void enterExprDG(B314Parser.ExprDGContext ctx) { }

	@Override public void exitExprDG(B314Parser.ExprDGContext ctx) { }

	@Override public void enterExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { }

	@Override public void exitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { }

	@Override public void enterExprEntPlusMoins(B314Parser.ExprEntPlusMoinsContext ctx) { }

	@Override public void exitExprEntPlusMoins(B314Parser.ExprEntPlusMoinsContext ctx) { }

	@Override public void enterExprEntEntier(B314Parser.ExprEntEntierContext ctx) { }

	@Override public void exitExprEntEntier(B314Parser.ExprEntEntierContext ctx) { }

	@Override public void enterExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) { }
	
	@Override public void exitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) { }

	@Override public void enterExprEntMulDiv(B314Parser.ExprEntMulDivContext ctx) { }

	@Override public void exitExprEntMulDiv(B314Parser.ExprEntMulDivContext ctx) { }

	@Override public void enterExprEntFonction(B314Parser.ExprEntFonctionContext ctx) { }

	@Override public void exitExprEntFonction(B314Parser.ExprEntFonctionContext ctx) { }

	@Override public void enterExprBoolInfSupEgale(B314Parser.ExprBoolInfSupEgaleContext ctx) { }

	@Override public void exitExprBoolInfSupEgale(B314Parser.ExprBoolInfSupEgaleContext ctx) { }

	@Override public void enterExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { }

	@Override public void exitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { }

	@Override public void enterExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) { }

	@Override public void exitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) { }

	@Override public void enterExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx) { }

	@Override public void exitExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx) { }

	@Override public void enterExprBoolNot(B314Parser.ExprBoolNotContext ctx) { }

	@Override public void exitExprBoolNot(B314Parser.ExprBoolNotContext ctx) { }

	@Override public void enterExprBoolEgaleGauche(B314Parser.ExprBoolEgaleGaucheContext ctx) { }

	@Override public void exitExprBoolEgaleGauche(B314Parser.ExprBoolEgaleGaucheContext ctx) { }

	@Override public void enterExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx) { }

	@Override public void exitExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx) { }

	@Override public void enterExprBoolAndOr(B314Parser.ExprBoolAndOrContext ctx) { }

	@Override public void exitExprBoolAndOr(B314Parser.ExprBoolAndOrContext ctx) { }

	@Override public void enterExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { }

	@Override public void exitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { }

	@Override public void enterExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx) { }

	@Override public void exitExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx) { }

	@Override public void enterExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) { }

	@Override public void exitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) { }

	@Override public void enterExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { }

	@Override public void exitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { }

	@Override public void enterExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx) { }

	@Override public void exitExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx) { }

	@Override public void enterExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { }

	@Override public void exitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { }

	@Override public void enterExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { }

	@Override public void exitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { }

	@Override public void enterExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { }

	@Override public void exitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { }

	@Override public void enterEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { }

	@Override public void exitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { }

	@Override public void enterEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { }

	@Override public void exitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { }

	@Override public void enterEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { }

	@Override public void exitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { }

	@Override public void enterExprGVariable(B314Parser.ExprGVariableContext ctx) { }

	@Override public void exitExprGVariable(B314Parser.ExprGVariableContext ctx) { }

	@Override public void enterExprGTableau(B314Parser.ExprGTableauContext ctx) { }

	@Override public void exitExprGTableau(B314Parser.ExprGTableauContext ctx) { }

	@Override public void enterEntier(B314Parser.EntierContext ctx) { }

	@Override public void exitEntier(B314Parser.EntierContext ctx) { }
        
        //les instructions

	@Override public void enterSkipppp(B314Parser.SkippppContext ctx) { }

	@Override public void exitSkipppp(B314Parser.SkippppContext ctx) { }

	@Override public void enterIf(B314Parser.IfContext ctx) { }

	@Override public void exitIf(B314Parser.IfContext ctx) { }

	@Override public void enterIfthenelse(B314Parser.IfthenelseContext ctx) { }

	@Override public void exitIfthenelse(B314Parser.IfthenelseContext ctx) { }

	@Override public void enterWhile(B314Parser.WhileContext ctx) { }

	@Override public void exitWhile(B314Parser.WhileContext ctx) { }

	@Override public void enterAffectation(B314Parser.AffectationContext ctx) { }

	@Override public void exitAffectation(B314Parser.AffectationContext ctx) { }

	@Override public void enterCompute(B314Parser.ComputeContext ctx) { }

	@Override public void exitCompute(B314Parser.ComputeContext ctx) { }

	@Override public void enterNextAction(B314Parser.NextActionContext ctx) { }

	@Override public void exitNextAction(B314Parser.NextActionContext ctx) { }

        //les actions
        
	@Override public void enterAction(B314Parser.ActionContext ctx) { }

	@Override public void exitAction(B314Parser.ActionContext ctx) { }

        //programmes
	@Override public void enterProgramme(B314Parser.ProgrammeContext ctx) { }

	@Override public void exitProgramme(B314Parser.ProgrammeContext ctx) { }
        
        //les variables et fonctions du programmes
                
	@Override public void enterProgDecl(B314Parser.ProgDeclContext ctx) { }

	@Override public void exitProgDecl(B314Parser.ProgDeclContext ctx) { }

         //les fonctions
	@Override public void enterFctDecl(B314Parser.FctDeclContext ctx) { }

	@Override public void exitFctDecl(B314Parser.FctDeclContext ctx) { }
        
        //les types de fonctions

	@Override public void enterFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { }

	@Override public void exitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { }

	@Override public void enterFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { }

	@Override public void exitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { }
        
        //les paramètres de fonctions

	@Override public void enterParamDecl(B314Parser.ParamDeclContext ctx) { }

	@Override public void exitParamDecl(B314Parser.ParamDeclContext ctx) { }
        
        //clauses when

	@Override public void enterClauseWhen(B314Parser.ClauseWhenContext ctx) { }

	@Override public void exitClauseWhen(B314Parser.ClauseWhenContext ctx) { }
        
        //clause default

	@Override public void enterClauseDefault(B314Parser.ClauseDefaultContext ctx) { }

	@Override public void exitClauseDefault(B314Parser.ClauseDefaultContext ctx) { }
        
        //other

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}
