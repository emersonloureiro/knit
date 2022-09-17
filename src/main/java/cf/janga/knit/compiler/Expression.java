package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

/**
 * An expression is a construct of the language which returns a value. In other words,
 * it pushes a value to the operand stack.
 */
public class Expression extends CompositeContext {
    public Expression(VirtualMachine vm) {
        super(vm);
    }
}
