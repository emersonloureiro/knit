package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Scpop;
import cf.janga.knit.vm.instructions.Scpsh;

public class Function extends WrapperNode {

    private final boolean main;

    private final String module;

    private final String functionName;

    public Function(VirtualMachine vm, String module, String name, boolean main) {
        super(vm, "Function");
        this.main = main;
        this.module = module;
        this.functionName = name;
    }

    public String getModule() {
        return this.module;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public boolean isMain() {
        return this.main;
    }

    @Override
    public String toString() {
        if (this.main) {
            return "Main function";
        }
        return String.format("Function %s", this.functionName);
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new Scpsh(startIndex++, this.vm));
        List<Instruction> childrenInstructions = super.getInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();
        instructions.add(new Scpop(startIndex++, this.vm));
        return instructions;
    }
}
