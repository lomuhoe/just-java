package Day_ex0413;

public abstract class MyPoint {
    private int x;
    private int y;
    
    public abstract void output();
    public abstract void calc();

    public MyPoint(){}
    public MyPoint(int x, int y){
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
        return "MyPoint.toString()";
    }
}
