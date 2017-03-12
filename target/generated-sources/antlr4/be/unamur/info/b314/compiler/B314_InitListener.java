// Generated from be\u005Cunamur\info\b314\compiler\B314_Init.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link B314_InitParser}.
 */
public interface B314_InitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(B314_InitParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(B314_InitParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(B314_InitParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(B314_InitParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(B314_InitParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(B314_InitParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(B314_InitParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(B314_InitParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEnvCase}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprEnvCase(B314_InitParser.ExprEnvCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEnvCase}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprEnvCase(B314_InitParser.ExprEnvCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntier}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprEntier(B314_InitParser.ExprEntierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntier}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprEntier(B314_InitParser.ExprEntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNearby}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprNearby(B314_InitParser.ExprNearbyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNearby}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprNearby(B314_InitParser.ExprNearbyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDexprG}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDexprG(B314_InitParser.ExprDexprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDexprG}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDexprG(B314_InitParser.ExprDexprGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(B314_InitParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(B314_InitParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEnvInt}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprEnvInt(B314_InitParser.ExprEnvIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEnvInt}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprEnvInt(B314_InitParser.ExprEnvIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEnvBool}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprEnvBool(B314_InitParser.ExprEnvBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEnvBool}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprEnvBool(B314_InitParser.ExprEnvBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOp}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprOp(B314_InitParser.ExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOp}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprOp(B314_InitParser.ExprOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#environnementInt}.
	 * @param ctx the parse tree
	 */
	void enterEnvironnementInt(B314_InitParser.EnvironnementIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#environnementInt}.
	 * @param ctx the parse tree
	 */
	void exitEnvironnementInt(B314_InitParser.EnvironnementIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#environnementBool}.
	 * @param ctx the parse tree
	 */
	void enterEnvironnementBool(B314_InitParser.EnvironnementBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#environnementBool}.
	 * @param ctx the parse tree
	 */
	void exitEnvironnementBool(B314_InitParser.EnvironnementBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#environnementCase}.
	 * @param ctx the parse tree
	 */
	void enterEnvironnementCase(B314_InitParser.EnvironnementCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#environnementCase}.
	 * @param ctx the parse tree
	 */
	void exitEnvironnementCase(B314_InitParser.EnvironnementCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExprG}
	 * labeled alternative in {@link B314_InitParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterVariableExprG(B314_InitParser.VariableExprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExprG}
	 * labeled alternative in {@link B314_InitParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitVariableExprG(B314_InitParser.VariableExprGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableauExprG}
	 * labeled alternative in {@link B314_InitParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterTableauExprG(B314_InitParser.TableauExprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableauExprG}
	 * labeled alternative in {@link B314_InitParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitTableauExprG(B314_InitParser.TableauExprGContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#entier}.
	 * @param ctx the parse tree
	 */
	void enterEntier(B314_InitParser.EntierContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#entier}.
	 * @param ctx the parse tree
	 */
	void exitEntier(B314_InitParser.EntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipppp}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSkipppp(B314_InitParser.SkippppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipppp}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSkipppp(B314_InitParser.SkippppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIf(B314_InitParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIf(B314_InitParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(B314_InitParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(B314_InitParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhile(B314_InitParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhile(B314_InitParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectation}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(B314_InitParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectation}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(B314_InitParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compute}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCompute(B314_InitParser.ComputeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compute}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCompute(B314_InitParser.ComputeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextAction}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNextAction(B314_InitParser.NextActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextAction}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNextAction(B314_InitParser.NextActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(B314_InitParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(B314_InitParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(B314_InitParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(B314_InitParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#progDecl}.
	 * @param ctx the parse tree
	 */
	void enterProgDecl(B314_InitParser.ProgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#progDecl}.
	 * @param ctx the parse tree
	 */
	void exitProgDecl(B314_InitParser.ProgDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void enterFctDecl(B314_InitParser.FctDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void exitFctDecl(B314_InitParser.FctDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#fctType}.
	 * @param ctx the parse tree
	 */
	void enterFctType(B314_InitParser.FctTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#fctType}.
	 * @param ctx the parse tree
	 */
	void exitFctType(B314_InitParser.FctTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(B314_InitParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(B314_InitParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(B314_InitParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(B314_InitParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void enterClauseWhen(B314_InitParser.ClauseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void exitClauseWhen(B314_InitParser.ClauseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314_InitParser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void enterClauseDefault(B314_InitParser.ClauseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314_InitParser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void exitClauseDefault(B314_InitParser.ClauseDefaultContext ctx);
}