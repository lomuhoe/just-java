package hobby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lamda05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("korea");
        list.add("china");
        list.add("japan");
        list.add("canada");

        list.forEach(str -> System.out.println(str));
        list.replaceAll(x -> x.toUpperCase());
        System.out.println(list);

        list.removeIf(x -> x.contains("P"));
        System.out.println(list);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "kbs");

        map.forEach((num, str) -> System.out.println(num + str));
    }
}
