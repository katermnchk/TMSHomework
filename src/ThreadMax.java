public class ThreadMax extends Thread {
    private final int[] array;

    public ThreadMax(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
