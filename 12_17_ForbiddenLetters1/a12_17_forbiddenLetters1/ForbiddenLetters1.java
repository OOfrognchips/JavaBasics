package a12_17_forbiddenLetters1;

import java.util.Scanner;

public class ForbiddenLetters1 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        final String forbiddenLetters = "çñwzqx";

        System.out.println("Enter a text:");
        String userInput = input.nextLine();

        boolean ifForbiddenLetters = false;

        input.close();

        for (int i = 0; i < userInput.length(); i++) {
            for (int j = 0; j < forbiddenLetters.length(); j++) {
                char userInputCharacter =
                    Character.toLowerCase(userInput.charAt(i));
                char forbiddenLetterCharacter = forbiddenLetters.charAt(j);

                int forbiddenLetter = Character.compare(userInputCharacter,
                    forbiddenLetterCharacter);

                if (forbiddenLetter == 0) {
                    ifForbiddenLetters = true;
                    break;
                }

            }
        }

        if (ifForbiddenLetters) {
            System.out.println("Text contains special letters");
        } else if (!ifForbiddenLetters) {
            System.out.println("Text does not contain special letters");
        }

    }

}
