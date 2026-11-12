package a12_10_palindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] arguments) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter word:");
		String userInput = input.nextLine();

		input.close();

		boolean isBlank = userInput.isBlank();

		if (isBlank) {
			System.out.println("Word not entered");
		} else if (!isBlank) {
			String dummyUserInput = userInput.toLowerCase(), dummyWord = "";

			for (int i = dummyUserInput.length() - 1; i >= 0; i--) {
				dummyWord += dummyUserInput.charAt(i);
			}

			boolean palindromeWord = dummyUserInput.equals(dummyWord);

			if (palindromeWord) {
				System.out.println("Palindrome: true");
			} else if (!palindromeWord) {
				System.out.println("Palindrome: false");
			}
		}

}

}
