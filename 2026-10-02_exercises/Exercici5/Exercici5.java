import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base:");
        double a = Double.parseDouble(input.nextLine());

        System.out.println("Enter the exponent:");
        int b = Integer.parseInt(input.nextLine());

        System.out.printf("%.1f^%d = %.4f%n", a, b, Math.pow(a, b));
    }
}
