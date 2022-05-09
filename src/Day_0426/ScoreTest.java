package Day_0426;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<ScoreVO> studentsList = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        String str;

        try {
            fr = new FileReader(".\\data\\Seiseki.txt");
            br = new BufferedReader(fr);

            while ((str=br.readLine())!=null) {
                String[] temp = str.split(" ");
                studentsList.add(new ScoreVO(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));
            }
            ScoreVO[] students = new ScoreVO[studentsList.size()];
            for(int i=0 ; i<studentsList.size() ; i++){
                students[i] = studentsList.get(i);
            }

            for(int i=0 ; i<students.length-1 ; i++){
                for(int j=i+1; j<students.length ; j++){
                    if(students[i].getTotal()<students[j].getTotal()){
                        ScoreVO temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }

            studentsList.clear();
            for(int i=0 ; i<students.length ; i++){
                if(i!=0)
                    if(students[i-1].getTotal()==students[i].getTotal())
                        students[i].setRank(students[i-1].getRank());
                    else    
                        students[i].setRank(i+1);
                studentsList.add(students[i]);
            }

            for(int i=0 ; i<studentsList.size() ; i++){
                System.out.println(studentsList.get(i).toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br!=null)br.close();
                if(fr!=null)fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
