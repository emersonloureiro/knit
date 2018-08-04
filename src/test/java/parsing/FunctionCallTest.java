package parsing;

import execution.ExecutionTest;
import parsing.ParsingTest;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class FunctionCallTest extends ParsingTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("FunctionCall.knit").getPath()));
        return files;
    }
}
