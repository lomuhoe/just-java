package Day_0329;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("끝값을 입력 : ");
        int end = scan.nextInt();
        int i = 1;

        while(i<=end){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
