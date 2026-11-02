import java.util.Scanner;

public class ShowRange2 {

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the starting number:");
		int start = input.nextInt();

		boolean notValidInput = true;

		while (notValidInput) {
			System.out.println("Enter the ending number:");
			int end = input.nextInt(), i;

			if (start != end) {
				if (start > end) {
					for (i = start; i >= end; i--) {
						if (i == end) {
							System.out.printf("%d%n", i);
						} else if (i != end) {
							System.out.printf("%d ", i);
						}
					}
				} else if (start < end) {
					for (i = start; i <= end; i++) {
						if (i == end) {
							System.out.printf("%d%n", i);
						} else if (i != end) {
							System.out.printf("%d ", i);
						}
					}
				}
			notValidInput = false;
			}
		}

		input.close();
}
}
