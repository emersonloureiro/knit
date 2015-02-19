package execution;

import parsing.ParsingTest;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class BooleanExpressionsTest extends ParsingTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("BooleanExpressions.knit").getPath()));
        return files;
    }
}
