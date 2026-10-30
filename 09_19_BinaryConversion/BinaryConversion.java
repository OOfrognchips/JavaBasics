import java.util.Scanner;

public class BinaryConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        byte i = 0;
        String output = "";

        while (notValidInput) {
            System.out.println("Enter a positive number:");
            int number = input.nextInt();

            if (number <= 0) {
                i++;
            } else if (number > 0) {
                while (number > 0) {
                    int newNumber = number % 2;
                    output = newNumber + output;
                    number = number / 2;
                }
                notValidInput = false;
            }
        }
        System.out.printf("Binary: %s%n", output);
    }
}
