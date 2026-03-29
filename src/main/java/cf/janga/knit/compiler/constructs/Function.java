package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Scpop;
import cf.janga.knit.vm.instructions.Scpsh;
import cf.janga.knit.vm.instructions.Ospop;
import cf.janga.knit.vm.instructions.Return;

public class Function extends WrapperNode {

    private final boolean main;

    private final String module;

    private final String functionName;

    private final List<String> parameters;

    public Function(VirtualMachine vm, String module, String name, boolean main) {
        super(vm, "Function");
        this.main = main;
        this.module = module;
        this.functionName = name;
        this.parameters = new ArrayList<>();
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

    public void addParameter(String parameterName) {
        this.parameters.add(parameterName);
    }

    public List<String> getParameters() {
        return new ArrayList<>(this.parameters);
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

        List<String> reversedParameters = new ArrayList<>(this.parameters);
        Collections.reverse(reversedParameters);
        for (String parameter : reversedParameters) {
            instructions.add(new Ospop(parameter, startIndex++, this.vm));
        }

        List<Instruction> childrenInstructions = super.getInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();
        instructions.add(new Scpop(startIndex++, this.vm));

        // Add Return instruction for non-main functions to handle returning to caller
        if (!this.main) {
            instructions.add(new Return(startIndex, this.vm));
        }

        return instructions;
    }
}