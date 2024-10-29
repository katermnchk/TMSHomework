import java.util.Arrays;

public class BubbleSortThread extends Thread {
    private final int[] array;

    public BubbleSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int[] arr = array.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort: " + Arrays.toString(arr));
    }
}
