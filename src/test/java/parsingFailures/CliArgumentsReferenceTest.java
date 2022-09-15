package parsingFailures;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CliArgumentsReferenceTest extends ParsingFailureTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("CliArgumentsReference1.knit").getPath()));
        files.add(new File(getClass().getResource("CliArgumentsReference2.knit").getPath()));
        files.add(new File(getClass().getResource("CliArgumentsReference3.knit").getPath()));
        return files;
    }
}
