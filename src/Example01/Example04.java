package Example01;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("기본급 입력 : ");
        long money = scan.nextLong();
        System.out.print("초과근무시간 입력 : ");
        int overHour = scan.nextInt();

        System.out.println("실수령액 : " + (money+overHour*15000-money/10) + "원");
    }
}
