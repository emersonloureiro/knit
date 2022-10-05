package cf.janga.knit.vm.instructions;

import java.util.HashMap;

import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.ProgramError;
import junit.framework.TestCase;

public class ComprTest extends TestCase {

    public void testEquality() {
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

    public void testInequality() {
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

    public void testLessThan() {
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

    public void testLessThanOrEqualTo() {
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

    public void testGreaterThan() {
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

    public void testGreaterThanOrEqualTo() {
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

    public void testAnd() {
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

    public void testOr() {
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
