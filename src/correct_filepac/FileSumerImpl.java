package correct_filepac;

import correct_filepac.interfaces.Counter;
import correct_filepac.interfaces.FileSumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileSumerImpl implements FileSumer {
    private File file;

    public FileSumerImpl(File file) {
        this.file = file;
    }

    @Override
    public long readSumOfOneFile() throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
        StringBuffer sb = new StringBuffer();
        if (file.exists()) {
            String str = null;
            while (true) {
                if ((str = reader.readLine()) == null) break;
                sb.append(str);
                sb.append("\n");
            }
        } else throw new FileNotFoundException("File not found");


        System.out.print("Sum of " + file.getName() + " is: ");
        Counter counter = new CounterImpl();

        return counter.countSum(sb.toString());
    }

    @Override
    public Long call() throws Exception {
        long res = readSumOfOneFile();
        System.out.println(res);
        return res;
    }
}
