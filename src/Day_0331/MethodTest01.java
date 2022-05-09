package Day_0331;

public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println("main() 시작");
        
        add1();
        System.out.println("add2() : " + add2());
        System.out.println("add3() : " + add3(12, 22));


        System.out.println("main() 끝");
        
    }

    public static void add1() {
        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println("결과는 : " + result);

        return;
    }

    public static int add2() {
        int num1 = 11;
        int num2 = 22;

        int result = num1 + num2;
        return result;
    }

    public static int add3(int a, int b) {
        int result = a + b;

        return result;
    }
}
