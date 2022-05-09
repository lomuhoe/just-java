package Day_0422;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set);

        set.add("서울");
        set.add("인천");
        set.add("제주");
        set.add("광주");
        set.add("부산");

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set);

        Iterator itor = set.iterator();
        while (itor.hasNext()) {
            System.out.println(itor.next());
        }
    }
}
