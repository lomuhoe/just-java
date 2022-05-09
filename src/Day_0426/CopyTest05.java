package Day_0426;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int temp;
        int cnt = 0;
        byte[] bt = new byte[10000];

        try {
            fis = new FileInputStream(".\\data\\TestImage.webp");
            fos = new FileOutputStream(".\\data\\CopyTest.webp");

            while (true) {
                temp = fis.read(bt);
                if(temp < bt.length)
                    break;

                fos.write(bt);
                cnt++;
            }
            fos.write(bt, 0, temp);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis!=null)fis.close();
                if(fos!=null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cnt);
        System.out.println("작업 완료");
    }
}
