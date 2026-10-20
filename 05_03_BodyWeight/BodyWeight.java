import java.util.Scanner;

public class BodyWeight {

    public static void main(String[] args) {

        final byte K_MEN = 4;
        final float K_WOMEN = 2.5f;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in cm:");
        float height = input.nextFloat();

        System.out.println("Enter your age:");
        float age = input.nextFloat();

        float formulaMen =
            height - 100 - (height - 150) / 4 + (age - 20) / (float)K_MEN;
        float formulaWomen =
            height - 100 - (height - 150) / 4 + (age - 20) / K_WOMEN;

        input.close();

        System.out.printf(
            "Ideal Body Weight for Men = %.2fkg%nIdeal Body Weight for Women = %.2fkg%n",
            formulaMen, formulaWomen);
    }
}
