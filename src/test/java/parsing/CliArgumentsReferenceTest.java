package parsing;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class CliArgumentsReferenceTest extends ParsingTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        URL url = getClass().getResource("CliArgumentsReference.knit");
        files.add(new File(url.getPath()));
        return files;
    }
}
