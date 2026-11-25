package a11_01_guessNumber;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        // boolean notValidInput = true;
        int numberOfAttempts = 0;
        final int secretNumber = 7;

        while (true) {
            System.out.println("Enter number of attempts (grater than 1):");
            numberOfAttempts = input.nextInt();

            if (numberOfAttempts < 1) {
                continue;
            } else if (numberOfAttempts > 1) {
                break;
            }
        }

        for (int i = 1; i <= numberOfAttempts; i++) {
            System.out.printf("Attempt %d: Enter your guess (1..10):%n", i);
            int attemptValue = input.nextInt();

            while (attemptValue < 1 || attemptValue > 10) {
                System.out.printf("Attempt %d: Enter your guess (1..10):%n", i);
                attemptValue = input.nextInt();
            }

            if (attemptValue < secretNumber) {
                System.out.print("Too low. ");
                // break;
            } else if (attemptValue > secretNumber) {
                System.out.print("Too high. ");
                // break;
            } else if (attemptValue == secretNumber) {
                System.out.println("Correct! You guessed the number.");
                break;
            }
            if (i == numberOfAttempts) {
                System.out.printf("You lost! The secret number was %d.%n",
                    secretNumber);
            }
        }

        input.close();

    }

}
