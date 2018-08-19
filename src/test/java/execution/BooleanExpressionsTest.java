package execution;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class BooleanExpressionsTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("BooleanExpressions.knit").getPath()));
        files.add(new File(getClass().getResource("ComplexBooleanExpressions.knit").getPath()));
        return files;
    }
}
