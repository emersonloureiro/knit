package cf.janga.knit.runtime;

import cf.janga.knit.compiler.CompilationError;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.runtime.RuntimeError;

import java.io.File;
import java.util.Map;

public class KnitProgramRunner {

    boolean printInstructions;

    boolean privateStackTrace;

    private RuntimeFactory runtimeFactory;

    public KnitProgramRunner(RuntimeFactory runtimeFactory) {
        this.printInstructions = getSystemProperty(RuntimeProperties.PRINT_INSTRUCTIONS);
        this.privateStackTrace = getSystemProperty(RuntimeProperties.PRINT_STACK_TRACE);
        this.runtimeFactory = runtimeFactory;
    }

    public int run(String filePath, Map<String, String> arguments) {
        return run(new File(filePath), arguments);
    }

    boolean getSystemProperty(String key) {
        String value = System.getProperty(key);
        if (value != null && value.equals("true")) {
            return true;
        }
        return false;
    }

    public int run(File knitFile, Map<String, String> arguments) {
        VirtualMachine vm = this.runtimeFactory.newVirtualMachine(arguments);
        ParsingResult result = this.runtimeFactory.newParser().parse(knitFile);

        try {
            Program program = this.runtimeFactory.newCompiler(vm).compile(result.getTree());
            if (this.printInstructions) {
                vm.console().write("========== PROGRAM INSTRUCTIONS ==========");
                vm.console().write(program.toString());
                vm.console().write("==========================================");
            }

            vm.loadInstructions(program.getMainFunction(), program.startInstruction());
            vm.execute();
            return vm.getExitCode();
        } catch (RuntimeError runtimeError) {
            vm.console().write(runtimeError.getMessage());
            if (this.privateStackTrace) {
                runtimeError.printStackTrace();
            }
        } catch (ProgramError programError) {
            vm.console().write(programError.getMessage());
            if (this.privateStackTrace) {
                programError.printStackTrace();
            }
        } catch (CompilationError compilationError) {
            vm.console().write(compilationError.getMessage());
            if (this.privateStackTrace) {
                compilationError.printStackTrace();
            }
        } catch (Exception e) {
            vm.console().write("Internal error:\n" + e.getMessage());
            if (this.privateStackTrace) {
                e.printStackTrace();
            }
        }
        return 1;
    }
}
