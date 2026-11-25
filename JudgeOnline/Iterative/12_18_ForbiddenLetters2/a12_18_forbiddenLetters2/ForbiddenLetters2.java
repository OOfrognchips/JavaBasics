package a12_18_forbiddenLetters2;

import java.util.Scanner;

public class ForbiddenLetters2 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        final String forbiddenLetters = "çñwzqx";

        System.out.println("Enter a text:");
        String userInput = input.nextLine();

        boolean ifForbiddenLetters = false;

        String outputInformation = "";

        input.close();

        for (int i = 0; i < userInput.length(); i++) {
            for (int j = 0; j < forbiddenLetters.length(); j++) {
                char userInputCharacter = userInput.charAt(i);
                char forbiddenLetterCharacter = forbiddenLetters.charAt(j);

                int forbiddenLetter =
                    Character.compare(Character.toLowerCase(userInputCharacter),
                        forbiddenLetterCharacter);

                if (forbiddenLetter == 0) {
                    ifForbiddenLetters = true;
                    outputInformation += userInputCharacter;
                    break;
                }

            }
        }

        if (ifForbiddenLetters) {
            System.out.println("Text contains special letters");
            System.out.printf("Forbidden letters: %s%n", outputInformation);
        } else if (!ifForbiddenLetters) {
            System.out.println("Text does not contain special letters");
        }

    }

}
