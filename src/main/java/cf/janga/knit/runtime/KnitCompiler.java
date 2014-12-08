package cf.janga.knit.runtime;

import cf.janga.knit.parser.KnitLanguageParser;
import cf.janga.knit.parser.KnitListenerAdapter;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class KnitCompiler extends KnitListenerAdapter {

    private int currentInstructionNumber;

    private List<Instruction> instructions;

    private int startInstruction;

    private VirtualMachine vm;

    public KnitCompiler(VirtualMachine vm) {
        this.currentInstructionNumber = -1;
        this.instructions = new LinkedList<Instruction>();
        this.vm = vm;
    }

    public Program compile(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return new Program(this.vm, this.instructions.toArray(new Instruction[]{}), this.startInstruction);
    }

    @Override
    public void enterVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx) {
        if (ctx.STRING() != null) {
            this.instructions.add(new OsPushC(returnAndIncrementInstruction(), this.vm, getText(ctx.STRING(), 1)));
        }
        if (ctx.COMMAND() != null) {
            this.instructions.add(new ComRet(returnAndIncrementInstruction(), this.vm, getText(ctx.COMMAND(), 1)));
        }
        if (ctx.number() != null) {
            Float number = Float.parseFloat(getText(ctx.number().children));
            this.instructions.add(new OsPushC(returnAndIncrementInstruction(), this.vm, number));
        }
    }

    @Override
    public void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
        this.instructions.add(new ScStore(returnAndIncrementInstruction(), this.vm, getText(ctx.identifier().children)));
    }

    @Override
    public void enterFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
        this.instructions.add(new ScPush(returnAndIncrementInstruction(), this.vm));
    }

    @Override
    public void exitFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
        this.instructions.add(new ScPop(returnAndIncrementInstruction(), this.vm));
    }

    @Override
    public void enterArgument(@NotNull KnitLanguageParser.ArgumentContext ctx) {
        if (ctx.STRING() != null) {
            this.instructions.add(new OsPushC(returnAndIncrementInstruction(), this.vm, ctx.STRING().getText()));
        }
        if (ctx.number() != null) {
            this.instructions.add(new OsPushC(returnAndIncrementInstruction(), this.vm, getText(ctx.number().children)));
        }
        if (ctx.identifier() != null) {
            this.instructions.add(new OsPushR(returnAndIncrementInstruction(), this.vm, getText(ctx.identifier().children)));
        }
        this.instructions.add(new Print(returnAndIncrementInstruction(), this.vm));
    }

    @Override
    public void enterMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        this.instructions.add(new ScPush(returnAndIncrementInstruction(), this.vm));
        this.startInstruction = this.currentInstructionNumber;
    }

    @Override
    public void exitMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        this.instructions.add(new ScPop(returnAndIncrementInstruction(), this.vm));
    }

    private int returnAndIncrementInstruction() {
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
