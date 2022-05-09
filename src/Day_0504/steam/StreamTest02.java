package Day_0504.steam;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {
        IntStream is1 = IntStream.of(5, 7, 2, 4, 5, 4, 1, 3 ,2);
        is1.distinct().forEach(num -> System.out.print(num +" "));
        System.out.println();

        is1 = IntStream.of(5, 7, 2, 4, 5, 4, 1, 3 ,2);
        is1.filter(num -> num%2==0).forEach(num -> System.out.print(num + " "));
        System.out.println();

        is1 = IntStream.of(5, 7, 2, 4, 5, 4, 1, 3 ,2);
        is1.map(num -> num*2).forEach(num -> System.out.print(num + " "));
        System.out.println();

        Stream<String> strStream = Stream.of("Korea", "Japan", "China", "America");
        strStream.map(str -> str.toUpperCase()).forEach(str -> System.out.print(str + " "));
        System.out.println();

        IntStream.iterate(1, num -> num*2).limit(20).forEach(num -> System.out.print(num + " "));
        System.out.println();

        IntStream.iterate(1, num -> (int)(Math.random()*20)).limit(10).forEach(num -> System.out.print(num + " "));
        System.out.println();

        Random rand = new Random();
        IntStream.generate(() -> rand.nextInt(10)).limit(10).forEach(num -> System.out.print(num + " "));
        System.out.println();
        
        IntStream.generate(() -> rand.nextInt(100)).distinct().filter(num -> num%2==0).limit(10).forEach(num -> System.out.print(num + " "));
        System.out.println();

        IntStream.generate(() -> rand.nextInt(45)+1).limit(6).sorted().forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
