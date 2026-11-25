package a12_31_graphic1Square1;

import java.util.Scanner;

public class Graphic1Square1 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int numberLines = Integer.parseInt(input.nextLine());

        System.out.println("Enter character:");
        String outputCharacter = input.nextLine();

        input.close();

        // Rows
        for (int i = 1; i <= numberLines; i++) {
            // Columns
            for (int j = 1; j <= numberLines; j++) {
                System.out.print(outputCharacter);
                // if (j == numberLines) {
                // System.out.printf("%s%n", outputCharacter);
                // break;
                // }
            }
            System.out.println();
        }

    }

}
