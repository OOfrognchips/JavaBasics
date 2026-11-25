package a12_38_graphic8Rhombus;

import java.util.Scanner;

public class Graphic8Rhombus {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int linesInput = Integer.parseInt(input.nextLine());

        System.out.println("Enter character:");
        char characterInput = input.findInLine(".").charAt(0);

        input.close();

        // Triangle 1
        for (int i = 1; i <= linesInput; i++) {
            String output = "";
            for (int j = linesInput; j > i; j--) {
                output += " ";
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                output += characterInput;
            }
            System.out.print(output);
            System.out.println();
        }

        // Triangle 2
        for (int i = linesInput - 1; i >= 1; i--) {
            String output = "";
            for (int j = i; j < linesInput; j++) {
                output += " ";
            }
            for (int k = (i * 2) - 1; k >= 1; k--) {
                output += characterInput;
            }
            System.out.print(output);
            System.out.println();
        }

    }

}
