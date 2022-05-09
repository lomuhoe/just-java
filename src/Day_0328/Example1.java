package Day_0328;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double product = scan.nextDouble();

        if(product>=5 && product<=10){
            System.out.println("상품을 포장했습니다.");
        } else {
            System.out.println("판매할 수 없는 상품입니다.");
        }
    }
}
