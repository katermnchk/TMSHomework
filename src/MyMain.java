import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        checkAbbreviation();
    }

    static void checkAbbreviation() {
        System.out.print("Please enter a string: ");
        String input = getScanner();
        String regex = "\\b[A-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }
}
