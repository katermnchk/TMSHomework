import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MyMain {
    public static void main(String[] args) {
        //getTask1();
        //getTask2();
        getSpecialTask();
    }

    static void getTask1() {
        String[] input1 = {"a", "b", "a", "c", "b"};
        String[] input2 = {"c", "b", "a"};
        String[] input3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(input1));
        System.out.println(wordMultiple(input2));
        System.out.println(wordMultiple(input3));
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();
        for (String word : words) {
            myMap.put(word, myMap.getOrDefault(word, 0) + 1);
        }

        for (String word : myMap.keySet()) {
            resultMap.put(word, myMap.get(word) >= 2);
        }
        return resultMap;
    }

    static void getTask2() {
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};
        System.out.println(pairs(input1));
        System.out.println(pairs(input2));
        System.out.println(pairs(input3));
    }

    public static Map<String, String> pairs(String[] words) {
        Map<String, String> resultMap = new HashMap<>();
        for (String word : words) {
            String firstSymbol = String.valueOf(word.charAt(0));
            String lastSymbol = String.valueOf(word.charAt(word.length()-1));
            resultMap.put(firstSymbol, lastSymbol);
        }
        return resultMap;
    }

    static void getSpecialTask() {
        String[] test = {"()",
                "[()]",
                "{[()]}",
                "([{{[(())]}}])",
                "{{[]()}}}}",
                "{[(])}"};
        for (String testing : test) {
            if (checkForBalance(testing)) {
                System.out.println(testing + " is balanced");
            }
            else System.out.println(testing + " is not balanced");
        }
    }

    static boolean checkForBalance(String str) {
        Stack<Character> stack = new Stack<>();

        for (char n : str.toCharArray()) {
            if (n == '(' || n == '{' || n == '[') {
                stack.push(n);
            }
            else if (n == ')' || n == '}' || n == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!isPair(stack.pop(), n)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }
}
