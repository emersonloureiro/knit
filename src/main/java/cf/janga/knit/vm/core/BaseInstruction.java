package cf.janga.knit.vm.core;

import cf.janga.knit.vm.errors.ProgramError;

public abstract class BaseInstruction implements Instruction {

    protected final VirtualMachine vm;
    private final int index;

    public BaseInstruction(int index, VirtualMachine vm) {
        this.vm = vm;
        this.index = index;
    }

    @Override
    public final void execute() throws ProgramError {
        doExecute();
        this.vm.programCounter().set(nextInstructionIndex());
    }

    protected Integer nextInstructionIndex() {
        return Integer.valueOf(this.index + 1);
    }

    public int getIndex() {
        return index;
    }

    @Override
    public final String toString() {
        String toStringParameter = this.toStringParameter();
        if (toStringParameter == null) {
            return this.getClass().getSimpleName().toLowerCase();
        }
        return String.format("%s %s", this.getClass().getSimpleName().toLowerCase(), this.toStringParameter());
    }

    protected String toStringParameter() {
        return null;
    }

    protected abstract void doExecute() throws ProgramError;
}
