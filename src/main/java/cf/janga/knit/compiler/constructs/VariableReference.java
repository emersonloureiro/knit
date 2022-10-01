package cf.janga.knit.compiler.constructs;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Osphr;

import java.util.ArrayList;
import java.util.List;

public class VariableReference extends Argument {

    private String identifier;

    public VariableReference(VirtualMachine vm, String identifier) {
        super(vm);
        this.identifier = identifier;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new Osphr(startIndex, this.vm, this.identifier, true));
        return instructions;
    }

    @Override
    public String toString() {
        return "VariableReference";
    }

    public String getIdentifier() {
        return identifier;
    }
}
