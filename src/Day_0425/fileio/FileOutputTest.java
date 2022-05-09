package Day_0425.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        byte[] bt = {65, 66, 67, 38, 68};

        try {
            fos = new FileOutputStream(".\\data\\TestFile.txt");
            
            fos.write(bt);

            System.out.println("output 작업 완료");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
