import java.util.Scanner;

public class Keyword {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		byte count = 1;
		while (true) {

			System.out.println("Enter word:");
			String word = input.next();

			if (word.equalsIgnoreCase("end")) {
				break;
			} else if (!word.equalsIgnoreCase("end")) {
				count += 1;
				continue;
			}
		}

		input.close();

		System.out.printf("Attempts = %d%n", count);
}
}
