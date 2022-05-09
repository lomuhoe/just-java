package lamda;

interface Sample2 {
    public int min(int a, int b);

    public default int max(int a, int b) {
        return (a > b) ? b : a;
    }
}

public class Lamda03 {
    public static void main(String[] args) {
        Sample2 s2 = (a, b) -> (a > b) ? a : b;
        System.out.println(s2.min(21, 11));
        System.out.println(s2.max(21, 11));
    }
}
