package Example01;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("피자는 몇 조각입니까? ");
        int pizza = scan.nextInt();
        System.out.print("사람은 몇 명 입니까? ");
        int human = scan.nextInt();

        System.out.println("한 사람 당 먹을 수 있는 피자 조각 수 : " + (pizza/human));
        System.out.println("강아지가 먹는 피자 조각 수 : " + (pizza%human));
    }
}
