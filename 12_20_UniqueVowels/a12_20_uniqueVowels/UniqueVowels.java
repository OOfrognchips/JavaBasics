package a12_20_uniqueVowels;

import java.util.Scanner;

public class UniqueVowels {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String vowels = "AEIOUÀÈÒÙÁÉÍÓÚÄËÏÖÜÂÊÎÔÛ", vowelsFound = "";

        System.out.println("Enter text:");
        String userInput = input.nextLine();

        input.close();

        boolean ifBlank = userInput.isBlank();

        if (ifBlank) {
            System.out.println("Text not entered");
        } else if (!ifBlank) {
            for (int i = 0; i < userInput.length(); i++) {
                char userInputCharacter = userInput.charAt(i);
                for (int j = 0; j < vowels.length(); j++) {
                    char vowelsCharacter = vowels.charAt(j);

                    int equalCharacter = Character.compare(
                        Character.toUpperCase(userInputCharacter),
                        vowelsCharacter);

                    if (equalCharacter == 0) {
                        boolean isCharacterRepeatedInOutput = false;

                        for (int k = 0; k < vowelsFound.length(); k++) {
                            char vowelsFoundCharacter = vowelsFound.charAt(k);

                            int characterInOutput = Character
                                .compare(vowelsCharacter, vowelsFoundCharacter);

                            if (characterInOutput == 0) {
                                isCharacterRepeatedInOutput = true;
                                break;
                            } else if (characterInOutput != 0) {
                                isCharacterRepeatedInOutput = false;
                                continue;
                            }

                        }
                        if (!isCharacterRepeatedInOutput) {
                            vowelsFound += vowelsCharacter;
                            break;
                        } else if (isCharacterRepeatedInOutput) {
                            continue;
                        }
                    } else if (equalCharacter != 0) {
                        continue;
                    }
                }
            }

            System.out.printf("Unique vowels found: %s%n", vowelsFound);
        }

    }

}
