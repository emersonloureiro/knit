package cf.janga.knit.test;

import junit.framework.TestCase;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public abstract class BaseKnitTest extends TestCase {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public void test() {
        runTestAction(getFiles(), getTestAction());
    }

    public void runTestAction(List<File> knitFiles, TestAction action) {
        assertTrue(knitFiles.size() > 0);
        for (File knitFile : knitFiles) {
            boolean pass = action.run(knitFile);
            if (!pass) {
                fail(action.failureLogMessage(knitFile.getPath()));
            } else {
                logger.info(action.successLogMessage(knitFile.getPath()));
            }
        }
    }

    public abstract List<File> getFiles();

    public abstract TestAction getTestAction();
}
