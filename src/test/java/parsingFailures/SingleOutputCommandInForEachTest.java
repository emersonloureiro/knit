package parsingFailures;

import execution.ExecutionTest;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class SingleOutputCommandInForEachTest extends ParsingFailureTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("SingleOutputCommandInForEach.knit").getPath()));
        return files;
    }
}
