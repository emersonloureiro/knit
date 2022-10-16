package cf.janga.knit.compiler.constructs;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

@RunWith(MockitoJUnitRunner.class)
public class KnitProgramTest {

    @Mock
    private VirtualMachine vm;

    @Test
    public void testAddChildMainFunction() {
        KnitProgram program = new KnitProgram(this.vm);
        Function function = mock(Function.class);
        when(function.isMain()).thenReturn(true);
        program.doAddChild(function);
        assertTrue(program.getMainFunction() != null);
    }

    @Test
    public void testAddChildNotMainFunction() {
        KnitProgram program = new KnitProgram(this.vm);
        Function function = mock(Function.class);
        when(function.isMain()).thenReturn(false);
        program.doAddChild(function);
        assertTrue(program.getMainFunction() == null);
    }

    @Test
    public void testAddChildNotAFunction() {
        KnitProgram program = new KnitProgram(this.vm);
        ASTNode child = mock(ASTNode.class);
        program.doAddChild(child);
        assertTrue(program.getMainFunction() == null);
    }

    @Test
    public void testGetInstructionsHasMainFunction() {
        KnitProgram program = new KnitProgram(this.vm);
        Function function = mock(Function.class);
        when(function.isMain()).thenReturn(true);
        program.doAddChild(function);
        List<Instruction> instructions = program.getInstructions(0);
        verify(this.vm).registerInstructions("main", "main", instructions);
    }

    @Test
    public void testGetInstructionsNoMainFunction() {
        KnitProgram program = new KnitProgram(this.vm);
        List<Instruction> instructions = program.getInstructions(0);
        verify(this.vm, never()).registerInstructions("name", "name", instructions);
    }
}
