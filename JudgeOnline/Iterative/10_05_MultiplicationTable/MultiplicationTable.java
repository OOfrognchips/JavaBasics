import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");

        int number = input.nextInt();

        input.close();

        for (byte i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

    }

}
