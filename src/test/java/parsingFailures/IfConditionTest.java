package parsingFailures;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class IfConditionTest extends ParsingFailureTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("IfCondition.knit").getPath()));
        return files;
    }
}
