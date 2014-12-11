package cf.janga.knit.runtime;

import cf.janga.knit.parser.KnitLanguageParser;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static cf.janga.knit.runtime.CompilationUtils.getText;

public class KnitCompiler extends Compiler {

    private int startInstruction;

    public KnitCompiler(VirtualMachine vm) {
        super(-1, vm);
    }

    public Program compile(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return new Program(this.vm, instructions().toArray(new Instruction[]{}), this.startInstruction);
    }

    @Override
    public void enterCode(@NotNull KnitLanguageParser.CodeContext ctx) {
        addInstructionsFromBuilderAndReset(new CodeBuilder(currentInstructionNumber(), this.vm), ctx);
    }

    @Override
    public void enterFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
        addInstruction(new ScPush(returnAndIncrementInstruction(), this.vm));
    }

    @Override
    public void exitFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
        addInstruction(new ScPop(returnAndIncrementInstruction(), this.vm));
    }

    @Override
    public void enterMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        addInstruction(new ScPush(returnAndIncrementInstruction(), this.vm));
        this.startInstruction = currentInstructionNumber();
    }

    @Override
    public void exitMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        addInstruction(new ScPop(returnAndIncrementInstruction(), this.vm));
        CompilationUtils.clearMap();
    }
}
