package task1;

public class Worker extends Employee {

    public Worker(String name) {
        super(name, "worker");
    }

    @Override
    public void printWork() {
        System.out.println("I do the simple work the director assigns me");
    }
}
