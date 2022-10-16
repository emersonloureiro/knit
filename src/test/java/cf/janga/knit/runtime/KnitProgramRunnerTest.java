package cf.janga.knit.runtime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
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
import cf.janga.knit.compiler.CompilationError;
import cf.janga.knit.compiler.KnitCompiler;
import cf.janga.knit.vm.core.Console;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.runtime.RuntimeError;

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
    public void testPrintsStackStraceOnRuntimeError() throws ProgramError {
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
        RuntimeError runtimeError = spy(new RuntimeError("ErrorMessage"));
        doThrow(runtimeError).when(this.vm).execute();

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write(String.format("Runtime error:\n%s: ErrorMessage", runtimeError.getClass().getSimpleName()));
        verify(runtimeError).printStackTrace();
    }

    @Test
    public void testDoesNotPrintStackStraceOnRuntimeError() throws ProgramError {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return false;
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
        RuntimeError runtimeError = spy(new RuntimeError("ErrorMessage"));
        doThrow(runtimeError).when(this.vm).execute();

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write(String.format("Runtime error:\n%s: ErrorMessage", runtimeError.getClass().getSimpleName()));
        verify(runtimeError, never()).printStackTrace();
    }

    @Test
    public void testPrintsStackTraceOnProgramError() throws ProgramError {
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
        ProgramError programError = spy(new ProgramError("ErrorMessage") {});
        doThrow(programError).when(this.vm).execute();

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("Program error:\nErrorMessage");
        verify(programError).printStackTrace();
    }

    @Test
    public void testDoesNotPrintStackTraceOnProgramError() throws ProgramError {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return false;
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
        ProgramError programError = spy(new ProgramError("ErrorMessage") {});
        doThrow(programError).when(this.vm).execute();

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("Program error:\nErrorMessage");
        verify(programError, never()).printStackTrace();
    }

    @Test
    public void testPrintsStackTraceOnCompilationError() throws ProgramError {
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
        CompilationError compilationError = spy(new CompilationError("CompilationError"));
        when(this.compiler.compile(knitTree)).thenThrow(compilationError);

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("Compilation error:\nCompilationError");
        verify(compilationError).printStackTrace();
    }

    @Test
    public void testDoesNotPrintStackTraceOnCompilationError() throws ProgramError {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return false;
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
        CompilationError compilationError = spy(new CompilationError("CompilationError"));
        when(this.compiler.compile(knitTree)).thenThrow(compilationError);

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("Compilation error:\nCompilationError");
        verify(compilationError, never()).printStackTrace();
    }

    @Test
    public void testPrintsStackTraceOnInternalError() throws ProgramError {
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
        RuntimeException runtimeException = mock(RuntimeException.class);
        when(runtimeException.getMessage()).thenReturn("ErrorMessage");
        when(this.compiler.compile(knitTree)).thenThrow(runtimeException);

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("Internal error:\nErrorMessage");
        verify(runtimeException).printStackTrace();
    }

    @Test
    public void testDoesNotPrintStackTraceOnInternalError() throws ProgramError {
        KnitProgramRunner runner = new KnitProgramRunner(this.runtimeFactory) {
            @Override
            boolean getSystemProperty(String key) {
                return false;
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
        RuntimeException runtimeException = mock(RuntimeException.class);
        when(runtimeException.getMessage()).thenReturn("ErrorMessage");
        when(this.compiler.compile(knitTree)).thenThrow(runtimeException);

        int exitCode = runner.run(knitFile, arguments);
        assertEquals(1, exitCode);

        verify(this.vm.console()).write("Internal error:\nErrorMessage");
        verify(runtimeException, never()).printStackTrace();
    }
}
