package Day_0413;

public class PolygonTest {
    public static void main(String[] args) {
        PolygonService service = new PolygonServiceImpl();
        double result = service.calcArea(new MyPoint(1, 1));
        System.out.println("결과 : " + result);
        result = service.calcArea(new Triangle(10, 5));
        System.out.println("결과 : " + result);
        result = service.calcArea(new Circle(5.5));
        System.out.println("결과 : " + result);
    }
}
