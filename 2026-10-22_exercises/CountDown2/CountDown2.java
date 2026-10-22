import java.util.Scanner;

public class CountDown2 {


		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			byte number;
			while (true) {
				System.out.println("Enter number >= 10:");
				number = input.nextByte();

				if (number >= 10) {
					break;
				} else if (number < 10) {
					continue;
				}
			}

			input.close();

			byte i = 0;
			while (i < number) {
				System.out.printf("%d ", number - i);
				i++;
			}
}
}
