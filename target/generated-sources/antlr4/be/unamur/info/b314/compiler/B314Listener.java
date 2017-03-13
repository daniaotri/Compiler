// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link B314Parser}.
 */
public interface B314Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code typeScalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeScalar(B314Parser.TypeScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeScalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeScalar(B314Parser.TypeScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(B314Parser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(B314Parser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarBoolean}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarBoolean(B314Parser.ScalarBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarBoolean}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarBoolean(B314Parser.ScalarBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarInteger}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarInteger(B314Parser.ScalarIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarInteger}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarInteger(B314Parser.ScalarIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarSquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarSquare(B314Parser.ScalarSquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarSquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarSquare(B314Parser.ScalarSquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(B314Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(B314Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDInteger}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDInteger(B314Parser.ExprDIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDInteger}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDInteger(B314Parser.ExprDIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDBoolean}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDBoolean(B314Parser.ExprDBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDBoolean}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDBoolean(B314Parser.ExprDBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDCase(B314Parser.ExprDCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDCase(B314Parser.ExprDCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDG(B314Parser.ExprDGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDG(B314Parser.ExprDGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntParennthese}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntParennthese}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntPlusMoins}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntPlusMoins(B314Parser.ExprEntPlusMoinsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntPlusMoins}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntPlusMoins(B314Parser.ExprEntPlusMoinsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntEntier}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntEntier(B314Parser.ExprEntEntierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntEntier}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntEntier(B314Parser.ExprEntEntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntEnvironnement}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntEnvironnement}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntMulDiv}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntMulDiv(B314Parser.ExprEntMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntMulDiv}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntMulDiv(B314Parser.ExprEntMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntFonction}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntFonction(B314Parser.ExprEntFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntFonction}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntFonction(B314Parser.ExprEntFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolInfSupEgale}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolInfSupEgale(B314Parser.ExprBoolInfSupEgaleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolInfSupEgale}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolInfSupEgale(B314Parser.ExprBoolInfSupEgaleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolFalse}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolFalse(B314Parser.ExprBoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolFalse}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolTrue}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolTrue(B314Parser.ExprBoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolTrue}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolNot(B314Parser.ExprBoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolNot(B314Parser.ExprBoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleGauche(B314Parser.ExprBoolEgaleGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleGauche(B314Parser.ExprBoolEgaleGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolFonction}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolFonction}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolAndOr}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolAndOr(B314Parser.ExprBoolAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolAndOr}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolAndOr(B314Parser.ExprBoolAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEnvironnement}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEnvironnement}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleInteger}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleInteger}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleBoolean}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleBoolean}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolParennthese}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolParennthese}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseFonction}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseFonction}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseEnvironnement}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseEnvironnement}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseNearby}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseNearby}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseParennthese}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseParennthese}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#environnementInt}.
	 * @param ctx the parse tree
	 */
	void enterEnvironnementInt(B314Parser.EnvironnementIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#environnementInt}.
	 * @param ctx the parse tree
	 */
	void exitEnvironnementInt(B314Parser.EnvironnementIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#environnementBool}.
	 * @param ctx the parse tree
	 */
	void enterEnvironnementBool(B314Parser.EnvironnementBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#environnementBool}.
	 * @param ctx the parse tree
	 */
	void exitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#environnementCase}.
	 * @param ctx the parse tree
	 */
	void enterEnvironnementCase(B314Parser.EnvironnementCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#environnementCase}.
	 * @param ctx the parse tree
	 */
	void exitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGVariable}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprGVariable(B314Parser.ExprGVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGVariable}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprGVariable(B314Parser.ExprGVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGTableau}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprGTableau(B314Parser.ExprGTableauContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGTableau}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprGTableau(B314Parser.ExprGTableauContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#entier}.
	 * @param ctx the parse tree
	 */
	void enterEntier(B314Parser.EntierContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#entier}.
	 * @param ctx the parse tree
	 */
	void exitEntier(B314Parser.EntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipppp}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSkipppp(B314Parser.SkippppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipppp}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSkipppp(B314Parser.SkippppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIf(B314Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIf(B314Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(B314Parser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(B314Parser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhile(B314Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhile(B314Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectation}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(B314Parser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectation}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(B314Parser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compute}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCompute(B314Parser.ComputeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compute}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCompute(B314Parser.ComputeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextAction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNextAction(B314Parser.NextActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextAction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNextAction(B314Parser.NextActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(B314Parser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(B314Parser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(B314Parser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(B314Parser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#progDecl}.
	 * @param ctx the parse tree
	 */
	void enterProgDecl(B314Parser.ProgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#progDecl}.
	 * @param ctx the parse tree
	 */
	void exitProgDecl(B314Parser.ProgDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void enterFctDecl(B314Parser.FctDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void exitFctDecl(B314Parser.FctDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fctTypeScalar}
	 * labeled alternative in {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 */
	void enterFctTypeScalar(B314Parser.FctTypeScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fctTypeScalar}
	 * labeled alternative in {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 */
	void exitFctTypeScalar(B314Parser.FctTypeScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fctTypeVoid}
	 * labeled alternative in {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 */
	void enterFctTypeVoid(B314Parser.FctTypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fctTypeVoid}
	 * labeled alternative in {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 */
	void exitFctTypeVoid(B314Parser.FctTypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(B314Parser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(B314Parser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void enterClauseWhen(B314Parser.ClauseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void exitClauseWhen(B314Parser.ClauseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void enterClauseDefault(B314Parser.ClauseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void exitClauseDefault(B314Parser.ClauseDefaultContext ctx);
}