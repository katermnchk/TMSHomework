import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        //getLongestAndShortestStrings(); //first task
        //displayInAscendingOrder(); //second task
       //getBeforeAverageStrings(); // third task(?)
        //getWordWithDifferentLetters(); //fourth task
        getDoubleSymbols(); //fifth task
    }

    static void getLongestAndShortestStrings() {
        String[] strings = writeStrings();
        System.out.println("The longest string: {" + getLongestString(strings) +
                "} It's length is " + getLongestString(strings).length());
        System.out.println("The shortest string: {" + getShortestString(strings) +
                "} It's length is " + getShortestString(strings).length());
    }

    static String getLongestString(String[] strings) {
        String longestString = strings[0];
        for (int counter = 0; counter < strings.length; counter++) {
            if (strings[counter].length() > longestString.length())
                longestString = strings[counter];
        }
        return longestString;
    }

    static String getShortestString(String[] strings) {
        String shortestString = strings[0];
        for (int counter = 0; counter < strings.length; counter++) {
            if (strings[counter].length() < shortestString.length())
                shortestString = strings[counter];
        }
        return shortestString;
    }


    static void displayInAscendingOrder() {
        String[] strings = writeStrings();
        String middleString = strings[0];
        for (int counter = 0; counter < strings.length; counter++) {
            if (!strings[counter].equals(getLongestString(strings)) &&
                    !strings[counter].equals(getShortestString(strings)))
                middleString= strings[counter];
        }
        System.out.println("The shortest string: {" + getShortestString(strings) + "}");
        System.out.println("The average string: {" + middleString + "}");
        System.out.println("The longest string: {" + getLongestString(strings) + "}");
    }


    static void getBeforeAverageStrings() {
        String[] strings = writeStrings();
        double averageLength = calculateAverageLength(strings);
        System.out.println("Strings that are shorter than average (" + averageLength + "):");
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println("{" + str + "} It's length is " + str.length());
            }
        }
    }

    static double calculateAverageLength(String[] strings) {
        int totalLength = 0;
        for (int counter = 0; counter < strings.length; counter++) {
            totalLength += strings[counter].length();
        }
        return totalLength / (double) strings.length;
    }


    static void getWordWithDifferentLetters() {
        String[] strings = writeStrings();
        for (String str : strings) {
            if (hasAllUniqueCharacters(str)) {
                System.out.println("The first string with all unique characters is: {" + str + "}");
                return;
            }
        }
        System.out.println("No strings with all unique characters were found");
    }

    static boolean hasAllUniqueCharacters(String str) {
        boolean[] charExists = new boolean[256]; //ASCII
        for (int counter = 0; counter < str.length(); counter++) {
            char symbol = str.charAt(counter);
            if (charExists[symbol]) {
                return false;
            }
            charExists[counter] = true;
        }
        return true;
    }

    static void getDoubleSymbols() {
        System.out.print("Please write the string: ");
        String newString = getScanner();
       StringBuilder doubleString = new StringBuilder();
       for (char c: newString.toCharArray()) {
           doubleString.append(c).append(c);
       }
        System.out.println("New string: " + doubleString);
    }

    static String[] writeStrings() {
        System.out.print("Please write the first string: ");
        String str1 = getScanner();
        System.out.print("Please write the second string: ");
        String str2 = getScanner();
        System.out.print("Please write the third string: ");
        String str3 = getScanner();
        return new String[]{str1, str2, str3};
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }
}
