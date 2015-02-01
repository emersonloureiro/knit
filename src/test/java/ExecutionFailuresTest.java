import cf.janga.knit.runtime.KnitParser;
import cf.janga.knit.runtime.KnitProgramRunner;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.test.TestAction;

import java.io.File;

public class ExecutionFailuresTest extends BaseKnitTest {

    public void test() {
        TestAction testAction = new TestAction() {

            @Override
            public String successLogMessage(String path) {
                return "File \"" + path + "\" failed running as expected";
            }

            @Override
            public String failureLogMessage(String path) {
                return "Expected runtime error running file \"" + path + "\"";
            }

            @Override
            public boolean run(File knitFile) {
                KnitParser parser = new KnitParser();
                parser.parse(knitFile);
                return !new KnitProgramRunner().run(knitFile);
            }
        };

        runTestAction("execution-failures", testAction);
    }
}
