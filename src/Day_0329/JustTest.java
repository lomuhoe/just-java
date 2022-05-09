package Day_0329;

public class JustTest {
    public static void main(String[] args) {
        boolean pn;
        for(int i=2; i<1000 ; i++){
            pn=false;
            for(int j=2 ; j<i ; j++){
                if(i%j==0){
                    pn=true;
                    System.out.printf("%4d는 소수가 아닙니다.%n", i);
                    break;
                }
            }
            if(!pn){
                System.out.printf("%4d는 소수입니다.%n", i);
            }
        }
    }
}
