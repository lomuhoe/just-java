package Day_ex0413;

public class MyTriangle extends MyPoint {
    private int height;
    private int weight;
    private double area;

    public MyTriangle(){}
    public MyTriangle(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    //setter
    public void setHeight(int height) {this.height = height; calc();}
    public void setWeight(int weight) {this.weight = weight; calc();}
    //getter
    public int getHeight() {return height;}
    public int getWeight() {return weight;}
    public double getArea() {return area;}

    @Override
    public void output() {
        System.out.println("x : " + super.getX() + ", y : " + super.getY() + ", height : " + height + ", weight : " + weight + ", area : " + area);
    }

    @Override
    public void calc() {
        area = height * weight * 0.5;
    }
    
}
