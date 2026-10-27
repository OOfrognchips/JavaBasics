import java.util.Scanner;

public class CountEvensFixed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte i = 0;
        byte count = 0;
        String output = "";
        boolean notValidInput = true;

        while (notValidInput) {
            System.out.println("Enter number:");
            byte number = input.nextByte();

            if (number == -1) {
                notValidInput = false;
                // break;
            } else if (number % 2 == 0) {
                notValidInput = true;
                count += 1;
                output = output + " " + number;
            } else if (number % 2 != 0) {
                notValidInput = true;
                i++;
                // continue;
            }
        }

        input.close();

        System.out.printf("Even numbers: %d%nNumbers:%s%n", count, output);
    }
}
