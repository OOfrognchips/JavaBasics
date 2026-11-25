package a14_03_numberCheck3;

import java.util.Scanner;

public class NumberCheck3 {

    public static Scanner input = new Scanner(System.in);

    public static void printMessage(String text) {
        System.out.printf(text);
    }

    public static int askNumber(String text) {
        System.out.println(text);
        int number = Integer.parseInt(input.nextLine());

        input.close();

        return number;
    }

    public static String printNumber(int number) {
        return String.format("Number: %d%n", number);
    }

    public static String checkEvenOdd(int number) {
        int checker = number % 2;
        String output = "";

        if (checker == 0) {
            output = "even";
        } else if (checker != 0) {
            output = "odd";
        }

        return output;
    }

    public static String checkSign(int number) {
        String output = "";

        if (number > 0) {
            output = "positive";
        } else if (number < 0) {
            output = "negative";
        } else if (number == 0) {
            output = "zero";
        }

        return output;
    }

    public static int checkDigits(int number) {
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

        return count;
    }

    public static boolean checkPrime(int number) {
        boolean prime = false;

        if (number >= 2) {
            for (int i = 2; i <= number - 1; i++) {
                int checker = number % i;
                if (checker == 0) {
                    prime = false;
                    break;
                } else if (checker != 0) {
                    prime = true;
                }
            }
        } else if (number < 2) {
            prime = false;
        }

        return prime;
    }

    public static void main(String[] args) {
        int inputNumber = askNumber("Enter number:");
        printMessage("NUMBER ANALYSIS PROGRAM%n");
        printMessage(printNumber(inputNumber));
        printMessage(
            String.format("The number is %s%n", checkEvenOdd(inputNumber)));
        printMessage(
            String.format("The number is %s%n", checkSign(inputNumber)));

        int digits = checkDigits(inputNumber);
        if (digits == 1) {
            printMessage(String.format("The number has %d digit%n", digits));
        } else if (digits > 1) {
            printMessage(String.format("The number has %d digits%n", digits));
        }

        boolean prime = checkPrime(inputNumber);
        if (prime == true) {
            printMessage(String.format("The number is a Prime number%n"));
        } else if (prime == false) {
            printMessage(String.format("The number is not Prime number%n"));
        }

        printMessage("END OF PROGRAM%n");
    }

}
