package cf.janga.knit.test.e2e;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CommandWithArgumentReferences extends E2ETest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        URL url = getClass().getResource("CommandWithArgumentReferences.knit");
        files.add(new File(url.getPath()));
        return files;
    }

    public Map<String, String> getArguments() {
        return Map.of("code", "1", "processName", "a");
    }
}
