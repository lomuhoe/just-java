package Day_0324;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fee = 35000; // 요금
        
        System.out.println("* 몇 분이세요?");
        int total = scan.nextInt(); // 총 인원 수

        System.out.println("* 7살 이하 어린이는 몇명이에요?");
        int child = scan.nextInt(); // 어린이 수

        int amount = (int)(child * fee * 0.9) + (fee * (total - child));
        System.out.println("총 요금은 " + amount + "원 입니다.");
    }
}
