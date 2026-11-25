package a14_01_numberCheck1;

public class NumberCheck1 {

    //public static int number = 12343;
    public static int number = 0;

    public static void printTitle() {
        System.out.println("NUMBER ANALYSIS PROGRAM");
    }

    public static void printNumber() {
        System.out.printf("Number: %d%n", number);
    }

    public static void checkEvenOdd() {
        int checker = number % 2;

        if (checker == 0) {
            System.out.println("The number is even");
        } else if (checker != 0) {
            System.out.println("The number is odd");
        }
    }

    public static void checkSign() {
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else if (number == 0) {
            System.out.println("The number is zero");
        }
    }

    public static void checkDigits() {
        String numberString = Integer.toString(number);
        int count = 0;

        for (int i = 0; i < numberString.length(); i++) {
            char numberCharacter = numberString.charAt(i);

            if (Character.isDigit(numberCharacter) == true) {
                count += 1;
            }
        }

        if (count == 1) {
            System.out.printf("The number has %d digit%n", count);
        } else if (count > 1) {
            System.out.printf("The number has %d digits%n", count);
        }
    }

    public static void checkPrime() {
        if (number >= 2) {
            for (int i = 2; i <= number - 1; i++) {
                int checker = number % i;
                if (checker == 0) {
                    System.out.println("The number is not a Prime number");
                    break;
                } else if (checker != 0) {
                    System.out.println("The number is a Prime number");
                    break;
                }
            }
        } else if (number < 2) {
            for (int i = 1; i >= number - 1; i--) {
                int checker = number % i;
                if (checker == 0) {
                    System.out.println("The number is not a Prime number");
                    break;
                } else if (checker != 0) {
                    System.out.println("The number is a Prime number");
                    break;
                }
            }
        }
    }

    public static void printEndMessage() {
        System.out.println("END OF PROGRAM");
    }

    public static void main(String[] arguments) {
        printTitle();
        printNumber();
        checkEvenOdd();
        checkSign();
        checkDigits();
        checkPrime();
        printEndMessage();
    }

}
