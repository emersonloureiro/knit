package cf.janga.knit.runtime;

import java.util.Map;

import cf.janga.knit.compiler.KnitCompiler;
import cf.janga.knit.vm.core.VirtualMachine;

public class RuntimeFactory {
    
    public VirtualMachine newVirtualMachine(Map<String, String> arguments) {
        return new VirtualMachine(arguments);
    }

    public KnitParser newParser() {
        return new KnitParser();
    }

    public KnitCompiler newCompiler(VirtualMachine vm) {
        return new KnitCompiler(vm);
    }
}
