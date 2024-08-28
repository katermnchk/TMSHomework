package task1;

public abstract class Employee implements Printable {
    private final String name;
    private final String position;

    Employee(String name, String position){
        this.name = name;
        this.position = position;
    }

    @Override
    public void printPosition() {
            System.out.println("A position of the employee " + name + " is " + position);
    }

}
