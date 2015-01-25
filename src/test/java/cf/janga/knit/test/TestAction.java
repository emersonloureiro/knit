package cf.janga.knit.test;

import java.io.File;

public interface TestAction {
    String successLogMessage(String path);

    String failureLogMessage(String path);

    boolean run(File knitFile);
}
