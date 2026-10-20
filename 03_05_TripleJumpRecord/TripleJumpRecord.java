public class TripleJumpRecord {
    // Varargs (Java 5) create an array under the hood for all the variables used as parameters
    static double localMax(double... numbers) {
        // Asume the first number is the biggest
        double dummyNumber = numbers[0];

        // Quick operator to create a for-each loop
        for (double number : numbers) {
            // Override the value of the variable if the comparison results in a new bigger number
            dummyNumber = Math.max(dummyNumber, number);
        }
        return dummyNumber;
    }

    public static void main(String[] args) {
        // Current record
        double record = 18.29;

        // Player records
        double jump1 = 15.58;
        double jump2 = 18.35;
        double jump3 = 17.26;
        double jump4 = 18.31;

        // Get new record 
        double newRecord = localMax(jump1, jump2, jump3, jump4);

        // Display the new record
        System.out
            .println("The current record is now " + newRecord + " meters");

        // Display the next integer value
        System.out.println("The current record is below "
            + (byte)Math.ceil(newRecord) + " meters");

        // Display the previous integer value
        System.out.println("The current record is above "
            + (byte)Math.floor(newRecord) + " meters");

    }

}
