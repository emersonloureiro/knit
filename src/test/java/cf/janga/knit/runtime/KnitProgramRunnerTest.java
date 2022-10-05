package cf.janga.knit.runtime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.antlr.KnitLanguageParser.KnitProgramContext;
import cf.janga.knit.compiler.KnitCompiler;
import cf.janga.knit.vm.core.Console;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.ProgramError;
import cf.janga.knit.vm.errors.RuntimeError;

@RunWith(MockitoJUnitRunner.class)
public class KnitProgramRunnerTest {

    @Mock
    private RuntimeFactory runtimeFactory;

    @Mock
    private VirtualMachine vm;

    @Mock
    private Console console;

    @Mock
    private KnitParser parser;

    @Mock
    private KnitCompiler compiler;
    
    @Test
    public void testPrintsInstructions() {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return key.equals(RuntimeProperties.PRINT_INSTRUCTIONS);
            }
        };

        Map<String, String> arguments = new HashMap<>();
        when(this.runtimeFactory.newVirtualMachine(arguments)).thenReturn(this.vm);
        when(this.vm.console()).thenReturn(this.console);
        when(this.vm.getExitCode()).thenReturn(123);
        when(this.runtimeFactory.newParser()).thenReturn(this.parser);

        File knitFile = new File("knit.knit");
        ParsingResult parsingResult = mock(ParsingResult.class);
        KnitProgramContext knitTree = mock(KnitProgramContext.class);
        when(parsingResult.getTree()).thenReturn(knitTree);
        when(this.parser.parse(knitFile)).thenReturn(parsingResult);

        when(this.runtimeFactory.newCompiler(this.vm)).thenReturn(this.compiler);
        Program program = mock(Program.class);
        when(this.compiler.compile(knitTree)).thenReturn(program);
        when(program.toString()).thenReturn("program");

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(123, exitCode);

        verify(this.vm.console()).write("========== PROGRAM INSTRUCTIONS ==========");
        verify(this.vm.console()).write("program");
        verify(this.vm.console()).write("==========================================");
    }
    
    @Test
    public void testPrintsStackStraceOnRuntimeError() {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return key.equals(RuntimeProperties.PRINT_STACK_TRACE);
            }
        };

        Map<String, String> arguments = new HashMap<>();
        when(this.runtimeFactory.newVirtualMachine(arguments)).thenReturn(this.vm);
        when(this.vm.console()).thenReturn(this.console);
        when(this.runtimeFactory.newParser()).thenReturn(this.parser);

        File knitFile = new File("knit.knit");
        ParsingResult parsingResult = mock(ParsingResult.class);
        KnitProgramContext knitTree = mock(KnitProgramContext.class);
        when(parsingResult.getTree()).thenReturn(knitTree);
        when(this.parser.parse(knitFile)).thenReturn(parsingResult);

        when(this.runtimeFactory.newCompiler(this.vm)).thenReturn(this.compiler);
        Program program = mock(Program.class);
        when(this.compiler.compile(knitTree)).thenReturn(program);
        RuntimeError runtimeError = mock(RuntimeError.class);
        when(runtimeError.getErrorType()).thenReturn("ErrorType");
        when(runtimeError.getMessage()).thenReturn("ErrorMessage");
        doThrow(runtimeError).when(this.vm).execute(program);

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("ErrorType: ErrorMessage.");
        verify(runtimeError).printStackTrace();
    }
    
    @Test
    public void testPrintsStackStraceOnProgramError() {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return key.equals(RuntimeProperties.PRINT_STACK_TRACE);
            }
        };

        Map<String, String> arguments = new HashMap<>();
        when(this.runtimeFactory.newVirtualMachine(arguments)).thenReturn(this.vm);
        when(this.vm.console()).thenReturn(this.console);
        when(this.runtimeFactory.newParser()).thenReturn(this.parser);

        File knitFile = new File("knit.knit");
        ParsingResult parsingResult = mock(ParsingResult.class);
        KnitProgramContext knitTree = mock(KnitProgramContext.class);
        when(parsingResult.getTree()).thenReturn(knitTree);
        when(this.parser.parse(knitFile)).thenReturn(parsingResult);

        when(this.runtimeFactory.newCompiler(this.vm)).thenReturn(this.compiler);
        Program program = mock(Program.class);
        when(this.compiler.compile(knitTree)).thenReturn(program);
        ProgramError programError = mock(ProgramError.class);
        when(programError.getMessage()).thenReturn("ErrorMessage");
        doThrow(programError).when(this.vm).execute(program);

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("ProgramError: ErrorMessage.");
        verify(programError).printStackTrace();
    }
}
