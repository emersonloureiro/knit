package cf.janga.knit.runtime;

import cf.janga.knit.compiler.KnitCompiler;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.ProgramError;
import cf.janga.knit.vm.errors.RuntimeError;

import java.io.File;
import java.util.Map;

public class KnitProgramRunner {

    public KnitProgramRunner() {
    }

    public boolean run(String filePath, Map<String, String> arguments) {
        return run(new File(filePath), arguments);
    }

    public boolean run(File knitFile, Map<String, String> arguments) {
        VirtualMachine vm = new VirtualMachine(arguments);
        ParsingResult result = new KnitParser().parse(knitFile);
        Program program = new KnitCompiler(vm).compile(result.getTree());
        String printInstructions = System.getProperty(RuntimeProperties.PRINT_INSTRUCTIONS);
        if (printInstructions != null && printInstructions.equals("true")) {
            vm.console().write("========== PROGRAM INSTRUCTIONS ==========");
            vm.console().write(program.toString());
            vm.console().write("==========================================");
        }
        try {
            vm.execute(program);
            return true;
        } catch (RuntimeError runtimeError) {
            vm.console().write(runtimeError.getErrorType() + ": " + runtimeError.getMessage() + ".");
        } catch (ProgramError programError) {
            vm.console().write("Program error: " + programError.getMessage() + ".");
        } catch (Exception e) {
            vm.console().write("Internal error on the virtual machine: \"" + e.getMessage() + "\".");
        }
        return false;
    }
}
