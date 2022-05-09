package Example01;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("년도 입력 : ");
            int year = scan.nextInt();

            System.out.print("월 입력 : ");
            int month = scan.nextInt();

            switch (month) {
                case 1:
                    System.out.println("해당 월은 31일 입니다.");
                    break;
                case 2:
                    if(year%400==0&&year%100==0&&year%4==0)    
                        System.out.println("해당 월은 29일 입니다.");
                    else if(year%100==0&&year%4==0)    
                        System.out.println("해당 월은 28일 입니다.");
                    else if(year%4==0)    
                        System.out.println("해당 월은 29일 입니다.");
                    else
                        System.out.println("해당 월은 28일 입니다.");
                    break;
                case 3:
                    System.out.println("해당 월은 31일 입니다.");
                    break;
                case 4:
                    System.out.println("해당 월은 30일 입니다.");
                    break;
                case 5:
                    System.out.println("해당 월은 31일 입니다.");
                    break;
                case 6:
                    System.out.println("해당 월은 30일 입니다.");
                    break;
                case 7:
                    System.out.println("해당 월은 31일 입니다.");
                    break;
                case 8:
                    System.out.println("해당 월은 31일 입니다."); 
                    break;
                case 9:
                    System.out.println("해당 월은 30일 입니다.");
                    break;
                case 10:
                    System.out.println("해당 월은 31일 입니다.");
                    break;
                case 11:
                    System.out.println("해당 월은 30일 입니다.");
                    break;
                case 12:
                    System.out.println("해당 월은 31일 입니다.");
                    break;
                default:
                    System.out.println("잘못된 월을 입력하셨습니다.");
                    break;
            }
            System.out.println();
        }
    }
}
