import java.util.Scanner;

public class CountText {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to find:");
        String initialText = input.nextLine();

        byte i = 1;
        byte count = 0;
        while (i <= 10) {
            System.out.printf("Enter text (%d):%n", i);
            String text = input.nextLine();

            if (text.equalsIgnoreCase(initialText)) {
                count += 1;
                i++;
            } else if (!text.equalsIgnoreCase(initialText)) {
                i++;
            } else if (i == 10) {
                break;
            }
        }

        input.close();

        System.out.printf("Count: %d%n", count);
    }

}
