import java.util.Scanner;

public class SumEvenToX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte number;
        while (true) {
            System.out.println("Enter number:");
            number = input.nextByte();

            if (number > 2) {
                break;
            } else if (number <= 2) {
                continue;
            }
        }

        input.close();

        byte i = 0;
        byte total = 0;
        while (i < number) {
            i++;
            if (i % 2 == 0) {
                total += i;
            } else if (i % 2 != 0) {
                continue;
            }
        }

        System.out.printf("Total = %d%n", total);
    }

}
