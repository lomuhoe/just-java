package Day_0401;

public class Overloading {
    public static void main(String[] args) {
        int a = 10, b = 20;
        double d1 = 22.5, d2 = 36.7;
        String s1 = "Hello", s2 = "World";

        add();
        add(a, b);
        add(d1, d2);
        add(s1, s2);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double d1, double d2) {
        System.out.println(d1 + d2);
    }

    public static void add(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void add() {
        System.out.println("add() 입니다.");
    }
}
