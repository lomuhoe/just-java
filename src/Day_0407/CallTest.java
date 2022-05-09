package Day_0407;

public class CallTest {
    public static void main(String[] args) {
        int[] arr = {10, 20};

        System.out.println("교환 전) arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);

        exchange(arr);
        System.out.println("교환 후) arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
        
    }

    public static void exchange(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
