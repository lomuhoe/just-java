package Day_0330;

public class KyuKyuDan {
    public static void main(String[] args) {
        for(int i=2 ; i<=9 ; i++){
            for(int j=1 ; j<=9 ; j++){
                System.out.printf("%2d *%2d = %2d   ", i, j, i*j);
                if(j%3==0)
                    System.out.println();
            }
            System.out.println();
        }
    }
}
