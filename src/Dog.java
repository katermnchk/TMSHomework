import java.util.Objects;

public class Dog extends Animal {
    public Dog(String animalType, String animalName, int animalAge, String animalColor) {
        super(animalType, animalName, animalAge, animalColor);
    }

    @Override
    void voice() {
        System.out.println("Woof-woof!");
    }

    @Override
    void eat(String food) {
        if (Objects.equals(food, "Meat")){
            System.out.println("The dog likes meat. Thank you!");
        }
        else if (Objects.equals(food, "Bone")){
            System.out.println("The dog likes bone. Thank you!");
        }
        else {
            System.out.println("The dog doesn't like this :(");
        }
    }
}
