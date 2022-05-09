package Day_0323;

public class OperatorTest3 {
    public static void main(String[] args) {
        double height = 180.0;
		double weight = 82.4;

        height*=0.01;
        double bmi = weight/(height*height);

        System.out.println(bmi);
    }
}
