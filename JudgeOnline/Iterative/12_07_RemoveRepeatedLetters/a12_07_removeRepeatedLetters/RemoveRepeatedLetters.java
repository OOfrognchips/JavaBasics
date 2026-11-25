package a12_07_removeRepeatedLetters;

import java.util.Scanner;

public class RemoveRepeatedLetters {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String output = "";

        System.out.println("Enter a text:");
        String userInput = input.nextLine();

        input.close();

        if (userInput.isBlank()) {
            System.out.println("Text not entered");
        } else if (!userInput.isBlank()) {
            for (int i = 0; i < userInput.length(); i++) {
                char userInputCharacter = userInput.charAt(i);

                if (i == 0) {
                    output += userInput.charAt(0);
                } else if (i != 0 & i != userInput.length() - 1) {
                    // int previousCharacter = Character.compare(userInput.charAt(i-1), userInputCharacter);
                    int nextCharacter = Character.compare(userInputCharacter,
                        userInput.charAt(i + 1));
                    if (nextCharacter == 0) {
                        output += "";
                    } else if (nextCharacter != 0) {
                        output += userInputCharacter;
                    }
                } else if (i == userInput.length() - 1) {
                    output += userInput.charAt(i);
                }
            }

            System.out.printf("Clean text: %s%n", output);
        }

    }

}
