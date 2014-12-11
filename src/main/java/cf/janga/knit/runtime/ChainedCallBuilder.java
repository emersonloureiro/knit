package cf.janga.knit.runtime;

import cf.janga.knit.parser.KnitLanguageParser;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;
import org.antlr.v4.runtime.misc.NotNull;

import static cf.janga.knit.runtime.CompilationUtils.getText;

public class ChainedCallBuilder extends Builder<KnitLanguageParser.ChainedCallContext> {

    private String functionName;
    private String variableName;

    public ChainedCallBuilder(int currentInstructionNumber, VirtualMachine vm) {
        super(currentInstructionNumber, vm);
    }

    @Override
    public void enterFunctionName(@NotNull KnitLanguageParser.FunctionNameContext ctx) {
        this.functionName = getText(ctx.children);
    }

    @Override
    public void enterIdentifier(@NotNull KnitLanguageParser.IdentifierContext ctx) {
        this.variableName = getText(ctx.children);
    }

    @Override
    public void enterCode(@NotNull KnitLanguageParser.CodeContext ctx) {
        int lsSizeInstructionIndex = returnAndIncrementInstruction();
        Instruction lssize = new LsSize(lsSizeInstructionIndex, this.vm);
        int condJumpInstructionIndex = returnAndIncrementInstruction();
        Instruction scpush = new ScPush(returnAndIncrementInstruction(), this.vm);
        Instruction lsnext = new LsNext(returnAndIncrementInstruction(), this.vm);
        Instruction scstore = new ScStore(returnAndIncrementInstruction(), this.vm, this.variableName);
        CodeBuilder codeBuilder = new CodeBuilder(returnAndIncrementInstruction(), this.vm);
        Instruction[] codeInstructions = codeBuilder.build(ctx);
        resetInstructionCounter(codeBuilder.currentInstructionNumber());
        Instruction scpop = new ScPop(returnAndIncrementInstruction(), this.vm);
        Instruction jump = new Jump(returnAndIncrementInstruction(), this.vm, lsSizeInstructionIndex);
        Instruction condjump = new CondJump(condJumpInstructionIndex, this.vm, currentInstructionNumber() + 1);

        addInstruction(lssize);
        addInstruction(condjump);
        addInstruction(scpush);
        addInstruction(lsnext);
        addInstruction(scstore);
        for (Instruction codeInstruction : codeInstructions) {
            addInstruction(codeInstruction);
        }
        addInstruction(scpop);
        addInstruction(jump);
    }
}
