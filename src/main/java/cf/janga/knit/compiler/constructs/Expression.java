package cf.janga.knit.compiler.constructs;

import cf.janga.knit.vm.core.VirtualMachine;

public class Expression extends WrapperNode {

    public Expression(VirtualMachine vm) {
        super(vm, "Expression");
    }
}
