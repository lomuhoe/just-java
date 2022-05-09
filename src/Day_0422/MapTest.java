package Day_0422;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("00001", new Student(28, "최인회"));
        students.put("00002", new Student(25, "최민수"));
        students.put("00003", new Student(21, "김덕배"));
        students.put("00004", new Student(22, "엄준식"));
        students.put("00005", new Student(23, "홍길동"));
        students.put("00006", new Student(24, "홍순식"));
    
        Iterator<String> keys = students.keySet().iterator();
        while(keys.hasNext()){
            String temp = keys.next();
            System.out.println(temp);
            System.out.println(students.get(temp));
        }
    }
}
