import java.util.Scanner;

public class CountTextFixed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to find:");
        String initialText = input.nextLine();

        byte i = 1;
        byte count = 0;
        boolean notFinalIteration = true;
        while (i <= 10 & notFinalIteration) {
            System.out.printf("Enter text (%d):%n", i);
            String text = input.nextLine();

            if (text.equalsIgnoreCase(initialText)) {
                count += 1;
                notFinalIteration = true;
                i++;
            } else if (!text.equalsIgnoreCase(initialText)) {
                notFinalIteration = true;
                i++;
            } else if (i == 10) {
                notFinalIteration = false;
                // break;
            }
        }

        input.close();

        System.out.printf("Count: %d%n", count);
    }

}
