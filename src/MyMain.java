import task1.*;
import task2.*;

public class MyMain {
    public static void main(String[] args) {
        //getEmployeeInfo(); //Task1
        createFigures();//Task2
    }

    static void getEmployeeInfo(){
        Employee[] office = new Employee[]{
            new Director("Pavel"),
            new Worker("Oleg"),
            new Accountant("Anna")
        };
        for (Employee person: office){
            person.printPosition();
            person.printWork();
            System.out.println("-------------------------");
        }
    }

    static void createFigures(){
        Figure[] figures = new Figure[]{
            new Triangle(3, 4, 5),
            new Rectangle(10, 5),
            new Rectangle(14, 12),
            new Circle(10),
            new Circle(5)
        };

        for (Figure figure: figures){
            System.out.println(figure);
            System.out.println("----------------------------");
        }

        System.out.println("Sum of the figures' perimeters is " + getSumOfPerimeters(figures));
    }

    static double getSumOfPerimeters(Figure[] figures){
        double sum = 0;
        for (int counter = 0; counter < figures.length; counter++){
            sum += figures[counter].getPerimeter();
        }
        return sum;
    }
}


