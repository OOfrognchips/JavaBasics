import java.util.Scanner;

public class GuessNumberWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final byte solution = 52;

        boolean notSolved = true;
        byte attempts = 1;

        while (notSolved) {
            System.out.println("Enter a number between 1 and 100:");
            int number = input.nextInt();

            if (number < 1) {
                System.out.println("At least 1!");
                attempts += 1;
            } else if (number > 100) {
                System.out.println("At most 100!");
                attempts += 1;
            } else if (number < solution) {
                System.out.printf("It's greater than %d%n", number);
                attempts += 1;
            } else if (number > solution) {
                System.out.printf("It's smaller than %d%n", number);
                attempts += 1;
            } else if (number == solution) {
                System.out.println("You guessed it!");
                notSolved = false;
            }
        }
        System.out.printf("Attempts: %d%n", attempts);
    }
}
