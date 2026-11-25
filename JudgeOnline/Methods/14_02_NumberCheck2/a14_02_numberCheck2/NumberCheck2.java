package a14_02_numberCheck2;

import java.util.Scanner;

public class NumberCheck2 {

    public static void printMessage(String text) {
        System.out.println(text);
    }

    public static void printNumber(int number) {
        System.out.printf("Number: %d%n", number);
    }

    public static void checkEvenOdd(int number) {
        int checker = number % 2;

        if (checker == 0) {
            System.out.println("The number is even");
        } else if (checker != 0) {
            System.out.println("The number is odd");
        }
    }

    public static void checkSign(int number) {
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else if (number == 0) {
            System.out.println("The number is zero");
        }
    }

    public static void checkDigits(int number) {
        String numberString = Integer.toString(number);
        int count = 0;

        for (int i = 0; i < numberString.length(); i++) {
            char numberCharacter = numberString.charAt(i);

            if (Character.isDigit(numberCharacter) == true) {
                count += 1;
            } else if (Character.isDigit(numberCharacter) == false) {
                continue;
            }
        }

        if (count == 1) {
            System.out.printf("The number has %d digit%n", count);
        } else if (count > 1) {
            System.out.printf("The number has %d digits%n", count);
        }
    }

    public static void checkPrime(int number) {
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
            System.out.println("The number is not a Prime number");
        }
    }

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        input.close();

        printMessage("NUMBER ANALYSIS PROGRAM");
        printNumber(number);
        checkEvenOdd(number);
        checkSign(number);
        checkDigits(number);
        checkPrime(number);
        printMessage("END OF PROGRAM");
    }

}
