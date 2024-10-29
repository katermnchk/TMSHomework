import java.util.Arrays;

public class SelectionSortTreads extends Thread {
    private final int[] array;

    public SelectionSortTreads(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int[] arr = array.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection sort: " + Arrays.toString(arr));
    }
}
