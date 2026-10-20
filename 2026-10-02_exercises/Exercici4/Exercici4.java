import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 cities separated by spaces:");

        for (byte i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.printf("Cities:%n%s%n", input.next());
            } else if (i != 1) {
                System.out.printf("%s%n", input.next());
            }
        }
    }
}
