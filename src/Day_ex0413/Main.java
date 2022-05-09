package Day_ex0413;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyPoint[] mp = new MyPoint[50];
        Scanner scan = new Scanner(System.in);
        String control;
        int count = 0;

        while(true){
            System.out.print("1) 원 2) 삼각형  3) 전체출력 4) 종료 : (선택) ");
            control = scan.next();
            switch(control){
                case "1":
                    mp[count] = new MyCircle();
                    System.out.print("x : ");
                    mp[count].setX(scan.nextInt());
                    System.out.print("y : ");
                    mp[count].setY(scan.nextInt());
                    System.out.print("r : ");
                    ((MyCircle)mp[count]).setRadius(scan.nextInt());
                    System.out.println("입력 완료.");
                    count++;
                    break;
                case "2":
                    mp[count] = new MyTriangle();
                    System.out.print("x : ");
                    mp[count].setX(scan.nextInt());
                    System.out.print("y : ");
                    mp[count].setY(scan.nextInt());
                    System.out.print("h : ");
                    ((MyTriangle)mp[count]).setHeight(scan.nextInt());
                    System.out.print("w : ");
                    ((MyTriangle)mp[count]).setWeight(scan.nextInt());
                    System.out.println("입력 완료.");
                    count++;
                    break;
                case "3":
                    for(int i=0; i<count ; i++){
                        mp[i].output();
                    }
                    break;
                case "4":
                    return;
                default :
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }
}
