import java.util.Scanner;

public class TextSearch {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        byte texts = 0, i = 0, countSensitive = 0, countInsensitive = 0;

        while (notValidInput) {
            System.out.println("How many texts?");
            texts = input.nextByte();

            if (texts > 0) {
                notValidInput = false;
            }
        }

        System.out.println("Word to search for:");
        String word = input.next();

        for (i = 1; i <= texts; i++) {
            System.out.printf("Enter text %d:%n", i);
            String texti = input.next();

            if (texti.equals(word)) {
                countSensitive += 1;
            } else if (texti.equalsIgnoreCase(word)) {
                countInsensitive += 1;
            }
        }

        System.out.printf("Exact matches: %d%nMatches ignoring case: %d%n",
            countSensitive, countInsensitive);

    }

}
