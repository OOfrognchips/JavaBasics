import java.util.Scanner;

public class CountNumber2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte number1;
        while (true) {

            System.out.println("Enter number > 0:");
            number1 = input.nextByte();

            if (number1 > 0) {
                break;
            } else if (number1 <= 0) {
                continue;
            }
        }

        byte i = 0;
        byte count = 0;

        while (i < 10) {
            System.out.println("Enter number:");
            byte number2 = input.nextByte();
            i++;

            if (number2 == number1) {
                count += 1;
            } else if (number2 != number1) {
                continue;
            }
        }

        input.close();

        System.out.printf("Count: %d%n", count);
    }
}
