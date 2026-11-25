import java.util.Scanner;

public class TravelTime {
    static String fuckHowRoundingWorksInJava(String floatNumber) {
        String[] characterArray = floatNumber.split("\\.");
        String result = characterArray[0];
        if (Byte.parseByte(result) < 10) {
            result = String.format("0%s", result);
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        // Minutes to seconds
        final int timeStops = 3 * 60;
        final int timeTransfers = 6 * 60;

        Scanner input = new Scanner(System.in);

        System.out.println("Number of stops:");
        byte numberOfStops = input.nextByte();

        System.out.println("Number of transfers:");
        byte numberOfTransfers = input.nextByte();

        float formula = (float)((numberOfStops * timeStops)
            + (numberOfTransfers * timeTransfers));
        float conversionToH = formula / 3600;
        float conversionToMin =
            (conversionToH - (byte)Math.floor(conversionToH)) * 60; // or (byte) conversionToH?

        System.out.printf("Total traveling time is %s:%s%n",
            fuckHowRoundingWorksInJava(Float.toString(conversionToH)),
            fuckHowRoundingWorksInJava(Float.toString(conversionToMin)));
    }

}
