package Day_0328;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        int kor = scan.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = scan.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = scan.nextInt();
        int sum = kor + eng + math;
        double avg = (kor + eng + math)/3.0;

        String grade;

        switch((int)(sum/3.0/10)){
            case 10:
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default:
                grade="F";
        }

        switch((int)avg/10){
            case 10:
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default:
                grade="F";
        }
        System.out.printf("평균 %.2f점은 %s학점입니다.%n", avg, grade);
    }
}
