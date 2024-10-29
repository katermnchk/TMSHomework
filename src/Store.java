import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private final Queue<String> products = new LinkedList<>();
    private final int capacity = 3;

    public synchronized void produce(String product) throws InterruptedException {
        while (products.size() == capacity) {
            wait();
        }
        products.add(product);
        System.out.println("Producer added a product " + product);
        notifyAll();
    }

    public synchronized String consume() throws InterruptedException {
        while (products.isEmpty()) {
            wait();
        }
        String product = products.poll();
        System.out.println("Consumer bought product " + product);
        notifyAll();
        return product;
    }
}
