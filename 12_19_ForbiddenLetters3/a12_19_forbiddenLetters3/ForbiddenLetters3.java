package a12_19_forbiddenLetters3;

import java.util.Scanner;

public class ForbiddenLetters3 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        final String forbiddenLetters = "çñwzqx";

        System.out.println("Enter a text:");
        String userInput = input.nextLine();

        boolean ifForbiddenLetters = false;

        String outputInformation = "";

        input.close();

        for (int i = 0; i < userInput.length(); i++) {
            char userInputCharacter = userInput.charAt(i);
            for (int j = 0; j < forbiddenLetters.length(); j++) {
                char forbiddenLetterCharacter = forbiddenLetters.charAt(j);

                int forbiddenLetter =
                    Character.compare(Character.toLowerCase(userInputCharacter),
                        forbiddenLetterCharacter);

                if (forbiddenLetter == 0) {
                    ifForbiddenLetters = true;

                    boolean isLetterRepeatedInOutput = false;
                    for (int k = 0; k < outputInformation.length(); k++) {
                        char outputInformationLetter =
                            outputInformation.charAt(k);

                        int letterInsideOutput = Character.compare(
                            outputInformationLetter, forbiddenLetterCharacter);

                        if (letterInsideOutput == 0) {
                            isLetterRepeatedInOutput = true;
                            break;
                        }
                    }

                    if (!isLetterRepeatedInOutput) {
                        outputInformation += forbiddenLetterCharacter;
                    }
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
