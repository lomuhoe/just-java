package Day_0426;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        Scanner scan = new Scanner(System.in);
        byte[] bt;

        try {
            System.out.print("입력할 내용 : ");
            String str = scan.nextLine();
            str = "\n".concat(str);
            bt = str.getBytes();
            fos = new FileOutputStream(".\\data\\TestFile.txt", true);

            fos.write(bt);
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
        System.out.println("OWATA");
    }
}
