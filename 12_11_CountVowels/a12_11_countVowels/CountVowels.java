package a12_11_countVowels;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        String userInput = input.nextLine();

        input.close();

        boolean isBlank = userInput.isBlank();
        int vowelCount = 0;

        if (isBlank) {
            System.out.println("Text not entered");
        } else if (!isBlank) {
            String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";

            for (int i = 0; i < userInput.length(); i++) {
                for (int j = 0; j < vowels.length(); j++) {
                    // String dummyUserInput = userInput.toUpperCase();

                    char userInputCharacter = userInput.charAt(i);
                    char currentLoopVowel = vowels.charAt(j);

                    boolean isLetter = Character.isLetter(userInputCharacter);

                    if (isLetter) {
                        int isVowel = Character.compare(
                            Character.toUpperCase(userInputCharacter),
                            currentLoopVowel);

                        if (isVowel == 0) {
                            // System.out.printf("%c %c%n", userInputCharacter, currentLoopVowel);
                            vowelCount += 1;
                        } // else if (isVowel != 0) {
                    }
                }
            }

            System.out.printf("Quantity of vowels: %d%n", vowelCount);
        }

    }

}
