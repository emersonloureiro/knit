// Generated from KnitLanguage.g4 by ANTLR 4.5
package cf.janga.knit.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnitLanguageParser}.
 */
public interface KnitLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#knitProgram}.
	 * @param ctx the parse tree
	 */
	void enterKnitProgram(KnitLanguageParser.KnitProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#knitProgram}.
	 * @param ctx the parse tree
	 */
	void exitKnitProgram(KnitLanguageParser.KnitProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(KnitLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(KnitLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(KnitLanguageParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(KnitLanguageParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(KnitLanguageParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(KnitLanguageParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(KnitLanguageParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(KnitLanguageParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(KnitLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(KnitLanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#programmingConstruct}.
	 * @param ctx the parse tree
	 */
	void enterProgrammingConstruct(KnitLanguageParser.ProgrammingConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#programmingConstruct}.
	 * @param ctx the parse tree
	 */
	void exitProgrammingConstruct(KnitLanguageParser.ProgrammingConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(KnitLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(KnitLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KnitLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KnitLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(KnitLanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(KnitLanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#modulePrefix}.
	 * @param ctx the parse tree
	 */
	void enterModulePrefix(KnitLanguageParser.ModulePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#modulePrefix}.
	 * @param ctx the parse tree
	 */
	void exitModulePrefix(KnitLanguageParser.ModulePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(KnitLanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(KnitLanguageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(KnitLanguageParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(KnitLanguageParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KnitLanguageParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KnitLanguageParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#foreachDoComprehension}.
	 * @param ctx the parse tree
	 */
	void enterForeachDoComprehension(KnitLanguageParser.ForeachDoComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#foreachDoComprehension}.
	 * @param ctx the parse tree
	 */
	void exitForeachDoComprehension(KnitLanguageParser.ForeachDoComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(KnitLanguageParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(KnitLanguageParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(KnitLanguageParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(KnitLanguageParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#simpleMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMathExpression(KnitLanguageParser.SimpleMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#simpleMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMathExpression(KnitLanguageParser.SimpleMathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#enclosedMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedMathExpression(KnitLanguageParser.EnclosedMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#enclosedMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedMathExpression(KnitLanguageParser.EnclosedMathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(KnitLanguageParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(KnitLanguageParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(KnitLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(KnitLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#simpleBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBooleanExpression(KnitLanguageParser.SimpleBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#simpleBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBooleanExpression(KnitLanguageParser.SimpleBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#enclosedBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedBooleanExpression(KnitLanguageParser.EnclosedBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#enclosedBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedBooleanExpression(KnitLanguageParser.EnclosedBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(KnitLanguageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(KnitLanguageParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#commandExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommandExpression(KnitLanguageParser.CommandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#commandExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommandExpression(KnitLanguageParser.CommandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#listOutputCommand}.
	 * @param ctx the parse tree
	 */
	void enterListOutputCommand(KnitLanguageParser.ListOutputCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#listOutputCommand}.
	 * @param ctx the parse tree
	 */
	void exitListOutputCommand(KnitLanguageParser.ListOutputCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#singleOutputCommand}.
	 * @param ctx the parse tree
	 */
	void enterSingleOutputCommand(KnitLanguageParser.SingleOutputCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#singleOutputCommand}.
	 * @param ctx the parse tree
	 */
	void exitSingleOutputCommand(KnitLanguageParser.SingleOutputCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(KnitLanguageParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(KnitLanguageParser.VariableReferenceContext ctx);
}