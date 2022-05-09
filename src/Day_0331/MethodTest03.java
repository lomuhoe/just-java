package Day_0331;

import java.util.Scanner;

public class MethodTest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        if(isPrimeNumber(num)){
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }
    }

    public static boolean isPrimeNumber(int value) {
        for(int i=2 ; i<value ; i++){
            if(value%i==0)
                return false;
        }
        return true;
    }
}
