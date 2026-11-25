import java.util.Scanner;

public class BlackFriday {

    static float formula(float price, float discount) {
        float formula = price - ((price * discount) / 100);
        return Math.round(formula * 100) / (float)100.0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price:");
        float price = input.nextFloat();

        System.out.println("Do you have a loyalty card? (yes/no):");
        String client = input.next();

        input.close();

        if (price > (float)60) {
            if (client.equalsIgnoreCase("yes")) {
                System.out.printf("Final price: %.2f €%n",
                    formula(price, (float)20));
            } else if (client.equalsIgnoreCase("no")) {
                System.out.printf("Final price: %.2f €%n",
                    formula(price, (float)10));
            }
        } else if (price <= (float)60) {
            if (client.equalsIgnoreCase("yes")) {
                System.out.printf("Final price: %.2f €%n",
                    formula(price, (float)5));
            } else if (client.equalsIgnoreCase("no")) {
                System.out.printf("Final price: %.2f €%n",
                    formula(price, (float)0));
            }
        }

    }
}
