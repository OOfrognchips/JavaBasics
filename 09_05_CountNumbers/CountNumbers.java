import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		// One could use an array here...
		/*
		byte count0;
		byte count1;
		byte count2;
		byte count3;
		byte count4;
		byte count5;
		byte count6;
		byte count7;
		byte count8;
		byte count9;
		*/

		byte number;
		byte[] count = new byte[10];

		System.out.println("Enter a number between 0 and 9. Enter -1 to finish:");

		while (true) {
			number = input.nextByte();

			if (number == -1) {
				break;
			} else if (number < 0 | number > 9) {
				System.out.println("Invalid number. Enter between 0 and 9. Enter -1 to finish.");
			} else if (number >= 0 & number <= 9) {
				count[number] += 1;
			}
		}

		input.close();

		byte i = 0;
		while (i <= 9) {
			System.out.printf("Total %d: %d%n", i, count[i]);
			i++;
		}
}
}
