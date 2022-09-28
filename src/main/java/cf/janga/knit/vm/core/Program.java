package cf.janga.knit.vm.core;

public class Program {

    private final Instruction[] instructions;
    private final int startInstruction;
    private final VirtualMachine vm;

    public Program(VirtualMachine vm, Instruction[] instructions, int startInstruction) {
        this.vm = vm;
        this.instructions = instructions;
        this.startInstruction = startInstruction;
    }

    public Instruction[] instructions() {
        return this.instructions;
    }

    public int startInstruction() {
        return this.startInstruction;
    }

    public VirtualMachine virtualMachine() {
        return this.vm;
    }

    @Override
    public String toString() {
        String string = "";
        for (Instruction instruction : this.instructions) {
            string += instruction.toString() + "\n";
        }
        return string;
    }
}
