import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import cf.janga.knit.test.BaseKnitTest;
import cf.janga.knit.tools.KnitParser;
import cf.janga.knit.tools.ParsingResult;

public class CompilationTest extends BaseKnitTest {

	private static final Logger LOGGER = Logger.getLogger(CompilationTest.class.getName());

	public void test() throws Exception {
		KnitParser parser = new KnitParser();
		List<File> knitFiles = getAllKnitFiles("basic");
		assertTrue(knitFiles.size() > 0);
		for (File knitFile : knitFiles) {
			ParsingResult result = parser.parse(knitFile);
			assertSuccessfulParsing(knitFile.getPath(), result.success());
		}
	}

	private void assertSuccessfulParsing(String filePath, boolean result) {
		if (!result) {
			fail("Failed parsing for file: \"" + filePath + "\"");
		}
		LOGGER.info("File \"" + filePath + "\" parsed successfully...");
	}

}
