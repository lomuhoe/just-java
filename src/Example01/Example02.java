package Example01;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("정수 입력 : ");
            num = scan.nextInt();

            if(num%4==0&&num%5==0)
                System.out.println("4와 5로 나누어 집니다.");
            else 
                System.out.println("4와 5로 나누어 지지 않습니다.");

            if(num%4==0||num%5==0)
                System.out.println("4또는 5로 나누어집니다.");
            
            if(num%4==0&&!(num%5==0))
                System.out.println("4로 나누어 집니다.");    

            if(!(num%4==0)&&num%5==0)
                System.out.println("5로 나누어 집니다.");  
                
            System.out.println();
        }
    }
}
