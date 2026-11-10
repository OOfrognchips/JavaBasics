package a12_06_firstAndLastLetter;

import java.util.Scanner;

public class FirstAndLastLetter {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String output = "";
        int count = 0;
        boolean doNotEndInput = true;

        while (doNotEndInput) {
            System.out.println("Enter word:");
            String userInput = input.next();

            if (!userInput.equalsIgnoreCase("end")) {
                if (userInput.length() >= 2) {
                    char firstCharacter = userInput.charAt(0);
                    char lastCharacter =
                        userInput.charAt(userInput.length() - 1);
                    if (Character.isLetter(firstCharacter)
                        & Character.isLetter(lastCharacter))
                    {
                        if (Character.compare(
                            Character.toLowerCase(firstCharacter),
                            Character.toLowerCase(lastCharacter)) == 0)
                        {
                            output += String.format("%s%n", userInput);
                            count += 1;
                        }
                    }
                }
            } else if (userInput.equalsIgnoreCase("end")) {
                doNotEndInput = false;
            }
        }

        if (count != 0) {
            System.out.printf("Total words: %d%n%s", count, output);
        } else if (count == 0) {
            System.out.println("No words entered");
        }

        input.close();

    }

}
