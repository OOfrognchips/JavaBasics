import java.util.Scanner;

public class DivisibleByN {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int divisor = 0, maximumValue = 0;
        String output = "";

        while (notValidInput) {
            System.out.println("Enter the divisor (greater than 1):");
            divisor = input.nextInt();

            if (divisor > 1) {
                notValidInput = false;
            }
        }

        notValidInput = true;

        while (notValidInput) {
            System.out.println("Enter maximum value (greater than 10):");
            maximumValue = input.nextInt();

            if (maximumValue > 10) {
                notValidInput = false;
            }
        }

        notValidInput = true;

        input.close();

        for (int i = 1; i <= maximumValue; i++) {
            if (i % divisor == 0) {
                output += String.format("%d, ", i);
            }
        }

        String trueOutput = output.substring(0, output.length() - 2);
        System.out.println(trueOutput);

    }

}
