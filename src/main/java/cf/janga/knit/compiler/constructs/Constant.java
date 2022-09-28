package cf.janga.knit.compiler.constructs;

import cf.janga.knit.vm.core.VirtualMachine;

public abstract class Constant extends Argument {

    public Constant(VirtualMachine vm) {
        super(vm);
    }
}
