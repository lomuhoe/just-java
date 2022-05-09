package Day_0411.third;

public class Circle implements Calculate {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    
    public void setRadian(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (this.radius*this.radius*PI);
    }

    @Override
    public void print() {
        System.out.println("radius : " + this.radius + ", area : " + area());
        
    }
}
