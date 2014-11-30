import cf.janga.knit.tools.KnitParser;
import cf.janga.knit.tools.KnitProgramBuilder;
import cf.janga.knit.tools.ParsingResult;
import junit.framework.TestCase;

import java.io.File;
import java.net.URL;

public class KnitProgramBuilderTest extends TestCase {

    public void testBasicExecution() {
        File knitFile = getKnitFile("BasicFile.knit");
        KnitParser parser = new KnitParser();
        ParsingResult result = parser.parse(knitFile);

        if (!result.success()) {
            fail("Failed parsing " + knitFile.getPath());
        }

        KnitProgramBuilder runtime = new KnitProgramBuilder();
        runtime.build(result.getTree()).execute();
    }

    private File getKnitFile(String fileName) {
        URL url = getClass().getResource("basic/" + fileName);
        return new File(url.getPath());
    }
}
