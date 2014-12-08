// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnitLanguageParser}.
 */
public interface KnitLanguageListener extends ParseTreeListener {
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
}