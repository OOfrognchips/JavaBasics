import java.util.Scanner;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean doNotEndLoop = true;
        byte i = 0;
        int count = 0;
        double storage = 0;

        while (doNotEndLoop) {
            System.out.println("Enter temperature (999 to finish):");
            double temperature = input.nextDouble();

            if (temperature == 999) {
                doNotEndLoop = false;
            } else if (temperature < -10.0 & temperature > 49.0) {
                i++;
            } else if (temperature >= -10.0 & temperature <= 49.0) {
                count += 1;
                storage += temperature;
                i++;
            }
        }
        input.close();

        if (count == 0) {
            System.out.println("No valid temperatures");
        } else if (count != 0) {
            System.out.printf("Average: %.2f%n", storage / count);
        }

    }
}
