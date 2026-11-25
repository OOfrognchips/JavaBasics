import java.util.Scanner;

public class CodeDecoder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        byte i = 0;
        String output = "";

        while (notValidInput) {
            System.out.println("Enter secret code > 0:");
            int number = input.nextInt();

            if (number <= 0) {
                i++;
            } else if (number > 0) {
                while (number > 0) {
                    int character = number % 10;
                    switch (character) {
                        case 1 -> output = "I" + output;
                        case 2 -> output = "Z" + output;
                        case 3 -> output = "E" + output;
                        case 4 -> output = "A" + output;
                        case 5 -> output = "S" + output;
                        case 6 -> output = "G" + output;
                        case 7 -> output = "T" + output;
                        case 8 -> output = "B" + output;
                        case 9 -> output = "P" + output;
                        case 0 -> output = "O" + output;
                        default -> System.out.println("null");
                    }
                    number = number / 10;
                }
                notValidInput = false;
            }
        }

        System.out.printf("Decoded message: %s%n", output);
    }

}
