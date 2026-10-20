import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = input.nextFloat();

        System.out.println("Enter units:");
        String units = input.next();

        double formula = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area = %s %s^2%n", formula, units);
    }
}
