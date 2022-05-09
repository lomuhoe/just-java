package Day_0328;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        int dice = (int)(Math.random()*6)+1;

        switch(dice){
            case 1:
                System.out.println("1이 나왔음");
                break;
            case 2:
                System.out.println("2가 나왔음");
                break;
            case 3:
                System.out.println("3이 나왔음");
                break;
            case 4:
                System.out.println("4가 나왔음");
                break;
            case 5:
                System.out.println("5가 나왔음");
                break;
            case 6:
                System.out.println("6이 나왔음");
                break;
            default:
                System.out.println("어캐 나왔음?? dice 값 : " + dice);
        }

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        switch(text){
            case "F":
            case "Father" :
                System.out.println("아버지");
                break;
            case "M":
            case "Mather" :
                System.out.println("엄마");
                break;
            case "B":
            case "Brother" :
                System.out.println("형제");
                break;
            case "S":
            case "Sister" :
                System.out.println("자매");
                break;
            default :
                System.out.println("누구세용?");
                break;
        }
    }
}
