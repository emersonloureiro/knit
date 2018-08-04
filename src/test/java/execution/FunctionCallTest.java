package execution;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FunctionCallTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("FunctionCallWithConstants.knit").getPath()));
        files.add(new File(getClass().getResource("FunctionCallWithVariables.knit").getPath()));
        files.add(new File(getClass().getResource("FunctionCallNoReturn.knit").getPath()));
        files.add(new File(getClass().getResource("FunctionCallWithCommand.knit").getPath()));
        return files;
    }
}
