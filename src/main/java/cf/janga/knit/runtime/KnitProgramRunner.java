package cf.janga.knit.runtime;

import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.RuntimeError;
import cf.janga.knit.vm.errors.program.ProgramError;

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
        Program program = this.runtimeFactory.newCompiler(vm).compile(result.getTree());
        if (this.printInstructions) {
            vm.console().write("========== PROGRAM INSTRUCTIONS ==========");
            vm.console().write(program.toString());
            vm.console().write("==========================================");
        }
        try {
            vm.execute(program);
            return vm.getExitCode();
        } catch (RuntimeError runtimeError) {
            vm.console().write(runtimeError.getErrorType() + ": " + runtimeError.getMessage() + ".");
            if (this.privateStackTrace) {
                runtimeError.printStackTrace();
            }
        } catch (ProgramError programError) {
            vm.console().write("ProgramError: " + programError.getMessage() + ".");
            if (this.privateStackTrace) {
                programError.printStackTrace();
            }
        } catch (Exception e) {
            vm.console().write("Internal error on the virtual machine: \"" + e.getMessage() + "\".");
            if (this.privateStackTrace) {
                e.printStackTrace();
            }
        }
        return 1;
    }
}
