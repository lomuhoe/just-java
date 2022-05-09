package Day_0325;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kor = scan.nextInt();
        int eng = scan.nextInt();

        String result = (kor>40&&eng>40&&(double)(kor+eng)/2>=60)?"합격":"불합격";

        System.out.println("당신은 " + result + "하셨습니다.");
    }
}
