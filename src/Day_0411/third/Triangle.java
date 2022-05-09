package Day_0411.third;

public class Triangle implements Calculate {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "width : " + width + ", height : " + height;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (this.width * this.height)*0.5;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("width="+ width + ", height=" + height + "area = " + this.area());
    }
}
