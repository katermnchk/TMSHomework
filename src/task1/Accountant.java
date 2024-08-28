package task1;

public class Accountant extends Employee {

    public Accountant(String name) {
        super(name, "accountant");
    }

    @Override
    public void printWork() {
        System.out.println("I take calls from visitors");
    }
}
