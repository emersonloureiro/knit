package parsingFailures;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SpacesOnVariableNamesTest extends ParsingFailureTest {
    @Override
    public List<File> getFiles() {
        List<File> files = new ArrayList<File>();
        files.add(new File(getClass().getResource("SpacesOnVariableNames.knit").getPath()));
        return files;
    }
}
