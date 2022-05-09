package Day_0502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayTest03 {
    public static void main(String[] args) {
        List<Integer> numLists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numLists.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("원본 : " + numLists);
        Collections.sort(numLists);
        System.out.println("오름차순 : " + numLists);
        //Collections.sort(numLists, new Comparator<Integer>() {
        //    public int compare(Integer num1, Integer num2) {
        //        return num2 - num1;
        //    };
        //});
        Collections.sort(numLists, (num1, num2) -> num2 - num1);
        System.out.println("내림차순 : " + numLists);

        List<String> strList = new ArrayList<>();
        strList.add("가방");
        strList.add("컵");
        strList.add("필통");
        strList.add("사람");
        strList.add("자격증");
        strList.add("가위");

        System.out.println("원본 : " + strList);
        Collections.sort(strList);
        System.out.println("오름차순 : " + strList);
        Collections.sort(strList, (str1, str2) -> str2.compareTo(str1));
        System.out.println("내림차순 : " + strList);

        //System.out.println("원본 : " + numLists);
        //System.out.println("오름차순 : " + numLists);
        //System.out.println("내림차순 : " + numLists);

        List<Friend> friends = new ArrayList<>();
        friends.add(new Friend("최인회", 27));
        friends.add(new Friend("유병인", 27));
        friends.add(new Friend("장재혁", 28));
        friends.add(new Friend("장재혁", 24));
        friends.add(new Friend("정주형", 28));
        friends.add(new Friend("박영훈", 27));

        System.out.println("=== 원본 ===");
        friends.forEach(friend -> System.out.println("이름 : " + friend.name + ", 나이 : " + friend.age));

        Collections.sort(friends, (Friend friend1, Friend friend2) -> {
                if(friend1.name.compareTo(friend2.name)!=0)
                    return friend1.name.compareTo(friend2.name);
                else 
                    return friend1.age - friend2.age;
            });
        System.out.println("=== 오름차순 ===");
        friends.forEach(friend -> System.out.println("이름 : " + friend.name + ", 나이 : " + friend.age));

        Collections.sort(friends, (friend1, friend2) -> {
                if(friend1.name.compareTo(friend2.name)!=0)
                    return friend2.name.compareTo(friend1.name);
                else 
                    return friend2.age - friend1.age;
            });
        System.out.println("=== 내림차순 ===");
        friends.forEach(friend -> System.out.println("이름 : " + friend.name + ", 나이 : " + friend.age));
    }
}
