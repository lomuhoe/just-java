package Example01;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vote = new int[11];
        int voteA = 0;
        int voteB = 0;
        for(int i=0 ; i<vote.length ; i++){
            System.out.print("선택 입력 (1. 제안A, 2. 제안B) : ");
            vote[i]=scan.nextInt();
        }

        for(int i=0 ; i<vote.length ; i++){
            if(vote[i]==1){
                System.out.print("제안A ");
                voteA++;
            } else {
                System.out.print("제안B ");
                voteB++;
            }
        }
        System.out.println();
        System.out.println("결과 : 제안 A " + voteA + "표, 제안 B " + voteB + "표");

        if(voteA>voteB){
            System.out.println("제안 A가 득표 수가 더 많습니다.");
        } else {
            System.out.println("제안 B가 득표 수가 더 많습니다.");
        }
    }
}
