package Day_0503;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Day_0503.example.Score;

public class SortTest01 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("원본 : " + numList);

        Collections.sort(numList);
        System.out.println("오름차순 : " + numList);

        List<String> strList = Arrays.asList("이순신", "세종대왕" , "광개토대왕", "아무튼 엄청남", "허준" , "최인회");
        System.out.println("원본 : " + strList);

        Collections.sort(strList, (str1, str2) -> str2.compareTo(str1));
        System.out.println("오름차순 : " + strList);

        List<Score> students = Arrays.asList(new Score("sunsinLee", "이순신", 300), new Score("kingSejong", "세종대왕", 350), new Score("VeryKing", "광개토대왕", 270),
        new Score("junHua", "허준", 360), new Score("chei", "최인회", 310));
        System.out.println(" ==== 원본 ==== ");
        students.forEach(student -> System.out.println(student));

        Collections.sort(students);
        System.out.println(" ==== 이름의 오름차순 ==== ");
        students.forEach(student -> System.out.println(student));

        Collections.sort(students, (student1, student2) -> student2.getTotal()-student1.getTotal());
        System.out.println(" ==== 점수의 내림차순 ==== ");
        students.forEach(student -> System.out.println(student));
    }
}
