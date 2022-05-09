package Day_ex0413;

public class MyCircle extends MyPoint {
    private double radius;
    private double area;

    public MyCircle(){}
    public MyCircle(double radius){
        super();
        this.radius = radius;
    }

    //setter
    public void setRadius(double radius) {this.radius = radius; calc();}
    //getter
    public double getRadius() {return radius;}
    public double getArea() {return area;}

    @Override
    public void output() {
        System.out.println("x : " + super.getX() + ", y : " + super.getY() + ", radius : " + radius + ", area : " + area);
    }

    @Override
    public void calc() {
        this.area = this.radius*this.radius*Math.PI;
    }
}
