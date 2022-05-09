package lamda;

// 람다식으로 표현하기 위한 인터페이스. FuctionalInterface라고 함.
@FunctionalInterface
interface Temp {
    public int max(int a, int b);
}

public class Lamda01 {
    public static void main(String[] args) {
        Temp t = new Temp() {
            public int max(int a, int b){
                int result = a > b ? a : b;
                return result;
            }
        };

        Temp t1 = (int a, int b) -> a > b ? a : b;
        Temp t2 = (a, b) -> a > b ? a : b;

        System.out.println(t.max(10, 20));
        System.out.println(t1.max(20, 10));
    }
}
