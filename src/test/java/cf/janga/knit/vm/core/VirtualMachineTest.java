package cf.janga.knit.vm.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.compiler.CompilationError;

@RunWith(MockitoJUnitRunner.class)
public class VirtualMachineTest {

    @Test
    public void argumentsTypification() {
        VirtualMachine vm = new VirtualMachine(Map.of("string", "s", "number", "1.2", "list", "[1 , 2 ,3,    4,     5]"));
        Scope scope = vm.globalScope();

        assertTrue(scope.valueOf("@string") instanceof String);
        assertTrue(scope.valueOf("@number") instanceof String);
        assertTrue(scope.valueOf("@list") instanceof List);

        assertEquals("s", scope.valueOf("@string"));
        assertEquals("1.2", scope.valueOf("@number"));
        assertEquals(Arrays.asList("1", "2", "3", "4", "5"), scope.valueOf("@list"));
    }

    @Test
    public void registerInstructions() {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        List<Instruction> instructions1 = Arrays.asList(mock(Instruction.class), mock(Instruction.class));
        vm.registerInstructions("test", "foo", instructions1);
    }

    @Test
    public void registerInstructionsAlreadyRegistered() {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        List<Instruction> instructions1 = Arrays.asList(mock(Instruction.class), mock(Instruction.class));
        vm.registerInstructions("test", "foo", instructions1);
        assertThrows(CompilationError.class, () -> vm.registerInstructions("test", "foo", instructions1));
    }
}
