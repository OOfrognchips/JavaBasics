package a12_37_graphic7Pyramid;

import java.util.Scanner;

public class Graphic7Pyramid {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int linesInput = Integer.parseInt(input.nextLine());

        System.out.println("Enter character:");
        char inputCharacter = input.findInLine(".").charAt(0);

        input.close();

        for (int i = 1; i <= linesInput; i++) {
            String output = "";
            for (int j = linesInput; j > i; j--) {
                output += " ";
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                output += inputCharacter;
            }
            System.out.print(output);
            System.out.println();
        }

    }

}
