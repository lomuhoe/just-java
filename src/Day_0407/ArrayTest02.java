package Day_0407;

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 6;
        int[] numArray = new int[ARRAY_LENGTH];
        Scanner scan = new Scanner(System.in);

        for(int i=0 ; i<numArray.length ; i++){
            System.out.print((i+1) + "번째 숫자를 입력해주세요 : ");
            numArray[i] = scan.nextInt();
        }

        System.out.println(numArray[0] + ", " + numArray[1] + ", " + numArray[2] + ", " + numArray[3] + ", " + numArray[4]);

        for(int i=0 ; i<numArray.length/2 ; i++){
            int tmp = numArray[i];
            numArray[i] = numArray[numArray.length-i-1];
            numArray[numArray.length-i-1] = tmp;
        }

        System.out.println(numArray[0] + ", " + numArray[1] + ", " + numArray[2] + ", " + numArray[3] + ", " + numArray[4]);
    }
}
