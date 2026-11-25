package a11_04_guessPassword;

import java.util.Scanner;

public class GuessPassword {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        final String adminPassword = "Fr34k!29$";
        final String rootPassword = "kL?Je45op";

        int count = 0;

        System.out.println("Login as:");
        String userInput = input.nextLine();

        if (userInput.equals("admin") | userInput.equals("root")) {
            while (true) {
                System.out.printf("%s@211.174.173.184's password:%n",
                    userInput);
                String userInputPassword = input.nextLine();
                count += 1;

                if (userInputPassword.equals(adminPassword)
                    & userInput.equals("admin"))
                {
                    System.out.printf(
                        "Welcome to Ubuntu 24.04.3 LTS. You have used %d attempts.%n",
                        count);
                    break;
                } else if (userInputPassword.equals(rootPassword)
                    & userInput.equals("root"))
                {
                    System.out.printf(
                        "Welcome to Ubuntu 24.04.3 LTS. You have used %d attempts.%n",
                        count);
                    break;
                }
            }
        } else if (!userInput.equals("admin") | !userInput.equals("root")) {
            System.out.println("This user does not exist!");
        }

        input.close();
    }

}
