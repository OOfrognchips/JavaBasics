import java.util.Scanner;

public class CountNumbersAlternative {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		byte count0 = 0;
		byte count1 = 0;
		byte count2 = 0;
		byte count3 = 0;
		byte count4 = 0;
		byte count5 = 0;
		byte count6 = 0;
		byte count7 = 0;
		byte count8 = 0;
		byte count9 = 0;

		byte number;
		byte i = 0;

		System.out.println("Enter a number between 0 and 9. Enter -1 to finish:");

		while (true) {
			number = input.nextByte();

			if (number == -1) {
				break;
			} else if (number < 0 | number > 9) {
				System.out.println("Invalid number. Enter between 0 and 9. Enter -1 to finish.");
			} else if (number >= 0 & number <= 9) {
				switch (number) {
					case 0 -> count0 += 1;
					case 1 -> count1 += 1;
					case 2 -> count2 += 1;
					case 3 -> count3 += 1;
					case 4 -> count4 += 1;
					case 5 -> count5 += 1;
					case 6 -> count6 += 1;
					case 7 -> count7 += 1;
					case 8 -> count8 += 1;
					case 9 -> count9 += 1;
					// default -> ;
				}
			}
		}

		input.close();

		System.out.printf("Total 0: %d%n", count0);
		System.out.printf("Total 1: %d%n", count1);
		System.out.printf("Total 2: %d%n", count2);
		System.out.printf("Total 3: %d%n", count3);
		System.out.printf("Total 4: %d%n", count4);
		System.out.printf("Total 5: %d%n", count5);
		System.out.printf("Total 6: %d%n", count6);
		System.out.printf("Total 7: %d%n", count7);
		System.out.printf("Total 8: %d%n", count8);
		System.out.printf("Total 9: %d%n", count9);
}
}
