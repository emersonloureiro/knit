package cf.janga.knit.runtime;

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
        KnitCompiler compiler = new KnitCompiler(vm);
        ParsingResult result = new KnitParser().parse(knitFile);
        Program program = compiler.compile(result.getTree());
        vm.execute(program);
    }
}
