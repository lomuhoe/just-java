package Day_0425;

import java.util.Scanner;

public class ExceptionTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp, sum = 0, count = 1;
        String str;

        while (true) {
            try {
                System.out.print(count + "번째 숫자를 입력 : ");
                str = scan.nextLine();
                temp = Integer.parseInt(str);
                sum += temp;
                count++;
                if(count==11)
                    break;
            } catch (Exception e) {
                System.out.println("정수를 제대로 입력해주세요.");
            }
        }
        System.out.println("합계 : " + sum);
    }
}
