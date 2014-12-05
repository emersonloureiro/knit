package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.VirtualMachine;
import junit.framework.TestCase;

public class InstructionsTest extends TestCase {

    public void testExecution() {
        VirtualMachine vm = new VirtualMachine();
        Instruction[] instructions = new Instruction[]{
                new ScPush(0, vm),
                new OsPushC(1, vm, "emerson"),
                new ScStore(2, vm, "foo"),
                new OsPushC(3, vm, Integer.valueOf(1)),
                new OsPushR(4, vm, "foo"),
                new Jump(5, vm, 10)
        };
    }
}
