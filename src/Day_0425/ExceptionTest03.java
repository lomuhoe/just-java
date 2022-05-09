package Day_0425;

import java.util.Scanner;

public class ExceptionTest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.print("두 개의 정수 입력 : ");
        a = scan.nextInt();
        b = scan.nextInt();
        scan.nextLine();

        try {
            int result = method(a, b);
            System.out.println("결과 : " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // a는 반드시 b보다 커야함.
    public static int method(int a, int b) throws Exception {
        if(a<b)
            throw new Exception("첫번째 숫자는 항상 두번째 숫자보다 커야합니다.");
        return a-b;
    }
}
