import java.util.Scanner;

public class TemperatureSensor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature from sensor 1:");
        byte temperature1 = input.nextByte();

        System.out.println("Enter temperature from sensor 2:");
        byte temperature2 = input.nextByte();

        System.out.println("Enter temperature from sensor 3:");
        byte temperature3 = input.nextByte();

        input.close();

        byte highestTemperature = temperature1;
        byte max;

        // The exercise does not seem to consider temperatures with equal values

        if (temperature1 > 30 & temperature2 > 30 & temperature3 > 30) {
            System.out.println("Temperature: ERROR");
        } else if (temperature1 > 30) {
            temperature1 = 0;
            if (temperature2 > 30) {
                System.out.printf("Temperature: %d%n", temperature3);
            } else if (temperature3 > 30) {
                System.out.printf("Temperature: %d%n", temperature2);
            } else if (temperature2 < 30 & temperature3 < 30) {
                max = (byte)Math.max(temperature2, temperature3);
                System.out.printf("Temperature: %d%n", max);
            }
        } else if (temperature2 > 30) {
            temperature2 = 0;
            if (temperature1 > 30) {
                System.out.printf("Temperature: %d%n", temperature3);
            } else if (temperature3 > 30) {
                System.out.printf("Temperature: %d%n", temperature1);
            } else if (temperature1 < 30 & temperature3 < 30) {
                max = (byte)Math.max(temperature1, temperature3);
                System.out.printf("Temperature: %d%n", max);
            }
        } else if (temperature3 > 30) {
            temperature3 = 0;
            if (temperature2 > 30) {
                System.out.printf("Temperature: %d%n", temperature1);
            } else if (temperature1 > 30) {
                System.out.printf("Temperature: %d%n", temperature2);
            } else if (temperature1 < 30 & temperature2 < 30) {
                max = (byte)Math.max(temperature1, temperature2);
                System.out.printf("Temperature: %d%n", max);
            }
        } else if (temperature1 < 30 & temperature2 < 30 & temperature3 < 30) {
            if (highestTemperature < temperature2) {
                // temperature1 < temperature2
                highestTemperature = temperature2;
                if (highestTemperature < temperature3) {
                    // temperature2 < temperature3
                    System.out.printf("Temperature: %d%n", temperature3);
                } else if (highestTemperature > temperature3) {
                    // temperature2 > temperature3
                    System.out.printf("Temperature: %d%n", temperature2);
                }
            } else if (highestTemperature > temperature2) {
                // temperature1 > temperature2
                // highestTemperature = temperature1, still
                if (highestTemperature < temperature3) {
                    //temperature1 < temperature3
                    System.out.printf("Temperature: %d%n", temperature3);
                } else if (highestTemperature > temperature3) {
                    // temperature1 > temperature3
                    System.out.printf("Temperature: %d%n", temperature1);
                }
            }
        }
    }
}
