import java.util.Scanner;

public class BasicCalculator {

    /*
    	static String operatorInputHelper(Scanner input) {
    		while (true) {
    			System.out.println("Enter an operator (+, -, *, /, %):");
    			String operatorInput = input.next();
    			if (operatorInput.equals("+") | operatorInput.equals("-") | operatorInput.equals("*") | operatorInput.equals("/") | operatorInput.equals("%")) {
    				return operatorInput;
    			} else {
    				System.err.println("Invalid operator!");
    			}
    		}
    	}
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int first = input.nextInt();

        System.out.println("Enter an operator (+, -, *, /, %):");
        String operator = input.next();

        System.out.println("Enter the second integer:");
        int second = input.nextInt();

        if (operator.equals("+") | operator.equals("-") | operator.equals("*")
            | operator.equals("/") | operator.equals("%"))
        {
            operator = operator;
        } else {
            System.err.println("Invalid operator!");
        }

        int result;

        if (operator.equals("+")) {
            result = first + second;
            System.out.printf("%d %s %d = %d%n", first, operator, second,
                result);
        } else if (operator.equals("-")) {
            result = first - second;
            System.out.printf("%d %s %d = %d%n", first, operator, second,
                result);
        } else if (operator.equals("*")) {
            result = first * second;
            System.out.printf("%d %s %d = %d%n", first, operator, second,
                result);
        } else if (operator.equals("/")) {
            if (second == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                result = first / second;
                System.out.printf("%d %s %d = %d%n", first, operator, second,
                    result);
            }
        } else if (operator.equals("%")) {
            if (second == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                result = first % second;
                System.out.printf("%d %s %d = %d%n", first, operator, second,
                    result);
            }
        }
    }
}
