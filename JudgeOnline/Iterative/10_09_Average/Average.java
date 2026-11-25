import java.util.Scanner;

public class Average {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int initialUserInput = 0;
        double loopInput = 0, inputStorage = 0;

        System.out.println("How many numbers do you want to enter?");
        while (notValidInput) {
            initialUserInput = input.nextInt();

            if (initialUserInput > 0) {
                notValidInput = false;
            } else if (initialUserInput <= 0) {
                System.out
                    .println("Invalid amount. Please enter a positive number.");
            }
        }

        for (int i = 1; i <= initialUserInput; i++) {
            System.out.printf("Enter number %d:%n", i);
            loopInput = input.nextDouble();
            inputStorage += loopInput;
        }

        input.close();

        double average = inputStorage / initialUserInput;

        System.out.printf("The average is: %.2f%n", average);

    }

}
