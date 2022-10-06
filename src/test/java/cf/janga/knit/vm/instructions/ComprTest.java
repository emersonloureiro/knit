package cf.janga.knit.vm.instructions;

import java.util.HashMap;

import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import junit.framework.TestCase;

public class ComprTest extends TestCase {

    public void testEquality() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push("emerson");
        vm.operandStack().push("emerson");
        vm.operandStack().push("==");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push("emerson");
        vm.operandStack().push("emmerson");
        vm.operandStack().push("==");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());
    }

    public void testInequality() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push("emerson");
        vm.operandStack().push("emerson");
        vm.operandStack().push("!=");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push("emerson");
        vm.operandStack().push("emmerson");
        vm.operandStack().push("!=");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());
    }

    public void testLessThan() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push(1);
        vm.operandStack().push(2);
        vm.operandStack().push("<");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(2);
        vm.operandStack().push(1);
        vm.operandStack().push("<");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push("1");
        vm.operandStack().push("2");
        vm.operandStack().push("<");
        try {
            cmpr.doExecute();
            fail();
        } catch (ProgramError e) {
        }
    }

    public void testLessThanOrEqualTo() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push(1);
        vm.operandStack().push(1);
        vm.operandStack().push("<=");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(1);
        vm.operandStack().push(2);
        vm.operandStack().push("<=");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(2);
        vm.operandStack().push(1);
        vm.operandStack().push("<=");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push("1");
        vm.operandStack().push("2");
        vm.operandStack().push("<=");
        try {
            cmpr.doExecute();
            fail();
        } catch (ProgramError e) {
        }
    }

    public void testGreaterThan() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push(1);
        vm.operandStack().push(2);
        vm.operandStack().push(">");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push(2);
        vm.operandStack().push(1);
        vm.operandStack().push(">");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push("1");
        vm.operandStack().push("2");
        vm.operandStack().push(">");
        try {
            cmpr.doExecute();
            fail();
        } catch (ProgramError e) {
        }
    }

    public void testGreaterThanOrEqualTo() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push(1);
        vm.operandStack().push(1);
        vm.operandStack().push(">=");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(1);
        vm.operandStack().push(2);
        vm.operandStack().push(">=");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push(2);
        vm.operandStack().push(1);
        vm.operandStack().push(">=");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push("1");
        vm.operandStack().push("2");
        vm.operandStack().push(">=");
        try {
            cmpr.doExecute();
            fail();
        } catch (ProgramError e) {
        }
    }

    public void testAnd() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push(true);
        vm.operandStack().push(true);
        vm.operandStack().push("&&");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(true);
        vm.operandStack().push(false);
        vm.operandStack().push("&&");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push(false);
        vm.operandStack().push(false);
        vm.operandStack().push("&&");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push("1");
        vm.operandStack().push("2");
        vm.operandStack().push("&&");
        try {
            cmpr.doExecute();
            fail();
        } catch (ProgramError e) {
        }
    }

    public void testOr() throws ProgramError {
        VirtualMachine vm = new VirtualMachine(new HashMap<>());
        Compr cmpr = new Compr(0, vm);

        vm.operandStack().push(true);
        vm.operandStack().push(true);
        vm.operandStack().push("||");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(false);
        vm.operandStack().push(false);
        vm.operandStack().push("||");
        cmpr.doExecute();
        assertFalse((Boolean) vm.operandStack().pop());

        vm.operandStack().push(true);
        vm.operandStack().push(false);
        vm.operandStack().push("||");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push(false);
        vm.operandStack().push(true);
        vm.operandStack().push("||");
        cmpr.doExecute();
        assertTrue((Boolean) vm.operandStack().pop());

        vm.operandStack().push("1");
        vm.operandStack().push("2");
        vm.operandStack().push("||");
        try {
            cmpr.doExecute();
            fail();
        } catch (ProgramError e) {
        }
    }
}
