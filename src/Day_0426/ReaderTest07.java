package Day_0426;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest07 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(".\\data\\Seiseki.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        
        while ((str=br.readLine())!=null) {
            String[] content = str.split(" ");
            int kor = Integer.parseInt(content[1]);
            int eng = Integer.parseInt(content[2]);

            System.out.println("이름 : " + content[0] + ", 합계 : " + (kor+eng) + ", 평균 : " + ((kor+eng)/(double)2));
        }

        if(br!=null) br.close();
        if(fr!=null) fr.close();
    }
}
