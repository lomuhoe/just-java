package Day_0413;

public class PolygonServiceImpl implements PolygonService {
    @Override
    public double calcArea(MyPoint p) {
        double result = -1;
        if(p instanceof Triangle){
            result = ((Triangle)p).getHeight()*((Triangle)p).getWidth()*0.5;
        } else if(p instanceof Circle){
            result = ((Circle)p).getRadius()*((Circle)p).getRadius()*Math.PI;
        } else if(p instanceof MyPoint){
            System.out.println("점은 면적을 구할 수 없습니다.");
        }
        return result;
    }

    public double test(Object obj){
        double result = -1;
        if(obj instanceof Triangle){
            result = ((Triangle)obj).getHeight()*((Triangle)obj).getWidth()*0.5;
        } else if(obj instanceof Circle){
            result = ((Circle)obj).getRadius()*((Circle)obj).getRadius()*Math.PI;
        } else if(obj instanceof MyPoint){
            System.out.println("점은 면적을 구할 수 없습니다.");
        }
        return result;
    }
}
