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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.compiler.constructs.Command;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.Console;
import cf.janga.knit.vm.core.MachineStack;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.program.UndeclaredVariableError;

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

    @Mock
    private Console console;

    @Test
    public void executesListOutputCommand() throws IOException, InterruptedException, ProgramError {
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al", Collections.emptyList(), Command.Type.LIST_OUTPUT, true) {
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
    public void executesSingleOutputCommand() throws IOException, InterruptedException, ProgramError {
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al", Collections.emptyList(), Command.Type.SINGLE_OUTPUT, true) {
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
    public void executesNoReturn() throws IOException, InterruptedException, ProgramError {
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al", Collections.emptyList(), Command.Type.LIST_OUTPUT, false) {
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
    public void executesProcessDoesNotExitInTime() throws IOException, InterruptedException, ProgramError {
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al", Collections.emptyList(), Command.Type.LIST_OUTPUT, true) {
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
    public void executesProcessWithReferencedVariable() throws IOException, InterruptedException, ProgramError {
        String referencedVariable = "variable";
        String variableValue = "value";
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al | grep '${variable}'", Arrays.asList(referencedVariable), Command.Type.LIST_OUTPUT, true) {
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
    public void executesProcessWithJoinedUpReferencedVariable() throws IOException, InterruptedException, ProgramError {
        String referencedVariable1 = "@var1";
        String referencedVariable2 = "@var2";
        String variableValue1 = "test";
        String variableValue2 = "value";
        Comd comd = new Comd(this.executor, 0, this.vm, "some-${@var1}-command-${@var2}-test", Arrays.asList(referencedVariable1, referencedVariable2), Command.Type.LIST_OUTPUT, true) {
            @Override
            BufferedReader getProcessStream(Process process) {
                return processStream;
            }
        };
        
        when(this.vm.scopeStack()).thenReturn(this.scopeStack);
        when(this.scopeStack.top()).thenReturn(this.scope);
        when(this.scope.valueOf(referencedVariable1)).thenReturn(variableValue1);
        when(this.scope.valueOf(referencedVariable2)).thenReturn(variableValue2);
        when(this.executor.execute("some-test-command-value-test")).thenReturn(this.process);
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
    public void executesProcessWithUndeclaredReferencedVariable() throws IOException, InterruptedException, ProgramError {
        String referencedVariable = "variable";
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al | grep '${variable}'", Arrays.asList(referencedVariable), Command.Type.LIST_OUTPUT, true) {
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

    @Test
    public void executesStandardCommand() throws IOException, InterruptedException, ProgramError {
        Comd comd = new Comd(this.executor, 0, this.vm, "ls -al", Collections.emptyList(), Command.Type.STANDARD, false) {
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
        when(this.process.waitFor(anyLong(), any())).thenReturn(true);
        when(this.process.exitValue()).thenReturn(0);
        when(this.vm.operandStack()).thenReturn(this.operandStack);
        ArgumentCaptor<Object> operandStackCaptor = ArgumentCaptor.forClass(Object.class);
        doNothing().when(this.operandStack).push(operandStackCaptor.capture());
        when(this.vm.console()).thenReturn(this.console);

        comd.doExecute();

        verify(this.vm.console()).write("line1");
        verify(this.vm.console()).write("line2");

        List<Object> pushedValues = operandStackCaptor.getAllValues();
        assertEquals(1, pushedValues.size());
        assertEquals(0f, pushedValues.get(0));
    }
}
