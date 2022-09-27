package cf.janga.knit.runtime;

import cf.janga.knit.compiler.KnitCompiler;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.ProgramError;
import cf.janga.knit.vm.errors.RuntimeError;

import java.io.File;
import java.util.Map;

public class KnitProgramRunner {

    private boolean printInstructions;

    private boolean privateStackTrace;

    public KnitProgramRunner() {
        this.printInstructions = getSystemProperty(RuntimeProperties.PRINT_INSTRUCTIONS);
        this.privateStackTrace = getSystemProperty(RuntimeProperties.PRINT_STACK_TRACE);
    }

    public int run(String filePath, Map<String, String> arguments) {
        return run(new File(filePath), arguments);
    }

    private boolean getSystemProperty(String key) {
        String value = System.getProperty(key);
        if (value != null && value.equals("true")) {
            return true;
        }
        return false;
    }

    public int run(File knitFile, Map<String, String> arguments) {
        VirtualMachine vm = new VirtualMachine(arguments);
        ParsingResult result = new KnitParser().parse(knitFile);
        Program program = new KnitCompiler(vm).compile(result.getTree());
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
            vm.console().write("Program error: " + programError.getMessage() + ".");
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
