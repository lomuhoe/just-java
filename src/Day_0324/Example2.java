package Day_0324;

public class Example2 {
    public static void main(String[] args) {
        int second = 12345;

        System.out.println(second +"초는 " + second/3600 + "시간 " + (second%3600)/60 + "분 " + (second%3600)%60 + "초 입니다.");
    }
}
