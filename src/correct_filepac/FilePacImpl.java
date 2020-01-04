package correct_filepac;

import correct_filepac.interfaces.FilePac;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FilePacImpl implements FilePac {
    @Override
    public String readAndGetSumOfFiles(File currentFile) throws Exception {

        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<Long>> futureControlSum = new ArrayList<>();

        if (currentFile.isDirectory()) {
            for (File file : currentFile.listFiles()) {
                if (!file.isDirectory() && file.toString().endsWith(".txt")) {
                    futureControlSum.add(service.submit(new FileSumerImpl(file)));
                }
            }

        }

        long controlSum = 0;
        for (Future<Long> fl : futureControlSum) controlSum += fl.get();
        System.out.println("_________________________________________________");
        System.out.println("Sum of all files is: " + controlSum);

        return null;
    }
}
