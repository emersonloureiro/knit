package cf.janga.knit.tools;

import cf.janga.knit.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class KnitProgramBuilder extends KnitListenerAdapter {


    public KnitProgramBuilder() {
    }

    public void build(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
    }

    @Override
    public void enterString(@NotNull KnitLanguageParser.StringContext ctx) {
    }

    @Override
    public void enterNumberEx(@NotNull KnitLanguageParser.NumberExContext ctx) {
        // TODO: Handle error
    }

    @Override
    public void enterVarNameEx(@NotNull KnitLanguageParser.VarNameExContext ctx) {
    }

    @Override
    public void enterVarEx(@NotNull KnitLanguageParser.VarExContext ctx) {
    }

    @Override
    public void exitVarEx(@NotNull KnitLanguageParser.VarExContext ctx) {
    }

    @Override
    public void enterFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx) {
    }

    @Override
    public void exitFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx) {
    }

    @Override
    public void enterMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx) {
    }

    @Override
    public void exitMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx) {
    }
}
