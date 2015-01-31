// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnitLanguageParser}.
 */
public interface KnitLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#complexMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexMathExpression(@NotNull KnitLanguageParser.ComplexMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#complexMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexMathExpression(@NotNull KnitLanguageParser.ComplexMathExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull KnitLanguageParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull KnitLanguageParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(@NotNull KnitLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(@NotNull KnitLanguageParser.CodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull KnitLanguageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull KnitLanguageParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#knitProgram}.
	 * @param ctx the parse tree
	 */
	void enterKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#knitProgram}.
	 * @param ctx the parse tree
	 */
	void exitKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull KnitLanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull KnitLanguageParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(@NotNull KnitLanguageParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(@NotNull KnitLanguageParser.ForeachContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull KnitLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull KnitLanguageParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull KnitLanguageParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull KnitLanguageParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#systemMethod}.
	 * @param ctx the parse tree
	 */
	void enterSystemMethod(@NotNull KnitLanguageParser.SystemMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#systemMethod}.
	 * @param ctx the parse tree
	 */
	void exitSystemMethod(@NotNull KnitLanguageParser.SystemMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#enclosedMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedMathExpression(@NotNull KnitLanguageParser.EnclosedMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#enclosedMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedMathExpression(@NotNull KnitLanguageParser.EnclosedMathExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull KnitLanguageParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull KnitLanguageParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull KnitLanguageParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull KnitLanguageParser.FunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(@NotNull KnitLanguageParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(@NotNull KnitLanguageParser.MathOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#programmingConstruct}.
	 * @param ctx the parse tree
	 */
	void enterProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#programmingConstruct}.
	 * @param ctx the parse tree
	 */
	void exitProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull KnitLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull KnitLanguageParser.BooleanExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull KnitLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull KnitLanguageParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#listMethods}.
	 * @param ctx the parse tree
	 */
	void enterListMethods(@NotNull KnitLanguageParser.ListMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#listMethods}.
	 * @param ctx the parse tree
	 */
	void exitListMethods(@NotNull KnitLanguageParser.ListMethodsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull KnitLanguageParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull KnitLanguageParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#systemFunctions}.
	 * @param ctx the parse tree
	 */
	void enterSystemFunctions(@NotNull KnitLanguageParser.SystemFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#systemFunctions}.
	 * @param ctx the parse tree
	 */
	void exitSystemFunctions(@NotNull KnitLanguageParser.SystemFunctionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#simpleMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMathExpression(@NotNull KnitLanguageParser.SimpleMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#simpleMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMathExpression(@NotNull KnitLanguageParser.SimpleMathExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull KnitLanguageParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull KnitLanguageParser.MethodCallContext ctx);
}