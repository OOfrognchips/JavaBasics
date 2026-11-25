import java.util.Scanner;

public class SquareTable {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int numericInput = 0;
        String output = "";

        while (notValidInput) {
            System.out.println("Enter maximum value (2-100):");

            numericInput = input.nextInt();

            if (numericInput >= 2 & numericInput <= 100) {
                notValidInput = false;
                // } else if (numericInput) {
            }
        }

        for (int i = 1; i <= numericInput; i++) {
            double powResult = Math.pow(i, 2);

            if (i == numericInput) {
                output += String.format("%d^2=%.0f", i, powResult);
            } else if (i != numericInput) {
                output += String.format("%d^2=%.0f, ", i, powResult);
            }
        }

        System.out.println(output);

    }

}
