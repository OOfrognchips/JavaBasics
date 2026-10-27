import java.util.Scanner;

public class CountPositivesNegativesZerosFixed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte countPositive = 0, countNegative = 0, countZeros = 0;
        boolean doNotExitLoop = true;

        while (doNotExitLoop) {
            System.out.println("How many numbers?");
            byte numbers = input.nextByte();

            if (numbers <= 0) {
                doNotExitLoop = true;
                // continue;
            } else if (numbers > 0) {
                byte i = 0;
                while (i < numbers) {
                    System.out.println("Enter number:");
                    short number = input.nextShort();

                    if (i != numbers) {
                        if (number > 0) {
                            countPositive += 1;
                            i++;
                        } else if (number < 0) {
                            countNegative += 1;
                            i++;
                        } else if (number == 0) {
                            countZeros += 1;
                            i++;
                        }
                    } else if (i == numbers) {
                        doNotExitLoop = false;
                        // break;
                    }
                }
                doNotExitLoop = false;
                // break;
            }
        }
        System.out.printf("Positive: %d%nNegative: %d%nZeros: %d%n",
            countPositive, countNegative, countZeros);

    }

}
