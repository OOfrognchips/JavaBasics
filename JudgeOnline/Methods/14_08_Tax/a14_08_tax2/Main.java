package a14_08_tax2;

import java.util.Scanner;

import a14_08_tax2.Tax;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static void menu() {
		System.out.println("1. Calculate tax from price");
		System.out.println("2. Calculate price with tax");
		System.out.println("3. Get tax from price");
	}

	public static byte chooser(String text) {
		byte chosenOption = 0;

		System.out.println(text);
		while (input.hasNextByte() == false) {
			input.nextLine();
			System.out.printf("Error! %s%n", text);
		}
		chosenOption = input.nextByte();
		return chosenOption;
	}

	public static void main(String[] arguments) {
		menu();

		byte option = chooser("Option:");

		/*
		switch (option) {
			case 1:
				System.out.println("Option 1 selected");
				break;
			case 2:
				System.out.println("Option 2 selected");
				break;
			case 3:
				System.out.println("Option 3 selected");
				break;
			default:
				System.out.println("Option not valid!");
		}
		*/

		System.out.println("Enter the price:");
		float price = input.nextFloat();

		input.close();

		float output = 0;

		switch (option) {
			case 1:
				output = Tax.tax(price);
				System.out.printf("Tax for %.2f is %.2f%n", price, output);
				break;
			case 2:
				output = Tax.priceWithTax(price);
				System.out.printf("Price with tax: %.2f%n", output);
				break;
			case 3:
				output = Tax.getTaxFromPrice(price);
				System.out.printf("Tax included in %.2f is %.2f%n", price, output);
				break;
			// default:
		}
	}

}
