package cf.janga.knit.test.e2e;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BasicE2ETest extends E2ETest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        URL url = getClass().getResource("BasicE2E.knit");
        files.add(new File(url.getPath()));
        return files;
    }

    public Map<String, String> getArguments() {
        return Map.of("arg1", "emerson", "arg3", "testArgValue", "items", "[1,2,3,4,5]");
    }
}
