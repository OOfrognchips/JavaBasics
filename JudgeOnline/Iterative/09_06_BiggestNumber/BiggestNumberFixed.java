import java.util.Scanner;

public class BiggestNumberFixed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
            "Enter positive numbers. Enter a negative number to finish:");
        short number = 0;
        short dummyNumber = number;
        byte i = 0;
        boolean validInput = true;

        while (validInput) {
            number = input.nextShort();

            if (number < 0) {
                if (i == 0) {
                    System.out.println("No positive numbers were entered");
                } else if (i != 0) {

                    System.out.printf("The biggest number is: %d%n",
                        dummyNumber);

                }
                validInput = false;
                // break;
            } else if (number > dummyNumber) {
                dummyNumber = number;
                validInput = true;
                i++;
            } else if (number <= dummyNumber) {
                validInput = true;
                i++;
                // continue;
            }
            // i++;

        }
        input.close();

    }

}
