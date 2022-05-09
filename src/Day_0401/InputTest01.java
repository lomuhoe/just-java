package Day_0401;

import java.util.Scanner;

public class InputTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("당신의 이름을 알려주세요 : ");
        String name = scan.next();

        System.out.println("당신의 나이를 알려주세요 : ");
        int age = scan.nextInt();

        System.out.println("당신의 이름 : " + name + ", 나이 : " + age + "살 입니다.");
    }
}
