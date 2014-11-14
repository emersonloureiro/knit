// Generated from ScruxLanguage.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScruxLanguageParser}.
 */
public interface ScruxLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#varNameEx}.
	 * @param ctx the parse tree
	 */
	void enterVarNameEx(@NotNull ScruxLanguageParser.VarNameExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#varNameEx}.
	 * @param ctx the parse tree
	 */
	void exitVarNameEx(@NotNull ScruxLanguageParser.VarNameExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#funcKw}.
	 * @param ctx the parse tree
	 */
	void enterFuncKw(@NotNull ScruxLanguageParser.FuncKwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#funcKw}.
	 * @param ctx the parse tree
	 */
	void exitFuncKw(@NotNull ScruxLanguageParser.FuncKwContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#functionNameEx}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameEx(@NotNull ScruxLanguageParser.FunctionNameExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#functionNameEx}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameEx(@NotNull ScruxLanguageParser.FunctionNameExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#functionEx}.
	 * @param ctx the parse tree
	 */
	void enterFunctionEx(@NotNull ScruxLanguageParser.FunctionExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#functionEx}.
	 * @param ctx the parse tree
	 */
	void exitFunctionEx(@NotNull ScruxLanguageParser.FunctionExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#programmingConstruct}.
	 * @param ctx the parse tree
	 */
	void enterProgrammingConstruct(@NotNull ScruxLanguageParser.ProgrammingConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#programmingConstruct}.
	 * @param ctx the parse tree
	 */
	void exitProgrammingConstruct(@NotNull ScruxLanguageParser.ProgrammingConstructContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#valueEx}.
	 * @param ctx the parse tree
	 */
	void enterValueEx(@NotNull ScruxLanguageParser.ValueExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#valueEx}.
	 * @param ctx the parse tree
	 */
	void exitValueEx(@NotNull ScruxLanguageParser.ValueExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#constantEx}.
	 * @param ctx the parse tree
	 */
	void enterConstantEx(@NotNull ScruxLanguageParser.ConstantExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#constantEx}.
	 * @param ctx the parse tree
	 */
	void exitConstantEx(@NotNull ScruxLanguageParser.ConstantExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#returnKw}.
	 * @param ctx the parse tree
	 */
	void enterReturnKw(@NotNull ScruxLanguageParser.ReturnKwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#returnKw}.
	 * @param ctx the parse tree
	 */
	void exitReturnKw(@NotNull ScruxLanguageParser.ReturnKwContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#scruxProgram}.
	 * @param ctx the parse tree
	 */
	void enterScruxProgram(@NotNull ScruxLanguageParser.ScruxProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#scruxProgram}.
	 * @param ctx the parse tree
	 */
	void exitScruxProgram(@NotNull ScruxLanguageParser.ScruxProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#numberEx}.
	 * @param ctx the parse tree
	 */
	void enterNumberEx(@NotNull ScruxLanguageParser.NumberExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#numberEx}.
	 * @param ctx the parse tree
	 */
	void exitNumberEx(@NotNull ScruxLanguageParser.NumberExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#commandEx}.
	 * @param ctx the parse tree
	 */
	void enterCommandEx(@NotNull ScruxLanguageParser.CommandExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#commandEx}.
	 * @param ctx the parse tree
	 */
	void exitCommandEx(@NotNull ScruxLanguageParser.CommandExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#varEx}.
	 * @param ctx the parse tree
	 */
	void enterVarEx(@NotNull ScruxLanguageParser.VarExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#varEx}.
	 * @param ctx the parse tree
	 */
	void exitVarEx(@NotNull ScruxLanguageParser.VarExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#functionBodyEx}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBodyEx(@NotNull ScruxLanguageParser.FunctionBodyExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#functionBodyEx}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBodyEx(@NotNull ScruxLanguageParser.FunctionBodyExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#stringEx}.
	 * @param ctx the parse tree
	 */
	void enterStringEx(@NotNull ScruxLanguageParser.StringExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#stringEx}.
	 * @param ctx the parse tree
	 */
	void exitStringEx(@NotNull ScruxLanguageParser.StringExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#codeEx}.
	 * @param ctx the parse tree
	 */
	void enterCodeEx(@NotNull ScruxLanguageParser.CodeExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#codeEx}.
	 * @param ctx the parse tree
	 */
	void exitCodeEx(@NotNull ScruxLanguageParser.CodeExContext ctx);

	/**
	 * Enter a parse tree produced by {@link ScruxLanguageParser#parameterEx}.
	 * @param ctx the parse tree
	 */
	void enterParameterEx(@NotNull ScruxLanguageParser.ParameterExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScruxLanguageParser#parameterEx}.
	 * @param ctx the parse tree
	 */
	void exitParameterEx(@NotNull ScruxLanguageParser.ParameterExContext ctx);
}