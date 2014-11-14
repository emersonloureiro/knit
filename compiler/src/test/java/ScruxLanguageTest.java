import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import junit.framework.TestCase;

public class ScruxLanguageTest extends TestCase {

	private static final Logger LOGGER = Logger.getLogger(ScruxLanguageTest.class.getName());

	public void testBasicSyntax() throws Exception {
		ScruxParser parser = new ScruxParser();
		List<String> scruxFiles = getAllScruxFiles("basic");
		assertTrue(scruxFiles.size() > 0);
		for (String scruxFile : scruxFiles) {
			ParsingResult result = parser.parse(new File(scruxFile));
			assertSuccessfulParsing(scruxFile, result.success());
		}
	}

	private void assertSuccessfulParsing(String filePath, boolean result) {
		if (!result) {
			fail("Failed parsing for file: \"" + filePath + "\"");
		}
		LOGGER.info("File \"" + filePath + "\" parsed successfully...");
	}

	private List<String> getAllScruxFiles(String folder) {
		URL url = getClass().getResource(folder);
		File file = new File(url.getPath());
		if (!file.isDirectory()) {
			fail("A directory should've been passed");
		}
		List<String> fooFiles = new ArrayList<String>();
		File[] files = file.listFiles();
		for (File directoryFile : files) {
			if (directoryFile.getName().endsWith(".scrux")) {
				fooFiles.add(directoryFile.getPath());
			}
		}
		return fooFiles;
	}
}
