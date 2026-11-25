package a12_15_textWithMaxVowels;

import java.util.Scanner;

public class TextWithMaxVowels {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";
        boolean doNotEndLoop = true;

        int maxVowelCount = 0;
        String outputString = "";

        while (doNotEndLoop) {
            System.out.println("Enter text (enter to finish):");
            String userInput = input.nextLine();

            boolean isBlank = userInput.isBlank();
            // char nl = 0x000A;

            if (isBlank & maxVowelCount == 0) {
                System.out.println("Text not entered");
                doNotEndLoop = false;
                //} else if (Character.compare(userInput.charAt(0), nl) == 0) {
            } else if (isBlank) {
                doNotEndLoop = false;
            } else if (!isBlank) {
                int vowelCount = 0;
                for (int i = 0; i < userInput.length(); i++) {
                    for (int j = 0; j < vowels.length(); j++) {
                        char userInputCharacter =
                            Character.toLowerCase(userInput.charAt(i));
                        char vowelCharacter =
                            Character.toLowerCase(vowels.charAt(j));

                        int isVowel = Character.compare(userInputCharacter,
                            vowelCharacter);
                        boolean isLetter1 =
                            Character.isLetter(userInputCharacter),
                            isLetter2 = Character.isLetter(vowelCharacter);

                        if (isVowel == 0 & isLetter1 & isLetter2) {
                            vowelCount += 1;
                        }
                    }
                }

                if (vowelCount > maxVowelCount) {
                    maxVowelCount = vowelCount;
                    outputString = userInput;
                } else if (vowelCount == maxVowelCount) {
                    maxVowelCount = vowelCount;
                    outputString += String.format(", %s", userInput);
                }
            }
        }

        if (maxVowelCount != 0) {
            System.out.printf("Quantity of vowels: %d%nText: %s%n",
                maxVowelCount, outputString);
        }

        input.close();

    }

}
