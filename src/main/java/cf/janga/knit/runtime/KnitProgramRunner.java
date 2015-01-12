package cf.janga.knit.runtime;

import cf.janga.knit.parser.KnitParser;
import cf.janga.knit.parser.ParsingResult;
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
        ParsingResult result = new KnitParser().parse(knitFile);
        VirtualMachine vm = new VirtualMachine();
        KnitCompiler compiler = new KnitCompiler(vm);
        Program program = compiler.compile(result.getTree());
        vm.execute(program);
    }
}
