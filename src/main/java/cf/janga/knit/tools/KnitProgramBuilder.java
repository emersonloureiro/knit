package cf.janga.knit.tools;

import cf.janga.knit.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class KnitProgramBuilder extends KnitListenerAdapter {

    private Deque<SequentialInstruction> instructionStack;

    private FunctionInstruction mainFunctionInstruction;

    public KnitProgramBuilder() {
        this.instructionStack = new ArrayDeque<SequentialInstruction>();
    }

    public FunctionInstruction build(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return mainFunctionInstruction;
    }

    @Override
    public void enterString(@NotNull KnitLanguageParser.StringContext ctx) {
        if (instructionStack.peek() instanceof VariableAssignmentInstruction) {
            String string = "";
            if (ctx.getChildCount() > 2) {
                for (int i = 1; i < ctx.getChildCount() - 1; i++) {
                    string += ctx.getChild(i).getText();
                }
            }
            instructionStack.peek().addInstruction(new StringConstantInstruction(string));
        }
    }

    @Override
    public void enterNumberEx(@NotNull KnitLanguageParser.NumberExContext ctx) {
        if (instructionStack.peek() instanceof VariableAssignmentInstruction) {
            instructionStack.peek().addInstruction(new RealNumberConstantInstruction(Double.valueOf(getText(ctx.DIGIT()))));
        }
        // TODO: Handle error
    }

    @Override
    public void enterVarNameEx(@NotNull KnitLanguageParser.VarNameExContext ctx) {
        if (instructionStack.peek() instanceof VariableAssignmentInstruction) {
            instructionStack.peek().addInstruction(new VariableAllocationInstruction(getText(ctx.ALPHA_CHARACTER())));
        }
    }

    @Override
    public void enterVarEx(@NotNull KnitLanguageParser.VarExContext ctx) {
        VariableAssignmentInstruction variableAssignmentInstruction = new VariableAssignmentInstruction();
        instructionStack.peek().addInstruction(variableAssignmentInstruction);
        instructionStack.push(variableAssignmentInstruction);
    }

    @Override
    public void exitVarEx(@NotNull KnitLanguageParser.VarExContext ctx) {
        instructionStack.pop();
    }

    @Override
    public void enterFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx) {
        instructionStack.push(new FunctionInstruction());
    }

    @Override
    public void exitFunctionEx(@NotNull KnitLanguageParser.FunctionExContext ctx) {
        instructionStack.pop();
    }

    @Override
    public void enterMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx) {
        FunctionInstruction functionInstruction = new FunctionInstruction();
        instructionStack.push(functionInstruction);
        mainFunctionInstruction = functionInstruction;
    }

    @Override
    public void exitMainFunctionEx(@NotNull KnitLanguageParser.MainFunctionExContext ctx) {
        instructionStack.pop();
    }

    public String getText(List<TerminalNode> nodes) {
        String result = "";
        for (TerminalNode node : nodes) {
            result += node.getText();
        }
        return result;
    }
}
