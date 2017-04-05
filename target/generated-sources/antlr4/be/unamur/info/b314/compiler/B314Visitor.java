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
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDInteger}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDInteger(B314Parser.ExprDIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDBoolean}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDBoolean(B314Parser.ExprDBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDCase(B314Parser.ExprDCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDG(B314Parser.ExprDGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntParennthese}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntEntier}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntEntier(B314Parser.ExprEntEntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntEnvironnement}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntPlusMoinsGauheEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntPlusMoinsEntEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntMulDivEntGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntMulDivEntEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntMulDivGaucheGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntMulDivGauheEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntPlusMoinsEntGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntPlusMoinsGaucheGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleEntGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolInfSupGG}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolFalse}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolTrue}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolNot(B314Parser.ExprBoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolNotGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolAndOrBoolGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleCaseGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleGaucheGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolAndOrBoolBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleBoolGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolInfSupGEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEnvironnement}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolInfSupEntGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleBoolean}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolParennthese}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleGaucheEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolAndOrGaucheBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleGaucheCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleGaucheBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolAndOrGaucheGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolEgaleInteger}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolInfSupEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseEnvironnement}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseNearbyEntEnt}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseNearbyEntEnt(B314Parser.ExprCaseNearbyEntEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseNearbyEntG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseNearbyEntG(B314Parser.ExprCaseNearbyEntGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseNearbyGEnt}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseNearbyGEnt(B314Parser.ExprCaseNearbyGEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseNearbyGG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseNearbyGG(B314Parser.ExprCaseNearbyGGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseParennthese}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx);
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
	 * Visit a parse tree produced by the {@code exprGVariable}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGVariable(B314Parser.ExprGVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGTableau}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGTableau(B314Parser.ExprGTableauContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#entier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntier(B314Parser.EntierContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#appelDeFonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelDeFonction(B314Parser.AppelDeFonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivFonction(B314Parser.MulDivFonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusmoinsFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusmoinsFonction(B314Parser.PlusmoinsFonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supEgaleFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupEgaleFonction(B314Parser.SupEgaleFonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOrFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrFonction(B314Parser.AndOrFonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFonction(B314Parser.NotFonctionContext ctx);
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
	 * Visit a parse tree produced by the {@code affectationGaucheGauche}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationGaucheGauche(B314Parser.AffectationGaucheGaucheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationGaucheEnt}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationGaucheEnt(B314Parser.AffectationGaucheEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationGaucheBool}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationGaucheBool(B314Parser.AffectationGaucheBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationGaucheCase}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationGaucheCase(B314Parser.AffectationGaucheCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationGaucheFonction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationGaucheFonction(B314Parser.AffectationGaucheFonctionContext ctx);
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