import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.println("Enter password: ");
        String password = scanner.nextLine().trim();

        if (username.equals("hoidanit") && password.length() > 6) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        scanner.close();
    }

}
