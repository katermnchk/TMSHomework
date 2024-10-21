import java.util.*;
import java.util.stream.Collectors;


public class MyMain {
    public static void main(String[] args) {
        //getTask1();
        getTask2();

    }

    static void getTask1() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 5, 6, 6, 14, 14, 14, 35, 36, 37, 37));
        int res = numbers.stream().distinct().filter(n -> n %2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(numbers);
        System.out.println(numbers.stream().distinct().toList());
        System.out.println(numbers.stream().distinct().filter(n -> n %2 == 0).toList());
        System.out.println("Sum = " + res);
    }

    static void getTask2() {
        Map<Integer, String> idName = new HashMap<>();
        idName.put(1, "Katya");
        idName.put(2, "Senya");
        idName.put(3, "Ilya");
        idName.put(5, "Anya");
        idName.put(7, "Nastya");
        idName.put(9, "Alesya");
        idName.put(13, "Ivan");

        List<String> names = idName.entrySet().stream().filter(n -> Arrays.asList(1,2,5,8,13).contains(n.getKey())).
                map(Map.Entry::getValue).filter(n -> n.length() % 2 != 0).
                map(n -> new StringBuilder(n).reverse().toString()).toList();
        System.out.println(idName);
        System.out.println(idName.entrySet().stream().filter(n -> Arrays.asList(1,2,5,8,13).
                contains(n.getKey())).toList());
        System.out.println(idName.entrySet().stream().filter(n -> Arrays.asList(1,2,5,8,13).contains(n.getKey())).
                map(Map.Entry::getValue).filter(n -> n.length() % 2 != 0).toList());
        System.out.println("\nResult: " + names);
    }

}
