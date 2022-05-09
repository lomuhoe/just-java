package Day_0411.first;

class Polygon {
    private int x;
    private int y;
    public Polygon() {
        System.out.println("Poligon()");
    }
    public void printPolygon() {
        System.out.println("x : " +x + ", y : " + y);
    }
}

class Rectangle extends Polygon {
    private int width;
    private int height;

    public Rectangle(){
        System.out.println("Rectangle()");
    }

    public void printRectangle() {
        System.out.println("width = " + width + ", height = " + height);
    }
}

public class PolygonTest {
    public static void main(String[] args) {
        // Polygon p1 = new Polygon();
        // p1.printPolygon();

        Rectangle r1 = new Rectangle();
        r1.printRectangle();
        r1.printPolygon();
    }
}