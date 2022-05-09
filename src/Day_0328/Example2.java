package Day_0328;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int i = 1;
        while(i<10){
            // System.out.println(num + " * " + i +" = " + num*i);
            System.out.printf("%d * %d = %d%n", num, i, num*i);
            i++;
        }
    }
}
