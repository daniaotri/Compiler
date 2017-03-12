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
	 * Visit a parse tree produced by {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(B314Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(B314Parser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(B314Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(B314Parser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEnvCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnvCase(B314Parser.ExprEnvCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntier}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntier(B314Parser.ExprEntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNearby}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNearby(B314Parser.ExprNearbyContext ctx);
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
	 * Visit a parse tree produced by the {@code exprEnvInt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnvInt(B314Parser.ExprEnvIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEnvBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnvBool(B314Parser.ExprEnvBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(B314Parser.ExprOpContext ctx);
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
	 * Visit a parse tree produced by {@link B314Parser#fctType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctType(B314Parser.FctTypeContext ctx);
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