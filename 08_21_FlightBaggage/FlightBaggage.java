import java.util.Scanner;

public class FlightBaggage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter fare type (Basic/Flex):");
        String fareType = input.next();

        System.out.println("Enter baggage weight (kg):");
        float weight = input.nextFloat();

        System.out.println("Enter baggage length (cm):");
        float length = input.nextFloat();

        System.out.println("Enter baggage width (cm):");
        float width = input.nextFloat();

        System.out.println("Enter baggage height (cm):");
        float height = input.nextFloat();

        input.close();

        float newWeightCharge;
        float totalSize = length + width + height;

        if (fareType.equalsIgnoreCase("basic")) {
            if (weight > 20 & weight <= 32) {
                newWeightCharge = ((byte)weight - 20) * 10;
                if (totalSize > 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge + 35);
                } else if (totalSize <= 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge);
                }
            } else if (weight <= 20) {
                if (totalSize > 158) {
                    System.out.println("Extra baggage cost: 35.00 €");
                } else if (totalSize <= 158) {
                    System.out.println("Extra baggage cost: 0.00 €");
                }
            } else if (weight > 32) {
                newWeightCharge = (((byte)weight - 20) * 10) + 35;
                if (totalSize > 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge + 35);
                } else if (totalSize <= 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge);
                }
            }
        } else if (fareType.equalsIgnoreCase("flex")) {

            if (weight > 25 & weight <= 32) {
                newWeightCharge = ((byte)weight - 25) * 10;
                if (totalSize > 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge + 35);
                } else if (totalSize <= 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge);
                }
            } else if (weight <= 25) {
                if (totalSize > 158) {
                    System.out.println("Extra baggage cost: 35.00 €");
                } else if (totalSize <= 158) {
                    System.out.println("Extra baggage cost: 0.00 €");
                }
            } else if (weight > 32) {
                newWeightCharge = (((byte)weight - 25) * 10) + 35;
                if (totalSize > 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge + 35);
                } else if (totalSize <= 158) {
                    System.out.printf("Extra baggage cost: %.2f €%n",
                        newWeightCharge);
                }
            }

        } else if (!fareType.equalsIgnoreCase("flex")
            & !fareType.equalsIgnoreCase("flex"))
        {
            System.out.println("Invalid data");
        }

    }
}
