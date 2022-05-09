package Day_0331;

import java.util.Scanner;

public class MethodTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int num1 = scan.nextInt();

        System.out.print("두 번째 수 : ");
        int num2 = scan.nextInt();

        System.out.println("add() : " + add(num1, num2));
        System.out.println("substract() : " + substract(num1, num2));
        System.out.println("multiply() : " + multiply(num1, num2));
        System.out.println("divide() : " + divide(num1, num2));        
    }

    public static int add(int num1, int num2) {
        return num1+num2;
    }

    public static int substract(int num1, int num2) {
        return num1-num2;
    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static double divide(int num1, int num2) {
        return num1/(double)num2;
    }
}
