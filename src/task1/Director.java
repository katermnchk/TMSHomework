package task1;

public class Director extends Employee {

    public Director(String name) {
        super(name, "director");
    }

    @Override
    public void printWork() {
        System.out.println("I'm a head of the office!");
    }
}
