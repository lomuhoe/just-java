package Day_0328;

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("반복할 횟수를 입력해주세요(1 ~ 10) : ");
        int loop = scan.nextInt();
        int i=0;
        int result=1;

        while(i<loop){
            if(i==30){
                result=(result-1)+result;
            } else {
                result*=2;
            }
            
            i++;
        }

        result+=1;
        System.out.printf("2의 %d거듭제곱 = %d%n", loop, result);
    }
}
