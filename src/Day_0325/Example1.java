package Day_0325;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        final int fee = 35000;

        int result = (age<7||age>65)? (int)(fee*0.9) : fee;
        System.out.println("지불 금액은 " + result + "원 입니다.");

    }
}
