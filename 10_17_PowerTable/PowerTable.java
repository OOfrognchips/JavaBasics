import java.util.Scanner;

public class PowerTable {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int base = 0, maxExponent = 0;
        String output = "";

        while (notValidInput) {
            System.out.println("Enter the base (2-100):");

            base = input.nextInt();

            if (base >= 2 & base <= 100) {
                notValidInput = false;
            }

        }

        notValidInput = true;

        while (notValidInput) {
            System.out.println("Enter maximum exponent (2-9):");

            maxExponent = input.nextInt();

            if (maxExponent >= 2 & maxExponent <= 9) {
                notValidInput = false;
            }
        }

        notValidInput = true;
        input.close();

        for (int i = 1; i <= maxExponent; i++) {
            if (i == maxExponent) {
                output +=
                    String.format("%d^%d=%.0f", base, i, Math.pow(base, i));
            } else if (i != maxExponent) {
                output +=
                    String.format("%d^%d=%.0f, ", base, i, Math.pow(base, i));
            }
        }

        System.out.println(output);

    }

}
