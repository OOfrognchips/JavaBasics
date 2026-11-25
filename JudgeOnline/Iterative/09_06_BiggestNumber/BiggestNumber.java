import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
            "Enter positive numbers. Enter a negative number to finish:");
        short number = 0;
        short dummyNumber = number;
        byte i = 0;

        while (true) {
            number = input.nextShort();

            if (number < 0) {
                if (i == 0) {
                    System.out.println("No positive numbers were entered");
                } else if (i != 0) {

                    System.out.printf("The biggest number is: %d%n",
                        dummyNumber);

                }
                break;
            } else if (number > dummyNumber) {
                dummyNumber = number;
                i++;
            } else if (number <= dummyNumber) {
                // continue;
                i++;
            }
            // i++;

        }
        input.close();

    }

}
