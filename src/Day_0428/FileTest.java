package Day_0428;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("Test.java");
        File f2 = new File("D:\\workspace");

        System.out.println("pathSeparator : " + File.pathSeparator);
        System.out.println("separator : " + File.separator);

        System.out.println(f1.exists()); // 파일 존재 여부
        System.out.println(f1.isFile()); // 파일인지?

        System.out.println(f2.exists()); // 존재여부
        System.out.println(f2.isDirectory()); // 디렉토리인지?
        System.out.println(f2.isAbsolute()); // 절대경로인가?

        System.out.println(f1.getName());
        System.out.println(f2.getName());

        System.out.println(f1.getPath());
        System.out.println(f2.getPath());
        System.out.println(f2.getParent());

        File f3 = new File("abc.txt");
        if(!f3.exists()){
            try {
                if(f3.createNewFile())
                    System.out.println("파일이 생성됨");
                else
                    System.out.println("파일 생성 에러");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
