package Day_0429;

public class EnumTest4 {
    public static void main(String[] args) {
        MyColor[] colors = MyColor.values();

        for (MyColor c : colors){
            System.out.println(c);
        }
    }
}
