package correct_filepac.interfaces;

import java.io.File;

public interface FilePac {
    long readSumOfFilesInDirectory(File currentFile) throws Exception;
}
