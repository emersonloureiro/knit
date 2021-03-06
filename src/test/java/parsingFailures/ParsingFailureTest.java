package parsingFailures;

import cf.janga.knit.runtime.KnitParser;
import cf.janga.knit.runtime.ParsingResult;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.test.TestAction;

import java.io.File;

public abstract class ParsingFailureTest extends BaseKnitTest {

    @Override
    public TestAction getTestAction() {
        TestAction testAction = new TestAction() {
            @Override
            public String successLogMessage(String path) {
                return "File \"" + path + "\" failed parsing successfully...";
            }

            @Override
            public String failureLogMessage(String path) {
                return "Should've failed parsing file: \"" + path + "\"";
            }

            @Override
            public boolean run(File knitFile) {
                KnitParser parser = new KnitParser();
                ParsingResult result = parser.parse(knitFile);
                return !result.success();
            }
        };
        return testAction;
    }
}
