import java.util.*;

public class Animals {
    private final LinkedList<String> animals;

    public Animals() {
        animals = new LinkedList<>();
    }

    public void deleteAnimal() {
        if (animals.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            String animal = animals.removeLast();
            System.out.println(animal + " is deleted");
        }
    }

    public void addAmimal(String animal) {
        animals.addFirst(animal);
        System.out.println(animal + " is added");
    }

    public void printAnimals() {
        if (animals.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Animals: " + animals);
        }
    }
}
