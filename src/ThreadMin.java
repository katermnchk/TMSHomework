public class ThreadMin extends Thread {
    private final int[] array;

    public ThreadMin(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Minimum: " + min);
    }
}
