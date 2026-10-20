import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first price:");
        int price1 = input.nextInt();

        System.out.println("Enter second price:");
        int price2 = input.nextInt();

        System.out.println("Enter third price:");
        int price3 = input.nextInt();

        System.out.println("Enter fourth price:");
        int price4 = input.nextInt();

        System.out.println("Enter fifth price:");
        int price5 = input.nextInt();

        int total = price1 + price2 + price3 + price4 + price5;
        System.out.printf("Total price: %d%n", total);

        float average = ((float)total / 5);
        System.out.printf("Average: %.1f%n", average);
    }
}
