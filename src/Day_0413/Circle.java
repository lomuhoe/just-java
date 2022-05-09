package Day_0413;

public class Circle extends MyPoint{
    private double radius;

    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    
    public void setRadian(double radius) {this.radius = radius;}
    public double getRadius() {return radius;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+", radius : " + radius;
    }
}
