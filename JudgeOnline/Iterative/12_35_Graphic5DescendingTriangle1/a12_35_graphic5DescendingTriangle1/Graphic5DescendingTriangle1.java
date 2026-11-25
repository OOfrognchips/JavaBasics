package a12_35_graphic5DescendingTriangle1;

import java.util.Scanner;

public class Graphic5DescendingTriangle1 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int inputLines = Integer.parseInt(input.nextLine());

        System.out.println("Enter character:");
        char inputCharacter = input.findInLine(".").charAt(0);

        input.close();

        for (int i = inputLines; i >= 1; i--) {
            String output = "";
            for (int j = 1; j <= i; j++) {
                output += inputCharacter;
                ;
            }
            System.out.print(output);
            System.out.println();
        }

    }

}
