package Day_0413;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        super();
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //setter
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    //getter
    public int getX() {return x;}
    public int getY() {return y;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "x : " + x + ", y : " + y;
    }
}
