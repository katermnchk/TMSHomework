import java.util.Arrays;

public class InsertionSortThread extends Thread {
    private final int[] array;

    public InsertionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int[] arr = array.clone();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion sort: " + Arrays.toString(arr));
    }
}
