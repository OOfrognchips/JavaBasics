package a12_01_countLetter;

import java.util.Scanner;

public class CountLetter {

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter text:");
        String userInput = input.nextLine().toLowerCase();

        if (userInput.isBlank()) {
            System.out.println("Text not entered");
        } else {
            System.out.println("Enter letter:");
            char character = input.next().charAt(0);

            for (int i = 0; i < userInput.length(); i++) {
                char userInputCharacter = userInput.charAt(i);
                if (Character.compare(character, userInputCharacter) == 0) {
                    count += 1;
                }
            }

            System.out.printf("Occurrences: %d%n", count);
        }

        input.close();

    }

}
