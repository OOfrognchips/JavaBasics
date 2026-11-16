import java.util.Scanner;

public class supermariano1 {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);
        String output = "";

        // int casesToProcess = input.nextInt();
        int casesToProcess = Integer.parseInt(input.nextLine());

        if (casesToProcess <= 100) {

            for (int i = 0; i < casesToProcess; i++) {
                try {
                    int userInputNumber = Integer.parseInt(input.nextLine());

                    if (userInputNumber < 1000) {
                        // System.out.println("MUY");
                        output += String.format("%s%n", "MUY");
                    } else if (userInputNumber >= 1000) {
                        // System.out.println("MUCHO");
                        output += String.format("%s%n", "MUCHO");
                    }

                } catch (NumberFormatException exception) {
                    // System.out.println("COSA");
                    output += String.format("%s%n", "COSA");
                }

            }

        }

        input.close();

        System.out.print(output);

        System.out.println("MUCHAS GRACIAS");

    }

}
