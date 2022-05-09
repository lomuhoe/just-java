package Day_0426;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyTest03 {
    public static void main(String[] args) {
        // 한글파일 깨지지않게 읽어오는법
        FileInputStream fis = null;
        InputStreamReader istreamReader = null;
        BufferedReader br = null;
        // 한글파일 깨지지않게 저장하는법
        FileOutputStream fos = null;
        OutputStreamWriter oStreamWriter = null;
        BufferedWriter bw = null;
        String[] members = {"","최인회", "박영훈", "박준모", "김기웅", "김종찬", "유병인", "이승우", "이주학", "장재혁", "정주형"};
        String str;
        String txt = "";

        try {
            fis = new FileInputStream(".\\data\\TestText.txt");
            istreamReader = new InputStreamReader(fis);
            br = new BufferedReader(istreamReader);

            fos = new FileOutputStream(".\\data\\TestText2.txt");
            oStreamWriter = new OutputStreamWriter(fos);
            bw = new BufferedWriter(oStreamWriter);

            while ((str = br.readLine())!=null) {
                txt = txt.concat(str);
            }

            String[] line = txt.split(";");
            String[][] content = new String[line.length][];
            for(int i=0 ; i<line.length ; i++){
                content[i] = line[i].split(",");
            }
            for(int i=0 ; i<content.length ; i++){
                for(int j=0 ; j<content[i].length ; j++){
                    if(j==content[i].length-1)
                        System.out.print(content[i][j] + "\n");
                    else
                    System.out.print(content[i][j] + "      ");
                }
            }

            for(int i=0 ; i<content.length ; i++){
                for(int j=0 ; j<content[i].length ; j++){
                    if(j==content[i].length-1)
                        bw.write(content[i][j]+";\n");
                    else
                        bw.write(content[i][j] + ",");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br!=null) br.close();
                if(istreamReader!=null) istreamReader.close();
                if(fis!=null) fis.close();
                if(bw!=null) bw.close();
                if(oStreamWriter!=null) oStreamWriter.close();
                if(fos!=null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("작업 완료");
    }
}
