package correct_filepac.interfaces;

import java.util.concurrent.Callable;

public interface FileSumer extends Callable<Long> {
    long readSumOfOneFile() throws Exception;
}
