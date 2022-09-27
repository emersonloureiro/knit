package cf.janga.knit.test.e2e;

import cf.janga.knit.runtime.KnitRuntime;
import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.test.TestAction;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class E2ETest extends BaseKnitTest {

    public Map<String, String> getArguments() {
        return new HashMap<>();
    }

    public int getExpectedExitCode() {
        return 0;
    }

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
                KnitRuntime runtime = new KnitRuntime();
                String[] arguments = new String[(E2ETest.this.getArguments().size() * 2) + 1];
                arguments[0] = knitFile.getAbsolutePath();
                int index = 1;
                for (Map.Entry<String, String> entry : E2ETest.this.getArguments().entrySet()) {
                    arguments[index++] = "--" + entry.getKey();
                    arguments[index++] = entry.getValue();
                }
                int exitCode = runtime.run(arguments);
                return exitCode == getExpectedExitCode();
            }
        };
        return testAction;
    }
}
