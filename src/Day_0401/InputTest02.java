package Day_0401;

import java.util.Scanner;

public class InputTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = scan.nextLine();

        System.out.print("주소 : ");
        String address = scan.nextLine();
        
        System.out.print("나이 : ");
        int age = scan.nextInt();
        
        System.out.print("키 : ");
        double height = scan.nextDouble();
    }
}
