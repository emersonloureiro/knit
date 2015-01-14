package cf.janga.knit.runtime;

import cf.janga.knit.antlr.KnitLanguageParser;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KnitCompiler extends KnitListenerAdapter {

    private int currentInstructionNumber;

    private List<Instruction> instructions;

    private int startInstruction;

    private VirtualMachine vm;

    private Deque<Context> contextStack;

    public KnitCompiler(VirtualMachine vm) {
        this.currentInstructionNumber = -1;
        this.instructions = new LinkedList<Instruction>();
        this.vm = vm;
        this.contextStack = new LinkedList<Context>();
    }

    public Program compile(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return new Program(this.vm, this.instructions.toArray(new Instruction[]{}), this.startInstruction);
    }

    @Override
    public void enterVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx) {
        if (ctx.STRING() != null) {
            this.instructions.add(new OsPushC(incrementAndReturnInstruction(), this.vm, getText(ctx.STRING(), 1)));
        }
        if (ctx.COMMAND() != null) {
            this.instructions.add(new ComRet(incrementAndReturnInstruction(), this.vm, getText(ctx.COMMAND(), 1)));
        }
        if (ctx.number() != null) {
            Float number = Float.parseFloat(getText(ctx.number().children));
            this.instructions.add(new OsPushC(incrementAndReturnInstruction(), this.vm, number));
        }
    }

    @Override
    public void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
        this.instructions.add(new ScStore(incrementAndReturnInstruction(), this.vm, getText(ctx.identifier().children)));
    }

    @Override
    public void enterForeach(@NotNull KnitLanguageParser.ForeachContext ctx) {
        int lsSizeIndex = incrementAndReturnInstruction();
        CondJump condJump = new CondJump(incrementAndReturnInstruction(), this.vm);
        ForEachContext context = new ForEachContext(ctx, lsSizeIndex, condJump);
        this.contextStack.push(context);

        this.instructions.add(new LsSize(lsSizeIndex, this.vm));
        this.instructions.add(condJump);
        this.instructions.add(new ScPush(incrementAndReturnInstruction(), this.vm));
        this.instructions.add(new LsNext(incrementAndReturnInstruction(), this.vm));
        this.instructions.add(new ScStore(incrementAndReturnInstruction(), this.vm, getText(ctx.identifier().children)));
    }

    @Override
    public void exitForeach(@NotNull KnitLanguageParser.ForeachContext ctx) {
        if (!(contextStack.peek() instanceof ForEachContext)) {
            throw new CompilationError("Expected a foreach context");
        }
        ForEachContext context = (ForEachContext) contextStack.pop();
        this.instructions.add(new ScPop(incrementAndReturnInstruction(), this.vm));
        this.instructions.add(new Jump(incrementAndReturnInstruction(), this.vm, context.getJumpBackToIndex()));
        context.getCondJumpInstruction().setJumpToInstruction(this.currentInstructionNumber + 1);
    }

    @Override
    public void enterFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
        this.instructions.add(new ScPush(incrementAndReturnInstruction(), this.vm));
    }

    @Override
    public void exitFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
        this.instructions.add(new ScPop(incrementAndReturnInstruction(), this.vm));
    }

    @Override
    public void enterArgument(@NotNull KnitLanguageParser.ArgumentContext ctx) {
        if (ctx.STRING() != null) {
            this.instructions.add(new OsPushC(incrementAndReturnInstruction(), this.vm, ctx.STRING().getText()));
        }
        if (ctx.number() != null) {
            this.instructions.add(new OsPushC(incrementAndReturnInstruction(), this.vm, getText(ctx.number().children)));
        }
        if (ctx.identifier() != null) {
            this.instructions.add(new OsPushR(incrementAndReturnInstruction(), this.vm, getText(ctx.identifier().children)));
        }
        this.instructions.add(new Print(incrementAndReturnInstruction(), this.vm));
    }

    @Override
    public void enterMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        this.instructions.add(new ScPush(incrementAndReturnInstruction(), this.vm));
        this.startInstruction = this.currentInstructionNumber;
    }

    @Override
    public void exitMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        this.instructions.add(new ScPop(incrementAndReturnInstruction(), this.vm));
        this.instructions.add(new Exit(incrementAndReturnInstruction(), this.vm));
    }

    private int incrementAndReturnInstruction() {
        this.currentInstructionNumber++;
        return this.currentInstructionNumber;
    }

    private String getText(TerminalNode node, int reference) {
        String text = node.getText();
        return text.substring(reference, text.length() - reference);
    }

    private String getText(List<ParseTree> nodes) {
        String text = "";
        for (ParseTree node : nodes) {
            text += node.getText();
        }
        return text;
    }
}
