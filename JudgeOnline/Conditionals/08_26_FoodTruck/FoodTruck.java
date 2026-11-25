import java.util.Scanner;

public class FoodTruck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice (burger/tacos/pizza):");
        String choice = input.next();

        float totalPrice = 0;
        boolean error = false;

        switch (choice.toLowerCase()) {
            case "burger" -> {
                totalPrice += 10.50;
                System.out.println("Fries size? (large/small):");
                String friesSize = input.next();

                switch (friesSize.toLowerCase()) {
                    case "large" -> totalPrice += 4.50;
                    // totalPrice += 4.50;
                    // break;
                    case "small" -> totalPrice += 3.75;
                    // totalPrice += 3.75;
                    // break;
                    default -> error = true;
                    // error = true;
                    // break;
                }
                // break;
            }
            case "tacos" -> {
                totalPrice += 8.50;
                System.out.println("Sauce? (cheese/guacamole):");
                String sauce = input.next();

                switch (sauce.toLowerCase()) {
                    case "cheese" -> totalPrice += 2.50;
                    // totalPrice += 2.50;
                    // break;
                    case "guacamole" -> totalPrice += 2.60;
                    // totalPrice += 2.60;
                    // break;
                    default -> error = true;
                    // error = true;
                    // break;
                }
                // break;
            }
            case "pizza" -> {
                totalPrice += 12.50;
                System.out.println("Topping? (pepperoni/carbonara):");
                String topping = input.next();

                switch (topping.toLowerCase()) {
                    case "pepperoni" -> totalPrice += 3.50;
                    // totalPrice += 3.50;
                    // break;
                    case "carbonara" -> totalPrice += 3.30;
                    // totalPrice += 3.30;
                    // break;
                    default -> error = true;
                    // error = true;
                    // break;
                }
                // break;
            }
            default -> error = true;
            // error = true;
            // break;
        }

        if (error == false) {
            System.out.println("Choose your drink (soft/beer/water):");
            String drink = input.next();

            switch (drink.toLowerCase()) {
                case "soft" -> totalPrice += 3.50;
                // totalPrice += 3.50;
                // break;
                case "beer" -> totalPrice += 5.50;
                // totalPrice += 5.50;
                // break;
                case "water" -> totalPrice += 2.20;
                // totalPrice += 2.20;
                // break;
                default -> error = true;
                // error = true;
                // break;
            }
        }

        input.close();

        if (error == true) {
            System.out.println("Invalid choice");
        } else if (error == false) {
            System.out.printf("Total: %.2f €%n", totalPrice);
        }
    }
}
