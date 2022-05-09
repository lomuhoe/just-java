package Day_0330;

public class ForTest01 {
    public static void main(String[] args) {

        for(char alpha='A' ; alpha<='z'; alpha++){
            System.out.printf("%c의 코드값 : %d%n", alpha, (int)(alpha));
            if(alpha==90)
                alpha=96;
        }
    }
}
