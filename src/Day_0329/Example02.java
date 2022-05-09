package Day_0329;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("시작값을 입력 : ");
        int start = scan.nextInt();

        System.out.print("끝값을 입력 : ");
        int end = scan.nextInt();

        if(start>end){
            System.out.println("error) 시작값은 끝값보다 작거나 같도록 입력해주세요!!");
            return;
        } else {
            while(start<=end){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}
