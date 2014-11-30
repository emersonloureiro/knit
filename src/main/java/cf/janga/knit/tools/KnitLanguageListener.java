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
	 * Enter a parse tree produced by {@link KnitLanguageParser#funcKw}.
	 * @param ctx the parse tree
	 */
	void enterFuncKw(@NotNull KnitLanguageParser.FuncKwContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#funcKw}.
	 * @param ctx the parse tree
	 */
	void exitFuncKw(@NotNull KnitLanguageParser.FuncKwContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull KnitLanguageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull KnitLanguageParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#charSequence}.
	 * @param ctx the parse tree
	 */
	void enterCharSequence(@NotNull KnitLanguageParser.CharSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#charSequence}.
	 * @param ctx the parse tree
	 */
	void exitCharSequence(@NotNull KnitLanguageParser.CharSequenceContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#returnKw}.
	 * @param ctx the parse tree
	 */
	void enterReturnKw(@NotNull KnitLanguageParser.ReturnKwContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#returnKw}.
	 * @param ctx the parse tree
	 */
	void exitReturnKw(@NotNull KnitLanguageParser.ReturnKwContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#numberEx}.
	 * @param ctx the parse tree
	 */
	void enterNumberEx(@NotNull KnitLanguageParser.NumberExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#numberEx}.
	 * @param ctx the parse tree
	 */
	void exitNumberEx(@NotNull KnitLanguageParser.NumberExContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#commandEx}.
	 * @param ctx the parse tree
	 */
	void enterCommandEx(@NotNull KnitLanguageParser.CommandExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#commandEx}.
	 * @param ctx the parse tree
	 */
	void exitCommandEx(@NotNull KnitLanguageParser.CommandExContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#varEx}.
	 * @param ctx the parse tree
	 */
	void enterVarEx(@NotNull KnitLanguageParser.VarExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#varEx}.
	 * @param ctx the parse tree
	 */
	void exitVarEx(@NotNull KnitLanguageParser.VarExContext ctx);

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
	 * Enter a parse tree produced by {@link KnitLanguageParser#codeEx}.
	 * @param ctx the parse tree
	 */
	void enterCodeEx(@NotNull KnitLanguageParser.CodeExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#codeEx}.
	 * @param ctx the parse tree
	 */
	void exitCodeEx(@NotNull KnitLanguageParser.CodeExContext ctx);

	/**
	 * Enter a parse tree produced by {@link KnitLanguageParser#parameterEx}.
	 * @param ctx the parse tree
	 */
	void enterParameterEx(@NotNull KnitLanguageParser.ParameterExContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnitLanguageParser#parameterEx}.
	 * @param ctx the parse tree
	 */
	void exitParameterEx(@NotNull KnitLanguageParser.ParameterExContext ctx);
}