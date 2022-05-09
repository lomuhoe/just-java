package Day_0324;

public class ModulusTest1 {
    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 5.2, d = 3;

        System.out.println("a / b = " + a/b);
        System.out.println("a % b = " + a%b);

        System.out.println("c / d = " + c/d);
        System.out.println("c % d = " + c%d);

        boolean bool = a > 10;
        System.out.println(bool);

        bool = b<=2;
        System.out.println(bool);

        int age = 17;
        System.out.println((age >= 19) ? "가능" : "불가");
    }
}
