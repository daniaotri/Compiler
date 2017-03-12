// Generated from be\u005Cunamur\info\b314\compiler\B314_Init.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link B314_InitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface B314_InitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(B314_InitParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(B314_InitParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(B314_InitParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(B314_InitParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEnvCase}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnvCase(B314_InitParser.ExprEnvCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntier}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntier(B314_InitParser.ExprEntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNearby}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNearby(B314_InitParser.ExprNearbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDexprG}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDexprG(B314_InitParser.ExprDexprGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(B314_InitParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEnvInt}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnvInt(B314_InitParser.ExprEnvIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEnvBool}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnvBool(B314_InitParser.ExprEnvBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp}
	 * labeled alternative in {@link B314_InitParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(B314_InitParser.ExprOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#environnementInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironnementInt(B314_InitParser.EnvironnementIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#environnementBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironnementBool(B314_InitParser.EnvironnementBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#environnementCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironnementCase(B314_InitParser.EnvironnementCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExprG}
	 * labeled alternative in {@link B314_InitParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExprG(B314_InitParser.VariableExprGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableauExprG}
	 * labeled alternative in {@link B314_InitParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableauExprG(B314_InitParser.TableauExprGContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#entier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntier(B314_InitParser.EntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipppp}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipppp(B314_InitParser.SkippppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(B314_InitParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(B314_InitParser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(B314_InitParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectation}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(B314_InitParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compute}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompute(B314_InitParser.ComputeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextAction}
	 * labeled alternative in {@link B314_InitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextAction(B314_InitParser.NextActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(B314_InitParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(B314_InitParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#progDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgDecl(B314_InitParser.ProgDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#fctDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctDecl(B314_InitParser.FctDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#fctType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctType(B314_InitParser.FctTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#paramDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecl(B314_InitParser.ParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(B314_InitParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#clauseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseWhen(B314_InitParser.ClauseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314_InitParser#clauseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseDefault(B314_InitParser.ClauseDefaultContext ctx);
}