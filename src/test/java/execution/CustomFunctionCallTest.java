package execution;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CustomFunctionCallTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<>();
        files.add(new File(getClass().getResource("CustomFunctionCall.knit").getPath()));
        return files;
    }
}
