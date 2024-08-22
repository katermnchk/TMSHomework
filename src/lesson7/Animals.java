package lesson7;

public class Animals {
    private String animalType;
    private String animalColor;
    private String animalName;
    private int animalAge;
    private int animalWeight;

    Animals(String animalType, String animalColor, String animalName, int animalAge, int animalWeight){
        this.animalType = animalType;
        this.animalColor = animalColor;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    void sounds(){
        System.out.println("No sound set...");
    }

    void runs(){
        System.out.println("Does not RUN!");
    }

    String getAnimalFullInformation(){
        return "Animal type: " + this.animalType + "\n" +
                "Animal color: " + this.animalColor + "\n" +
                "Animal name: " + this.animalName + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal weight: " + this.animalWeight;
    }
}
