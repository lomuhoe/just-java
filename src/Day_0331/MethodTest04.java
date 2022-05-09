package Day_0331;

import java.util.Scanner;

public class MethodTest04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        if(num<10){
            System.out.println("숫자는 10 이상이여야 합니다!");
            return;
        } else {
            int nlNumber = 0;
            for(int i=2 ; i<=num ; i++){
                if(isPrimeNumber(i)){
                    System.out.printf("%3d ", i);
                    if(++nlNumber%5==0)
                        System.out.println();
                }
            }
            System.out.println();
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
