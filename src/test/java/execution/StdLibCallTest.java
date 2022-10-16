package execution;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class StdLibCallTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("StdLibCallWithConstants.knit").getPath()));
        files.add(new File(getClass().getResource("StdLibCallWithVariables.knit").getPath()));
        files.add(new File(getClass().getResource("StdLibCallNoReturn.knit").getPath()));
        files.add(new File(getClass().getResource("StdLibCallWithCommand.knit").getPath()));
        return files;
    }
}
