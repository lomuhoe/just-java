package lamda;

interface Sample {
    public int min(int a, int b);
    public int max(int a, int b);
}

public class Lamda02 {
    public static void main(String[] args) {
        Sample sample = new Sample() {
            @Override
            public int min(int a, int b) {
                return (a > b) ? a : b;
            }

            @Override
            public int max(int a, int b) {
                return (a < b) ? a : b;
            }
        };

        System.out.println(sample.max(21, 11));
        System.out.println(sample.min(21, 11));
    }
}
