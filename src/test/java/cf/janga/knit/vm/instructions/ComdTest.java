package cf.janga.knit.vm.instructions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.compiler.constructs.Command;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.MachineStack;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.UndeclaredVariableError;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("unchecked")
public class ComdTest {
    
    @Mock
    private VirtualMachine vm;

    @Mock
    private CommandExecutor executor;

    @Mock
    private Process process;

    @Mock
    private BufferedReader processStream;

    @Mock
    private MachineStack<Object> operandStack;

    @Mock
    private MachineStack<Scope> scopeStack;

    @Mock
    private Scope scope;

    @Test
    public void executesListOutputCommand() throws IOException, InterruptedException {
        Comd comd = new Comd(this.executor, 0, this.vm, "[ls -al]", null, Command.Type.LIST_OUTPUT, true) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };

        when(this.executor.execute("ls -al")).thenReturn(this.process);
        when(this.processStream.readLine())
            .thenReturn("line1")
            .thenReturn("line2")
            .thenReturn(null);
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        ArgumentCaptor<Object> operandStackCaptor = ArgumentCaptor.forClass(Object.class);
        doNothing().when(this.operandStack).push(operandStackCaptor.capture());
        when(this.process.waitFor(anyLong(), any())).thenReturn(true);
        when(this.process.exitValue()).thenReturn(0);

        comd.doExecute();

        List<Object> pushedValues = operandStackCaptor.getAllValues();
        assertEquals(2, pushedValues.size());
        List<Object> commandListOuput = (List<Object>) pushedValues.get(0);
        assertEquals(2, commandListOuput.size());
        assertEquals("line1", commandListOuput.get(0));
        assertEquals("line2", commandListOuput.get(1));
        assertEquals(0f, pushedValues.get(1));
    }

    @Test
    public void executesSingleOutputCommand() throws IOException, InterruptedException {
        Comd comd = new Comd(this.executor, 0, this.vm, "[ls -al]", null, Command.Type.SINGLE_OUTPUT, true) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };

        when(this.executor.execute("ls -al")).thenReturn(this.process);
        when(this.processStream.readLine())
            .thenReturn("line1")
            .thenReturn("line2")
            .thenReturn(null);
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        ArgumentCaptor<Object> operandStackCaptor = ArgumentCaptor.forClass(Object.class);
        doNothing().when(this.operandStack).push(operandStackCaptor.capture());
        when(this.process.waitFor(anyLong(), any())).thenReturn(true);
        when(this.process.exitValue()).thenReturn(0);

        comd.doExecute();

        List<Object> pushedValues = operandStackCaptor.getAllValues();
        assertEquals(2, pushedValues.size());
        assertEquals("line1\n\rline2\n\r", pushedValues.get(0));
        assertEquals(0f, pushedValues.get(1));
    }

    @Test
    public void executesNoReturn() throws IOException, InterruptedException {
        Comd comd = new Comd(this.executor, 0, this.vm, "[ls -al]", null, Command.Type.LIST_OUTPUT, false) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };

        when(this.executor.execute("ls -al")).thenReturn(this.process);
        when(this.processStream.readLine())
            .thenReturn("line1")
            .thenReturn("line2")
            .thenReturn(null);
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        when(this.process.waitFor(anyLong(), any())).thenReturn(true);
        when(this.process.exitValue()).thenReturn(0);

        comd.doExecute();

        verify(this.operandStack).push(0f);
        verifyNoMoreInteractions(this.operandStack);
    }

    @Test
    public void executesProcessDoesNotExitInTime() throws IOException, InterruptedException {
        Comd comd = new Comd(this.executor, 0, this.vm, "[ls -al]", null, Command.Type.LIST_OUTPUT, true) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };

        when(this.executor.execute("ls -al")).thenReturn(this.process);
        when(this.processStream.readLine())
            .thenReturn("line1")
            .thenReturn("line2")
            .thenReturn(null);
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        ArgumentCaptor<Object> operandStackCaptor = ArgumentCaptor.forClass(Object.class);
        doNothing().when(this.operandStack).push(operandStackCaptor.capture());
        when(this.process.waitFor(anyLong(), any())).thenReturn(false);

        comd.doExecute();

        List<Object> pushedValues = operandStackCaptor.getAllValues();
        assertEquals(2, pushedValues.size());
        List<Object> commandListOuput = (List<Object>) pushedValues.get(0);
        assertEquals(2, commandListOuput.size());
        assertEquals("line1", commandListOuput.get(0));
        assertEquals("line2", commandListOuput.get(1));
        assertEquals(-1f, pushedValues.get(1));
    }

    @Test
    public void executesProcessWithReferencedVariable() throws IOException, InterruptedException {
        String referencedVariable = "variable";
        String variableValue = "value";
        Comd comd = new Comd(this.executor, 0, this.vm, "[ls -al | grep '${variable}']", referencedVariable, Command.Type.LIST_OUTPUT, true) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };

        when(this.vm.scopeStack()).thenReturn(this.scopeStack);
        when(this.scopeStack.top()).thenReturn(this.scope);
        when(this.scope.valueOf(referencedVariable)).thenReturn(variableValue);
        when(this.executor.execute("ls -al | grep 'value'")).thenReturn(this.process);
        when(this.processStream.readLine())
            .thenReturn("line1")
            .thenReturn("line2")
            .thenReturn(null);
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        ArgumentCaptor<Object> operandStackCaptor = ArgumentCaptor.forClass(Object.class);
        doNothing().when(this.operandStack).push(operandStackCaptor.capture());
        when(this.process.waitFor(anyLong(), any())).thenReturn(false);

        comd.doExecute();

        List<Object> pushedValues = operandStackCaptor.getAllValues();
        assertEquals(2, pushedValues.size());
        List<Object> commandListOuput = (List<Object>) pushedValues.get(0);
        assertEquals(2, commandListOuput.size());
        assertEquals("line1", commandListOuput.get(0));
        assertEquals("line2", commandListOuput.get(1));
        assertEquals(-1f, pushedValues.get(1));
    }

    @Test
    public void executesProcessWithUndeclaredReferencedVariable() throws IOException, InterruptedException {
        String referencedVariable = "variable";
        Comd comd = new Comd(this.executor, 0, this.vm, "[ls -al | grep '${variable}']", referencedVariable, Command.Type.LIST_OUTPUT, true) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };

        when(this.vm.scopeStack()).thenReturn(this.scopeStack);
        when(this.scopeStack.top()).thenReturn(this.scope);
        when(this.scope.valueOf(referencedVariable)).thenReturn(null);

        assertThrowsExactly(UndeclaredVariableError.class, () -> comd.doExecute());
    }
}