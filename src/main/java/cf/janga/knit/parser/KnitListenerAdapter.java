package cf.janga.knit.parser;

import cf.janga.knit.parser.KnitLanguageListener;
import cf.janga.knit.parser.KnitLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class KnitListenerAdapter implements KnitLanguageListener {

    @Override
    public void enterVarNameEx(@NotNull KnitLanguageParser.VarNameExContext ctx) {
    }

    @Override
    public void exitVarNameEx(@NotNull KnitLanguageParser.VarNameExContext ctx) {
    }

    @Override
    public void enterNumberVarValue(@NotNull KnitLanguageParser.NumberVarValueContext ctx) {
    }

    @Override
    public void exitNumberVarValue(@NotNull KnitLanguageParser.NumberVarValueContext ctx) {
    }

    @Override
    public void enterFunctionNameEx(@NotNull KnitLanguageParser.FunctionNameExContext ctx) {
    }

    @Override
    public void exitFunctionNameEx(@NotNull KnitLanguageParser.FunctionNameExContext ctx) {
    }

    @Override
    public void enterVarValueEx(@NotNull KnitLanguageParser.VarValueExContext ctx) {
    }

    @Override
    public void exitVarValueEx(@NotNull KnitLanguageParser.VarValueExContext ctx) {
    }

    @Override
    public void enterFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx) {
    }

    @Override
    public void exitFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx) {
    }

    @Override
    public void enterProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx) {
    }

    @Override
    public void exitProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx) {
    }

    @Override
    public void enterParameterName(@NotNull KnitLanguageParser.ParameterNameContext ctx) {
    }

    @Override
    public void exitParameterName(@NotNull KnitLanguageParser.ParameterNameContext ctx) {
    }

    @Override
    public void enterMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx) {
    }

    @Override
    public void exitMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx) {
    }

    @Override
    public void enterStringVarValue(@NotNull KnitLanguageParser.StringVarValueContext ctx) {
    }

    @Override
    public void exitStringVarValue(@NotNull KnitLanguageParser.StringVarValueContext ctx) {
    }

    @Override
    public void enterKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx) {
    }

    @Override
    public void exitKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx) {
    }

    @Override
    public void enterConstantVarValueEx(@NotNull KnitLanguageParser.ConstantVarValueExContext ctx) {
    }

    @Override
    public void exitConstantVarValueEx(@NotNull KnitLanguageParser.ConstantVarValueExContext ctx) {
    }

    @Override
    public void enterNumber(@NotNull KnitLanguageParser.NumberContext ctx) {
    }

    @Override
    public void exitNumber(@NotNull KnitLanguageParser.NumberContext ctx) {
    }

    @Override
    public void enterVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
    }

    @Override
    public void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
    }

    @Override
    public void enterFunctionBodyEx(@NotNull KnitLanguageParser.FunctionBodyExContext ctx) {
    }

    @Override
    public void exitFunctionBodyEx(@NotNull KnitLanguageParser.FunctionBodyExContext ctx) {
    }

    @Override
    public void enterCodeEx(@NotNull KnitLanguageParser.CodeExContext ctx) {
    }

    @Override
    public void exitCodeEx(@NotNull KnitLanguageParser.CodeExContext ctx) {
    }

    @Override
    public void enterParameter(@NotNull KnitLanguageParser.ParameterContext ctx) {
    }

    @Override
    public void exitParameter(@NotNull KnitLanguageParser.ParameterContext ctx) {
    }

    @Override
    public void enterCommandVariableValue(@NotNull KnitLanguageParser.CommandVariableValueContext ctx) {
    }

    @Override
    public void exitCommandVariableValue(@NotNull KnitLanguageParser.CommandVariableValueContext ctx) {
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode terminalNode) {
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode errorNode) {
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext parserRuleContext) {
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext parserRuleContext) {
    }
}
