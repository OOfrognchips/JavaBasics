import java.util.Scanner;

public class ShowRange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the starting number:");
		short start = input.nextShort();

		boolean notValidInput = true;
		while (notValidInput) {
			System.out.println("Enter the ending number:");
			short end = input.nextShort();

			if (end > start) {
				for (short i = start; i <= end; i++) {
					if (i == end) {
						System.out.printf("%d%n", i);
					} else if (i != end) {
						System.out.printf("%d ", i);
					}
				}
				notValidInput = false;
			}

			/*} else if (end <= start) {
				
			}*/

		}
		input.close();
}
}
