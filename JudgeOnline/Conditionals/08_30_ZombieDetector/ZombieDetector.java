import java.util.Scanner;

public class ZombieDetector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter body temperature:");
        float bodyTemperature = input.nextFloat();

        input.close();

        String result =
            bodyTemperature < 30.0 ? "Zombie detected!" : "Human detected!";
        System.out.println(result);
    }
}
