package cf.janga.knit.runtime;

import cf.janga.knit.runtime.compiler.KnitCompiler;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;

import java.io.File;

public class KnitProgramRunner {

    public KnitProgramRunner() {
    }

    public void run(String filePath) {
        run(new File(filePath));
    }

    public void run(File knitFile) {
        VirtualMachine vm = new VirtualMachine();
        ParsingResult result = new KnitParser().parse(knitFile);
        Program program = new KnitCompiler(vm).compile(result.getTree());
        String printInstructions = System.getProperty(RuntimeProperties.PRINT_INSTRUCTIONS);
        if (printInstructions != null && printInstructions.equals("true")) {
            System.out.println("========== PROGRAM INSTRUCTIONS ==========");
            System.out.println(program);
            System.out.println("==========================================");
        }
        vm.execute(program);
    }
}
