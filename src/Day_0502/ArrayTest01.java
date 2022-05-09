package Day_0502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest01 {
    public static void main(String[] args) {
        List<String> slist = new ArrayList<>();
        slist.add("대한민국");
        slist.add("미국");

        slist.forEach(str -> System.out.println(str));

        // 이렇게 선언하면 read만 가능하고 수정은 불가능
        List<String> slist2 = Arrays.asList("Korea", "America");

        slist2.forEach(str -> System.out.println(str));

        List<Integer> ilist = Arrays.asList(5, 3, 6, 8, 3, 1);
        slist2.forEach(num -> System.out.println(num));
    }
}
