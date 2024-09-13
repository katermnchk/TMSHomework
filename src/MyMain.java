import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        //checkAbbreviation();
        checkDocument();
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

    static void checkDocument(){
        System.out.print("Please enter a text: ");
        String document = getScanner();
        String regexNum = "\\b(?:\\d{4}-){2}\\d{2}\\b";
        Pattern patternNum = Pattern.compile(regexNum);
        Matcher matcherNum = patternNum.matcher(document);
        while(matcherNum.find())
            System.out.println("Number of document: " + matcherNum.group());
        String regexPhone = "\\+\\(\\d{2}\\)\\d{7}";
        Pattern patternPhone = Pattern.compile(regexPhone);
        Matcher matcherPhone = patternPhone.matcher(document);
        while(matcherPhone.find())
            System.out.println("Phone: " + matcherPhone.group());
        String regexEmail = "[A-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(document);
        while(matcherEmail.find())
            System.out.println("Email: " + matcherEmail.group());
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }
}
