package Day_0426;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(".\\data\\TestFile.txt");
            int result = 0;

            while(true){
                result = fis.read();
                if(result==-1)
                    break;
                System.out.println(result);

                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
