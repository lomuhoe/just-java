package Day_0407;

import java.util.Scanner;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        Scanner scan = new Scanner(System.in);

        for(int i=0 ; i<numArray.length ; i++){
            System.out.print((i+1) + "번째 숫자를 입력해주세요 : ");
            numArray[i] = scan.nextInt();
        }

        print(numArray);
        exchange(numArray);
        print(numArray);
    }

    public static void print(int[] array) {
        for(int i=0;i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void exchange(int[] array) {
        for(int i=0 ; i<array.length/2 ; i++){
            int tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }
    }
}
