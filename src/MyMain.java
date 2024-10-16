import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class MyMain {
    public static void main(String[] args) {
        //getTask1();
        //getTask2();
        //getTask3();
        //getTask4();
        getTask5();
    }

    static void getTask1() {
        System.out.print("PLease enter the date on format yyyy-MM-dd: ");
        String dateOfBirth = getScanner();
        try {
            LocalDate birthday = LocalDate.parse(dateOfBirth);
            System.out.println("You will be 100 age on " + birthday.plusYears(100));

        } catch (DateTimeParseException e) {
            System.out.println("Error");
        }
    }

    static void getTask2() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, -4, 0, -8, -2);
        List<Integer> positiveNumbers = new ArrayList<>();
        Predicate<Integer> isPositive = x -> x > 0;
        for (int num : numbers) {
            if (isPositive.test(num)) {
               positiveNumbers.add(num);
            }
        }
        System.out.println(positiveNumbers);
    }

    static void getTask3() {
        System.out.print("Please enter amount of money in BYN: ");
        String amountInBYN = getScanner();
        Function<String, Double> convertToDollars = x -> {
            String[] parts = x.split(" ");
            double byn = Double.parseDouble(parts[0]);
            return byn/3.2;
        };

        double amountInUSD = convertToDollars.apply(amountInBYN);
        System.out.println("Сумма в долларах: " + amountInUSD);
    }

    public static void getTask4(){
        System.out.print("Please enter amount of money in BYN: ");
        String amountInBYN = getScanner();
        Consumer<String> convertToDollars = x -> {
            String[] parts = x.split(" ");
            double byn = Double.parseDouble(parts[0]);
            System.out.println(byn/3.2);
        };

        convertToDollars.accept(amountInBYN);
    }

    public static void getTask5() {
        Supplier<String> supplier = () -> {
            System.out.print("Please enter a string: ");
            String newString = getScanner();
            return "Reversed string: " + new StringBuilder(newString).reverse().toString();
        };
        System.out.println(supplier.get());
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }


}
