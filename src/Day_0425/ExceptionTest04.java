package Day_0425;

public class ExceptionTest04 {
    public static void main(String[] args) throws InterruptedException {
        int i=0, num=1;

        while (true) {
            System.out.println(i + ", " + num);
            i++;
            num*=2;

            // try {
                Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}
