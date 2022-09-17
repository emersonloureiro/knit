package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

public abstract class BaseContext implements Context {

    final VirtualMachine _vm;

    public BaseContext(VirtualMachine vm) {
        _vm = vm;
    }
}
