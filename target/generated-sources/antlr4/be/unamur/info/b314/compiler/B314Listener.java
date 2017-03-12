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
	 * Enter a parse tree produced by the {@code exprBoolEnvi}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEnvi(B314Parser.ExprBoolEnviContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEnvi}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEnvi(B314Parser.ExprBoolEnviContext ctx);
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
	 * Enter a parse tree produced by the {@code exprIntEntier}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterExprIntEntier(B314Parser.ExprIntEntierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIntEntier}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitExprIntEntier(B314Parser.ExprIntEntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIntPlusMoins}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterExprIntPlusMoins(B314Parser.ExprIntPlusMoinsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIntPlusMoins}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitExprIntPlusMoins(B314Parser.ExprIntPlusMoinsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIntEnv}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterExprIntEnv(B314Parser.ExprIntEnvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIntEnv}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitExprIntEnv(B314Parser.ExprIntEnvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIntMulDiv}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterExprIntMulDiv(B314Parser.ExprIntMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIntMulDiv}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitExprIntMulDiv(B314Parser.ExprIntMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseEnv}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseEnv(B314Parser.ExprCaseEnvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseEnv}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseEnv(B314Parser.ExprCaseEnvContext ctx);
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
	 * Enter a parse tree produced by the {@code exprDBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDBool(B314Parser.ExprDBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDBool(B314Parser.ExprDBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDInt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDInt(B314Parser.ExprDIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDInt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDInt(B314Parser.ExprDIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDCas}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDCas(B314Parser.ExprDCasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDCas}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDCas(B314Parser.ExprDCasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDexprG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDexprG(B314Parser.ExprDexprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDexprG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDexprG(B314Parser.ExprDexprGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(B314Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(B314Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(B314Parser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(B314Parser.ExprParContext ctx);
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
	 * Enter a parse tree produced by the {@code variableExprG}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterVariableExprG(B314Parser.VariableExprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExprG}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitVariableExprG(B314Parser.VariableExprGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableauExprG}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterTableauExprG(B314Parser.TableauExprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableauExprG}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitTableauExprG(B314Parser.TableauExprGContext ctx);
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