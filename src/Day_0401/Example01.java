package Day_0401;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int value = scan.nextInt();

        for(int i=2 ; i<=value ; i++){
            if(divisor(value, i)>0){
                System.out.print(i+" ");
            }
        }
    }

    public static int divisor(int value, int i) {
        if(value%i==0)
            return i;
        return -1;
    }
}
