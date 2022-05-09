package Day_0331;

public class MethodTest05 {
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.println("myMethod() is static...");
    }

    public void yourMethod() {
        System.out.println("yourMethod() is non-static...");
    }
}
