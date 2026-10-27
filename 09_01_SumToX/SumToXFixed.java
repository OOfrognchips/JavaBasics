import java.util.Scanner;

public class SumToXFixed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte number = 0;
        boolean notValidInput = true;
        while (notValidInput) {
            System.out.println("Enter number > 10:");
            number = input.nextByte();

            if (number > 10) {
                notValidInput = false;
                // break;
            } else if (number <= 10) {
                notValidInput = true;
                // continue;
            }
        }

        input.close();

        short total = 0;
        byte i = 1;
        while (i <= number) {
            total = (short)(total + i);
            i++;
        }

        System.out.printf("Total = %d%n", total);
    }
}
