package Day_0329;

public class ForTest02 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1 ; i<=100 ; i++){
            sum += i;
        }

        System.out.println("1부터 100까지의 합계는 : " + sum);
    }
}