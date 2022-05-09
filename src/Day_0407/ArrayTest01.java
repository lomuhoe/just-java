package Day_0407;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        Scanner scan = new Scanner(System.in);

        for(int i=0 ; i<numArray.length ; i++){
            System.out.print((i+1) + "번째 숫자를 입력해주세요 : ");
            numArray[i] = scan.nextInt();
        }

        System.out.println(numArray[0] + ", " + numArray[1] + ", " + numArray[2] + ", " + numArray[3] + ", " + numArray[4]);
    }
}
