package Example01;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int virus, time, plus=0, result;
        while(true){
            System.out.print("박테리아가 몇 마리입니까? ");
            virus = scan.nextInt();
            System.out.print("경과시간을 입력 해주세요.(분) ");
            time = scan.nextInt();

            virus *= (0.1*(time/30)+1);
            
            //30분에 10%씩 증가하면 복리아닌가요?
            // for(int i=0 ; i<time/30 ; i++){
            //     virus *= 1.1;
            // }
            
            System.out.println("총 박테리아 수 : " + virus);
        }
    }
}
