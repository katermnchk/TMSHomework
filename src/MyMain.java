import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        //removeDublicates();
        //getAnimals();
        getStudents();
    }

    public static void removeDublicates() {
        System.out.print("Please enter numbers separated by spaces: ");
        String input = getScanner();

        String[] numArray = input.split(" ");

        List<String> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = numArray[i].trim();

            if(!uniqueNumbers.contains(numArray[i])) {
                uniqueNumbers.add(numArray[i]);
            }
        }
        System.out.println("Result: " + String.join(", ", uniqueNumbers));
    }

    public static void getAnimals() {
        Animals animals = new Animals();

        animals.addAmimal("Tiger");
        animals.addAmimal("Cat");
        animals.addAmimal("Dog");
        animals.addAmimal("Lion");

        System.out.println();
        animals.printAnimals();
        System.out.println();
        animals.deleteAnimal();
        animals.deleteAnimal();
        System.out.println();
        animals.printAnimals();
    }

    public static void getStudents() {
        List<Student> students = new LinkedList<>();

        students.add(new Student("Kate", "377901", 3,  new LinkedList<>(List.of(9, 9, 8))));
        students.add(new Student("Senya", "418101", 1, new LinkedList<>(List.of(10, 10, 10, 10))));
        students.add(new Student("Ivan", "12345", 1, new LinkedList<>(List.of(7, 8, 9))));
        students.add(new Student("Masha", "4343", 1, new LinkedList<>(List.of(2, 3, 3))));

        Student.printStudents(students, 1);
        Student.checkStudentsMarks(students);
        System.out.println();
        Student.printStudents(students, 2);
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }
}
