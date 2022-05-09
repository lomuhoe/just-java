package Day_0427;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;

public class ObjectInputTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = null;
        
        ois = new ObjectInputStream(new FileInputStream(".\\data\\student.dat"));

        // 다운형변환 클래스 파악되었으니 에러표시 하지말라는 의미
        @SuppressWarnings("unchecked")
        List<Student> list = (List<Student>)ois.readObject();

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        ois.close();
    }
}
