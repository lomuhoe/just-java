package Day_0324;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        final int pay = 9500;
        final double fee = 3.3;

        Scanner scan = new Scanner(System.in);
        System.out.print("일한 시간 입력 : ");
        int hour = scan.nextInt();

        System.out.println("세금 : " + (int)(hour*pay*(fee*0.01)) + "원");
        System.out.println("실 수령액 : " + (hour*pay-(int)(hour*pay*(fee*0.01))) + "원");
    }
}
