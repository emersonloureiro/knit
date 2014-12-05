package cf.janga.knit.vm.core;

import cf.janga.knit.vm.instructions.Scope;

public class VirtualMachine {

    private final MachineStack<Scope> scopeStack;
    private final MachineStack<Object> operandStack;
    private final Register<Integer> programCounter;
    private final Register<Integer> lastInstruction;

    public VirtualMachine() {
        this.scopeStack = new MachineStack<Scope>();
        this.operandStack = new MachineStack<Object>();
        this.programCounter = new Register<Integer>();
        this.lastInstruction = new Register<Integer>();
    }

    public MachineStack<Scope> scopeStack() {
        return this.scopeStack;
    }

    public MachineStack<Object> operandStack() {
        return this.operandStack;
    }

    public Register<Integer> programCounter() {
        return this.programCounter;
    }
    public Register<Integer> lastInstruction() {
        return this.lastInstruction;
    }
}
