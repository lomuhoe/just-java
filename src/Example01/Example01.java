package Example01;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("제품가격을 입력하세요 : ");
        double temp = scan.nextDouble();
        System.out.println("제품의 부가세 : " + temp/10);
        System.out.println("제품 원가 : " + (temp - temp/10));
    }
}
