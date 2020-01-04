package correct_filepac.interfaces;

import java.io.File;

public interface FilePac {
    String readAndGetSumOfFiles(File currentFile) throws Exception;
}
