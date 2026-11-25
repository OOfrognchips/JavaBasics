import java.util.Scanner;

public class Calories {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter calories to burn:");
        float calories = input.nextFloat();

        System.out.println("Enter MET value:");
        float METvalue = input.nextFloat();

        System.out.println("Enter your weight in kg:");
        float weight = input.nextFloat();

        float formula =
            (calories * (float)200) / (METvalue * (float)3.5 * weight);
        float resultSeconds = (formula * (float)60) % (float)60;

        if (resultSeconds < (float)10) {
            System.out.printf("Running time: %d:0%d%n", (short)formula,
                (short)resultSeconds);
        } else {
            System.out.printf("Running time: %d:%d%n", (short)formula,
                (short)resultSeconds);
        }
    }
}
