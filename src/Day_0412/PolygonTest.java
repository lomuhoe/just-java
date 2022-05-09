package Day_0412;

public class PolygonTest {
    public static void main(String[] args) {
        MyPoint p;
        p = new MyPoint(1,1);
        output(p);

        p = new Circle(5.5);
        output(p);

        p = new Triangle(6, 7);
        output(p);

        System.out.println(p instanceof MyPoint);
    }

    public static void output(MyPoint p) {
        System.out.println(p);
    }
}
