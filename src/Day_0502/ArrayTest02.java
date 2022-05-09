package Day_0502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayTest02 {
    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();
        friends.add(new Friend("유병인", 27));
        friends.add(new Friend("장재혁", 28));
        friends.add(new Friend("정주형", 28));
        friends.add(new Friend("박영훈", 27));
        friends.forEach(friend -> System.out.println("이름 : " + friend.name + ", 나이 : " + friend.age));

        List<Friend> friends2 = Arrays.asList(new Friend("홍길동", 14), new Friend("홍길이", 15), new Friend("홍길삼", 16));
        // friends2.add(new Friend("홍길사", 17)); Arrays.asList로 넣으면 추가 수정, 삭제는 안됨.
        friends2.forEach(friend -> System.out.println("이름 : " + friend.name + ", 나이 : " + friend.age));

        // ==========================================================================

        int[] iarr = new int[] { 6, 3, 7, 9, 1, 3, 0, 5, 7, 10 };
        int[] iarr2 = iarr;

        System.out.println(Arrays.toString(iarr));
        iarr[0] = 100;

        System.out.println(iarr[0]);
        System.out.println(iarr2[0]);

        int[] iarr3 = Arrays.copyOf(iarr, iarr.length);
        System.out.println(Arrays.toString(iarr3));

        System.out.println(iarr + ", " + iarr2 + ", " + iarr3);

        // ==========================================================================

        int[] iarr4 = Arrays.copyOf(iarr, 5);
        System.out.println(Arrays.toString(iarr4));
        int[] iarr5 = Arrays.copyOf(iarr, 15);
        System.out.println(Arrays.toString(iarr5));

        // ==========================================================================

        int[] iarr6 = new int[10];
        Arrays.fill(iarr6, 8);

        System.out.println(Arrays.toString(iarr6));
        Arrays.setAll(iarr6, i -> (int) (Math.random() * 45 + 1));

        System.out.println("정렬 전 : " + Arrays.toString(iarr6));
        Arrays.sort(iarr6);
        System.out.println("정렬 후 : " + Arrays.toString(iarr6));

        Integer[] iarr7 = new Integer[8];
        Arrays.setAll(iarr7, (i) -> (int) (Math.random() * 45 + 1));
        System.out.println("정렬 전 : " + Arrays.toString(iarr7));
        // Arrays.sort(iarr7, new Comparator<Integer>() {
        //    public int compare(Integer num1, Integer num2) {
        //        return num2 - num1;
        //    };
        // });
        Arrays.sort(iarr7, (num1, num2) -> num2 - num1);
        System.out.println("정렬 후 : " + Arrays.toString(iarr7));
    }
}
