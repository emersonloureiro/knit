package execution;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CommandsTest extends ExecutionTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("CommandInForEach.knit").getPath()));
        files.add(new File(getClass().getResource("CommandNoReturn.knit").getPath()));
        files.add(new File(getClass().getResource("CommandWithVariableSpaces.knit").getPath()));
        files.add(new File(getClass().getResource("CommandWithVariable.knit").getPath()));
        files.add(new File(getClass().getResource("SingleOutputCommand.knit").getPath()));
        files.add(new File(getClass().getResource("PlainCommandStdoutByDefault.knit").getPath()));
        files.add(new File(getClass().getResource("CommandStatusCode.knit").getPath()));
        return files;
    }
}
