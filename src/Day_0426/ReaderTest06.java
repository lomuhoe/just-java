package Day_0426;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest06 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        fr = new FileReader(".\\data\\CopyFile.txt");
        fw = new FileWriter(".\\data\\TempText.txt");

        int result = 0;
        while ((result=fr.read())!=-1) {
            fw.write(result);
        }

        if(fr!=null) fr.close();
        if(fw!=null) fw.close();
    }
}
