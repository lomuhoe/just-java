package Day_0411.second;

class Polygon {
    private int x;
    private int y;
    public Polygon(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("x : " +x + ", y : " + y);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "x : " +x + ", y : " + y;
    }
}

class Rectangle extends Polygon {
    private int width;
    private int height;

    public Rectangle(){
        super(10, 5);
        System.out.println("Rectangle()");
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        super.print();
        System.out.println("width = " + width + ", height = " + height);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "width = " + width + ", height = " + height;
    }
}

public class PolygonTest {
    public static void main(String[] args) {
        // Polygon p1 = new Polygon();
        // p1.printPolygon();

        Rectangle r1 = new Rectangle();
        r1.print();
        System.out.println(r1);
        System.out.println(r1.toString());
    }
}