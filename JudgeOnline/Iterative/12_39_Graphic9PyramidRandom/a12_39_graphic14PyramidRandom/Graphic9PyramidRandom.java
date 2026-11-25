package a12_39_graphic14PyramidRandom;

import java.util.Scanner;

public class Graphic9PyramidRandom {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int linesInput = Integer.parseInt(input.nextLine());

        input.close();

        String letters = "+~ox*O";

        // Triangle 1
        for (int i = 1; i <= linesInput; i++) {
            String output = "";
            for (int j = linesInput; j > i; j--) {
                output += " ";
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (i == 1) {
                    char star = 0x2605;
                    output += star;
                } else if (i != 1) {
                    int randomValue = (int)(Math.random() * (5 - 0 + 1)) + 0;
                    output += letters.charAt(randomValue);
                }
            }
            System.out.print(output);
            System.out.println();
        }

    }

}
