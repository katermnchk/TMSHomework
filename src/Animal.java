public class Animal {
    private final String animalType;
    private final String animalName;
    private final int animalAge;
    private final String animalColor;

    public Animal(String animalType, String animalName, int animalAge, String animalColor) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalColor = animalColor;
    }

    String getAnimalType(){
        return animalType;
    }

    void voice(){
        System.out.println("For now there is silence...");
    }

    void eat(String food){
        System.out.println("The animal is hungry...");
    }

   @Override
   public String toString(){
        return "Animal type: " + this.animalType + "\n" +
                "Animal name: " + this.animalName + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal color: " + this.animalColor;
    }
}
