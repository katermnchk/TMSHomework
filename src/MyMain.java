import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        registration();
    }

    static void registration() {
        System.out.print("Please enter your login: ");
        String login = getScanner();
        System.out.print("Please enter your password: ");
        String password = getScanner();
        System.out.print("Please confirm your password: ");
        String confirmPassword = getScanner();

        try {
            boolean isValid = validateCredentials(login, password, confirmPassword);
            System.out.println("Проверка успешна: " + isValid);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
        }
    }

    public static boolean validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не содержать пробелов");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException
                    ("Пароль должен быть меньше 20 символов, не содержать пробелов и содержать хотя бы одну цифру.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords aren't excepted");
        }
        return true;
    }

    static String getScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
