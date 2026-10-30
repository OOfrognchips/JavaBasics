import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean doNotExitLoop = true;

        short number = 0;
        short sum = 0;
        short count = 0;

        byte i = 0;

        while (doNotExitLoop) {
            System.out.println("Enter number:");
            number = input.nextShort();

            if (number == 0) {
                doNotExitLoop = false;
            } else if (number != 0) {
                doNotExitLoop = true;
                count += 1;
                sum += number;
                i++;
            }
        }

        System.out.printf("Sum: %d%nCount: %d%n", sum, count);

    }
}
