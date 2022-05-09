package Day_0404;

import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
        MainMenu m = new MainMenu();

        Scanner scan = new Scanner(System.in);
        String choice;

        while(true){
            m.menu();
            choice = scan.next();
            scan.nextLine();

            switch(choice){
                case "1": m.input(); break;
                case "2": m.output(); break;
                case "3": m.selectOne(); break;
                case "4": m.delete(); break;
                case "5": m.update(); break;
                case "0": return;
                default : System.out.println("올바른 숫자를 입력해주세요.");
            }
            System.out.println();
        }
    }
}
