package Day_0329;

import java.util.Scanner;

public class ForTest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = scan.nextInt();
        boolean pn = true;

        for(int i=2 ; i<num ; i++){
            if(num%i==0){
                pn=false;
                break;
            }
        }

        if(pn){
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }
    }
}
