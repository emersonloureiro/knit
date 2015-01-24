package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;
import cf.janga.knit.vm.instructions.OsPushR;
import cf.janga.knit.vm.instructions.Print;

import java.util.ArrayList;
import java.util.List;

public class PrintContext extends BaseContext {

    private String _argument;
    private KnitType _type;

    public PrintContext(VirtualMachine vm) {
        super(vm);
    }

    public void setArgumentType(KnitType type) {
        _type = type;
    }

    public void setArgument(String argument) {
        _argument = argument;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();

        switch (_type) {
            case STRING:
                instructions.add(new OsPushC(startIndex++, _vm, _argument));
                break;
            case NUMBER:
                instructions.add(new OsPushC(startIndex++, _vm, _argument));
                break;
            case REFERENCE:
                instructions.add(new OsPushR(startIndex++, _vm, _argument));
                break;
            default:
                throw new CompilationError("Invalid type for print function " + _type);
        }

        instructions.add(new Print(startIndex++, _vm));
        return instructions;
    }
}
