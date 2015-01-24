import cf.janga.knit.runtime.KnitParser;
import cf.janga.knit.runtime.ParsingResult;
import cf.janga.knit.test.BaseKnitTest;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class ParsingFailuresTest extends BaseKnitTest {

	private static final Logger LOGGER = Logger.getLogger(ParsingFailuresTest.class.getName());

	public void test() throws Exception {
		KnitParser parser = new KnitParser();
		List<File> knitFiles = getAllKnitFiles("parsing-failures");
		assertTrue(knitFiles.size() > 0);
		for (File knitFile : knitFiles) {
			ParsingResult result = parser.parse(knitFile);
			assertSuccessfulParsing(knitFile.getPath(), result.success());
		}
	}

	private void assertSuccessfulParsing(String filePath, boolean result) {
		if (result) {
			fail("Failed parsing for file: \"" + filePath + "\"");
		}
		LOGGER.info("File \"" + filePath + "\" failed parsing successfully...");
	}
}
