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
	 * Enter a parse tree produced by the {@code exprEntPlusMoinsGauheEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntPlusMoinsGauheEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntPlusMoinsEntEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntPlusMoinsEntEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntMulDivEntGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntMulDivEntGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntMulDivEntEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntMulDivEntEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntMulDivGaucheGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntMulDivGaucheGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntMulDivGauheEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntMulDivGauheEnt}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntPlusMoinsEntGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntPlusMoinsEntGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntPlusMoinsGaucheGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntPlusMoinsGaucheGauhe}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleEntGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleEntGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolInfSupGG}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolInfSupGG}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx);
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
	 * Enter a parse tree produced by the {@code exprBoolNotGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolNotGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolAndOrBoolGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolAndOrBoolGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleCaseGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleCaseGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleGaucheGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleGaucheGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolAndOrBoolBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolAndOrBoolBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleBoolGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleBoolGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolInfSupGEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolInfSupGEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx);
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
	 * Enter a parse tree produced by the {@code exprBoolInfSupEntGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolInfSupEntGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx);
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
	 * Enter a parse tree produced by the {@code exprBoolEgaleGaucheEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleGaucheEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolAndOrGaucheBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolAndOrGaucheBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleGaucheCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleGaucheCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolEgaleGaucheBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolEgaleGaucheBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolAndOrGaucheGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolAndOrGaucheGauche}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx);
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
	 * Enter a parse tree produced by the {@code exprBoolInfSupEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolInfSupEnt}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx);
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
	 * Enter a parse tree produced by the {@code exprCaseNearbyEntEnt}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseNearbyEntEnt(B314Parser.ExprCaseNearbyEntEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseNearbyEntEnt}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseNearbyEntEnt(B314Parser.ExprCaseNearbyEntEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseNearbyEntG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseNearbyEntG(B314Parser.ExprCaseNearbyEntGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseNearbyEntG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseNearbyEntG(B314Parser.ExprCaseNearbyEntGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseNearbyGEnt}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseNearbyGEnt(B314Parser.ExprCaseNearbyGEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseNearbyGEnt}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseNearbyGEnt(B314Parser.ExprCaseNearbyGEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseNearbyGG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseNearbyGG(B314Parser.ExprCaseNearbyGGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseNearbyGG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseNearbyGG(B314Parser.ExprCaseNearbyGGContext ctx);
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
	 * Enter a parse tree produced by {@link B314Parser#appelDeFonction}.
	 * @param ctx the parse tree
	 */
	void enterAppelDeFonction(B314Parser.AppelDeFonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#appelDeFonction}.
	 * @param ctx the parse tree
	 */
	void exitAppelDeFonction(B314Parser.AppelDeFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void enterMulDivFonction(B314Parser.MulDivFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void exitMulDivFonction(B314Parser.MulDivFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusmoinsFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void enterPlusmoinsFonction(B314Parser.PlusmoinsFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusmoinsFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void exitPlusmoinsFonction(B314Parser.PlusmoinsFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supEgaleFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void enterSupEgaleFonction(B314Parser.SupEgaleFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supEgaleFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void exitSupEgaleFonction(B314Parser.SupEgaleFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOrFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void enterAndOrFonction(B314Parser.AndOrFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOrFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void exitAndOrFonction(B314Parser.AndOrFonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void enterNotFonction(B314Parser.NotFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFonction}
	 * labeled alternative in {@link B314Parser#manipulationFonction}.
	 * @param ctx the parse tree
	 */
	void exitNotFonction(B314Parser.NotFonctionContext ctx);
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
	 * Enter a parse tree produced by the {@code affectationGaucheGauche}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationGaucheGauche(B314Parser.AffectationGaucheGaucheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationGaucheGauche}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationGaucheGauche(B314Parser.AffectationGaucheGaucheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationGaucheEnt}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationGaucheEnt(B314Parser.AffectationGaucheEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationGaucheEnt}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationGaucheEnt(B314Parser.AffectationGaucheEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationGaucheBool}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationGaucheBool(B314Parser.AffectationGaucheBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationGaucheBool}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationGaucheBool(B314Parser.AffectationGaucheBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationGaucheCase}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationGaucheCase(B314Parser.AffectationGaucheCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationGaucheCase}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationGaucheCase(B314Parser.AffectationGaucheCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationGaucheFonction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationGaucheFonction(B314Parser.AffectationGaucheFonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationGaucheFonction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationGaucheFonction(B314Parser.AffectationGaucheFonctionContext ctx);
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