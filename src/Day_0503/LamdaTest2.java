package Day_0503;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaTest2 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for(int i=0 ; i<10 ; i++){
            numList.add((int)(Math.random()*100) + 1);
        }
        System.out.println(" ================ 원본 ================ ");
        numList.forEach(num -> System.out.print(num + "  "));

        numList.removeIf(num -> num%2==0); // List안의 짝수는 삭제해라 (리턴값이 true면 삭제됨)

        System.out.println();
        System.out.println(" ================ 짝수 삭제 ================ ");
        numList.forEach(num -> System.out.print(num + "  "));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "한국");
        map.put(2, "일본");
        map.put(3, "미국");
        map.put(4, "그 나라");
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
