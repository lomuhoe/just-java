package Day_0422;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(22, "최인회"));
        set.add(new Student(25, "어쩌구"));
        set.add(new Student(26, "저쩌구"));

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set);
    }
}
