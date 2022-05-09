package Day_0325;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("키(cm)를 입력해주세요");
        double height = scan.nextDouble();

        System.out.println("몸무게(kg)를 입력해주세요");
        double weight = scan.nextDouble();

        double bmi = weight/((height*0.01)*(height*0.01));

        if(bmi>=35){
            System.out.println("체지방 지수 " + bmi + "로 고도비만입니다");
        } else if (bmi>=30) {
            System.out.println("체지방 지수 " + bmi + "로 중도비만입니다");
        } else if (bmi>=25) {
            System.out.println("체지방 지수 " + bmi + "로 경도비만입니다");
        } else if (bmi>=23) {
            System.out.println("체지방 지수 " + bmi + "로 과체중입니다");
        } else if (bmi>=18.5) {
            System.out.println("체지방 지수 " + bmi + "로 정상입니다");
        } else {
            System.out.println("체지방 지수 " + bmi + "로 저체중입니다");
        }
    }
}
