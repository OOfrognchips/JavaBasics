package a14_10_triangleUtils;

import a14_10_triangleUtils.TriangleUtils;

public class Main {

    public static void menu() {
        System.out.println("1. Type of triangle");
        System.out.println("2. Area");
        System.out.println("3. Perimeter");
        System.out.println("4. The three angles");
        System.out.println("0. Exit");
    }

    public static byte chooser(String text) {
        byte chosenOption = 0;

        System.out.println(text);
        while (TriangleUtils.input.hasNextByte() == false) {
            TriangleUtils.input.nextLine();
            System.out.printf("Error! %s%n", text);
        }
        chosenOption = TriangleUtils.input.nextByte();
        return chosenOption;
    }

    public static double sides(int side) {
        double a = 0, b = 0, c = 0, output = 0;

        if (side == 1) {
            System.out.println("Enter side a:");
            a = TriangleUtils.input.nextDouble();
            output = a;
        } else if (side == 2) {

            System.out.println("Enter side b:");
            b = TriangleUtils.input.nextDouble();
            output = b;
        } else if (side == 3) {
            System.out.println("Enter side c:");
            c = TriangleUtils.input.nextDouble();
            output = c;
        }
        return output;

    }

    public static double round(double number, byte decimals) {
        String decimalsString = "1";

        for (int i = 1; i <= decimals; i++) {
            decimalsString += "0";
        }

        double result = Math.round(number * Integer.parseInt(decimalsString))
            / Double.parseDouble(decimalsString);

        return result;
    }

    public static void main(String[] arguments) {
        menu();

        byte option = chooser("Option?");

        while (option != 0) {

            switch (option) {
                case 1:
                    System.out.printf("Type: %s%n", TriangleUtils
                        .typeOfTriangle(sides(1), sides(2), sides(3)));
                    break;
                case 2:
                    System.out.printf("Area: %.4f%n",
                        round(TriangleUtils.area(sides(1), sides(2), sides(3)),
                            (byte)4));
                    break;
                case 3:
                    System.out.printf("Perimeter: %.1f%n", round(
                        TriangleUtils.perimeter(sides(1), sides(2), sides(3)),
                        (byte)4));
                    break;
                case 4:
                    double a = sides(1);
                    double b = sides(2);
                    double c = sides(3);
                    System.out.printf("Angle A = %.4f%n",
                        round(TriangleUtils.angleA(a, b, c), (byte)4));
                    System.out.printf("Angle B = %.4f%n",
                        round(TriangleUtils.angleB(a, b, c), (byte)4));
                    System.out.printf("Angle C = %.4f%n",
                        round(TriangleUtils.angleC(a, b, c), (byte)4));
                    break;
                // default:
            }
            break;
        }

        TriangleUtils.input.close();
    }

}
