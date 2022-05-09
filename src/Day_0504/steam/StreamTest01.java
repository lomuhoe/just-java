package Day_0504.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {
    public static void main(String[] args) {
        // Stream : 배열, 자료구조에서 데이터를 일관적으로 접근해서 사용하기 위한 문법
        // 데이터를 읽기만 함. 원본에 접근하지 않으므로 Stream 처리가 끝나면 다시 생성해야함
        // 스트림 생성 -> 중간연산 메소드(반복가능) -> 최종연산(스트림 닫힘)

        // 중간연산
        // 필터링 : filter, distinct
        // 변환 : map, flatMap
        // 제한 : limit
        // 정렬 : sorted
        // 출력 : peek

        // 최종연산 
        // 출력 : forEach
        // 통계 : count, sum, average
        // 소모 : reduce
        // 검색 : findFirst, findAny
        // 수집 : collect
        List<Integer> ilist = Arrays.asList(5, 2, 1, 9, 6, 3);
        Stream<Integer> istrm = ilist.stream();

        istrm.forEach(num -> System.out.println(num));

        System.out.println("─────────────────────────────");

        String[] strArray = {"korean", "japan", "canada", "china", "america"};
        Stream<String> strStream = Stream.of(strArray);

        strStream.forEach(str -> System.out.println(str));

        Integer[] iary1 = {1, 3, 5, 7, 20};
        Stream<Integer> tStream01 = Arrays.stream(iary1);
        tStream01.forEach(num -> System.out.print(num + " "));
        System.out.println();
        Stream<Integer> tmp1  = Stream.of(iary1);
        //long cnt =   tmp1.count();
        //System.out.println("개수 : " + cnt);
        int total;
        //total = tmp1.count(); tmp1는 Integer(객체)의 배열이라 합계, 평균 같은 메소드를 사용할 수 없음

        int[] iary2 = {1, 3, 5, 7, 2};
        IntStream istrm3 = Arrays.stream(iary2);
        System.out.println("평균 : " + istrm3.average());

        istrm3 = Arrays.stream(iary2);
        //istrm3.forEach(num -> System.out.println(num));
        total = istrm3.sum(); // istrm3는 int의 배열이라 합계 평균을 사용할수있음
        System.out.println("total : " + total);

    }
}
