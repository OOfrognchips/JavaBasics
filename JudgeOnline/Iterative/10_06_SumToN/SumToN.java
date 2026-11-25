import java.util.Scanner;

public class SumToN {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int number = 0, i, storage = 0;

        while (notValidInput) {

            System.out.println("Enter a number (greater than 1):");
            number = input.nextInt();

            if (number > 1) {
                notValidInput = false;
            }
        }

        input.close();

        for (i = 1; i <= number; i++) {
            storage += i;
        }

        System.out.printf("Sum = %d%n", storage);
    }

}
