import java.util.Objects;

public class Tiger extends Animal {
    public Tiger(String animalType, String animalName, int animalAge, String animalColor) {
        super(animalType, animalName, animalAge, animalColor);
    }

    @Override
    void voice() {
        System.out.println("Grrrr");
    }

    @Override
    void eat(String food) {
        if (Objects.equals(food, "Meat")){
            System.out.println("The tiger likes meat. Thank you!");
        }
        else if (Objects.equals(food, "Fish")){
            System.out.println("The tiger likes fish. Thank you!");
        }
        else {
            System.out.println("The tiger doesn't like this :(");
        }
    }
}
