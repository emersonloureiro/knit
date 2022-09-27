package executionFailure;

import cf.janga.knit.runtime.KnitParser;
import cf.janga.knit.runtime.KnitProgramRunner;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.test.TestAction;

import java.io.File;
import java.util.HashMap;

public abstract class ExecutionFailuresTest extends BaseKnitTest {

    @Override
    public TestAction getTestAction() {
        TestAction testAction = new TestAction() {

            private String _message = "Expected runtime error running file ";

            @Override
            public String successLogMessage(String path) {
                return "File \"" + path + "\" failed running as expected";
            }

            @Override
            public String failureLogMessage(String path) {
                return _message + "\"" + path + "\"";
            }

            @Override
            public boolean run(File knitFile) {
                KnitParser parser = new KnitParser();
                if (!parser.parse(knitFile).success()) {
                    _message = "Failed compiling file ";
                    return false;
                }
                return new KnitProgramRunner().run(knitFile, new HashMap<>()) != 0;
            }
        };
        return testAction;
    }
}
