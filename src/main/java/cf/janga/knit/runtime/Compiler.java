package cf.janga.knit.runtime;

import cf.janga.knit.parser.KnitListenerAdapter;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;
import java.util.List;

public abstract class Compiler extends KnitListenerAdapter {

    private final List<Instruction> instructions;

    private int currentInstructionNumber;

    protected final VirtualMachine vm;

    public Compiler(int currentInstructionNumber, VirtualMachine vm) {
        this.currentInstructionNumber = currentInstructionNumber;
        this.instructions = new LinkedList<Instruction>();
        this.vm = vm;
    }

    public final void addInstruction(Instruction instruction) {
        this.instructions.add(instruction);
    }

    public final List<Instruction> instructions() {
        return this.instructions;
    }

    protected final int returnAndIncrementInstruction() {
        this.currentInstructionNumber++;
        return this.currentInstructionNumber;
    }

    public final int currentInstructionNumber() {
        return this.currentInstructionNumber;
    }

    public final void resetInstructionCounter(int currentInstructionNumber) {
        this.currentInstructionNumber = currentInstructionNumber;
    }

    protected final <T extends ParserRuleContext> void addInstructionsFromBuilderAndReset(Builder<T> builder, T tree) {
        Instruction[] codeInstructions = builder.build(tree);
        for (Instruction codeInstruction : codeInstructions) {
            addInstruction(codeInstruction);
        }
        resetInstructionCounter(builder.currentInstructionNumber());
    }
}
