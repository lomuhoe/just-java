package Day_0329;

import java.util.Scanner;

public class MyMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("===== [ 관리 프로그램 ] =====");
            System.out.println("         1. 입   력         ");
            System.out.println("         2. 전체 출력       ");
            System.out.println("         3. 조   회         ");
            System.out.println("         4. 삭   제         ");
            System.out.println("         5. 수   정         ");
            System.out.println("         0. 종   료         ");
            System.out.println("----------------------------");
            System.out.print("         선택> ");
            choice = scan.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("입력됨");
                    break;
                case 2: 
                    System.out.println("전체 출력됨");
                    break;
                case 3: 
                    System.out.println("조회됨");
                    break;
                case 4: 
                    System.out.println("삭제됨");
                    break;
                case 5: 
                    System.out.println("수정됨");
                    break;
                case 0: 
                    return;
                default :
                    System.out.println("올바른 숫자를 입력해주세요.");
            }
            System.out.println();
        }
    }
}
