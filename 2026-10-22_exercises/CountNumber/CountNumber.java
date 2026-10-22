import java.util.Scanner;

public class CountNumber {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		byte i = 0;
		byte count = 0;
		while (i < 10) {
			System.out.println("Enter number:");
			byte number = input.nextByte();

			if (number == 5) {
				count += 1;
			}
			i++;
		}

		input.close();

		System.out.printf("Count: %d%n", count);
}
}
