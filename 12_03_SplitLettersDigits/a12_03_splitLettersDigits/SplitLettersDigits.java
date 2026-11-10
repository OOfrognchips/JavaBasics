package a12_03_splitLettersDigits;

import java.util.Scanner;

public class SplitLettersDigits {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String alphabeticalOutput = "", numericalOutput = "";

        System.out.println("Enter text:");
        String userInput = input.nextLine();

        input.close();

        if (userInput.isBlank()) {
            System.out.println("Text not entered");
        } else if (!userInput.isBlank()) {
            for (int i = 0; i < userInput.length(); i++) {
                char userInputCharacter = userInput.charAt(i);

                if (Character.isLetter(userInputCharacter)) {
                    alphabeticalOutput += userInputCharacter;
                } else if (Character.isDigit(userInputCharacter)) {
                    numericalOutput += userInputCharacter;
                } // else if (Character.isWhitespace() {}
            }

            System.out.printf("Letters: %s%nDigits: %s%n", alphabeticalOutput,
                numericalOutput);
        }
    }

}
