import java.util.Scanner;

public class taulacremada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte burns = input.nextByte();
        String coordinates = "";

        for (byte i = 0; i <= burns; i++) {
            coordinates = input.nextLine();

            // System.out.printf("coords: %s%n", coordinates);
        }

        input.close();

        if (burns % 2 == 0) {
            System.out.println("SI");
        } else if (burns % 2 != 0) {
            System.out.println("NO");
        }

        // System.out.println(coordinates);
    }
}
