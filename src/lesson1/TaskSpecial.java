package lesson1;

public class TaskSpecial {
    public static void main(String[] args) {
        //method 1
        int a = 1, b = 2, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.print("a = " + a);
        System.out.println(" b = " + b);

        //method 2
        int a1 = 1, b1 = 2;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.print("a = " + a1);
        System.out.println(" b = " + b1);
    }
}
