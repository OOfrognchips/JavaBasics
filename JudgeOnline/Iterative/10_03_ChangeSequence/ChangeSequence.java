import java.util.Scanner;

public class ChangeSequence {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = input.nextInt(), end = 0, i;

        boolean notValidInput = true;

        while (notValidInput) {

            System.out.println("Enter the ending number:");
            end = input.nextInt();
            if (end > start) {
                notValidInput = false;
            }
        }

        input.close();

        // System.out.println(start + " " + end);

        for (i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (i == end) {
                    System.out.printf("%d%n", i * 2);
                } else if (i != end) {
                    System.out.printf("%d ", i * 2);
                }
            } else if (i % 2 != 0) {
                if (i == end) {
                    System.out.printf("%d%n", i / 2);
                } else if (i != end) {
                    System.out.printf("%d ", i / 2);
                }
            }
        }

    }

}
