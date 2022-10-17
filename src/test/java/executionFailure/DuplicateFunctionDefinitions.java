package executionFailure;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class DuplicateFunctionDefinitions extends ExecutionFailuresTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("DuplicateFunctionDefinitionMainModule.knit").getPath()));
        return files;
    }
}
