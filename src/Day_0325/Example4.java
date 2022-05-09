package Day_0325;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int max, min;

        if(num1>num2){
            max=num1;
            min=num2;
        } else {
            max=num2;
            min=num1;
        }

        System.out.println("큰 수 : " + max + ", 작은 수 : " + min);
    }
}
