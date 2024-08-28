public class MyMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                Dog.createDog("dog", "Tosya", 7, "brown"),
                new Tiger("tiger", "Vasya", 5, "yellow"),
                new Rabbit("rabbit", "Fedor", 1, "white")
        };
        showAnimals(animals);
        listenToTheAnimals(animals);
        feedTheAnimals(animals);
    }

    public static void showAnimals(Animal[] animals){
        for (Animal animal : animals){
            System.out.println(animal);
            System.out.println("---------------------------------");
        }
    }

    public static void listenToTheAnimals(Animal[] animals){
        for (Animal animal : animals) {
            System.out.print("The " + animal.getAnimalType() + " says: ");
            animal.voice();
        }
        System.out.println("---------------------------------");
    }

    public static void feedTheAnimals(Animal[] animals){
        animals[0].eat("Meat");
        animals[1].eat("Grass");
        animals[2].eat("Carrot");
    }
}
