package execution;

import cf.janga.knit.runtime.KnitParser;
import cf.janga.knit.runtime.KnitProgramRunner;
import cf.janga.knit.runtime.ParsingResult;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.test.TestAction;

import java.io.File;

public abstract class ExecutionTest extends BaseKnitTest {

    @Override
    public TestAction getTestAction() {
        TestAction testAction = new TestAction() {
            public String _failureMessage = "Failed executing file ";

            @Override
            public String successLogMessage(String path) {
                return "Successfully executed file \"" + path + "\"";
            }

            @Override
            public String failureLogMessage(String path) {
                return _failureMessage + "\"" + path + "\"";
            }

            @Override
            public boolean run(File knitFile) {
                KnitParser parser = new KnitParser();
                ParsingResult result = parser.parse(knitFile);
                if (!result.success()) {
                    _failureMessage = "Failed parsing ";
                    return false;
                }
                return new KnitProgramRunner().run(knitFile);
            }
        };
        return testAction;
    }
}
