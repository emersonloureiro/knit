package cf.janga.knit.vm.core;

import java.util.Map;

public class Program {

    private final int startInstruction;
    private final VirtualMachine vm;

    public Program(VirtualMachine vm, int startInstruction) {
        this.vm = vm;
        this.startInstruction = startInstruction;
    }

    public int startInstruction() {
        return this.startInstruction;
    }

    public VirtualMachine virtualMachine() {
        return this.vm;
    }

    public String getMainFunction() {
        return "main";
    }

    @Override
    public String toString() {
        String string = "";
        for (Map.Entry<String, Instruction[]> functionInstructions : this.vm.getFunctionInstructions().entrySet()) {
            string += "==============================\n";
            string += functionInstructions.getKey() + "\n";
            string += "==============================\n";
            for (Instruction instruction : functionInstructions.getValue()) {
                string += instruction.toString() + "\n";
            }
        }
        return string;
    }
}
