package parsingFailures;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class MathExpressionsTest extends ParsingFailureTest {

    @Override
    public List<File> getFiles() {
        List<File> files = new LinkedList<File>();
        files.add(new File(getClass().getResource("MathExpressions1.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions2.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions3.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions4.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions5.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions6.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions7.knit").getPath()));
        files.add(new File(getClass().getResource("MathExpressions8.knit").getPath()));
        return files;
    }
}
