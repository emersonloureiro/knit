package cf.janga.knit.test;

import junit.framework.TestCase;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class BaseKnitTest extends TestCase {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public List<File> getAllKnitFiles(String folder) {
        URL url = getClass().getResource(folder);
        File file = new File(url.getPath());
        if (!file.isDirectory()) {
            fail("A directory should've been passed");
        }
        List<File> knitFiles = new ArrayList<File>();
        File[] files = file.listFiles();
        for (File directoryFile : files) {
            if (directoryFile.getName().endsWith(".knit")) {
                knitFiles.add(directoryFile);
            }
        }
        return knitFiles;
    }

    public void runTestAction(String testFolder, TestAction action) {
        List<File> knitFiles = getAllKnitFiles(testFolder);
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
}
