package a12_33_graphic3AscendingTriangle1;

import java.util.Scanner;

public class Graphic3AscendingTriangle1 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        // String output = "";

        System.out.println("Enter number of lines:");
        int inputNumberLines = Integer.parseInt(input.nextLine());

        System.out.println("Enter character:");
        // Method "next" returns an InputMismatchException if a character is not found
        char inputCharacter = input.findInLine(".").charAt(0);

        input.close();

        /*
        for (int i = 0; i < inputNumberLines; i++) {
        	output += inputCharacter;
        	System.out.printf("%s%n", output);
        }
        */

        for (int i = 1; i <= inputNumberLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(inputCharacter);
            }
            System.out.println();
        }

    }

}
