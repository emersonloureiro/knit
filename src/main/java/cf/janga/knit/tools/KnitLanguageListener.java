// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.tools;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnitLanguageParser}.
 */
public interface KnitLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#varNameEx}.
	 * @param ctx the parse tree
	 */
	void enterVarNameEx(@NotNull KnitLanguageParser.VarNameExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#varNameEx}.
	 * @param ctx the parse tree
	 */
	void exitVarNameEx(@NotNull KnitLanguageParser.VarNameExContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionNameEx}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameEx(@NotNull KnitLanguageParser.FunctionNameExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionNameEx}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameEx(@NotNull KnitLanguageParser.FunctionNameExContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#varValueEx}.
	 * @param ctx the parse tree
	 */
	void enterVarValueEx(@NotNull KnitLanguageParser.VarValueExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#varValueEx}.
	 * @param ctx the parse tree
	 */
	void exitVarValueEx(@NotNull KnitLanguageParser.VarValueExContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionEx}.
	 * @param ctx the parse tree
	 */
	void enterFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionEx}.
	 * @param ctx the parse tree
	 */
	void exitFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(@NotNull KnitLanguageParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(@NotNull KnitLanguageParser.ParameterNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#commandVariableValue}.
	 * @param ctx the parse tree
	 */
	void enterCommandVariableValue(@NotNull KnitLanguageParser.CommandVariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#commandVariableValue}.
	 * @param ctx the parse tree
	 */
	void exitCommandVariableValue(@NotNull KnitLanguageParser.CommandVariableValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#mainFunctionEx}.
	 * @param ctx the parse tree
	 */
	void enterMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#mainFunctionEx}.
	 * @param ctx the parse tree
	 */
	void exitMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#stringVarValue}.
	 * @param ctx the parse tree
	 */
	void enterStringVarValue(@NotNull KnitLanguageParser.StringVarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#stringVarValue}.
	 * @param ctx the parse tree
	 */
	void exitStringVarValue(@NotNull KnitLanguageParser.StringVarValueContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#constantVarValueEx}.
	 * @param ctx the parse tree
	 */
	void enterConstantVarValueEx(@NotNull KnitLanguageParser.ConstantVarValueExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#constantVarValueEx}.
	 * @param ctx the parse tree
	 */
	void exitConstantVarValueEx(@NotNull KnitLanguageParser.ConstantVarValueExContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#numberVarValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberVarValue(@NotNull KnitLanguageParser.NumberVarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#numberVarValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberVarValue(@NotNull KnitLanguageParser.NumberVarValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#functionBodyEx}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBodyEx(@NotNull KnitLanguageParser.FunctionBodyExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#functionBodyEx}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBodyEx(@NotNull KnitLanguageParser.FunctionBodyExContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#codeEx}.
	 * @param ctx the parse tree
	 */
	void enterCodeEx(@NotNull KnitLanguageParser.CodeExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#codeEx}.
	 * @param ctx the parse tree
	 */
	void exitCodeEx(@NotNull KnitLanguageParser.CodeExContext ctx);
}