package Day_0427;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputTest {
    public static void main(String[] args) {
        ObjectOutputStream oStream = null;
        try {
            oStream = new ObjectOutputStream(new FileOutputStream("student.dat"));

            List<Student> list = new ArrayList<>();

            list.add(new Student("최인회", 28));
            list.add(new Student("최일군", 34));
            list.add(new Student("최이희",36));
            list.add(new Student("최삼자",37));
            list.add(new Student("최사후", 35));
            
            oStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oStream!=null)
                    oStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
