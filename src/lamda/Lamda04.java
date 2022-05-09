package lamda;

@FunctionalInterface
interface MyTemp {
    public void output();
}

public class Lamda04 {
    public static void main(String[] args) {
        MyTemp temp = () -> System.out.println("람다 테스트");
        temp.output();

        methodA().output();

        methodB(() -> System.out.println("methodB~"));
    }

    public static MyTemp methodA() {
        return () -> System.out.println("methodA~");
    }

    public static void methodB(MyTemp temp) {
        temp.output();
    }
}
