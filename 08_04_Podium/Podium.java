import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Podium {

    // Varargs (Java 5) create an array under the hood for all the variables used as parameters
    static String orderer(String operation, Byte... scores)
        throws IllegalArgumentException
    {
        StringBuilder builder = new StringBuilder("Podium:");
        // Sort using a comparator
        if (operation.equals("asc")) {
            Arrays.sort(scores, Comparator.naturalOrder());
            // Could use: loop and then detect if the element is the last to remove the trailing whitespace,
            //	      replace method from String class,
            //	      StringBuilder class,
            //            etc.: https://stackoverflow.com/questions/4389480/print-array-without-brackets-and-commas
            for (Byte score : scores) {
                // https://www.geeksforgeeks.org/java/different-ways-for-integer-to-string-conversions-in-java/
                String byteString = Byte.toString(score);
                builder.append(String.format(" %s", byteString));
            }
            String outputString = builder.toString();
            return outputString;
        } else if (operation.equals("desc")) {
            Arrays.sort(scores, Comparator.reverseOrder());
            for (Byte score : scores) {
                String byteString = Byte.toString(score);
                builder.append(String.format(" %s", byteString));
            }
            String outputString = builder.toString();
            return outputString;
        } else {
            throw new IllegalArgumentException(
                "Invalid value used in the 'operation' parameter of the 'orderer' method.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the score of the first athlete:");
        byte score1 = input.nextByte();

        System.out.println("Enter the score of the second athlete:");
        byte score2 = input.nextByte();

        System.out.println("Enter the score of the third athlete:");
        byte score3 = input.nextByte();

        System.out.println("Enter \"asc\" or \"desc\":");
        String orderType = input.next().toLowerCase();

        input.close();

        System.out.printf("%s%n", orderer(orderType, score1, score2, score3));
    }
}
