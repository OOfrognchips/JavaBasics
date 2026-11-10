package a12_05_reverseString;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String output = "";

        System.out.println("Enter a text:");
        String userInput = input.nextLine();

        input.close();

        if (userInput.isBlank()) {
            System.out.println("Text not entered");
        } else if (!userInput.isBlank()) {
            for (int i = userInput.length() - 1; i >= 0; i--) {
                // System.out.println(i);
                // System.out.println(length);
                // System.out.println(length - i);
                // char userInputCharacter = userInput.charAt(length - i);
                char userInputCharacter = userInput.charAt(i);

                output += userInputCharacter;
            }

            System.out.println(output);
        }

    }

}
