import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = 0.0;
        double smallestNumber = number;
        double biggestNumber = number;

        byte i = 0;

        while (true) {
            System.out.println(
                "Enter a positive double (negative number to finish):");
            number = input.nextDouble();

            if (number < 0) {
                if (i == 0) {
                    System.out.println("No numbers entered");
                } else if (i != 0) {
                    System.out.printf("MINIM = %.1f%nMAXIM = %.1f%n",
                        smallestNumber, biggestNumber);
                }
                break;

            } else if (number >= 0) {
                if (i == 0) {
                    smallestNumber = number;
                    biggestNumber = number;
                } else if (i != 0) {
                    if (number < smallestNumber) {
                        smallestNumber = number;
                    } else if (number > biggestNumber) {
                        biggestNumber = number;
                    }
                }
                i++;

            }

        }
        input.close();

    }
}
