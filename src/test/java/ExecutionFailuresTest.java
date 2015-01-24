import cf.janga.knit.runtime.KnitParser;
import cf.janga.knit.runtime.KnitProgramRunner;
import cf.janga.knit.runtime.ParsingResult;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.vm.core.RuntimeError;

import java.io.File;
import java.util.List;

public class ExecutionFailuresTest extends BaseKnitTest {

    public void test() {
        List<File> knitFiles = getAllKnitFiles("execution-failures");
        for (File knitFile : knitFiles) {
            KnitParser parser = new KnitParser();
            ParsingResult result = parser.parse(knitFile);

            if (!result.success()) {
                fail("Failed parsing " + knitFile.getPath());
            }

            try {
                new KnitProgramRunner().run(knitFile);
                fail("RuntimeError should've been thrown");
            } catch (RuntimeError e) {
            }
        }
    }
}
