package Day_0401;

import java.util.Scanner;

public class MyMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        while(true){
            menu();
            choice = scan.next();
            scan.nextLine();

            switch(choice){
                case "1": 
                    input(); break;
                case "2": 
                    output(); break;
                case "3": 
                    selectOne(); break;
                case "4": 
                    delete(); break;
                case "5": 
                    update(); break;
                case "0": 
                    return;
                default :
                    System.out.println("올바른 숫자를 입력해주세요.");
            }
            System.out.println();
        }
    }

    public static void menu() {
        System.out.println("===== [ 관리 프로그램 ] =====");
        System.out.println("         1. 입   력         ");
        System.out.println("         2. 전체 출력       ");
        System.out.println("         3. 조   회         ");
        System.out.println("         4. 삭   제         ");
        System.out.println("         5. 수   정         ");
        System.out.println("         0. 종   료         ");
        System.out.println("----------------------------");
        System.out.print("         선택> ");
    }

    public static void input() {
        System.out.println("입력됨");
    }

    public static void output() {
        System.out.println("전체 출력됨");
    }

    public static void selectOne() {
        System.out.println("조회됨");
    }

    public static void delete() {
        System.out.println("삭제됨");
    }

    public static void update() {
        System.out.println("수정됨");
    }
}
