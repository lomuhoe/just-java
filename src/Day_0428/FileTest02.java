package Day_0428;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File(".");

        String[] names = f1.list();

        for(String name : names){
            System.out.println(name);
        }

        File[] files = f1.listFiles();
        for(File file : files){
            System.out.println(file.getName());
        }
    }
}
