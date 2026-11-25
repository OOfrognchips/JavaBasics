import java.util.Scanner;

public class PasswordLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean incorrectPassword = true;
        byte attempts = 0;

        System.out.println("Enter the password:");

        while (incorrectPassword) {
            String password = input.nextLine();

            if (password.equals("Qwert?9876")) {
                incorrectPassword = false;
                attempts += 1;
            } else if (!password.equals("Qwert?9876")) {
                incorrectPassword = true;
                System.out.println("Incorrect, try again:");
                attempts += 1;
            }
        }

        input.close();

        System.out.printf("Access granted!%nAttempts: %d%n", attempts);

    }

}
