package cf.janga.knit.test.e2e;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class ExitE2ETest extends E2ETest {

    public int getExpectedExitCode() {
        return 3;
    }

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        URL url = getClass().getResource("Exit.knit");
        files.add(new File(url.getPath()));
        return files;
    }
}
