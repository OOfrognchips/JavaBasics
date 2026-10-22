import java.util.Scanner;

public class CountDown {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number:");
		byte number = input.nextByte();

		input.close();

		byte i = 0;
		while (i < number) {
			System.out.printf("%d ", number - i);
			i++;
		}
}
}
