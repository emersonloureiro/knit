package execution;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CommandAsListForEachTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("CommandAsListForEach.knit").getPath()));
        return files;
    }
}
