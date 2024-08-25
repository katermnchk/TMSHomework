public class MyMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("dog", "Tosya", 3, "brown"),
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
        System.out.print("The " + animals[0].getAnimalType() + " says: ");
        animals[0].voice();
        System.out.print("The " + animals[1].getAnimalType() + " says: ");
        animals[1].voice();
        System.out.print("The " + animals[2].getAnimalType() + " says: ");
        animals[2].voice();
        System.out.println("---------------------------------");
    }

    public static void feedTheAnimals(Animal[] animals){
        animals[0].eat("Meat");
        animals[1].eat("Grass");
        animals[2].eat("Carrot");
    }
}
