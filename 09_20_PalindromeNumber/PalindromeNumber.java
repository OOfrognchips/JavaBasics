import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        byte i = 0;
        int number = 0;
        String inputString = "";
        String output = "";
        byte countLength = 0;

        while (notValidInput) {
            System.out.println("Enter a positive number:");
            number = input.nextInt();

            if (number <= 0) {
                i++;
            } else if (number > 0) {
                inputString += number;
                while (number > 0) {
                    output += number % 10;
                    number = number / 10;
                    countLength += 1;
                }
                boolean validNumber = countLength >= 5 & countLength <= 7;

                if (inputString.equals(output) & validNumber) {
                    System.out.println("Valid code");
                } else if (inputString.equals(output) & !validNumber) {
                    System.out.println("Invalid code");
                } else if (!inputString.equals(output)) {
                    System.out.println("Invalid code");
                }
                notValidInput = false;
            }
        }
    }
}
