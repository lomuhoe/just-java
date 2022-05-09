package Day_0412;

public class Triangle extends MyPoint{
    private int width;
    private int height;

    public Triangle() {
        super();
    }
    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Triangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    //setter
    public void setWidth(int width) {this.width = width;}
    public void setHeight(int height) {this.height = height;}
    //getter
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", width : " + width + ", height : " + height;
    }
}
