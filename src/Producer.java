public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                store.produce("Product " + i);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
