import java.util.Scanner;

public class CountEvens {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte count = 0;
        String output = "";

        while (true) {
            System.out.println("Enter number:");
            byte number = input.nextByte();

            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                count += 1;
                output = output + " " + number;
            } else if (number % 2 != 0) {
                continue;
            }
        }

        input.close();

        System.out.printf("Even numbers: %d%nNumbers:%s%n", count, output);
    }
}
