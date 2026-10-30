import java.util.Scanner;

public class afinantlarpa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String harp = input.nextLine().toUpperCase();
        input.close();

        // String[] parts = harp.split("(?<=[+-].{1})");

        // Regular expression to split between a number and an alphabetic character
        String[] parts = harp.split("(?<=\\d)(?=[A-Z])");

        for (byte i = 0; i < parts.length; i++) {
            if (parts[i].contains("+")) {
                byte delimiterIndex = (byte)(parts[i].lastIndexOf("+"));

                // for (byte n = 0; n < 10; n++) {
                // byte timesValue = (byte)(Character.getNumericValue(parts[i].charAt(delimiterIndex + 1)));
                // System.out.println(delimiterIndex);
                short timesValue =
                    Short.parseShort(parts[i].substring(delimiterIndex + 1));
                // System.out.println(timesValue);
                // if (timesValue == n) {
                System.out.printf("%s tighten %d%n",
                    parts[i].substring(0, parts[i].indexOf("+")), timesValue);
                // }
                // }
            } else if (parts[i].contains("-")) {
                byte delimiterIndex = (byte)(parts[i].lastIndexOf("-"));

                // for (byte n = 0; n < 10; n++) {
                // byte timesValue = (byte)(Character.getNumericValue(parts[i].charAt(delimiterIndex + 1)));
                short timesValue =
                    Short.parseShort(parts[i].substring(delimiterIndex + 1));
                // if (timesValue == n) {
                System.out.printf("%s loosen %d%n",
                    parts[i].substring(0, parts[i].indexOf("-")), timesValue);
                // }
                // }
            }
        }
    }
}
