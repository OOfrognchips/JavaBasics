package a14_04_integerCalculator;

import java.util.Scanner;

public class IntegerCalculator {

	public static int add(int x, int y) {
		int result = x + y;
		return result;
	}

	public static int subtract(int x, int y) {
		int result = x - y;
		return result;
	}

	public static int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

	public static int divide(int x, int y) {
		int result = x / y;
		return result;
	}

	public static int modulo(int x, int y) {
		int result = x % y;
		return result;
	}

	public static double power(int x, int y) {
		double result = Math.pow(x, y);
		return result;
	}

	public static int minimum(int x, int y) {
		int result = Math.min(x, y);
		return result;
	}

	public static int maximum(int x, int y) {
		int result = Math.max(x, y);
		return result;
	}

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int x = input.nextInt();

		System.out.println("Enter the second number:");
		int y = input.nextInt();

		input.close();

		System.out.printf("Add = %d%n", add(x, y));
		System.out.printf("Subtract = %d%n", subtract(x, y));
		System.out.printf("Multiply = %d%n", multiply(x, y));
		System.out.printf("Divide = %d%n", divide(x, y));
		System.out.printf("Modulo = %d%n", modulo(x, y));
		System.out.printf("Power = %.1f%n", power(x, y));
		System.out.printf("Minimum = %d%n", minimum(x, y));
		System.out.printf("Maximum = %d%n", maximum(x, y));
	}

}
