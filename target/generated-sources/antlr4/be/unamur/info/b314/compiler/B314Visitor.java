// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link B314Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface B314Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code typeScalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeScalar(B314Parser.TypeScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(B314Parser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarBoolean}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarBoolean(B314Parser.ScalarBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarInteger}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarInteger(B314Parser.ScalarIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarSquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarSquare(B314Parser.ScalarSquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(B314Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolInfSupEgale}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolInfSupEgale(B314Parser.ExprBoolInfSupEgaleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolNot(B314Parser.ExprBoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEnvi}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEnvi(B314Parser.ExprBoolEnviContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolAndOr}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolAndOr(B314Parser.ExprBoolAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIntEntier}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntEntier(B314Parser.ExprIntEntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIntPlusMoins}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntPlusMoins(B314Parser.ExprIntPlusMoinsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIntEnv}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntEnv(B314Parser.ExprIntEnvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIntMulDiv}
	 * labeled alternative in {@link B314Parser#exprInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntMulDiv(B314Parser.ExprIntMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseEnv}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseEnv(B314Parser.ExprCaseEnvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseNearby}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDBool(B314Parser.ExprDBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDInt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDInt(B314Parser.ExprDIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDCas}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDCas(B314Parser.ExprDCasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDexprG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDexprG(B314Parser.ExprDexprGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(B314Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(B314Parser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#environnementInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#environnementBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#environnementCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExprG}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExprG(B314Parser.VariableExprGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableauExprG}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableauExprG(B314Parser.TableauExprGContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#entier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntier(B314Parser.EntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipppp}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipppp(B314Parser.SkippppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(B314Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(B314Parser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(B314Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectation}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(B314Parser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compute}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompute(B314Parser.ComputeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextAction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextAction(B314Parser.NextActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(B314Parser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(B314Parser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#progDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgDecl(B314Parser.ProgDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctDecl(B314Parser.FctDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fctTypeScalar}
	 * labeled alternative in {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctTypeScalar(B314Parser.FctTypeScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fctTypeVoid}
	 * labeled alternative in {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctTypeVoid(B314Parser.FctTypeVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#paramDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecl(B314Parser.ParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseWhen(B314Parser.ClauseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseDefault(B314Parser.ClauseDefaultContext ctx);
}