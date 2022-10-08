package cf.janga.knit.compiler.constructs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Stdlb;
import cf.janga.knit.vm.instructions.Osphc;
import cf.janga.knit.vm.instructions.Osphr;

@RunWith(MockitoJUnitRunner.class)
public class StringConstantTest {
    
    @Mock
    private VirtualMachine vm;

    @Test
    public void testPlainString() {
        StringConstant stringConstant = new StringConstant(this.vm, "test");
        List<Instruction> instructions = stringConstant.getInstructions(0);
        assertEquals(1, instructions.size());
        assertInstanceOf(Osphc.class, instructions.get(0));
    }

    @Test
    public void testStringWithVariableSubstitution() {
        StringConstant stringConstant = new StringConstant(this.vm, "Hello ${variable} world ${anotherVariable} ");
        List<Instruction> instructions = stringConstant.getInstructions(0);
        assertEquals(21, instructions.size());

        assertInstanceOf(Osphc.class, instructions.get(0));
        assertEquals("Hello ", ((Osphc) instructions.get(0)).getValue());
        assertInstanceOf(Osphr.class, instructions.get(1));
        assertEquals("variable", ((Osphr) instructions.get(1)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(2));
        assertEquals(2, ((Osphc) instructions.get(2)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(3));
        assertEquals("strConcat", ((Osphc) instructions.get(3)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(4));
        assertEquals("knit::str::", ((Osphc) instructions.get(4)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(5));

        assertInstanceOf(Osphc.class, instructions.get(6));
        assertEquals(" world ", ((Osphc) instructions.get(6)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(7));
        assertEquals(2, ((Osphc) instructions.get(7)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(8));
        assertEquals("strConcat", ((Osphc) instructions.get(8)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(9));
        assertEquals("knit::str::", ((Osphc) instructions.get(9)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(10));
        
        assertInstanceOf(Osphr.class, instructions.get(11));
        assertEquals("anotherVariable", ((Osphr) instructions.get(11)).getVariableName());        
        assertInstanceOf(Osphc.class, instructions.get(12));
        assertEquals(2, ((Osphc) instructions.get(12)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(13));
        assertEquals("strConcat", ((Osphc) instructions.get(13)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(14));
        assertEquals("knit::str::", ((Osphc) instructions.get(14)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(15));

        assertInstanceOf(Osphc.class, instructions.get(16));
        assertEquals(" ", ((Osphc) instructions.get(16)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(17));
        assertEquals(2, ((Osphc) instructions.get(17)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(18));
        assertEquals("strConcat", ((Osphc) instructions.get(18)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(19));
        assertEquals("knit::str::", ((Osphc) instructions.get(19)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(20));
    }

    @Test
    public void testStringWithOnlyVariableSubstitution() {
        StringConstant stringConstant = new StringConstant(this.vm, "${hello} ${variable} ${world} ${anotherVariable}");
        List<Instruction> instructions = stringConstant.getInstructions(0);
        assertEquals(31, instructions.size());

        assertInstanceOf(Osphr.class, instructions.get(0));
        assertEquals("hello", ((Osphr) instructions.get(0)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(1));
        assertEquals(" ", ((Osphc) instructions.get(1)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(2));
        assertEquals(2, ((Osphc) instructions.get(2)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(3));
        assertEquals("strConcat", ((Osphc) instructions.get(3)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(4));
        assertEquals("knit::str::", ((Osphc) instructions.get(4)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(5));

        assertInstanceOf(Osphr.class, instructions.get(6));
        assertEquals("variable", ((Osphr) instructions.get(6)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(7));
        assertEquals(2, ((Osphc) instructions.get(7)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(8));
        assertEquals("strConcat", ((Osphc) instructions.get(8)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(9));
        assertEquals("knit::str::", ((Osphc) instructions.get(9)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(10));

        assertInstanceOf(Osphc.class, instructions.get(11));
        assertEquals(" ", ((Osphc) instructions.get(11)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(12));
        assertEquals(2, ((Osphc) instructions.get(12)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(13));
        assertEquals("strConcat", ((Osphc) instructions.get(13)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(14));
        assertEquals("knit::str::", ((Osphc) instructions.get(14)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(15));

        assertInstanceOf(Osphr.class, instructions.get(16));
        assertEquals("world", ((Osphr) instructions.get(16)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(17));
        assertEquals(2, ((Osphc) instructions.get(17)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(18));
        assertEquals("strConcat", ((Osphc) instructions.get(18)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(19));
        assertEquals("knit::str::", ((Osphc) instructions.get(19)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(20));

        assertInstanceOf(Osphc.class, instructions.get(21));
        assertEquals(" ", ((Osphc) instructions.get(21)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(22));
        assertEquals(2, ((Osphc) instructions.get(22)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(23));
        assertEquals("strConcat", ((Osphc) instructions.get(23)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(24));
        assertEquals("knit::str::", ((Osphc) instructions.get(24)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(25));
        
        assertInstanceOf(Osphr.class, instructions.get(26));
        assertEquals("anotherVariable", ((Osphr) instructions.get(26)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(27));
        assertEquals(2, ((Osphc) instructions.get(27)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(28));
        assertEquals("strConcat", ((Osphc) instructions.get(28)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(29));
        assertEquals("knit::str::", ((Osphc) instructions.get(29)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(30));
    }

    @Test
    public void testStringWithOnlyVariableSubstitutionNoSpaces() {
        StringConstant stringConstant = new StringConstant(this.vm, "${hello}${variable}${world}${anotherVariable}");
        List<Instruction> instructions = stringConstant.getInstructions(0);
        assertEquals(16, instructions.size());

        assertInstanceOf(Osphr.class, instructions.get(0));
        assertEquals("hello", ((Osphr) instructions.get(0)).getVariableName());
        assertInstanceOf(Osphr.class, instructions.get(1));
        assertEquals("variable", ((Osphr) instructions.get(1)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(2));
        assertEquals(2, ((Osphc) instructions.get(2)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(3));
        assertEquals("strConcat", ((Osphc) instructions.get(3)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(4));
        assertEquals("knit::str::", ((Osphc) instructions.get(4)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(5));

        assertInstanceOf(Osphr.class, instructions.get(6));
        assertEquals("world", ((Osphr) instructions.get(6)).getVariableName());
        assertInstanceOf(Osphc.class, instructions.get(7));
        assertEquals(2, ((Osphc) instructions.get(7)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(8));
        assertEquals("strConcat", ((Osphc) instructions.get(8)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(9));
        assertEquals("knit::str::", ((Osphc) instructions.get(9)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(10));
        
        assertInstanceOf(Osphr.class, instructions.get(11));
        assertEquals("anotherVariable", ((Osphr) instructions.get(11)).getVariableName());        
        assertInstanceOf(Osphc.class, instructions.get(12));
        assertEquals(2, ((Osphc) instructions.get(12)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(13));
        assertEquals("strConcat", ((Osphc) instructions.get(13)).getValue());
        assertInstanceOf(Osphc.class, instructions.get(14));
        assertEquals("knit::str::", ((Osphc) instructions.get(14)).getValue());
        assertInstanceOf(Stdlb.class, instructions.get(15));
    }
}
