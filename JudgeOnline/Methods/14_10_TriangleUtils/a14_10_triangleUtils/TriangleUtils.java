package a14_10_triangleUtils;

import java.util.Scanner;

public class TriangleUtils {

    public static final String SCALENE = "Scalene";
    public static final String ISOSCELES = "Isosceles";
    public static final String EQUILATERAL = "Equilateral";
    public static final String ERROR = "Error";

    public static final Scanner input = new Scanner(System.in);

    public static boolean isTriangle(double a, double b, double c) {
        boolean condition1 = false, condition2 = false, condition3 = false;

        boolean output = true;

        if (a + b > c) {
            condition1 = true;
        }
        if (a + c > b) {
            condition2 = true;
        }
        if (b + c > a) {
            condition3 = true;
        }

        if ((condition1 == true) & (condition2 == true)
            & (condition3 == true))
        {
            output = true;
        } else {
            output = false;
        }

        return output;
    }

    public static String typeOfTriangle(double a, double b, double c) {
        String output = "";

        if (isTriangle(a, b, c)) {
            if ((a == b) & (a == c) & (b == c)) {
                output = EQUILATERAL;
            } else if ((a == b) | (a == c) | (b == c)) {
                output = ISOSCELES;
            } else {
                output = SCALENE;
            }
        } else if (!isTriangle(a, b, c)) {
            output = ERROR;
        }

        return output;
    }

    public static double area(double a, double b, double c) {
        double formula = 0;

        if (typeOfTriangle(a, b, c) == EQUILATERAL) {
            formula = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
        } else if (typeOfTriangle(a, b, c) == ISOSCELES) {
            if (a == b) {
                formula = c
                    * ((Math.sqrt(Math.pow(a, 2) - (Math.pow(c, 2) / 4))) / 2);
            } else if (a == c) {
                formula = b
                    * ((Math.sqrt(Math.pow(a, 2) - (Math.pow(b, 2) / 4))) / 2);
            } else if (b == c) {
                formula = a
                    * ((Math.sqrt(Math.pow(b, 2) - (Math.pow(a, 2) / 4))) / 2);
            }
        } else if (typeOfTriangle(a, b, c) == SCALENE) {
            double semiperimeter = (a + b + c) / 2;

            formula = Math.sqrt(semiperimeter * (semiperimeter - a)
                * (semiperimeter - b) * (semiperimeter - c));
        } else {
            formula = -1;
        }

        return formula;
    }

    public static double perimeter(double a, double b, double c) {
        double formula = (a + b + c);

        return formula;
    }

    public static double angleA(double a, double b, double c) {
        // Provided by the exercise itself
        double formula = Math.toDegrees(Math.acos(
            (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));

        return formula;
    }

    public static double angleB(double a, double b, double c) {
        // Provided by the exercise itself
        double formula = Math.toDegrees(Math.acos(
            (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));

        return formula;
    }

    public static double angleC(double a, double b, double c) {
        // Provided by the exercise itself
        double formula = Math.toDegrees(Math.acos(
            (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));

        return formula;
    }

}
