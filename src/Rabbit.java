import java.util.Objects;

public class Rabbit extends Animal {
    public Rabbit(String animalType, String animalName, int animalAge, String animalColor) {
        super(animalType, animalName, animalAge, animalColor);
    }

    @Override
    void voice() {
        System.out.println("f-f-f-f");
    }

    @Override
    void eat(String food) {
        if (Objects.equals(food, "Grass")){
            System.out.println("The rabbit likes grass. Thank you!");
        }
        else if (Objects.equals(food, "Carrot")){
            System.out.println("The rabbit likes carrot. Thank you!");
        }
        else {
            System.out.println("The rabbit doesn't like this :(");
        }
    }
}
