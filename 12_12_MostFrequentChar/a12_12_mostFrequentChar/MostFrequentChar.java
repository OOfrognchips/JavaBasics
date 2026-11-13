package a12_12_mostFrequentChar;

import java.util.Scanner;

public class MostFrequentChar {

	public static void main(String[] arguments) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter text:");
		String userInput = input.nextLine();

		int maxCharacterCount = 0;
		char mostFrequentCharacter = userInput.charAt(0);

		input.close();

		for (int i = 0; i < userInput.length(); i++) {
			int characterCount = 0;
			char userInputCharacter1 = Character.toLowerCase(userInput.charAt(i));

			for (int j = 0; j < userInput.length(); j++) {
				char userInputCharacter2 = Character.toLowerCase(userInput.charAt(j));

				boolean isLetter1 = Character.isLetter(userInputCharacter1), isLetter2 = Character.isLetter(userInputCharacter2);
				int characterCompare = Character.compare(userInputCharacter1, userInputCharacter2);

				if (isLetter1 & isLetter2) {
					if (characterCompare == 0) {
						characterCount += 1;
					}
				}

			}

			if (characterCount > maxCharacterCount) {
				maxCharacterCount = characterCount;
				mostFrequentCharacter = userInputCharacter1;
			}

		}

		String outputTimesString = "";

		if (maxCharacterCount == 1) {
			outputTimesString = "time";
		} else if (maxCharacterCount != 1) {
			outputTimesString = "times";
		}

		System.out.printf("Most freqüent character: '%c' appears %d %s%n", mostFrequentCharacter, maxCharacterCount, outputTimesString);

}

}
