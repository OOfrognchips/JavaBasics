package a12_32_graphic2Square2;

import java.util.Scanner;

public class Graphic2Square2 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int numberLines = Integer.parseInt(input.nextLine());

        System.out.println("Enter character:");
        String printCharacter = input.nextLine();

        input.close();

        // Rows
        for (int i = 1; i <= numberLines; i++) {
            // Columns
            for (int j = 1; j <= numberLines; j++) {
                // System.out.printf("%s ", printCharacter);
                if (j == numberLines) {
                    System.out.printf("%s", printCharacter);
                } else if (j != numberLines) {
                    System.out.printf("%s ", printCharacter);
                }
            }
            System.out.println();
        }

    }

}
