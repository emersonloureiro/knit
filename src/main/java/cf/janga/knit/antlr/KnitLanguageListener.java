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
	 * Enter a parse tree produced by {@link KnitLanguageParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(KnitLanguageParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(KnitLanguageParser.VariableValueContext ctx);
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
	 * Enter a parse tree produced by {@link KnitLanguageParser#systemFunctions}.
	 * @param ctx the parse tree
	 */
	void enterSystemFunctions(KnitLanguageParser.SystemFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#systemFunctions}.
	 * @param ctx the parse tree
	 */
	void exitSystemFunctions(KnitLanguageParser.SystemFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#systemMethod}.
	 * @param ctx the parse tree
	 */
	void enterSystemMethod(KnitLanguageParser.SystemMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#systemMethod}.
	 * @param ctx the parse tree
	 */
	void exitSystemMethod(KnitLanguageParser.SystemMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#listMethods}.
	 * @param ctx the parse tree
	 */
	void enterListMethods(KnitLanguageParser.ListMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#listMethods}.
	 * @param ctx the parse tree
	 */
	void exitListMethods(KnitLanguageParser.ListMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(KnitLanguageParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(KnitLanguageParser.MethodCallContext ctx);
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
	 * Enter a parse tree produced by {@link KnitLanguageParser#complexMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexMathExpression(KnitLanguageParser.ComplexMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#complexMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexMathExpression(KnitLanguageParser.ComplexMathExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link KnitLanguageParser#plainCommand}.
	 * @param ctx the parse tree
	 */
	void enterPlainCommand(KnitLanguageParser.PlainCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#plainCommand}.
	 * @param ctx the parse tree
	 */
	void exitPlainCommand(KnitLanguageParser.PlainCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#asListCommand}.
	 * @param ctx the parse tree
	 */
	void enterAsListCommand(KnitLanguageParser.AsListCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#asListCommand}.
	 * @param ctx the parse tree
	 */
	void exitAsListCommand(KnitLanguageParser.AsListCommandContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(KnitLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(KnitLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(KnitLanguageParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(KnitLanguageParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(KnitLanguageParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(KnitLanguageParser.ForeachContext ctx);
}