package cf.janga.knit.vm.instructions;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.vm.core.MachineStack;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.VariableReassignmentError;
import junit.framework.TestCase;

@RunWith(MockitoJUnitRunner.class)
public class ScStoreTest extends TestCase {

    @Mock
    private VirtualMachine vm;

    @Mock
    private MachineStack<Object> operandStack;

    @Mock
    private MachineStack<Scope> scopeStack;

    @Mock
    private Scope localScope;

    @Mock
    private Scope globalScope;

    @Test
    public void storeLocalScopeVariableUnassigned() {
        Scstr scStore = new Scstr(0, vm, "test");

        when(this.vm.operandStack()).thenReturn(this.operandStack);
        when(this.vm.scopeStack()).thenReturn(this.scopeStack);
        when(this.operandStack.pop()).thenReturn("testValue");
        when(this.scopeStack.top()).thenReturn(this.localScope);

        scStore.doExecute();

        verify(this.localScope).assign("test", "testValue");
    }

    @Test
    public void storeLocalScopeVariableAlreadyAssigned() {
        Scstr scStore = new Scstr(0, vm, "test");

        when(this.vm.scopeStack()).thenReturn(this.scopeStack);
        when(this.scopeStack.top()).thenReturn(this.localScope);
        when(this.localScope.valueOf("test")).thenReturn("value");

        assertThrowsExactly(VariableReassignmentError.class, () -> scStore.doExecute());
    }

    @Test
    public void storeLocalScopeVariableAlreadyAssignedAllowOverwride() {
        Scstr scStore = new Scstr(0, vm, "test", false, true);

        when(this.vm.scopeStack()).thenReturn(this.scopeStack);
        when(this.scopeStack.top()).thenReturn(this.localScope);
        when(this.localScope.valueOf("test")).thenReturn("value");
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        when(this.operandStack.pop()).thenReturn("testValue");

        scStore.doExecute();

        verify(this.localScope).assign("test", "testValue");
    }

    @Test
    public void storeGlobalScopeVariableUnassigned() {
        Scstr scStore = new Scstr(0, vm, "test", true, false);

        when(this.vm.operandStack()).thenReturn(this.operandStack);
        when(this.operandStack.pop()).thenReturn("testValue");
        when(this.vm.globalScope()).thenReturn(this.globalScope);
        when(this.globalScope.valueOf("test")).thenReturn(null);

        scStore.doExecute();

        verify(this.globalScope).assign("test", "testValue");
        verify(this.localScope, never()).assign(any(), any());
    }

    @Test
    public void storeGlobalScopeVariableAlreadyAssigned() {
        Scstr scStore = new Scstr(0, vm, "test", true, false);

        when(this.vm.globalScope()).thenReturn(this.globalScope);
        when(this.globalScope.valueOf("test")).thenReturn("value");

        assertThrowsExactly(VariableReassignmentError.class, () -> scStore.doExecute());
    }

    @Test
    public void storeGlobalScopeVariableAlreadyAssignedAllowOverwrite() {
        Scstr scStore = new Scstr(0, vm, "test", true, true);

        when(this.vm.operandStack()).thenReturn(this.operandStack);
        when(this.operandStack.pop()).thenReturn("testValue");
        when(this.vm.globalScope()).thenReturn(this.globalScope);
        when(this.globalScope.valueOf("test")).thenReturn("value");

        scStore.doExecute();

        verify(this.globalScope).assign("test", "testValue");
        verify(this.localScope, never()).assign(any(), any());
    }
}
