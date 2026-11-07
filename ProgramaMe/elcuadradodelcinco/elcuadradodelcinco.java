import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;

public class elcuadradodelcinco {

    public static void main(String[] arguments) {
        Instant start = Instant.now();

        Scanner input = new Scanner(System.in);

        long numericInput = input.nextLong(), continuousInput = 0;
        String output = "";

        // System.out.println(Long.MAX_VALUE);
        // System.out.println(2 * (long)Math.pow(10, 10));

        for (int i = 1; i <= numericInput; i++) {
            continuousInput = input.nextLong();

            if (continuousInput == 5) {
                if (i == numericInput) {
                    output += String.format("25");
                } else if (i != numericInput) {
                    output += String.format("25%n");
                }
            } else if (continuousInput != 5) {
                long inputFirstDigit = (continuousInput / 10);
                long formula = inputFirstDigit * (inputFirstDigit + 1);

                if (i == numericInput) {
                    output += String.format("%d25", formula);
                } else if (i != numericInput) {
                    output += String.format("%d25%n", formula);
                }
            }
        }

        input.close();

        System.out.println(output);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("%n%d", timeElapsed);
    }

}
