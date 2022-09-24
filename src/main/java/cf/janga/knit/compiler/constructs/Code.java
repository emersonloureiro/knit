package cf.janga.knit.compiler.constructs;

import cf.janga.knit.vm.core.VirtualMachine;

public class Code extends WrapperNode {

    public Code(VirtualMachine vm) {
        super(vm, "Code");
    }
}
