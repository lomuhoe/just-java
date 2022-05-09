package Day_0330;

public class ForTest02 {
    public static void main(String[] args) {
        for(int i=1 ; i<=127 ; i++){
            System.out.printf("%3d : %c   ", i, i);
            if(i%5==0)
                System.out.println();
        }
    }    
}
