package a12_02_replaceSpaces;

import java.util.Scanner;

public class ReplaceSpaces {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String output = "";

        System.out.println("Enter text:");
        String userInput = input.nextLine();

        if (userInput.isBlank()) {
            System.out.println("Text not entered");
        } else if (!userInput.isBlank()) {
            for (int i = 0; i < userInput.length(); i++) {
                char userInputCharacter = userInput.charAt(i);
                // Not a robust method :c
                if (Character.isWhitespace(userInputCharacter)) {
                    // userInput.replace(' ', '_');
                    output += "_";
                } else if (!Character.isWhitespace(userInputCharacter)) {
                    output += userInputCharacter;
                }
            }

            System.out.println(output);
        }

        input.close();

    }

}
