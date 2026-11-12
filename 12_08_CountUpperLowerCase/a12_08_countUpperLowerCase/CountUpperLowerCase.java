package a12_08_countUpperLowerCase;

import java.util.Scanner;

public class CountUpperLowerCase {

	public static void main(String[] arguments) {

		Scanner input = new Scanner(System.in);

		int uppercaseCount = 0, lowercaseCount = 0;

		System.out.println("Enter a text:");
		String userInput = input.nextLine();

		input.close();

		if (userInput.isBlank()) {
			System.out.println("Text not entered");
		} else if (!userInput.isBlank()) {
			for (int i = 0; i < userInput.length(); i++) {
				char userInputCharacter = userInput.charAt(i);
				boolean isLetter = Character.isLetter(userInputCharacter);
				boolean isUppercase = Character.isUpperCase(userInputCharacter);
				boolean isLowercase = Character.isLowerCase(userInputCharacter);

				if (isLetter) {
					if (isUppercase) {
						uppercaseCount += 1;
					} else if (isLowercase) {
						lowercaseCount += 1;
					}
				}
			}

			System.out.printf("Uppercase = %d%nLowercase = %d%n", uppercaseCount, lowercaseCount);
		}

}

}
