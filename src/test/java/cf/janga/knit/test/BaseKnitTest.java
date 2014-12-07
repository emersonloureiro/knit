package cf.janga.knit.test;

import junit.framework.TestCase;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseKnitTest extends TestCase {

    public List<File> getAllKnitFiles(String folder) {
        URL url = getClass().getResource(folder);
        File file = new File(url.getPath());
        if (!file.isDirectory()) {
            fail("A directory should've been passed");
        }
        List<File> knitFiles = new ArrayList<File>();
        File[] files = file.listFiles();
        for (File directoryFile : files) {
            if (directoryFile.getName().endsWith(".knit")) {
                knitFiles.add(directoryFile);
            }
        }
        return knitFiles;
    }
}
