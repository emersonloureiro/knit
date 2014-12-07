import cf.janga.knit.runtime.KnitProgramRunner;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.parser.KnitParser;
import cf.janga.knit.runtime.KnitCompiler;
import cf.janga.knit.parser.ParsingResult;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;

import java.io.File;
import java.util.List;

public class ExecutionTest extends BaseKnitTest {

    public void test() {
        List<File> knitFiles = getAllKnitFiles("execution");
        for (File knitFile : knitFiles) {
            KnitParser parser = new KnitParser();
            ParsingResult result = parser.parse(knitFile);

            if (!result.success()) {
                fail("Failed parsing " + knitFile.getPath());
            }

            new KnitProgramRunner().run(knitFile);
        }
    }
}
