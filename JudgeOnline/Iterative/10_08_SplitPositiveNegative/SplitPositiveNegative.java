import java.util.Scanner;

public class SplitPositiveNegative {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String positiveInput = "", negativeInput = "";

        for (byte i = 1; i <= 10; i++) {
            System.out.printf("Enter a number [%d]:%n", i);
            int userInput = input.nextInt();

            if (userInput >= 0) {
                positiveInput += " " + userInput;
            } else if (userInput < 0) {
                negativeInput += " " + userInput;
            }
        }

        input.close();
        System.out.printf("Positive or zero:%s%nNegative:%s%n", positiveInput,
            negativeInput);
    }

}
