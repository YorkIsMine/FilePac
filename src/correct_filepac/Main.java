package correct_filepac;

import correct_filepac.interfaces.FilePac;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Main {
    // C:\Users\vlada\Desktop
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FilePac filePac = new FilePacImpl();
        filePac.readAndGetSumOfFiles(new File(reader.readLine()));
    }
}
