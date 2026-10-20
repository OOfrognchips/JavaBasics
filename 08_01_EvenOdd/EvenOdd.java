import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int result = number % 2;

        if (result == 0) {
            System.out.printf("The number %d is even%n", number);
        } else if (result != 0) {
            System.out.printf("The number %d is odd%n", number);
        }
    }
}
