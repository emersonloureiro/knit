package cf.janga.knit.vm.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

public class VirtualMachineTest extends TestCase {

    public void testArgumentsTypification() {
        VirtualMachine vm = new VirtualMachine(Map.of("string", "s", "number", "1.2", "list", "[1 , 2 ,3,    4,     5]"));
        Scope scope = vm.globalScope();

        assertTrue(scope.valueOf("@string") instanceof String);
        assertTrue(scope.valueOf("@number") instanceof Double);
        assertTrue(scope.valueOf("@list") instanceof List);

        assertEquals("s", scope.valueOf("@string"));
        assertEquals(1.2d, scope.valueOf("@number"));
        assertEquals(Arrays.asList("1", "2", "3", "4", "5"), scope.valueOf("@list"));
    }
}
