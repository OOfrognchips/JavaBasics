package a12_09_longestText;

import java.util.Scanner;

public class LongestText {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int storageLength = 0;
        String longestText = "";

        while (notValidInput) {
            System.out.println("Enter a text (END to finish):");
            String userInput = input.nextLine();
            boolean endInput = userInput.equalsIgnoreCase("end");

            if (!endInput) {
                if (storageLength == 0) {
                    storageLength = userInput.length();
                    longestText = userInput;
                } else if (storageLength != 0
                    & storageLength < userInput.length())
                {
                    storageLength = userInput.length();
                    longestText = userInput;
                }
            } else if (endInput) {
                if (storageLength == 0) {
                    System.out.println("Text not entered");
                } else if (storageLength != 0) {
                    System.out.printf("Longest text length: %d%nText: %s%n",
                        storageLength, longestText);
                }
                notValidInput = false;
            }
        }

        input.close();

    }

}
