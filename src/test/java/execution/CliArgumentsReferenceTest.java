package execution;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CliArgumentsReferenceTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        URL url = getClass().getResource("CliArgumentsReference.knit");
        files.add(new File(url.getPath()));
        return files;
    }

    public Map<String, String> getArguments() {
        return Map.of("filter", "emerson", "testArg", "testArgValue", "items", "[1,2,3,4,5]");
    }
}
