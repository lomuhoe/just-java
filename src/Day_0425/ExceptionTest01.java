package Day_0425;

public class ExceptionTest01 {
    public static void main(String[] args) {
        try {
            String[] str = { "1", "5", "5a", "0"};

            String a = str[0];
            String b = str[1];

            System.out.println(a + ", " + b);

            int ia = Integer.parseInt(a);
            int ib = Integer.parseInt(b);

            System.out.println("결과 : " + (ia / ib));
        } 
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("배열의 인덱스 에러");
        //     e.printStackTrace();    
        // } catch (NumberFormatException e) {
        //     System.out.println("정수로 파싱 불가능");
        //     e.printStackTrace();    
        // } catch (ArithmeticException e) {
        //     System.out.println("0으로 나눌수없음");
        //     e.printStackTrace();    
        // } 
        catch (Exception e) {
            System.out.println("그외 오류");   
            e.printStackTrace();         
        } finally {
            System.out.println("finally");
        }
    }
}
