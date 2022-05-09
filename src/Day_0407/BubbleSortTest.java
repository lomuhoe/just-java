package Day_0407;

public class BubbleSortTest {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 15;
        int[] numArray = new int[ARRAY_LENGTH];
        for(int i=0 ; i<numArray.length ; i++){
            numArray[i] = (int)(Math.random()*100+1);
        }

        print(numArray);
        System.out.println();

        sort(numArray);
        print(numArray);
    }

    public static void print(int[] numArray) {
        for(int i=0 ; i<numArray.length ; i++){
            if(i==numArray.length-1||i%5==4)
                System.out.printf("Array[%2d] : %3d%n", i, numArray[i]);
            else
                System.out.printf("Array[%2d] : %3d , ", i,  numArray[i]);
        }
    }

    public static void sort(int[] numArray) {
        for(int i=0 ; i<numArray.length-1 ; i++){
            for(int j=0 ; j<numArray.length-i-1 ; j++){
                if(numArray[j]>numArray[j+1]){
                    int tmp = numArray[j+1];
                    numArray[j+1] = numArray[j];
                    numArray[j] = tmp;
                }
            }
        }
    }
}
