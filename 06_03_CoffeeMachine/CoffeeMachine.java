import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Monthly electricity cost:");
        float perMonthElectricityCost = input.nextFloat();

        System.out.println("Monthly coffee machine rental cost:");
        float perMonthMachineRentalCost = input.nextFloat();

        System.out.println("Number of coffees:");
        float numberOfCoffees = input.nextFloat();

        System.out.println("Average coffee price:");
        float medianCoffeePrice = input.nextFloat();

        System.out.println("Coffee price per kilo:");
        float perKiloCoffeePrice = input.nextFloat();

        System.out.println("Kilograms of coffee:");
        float coffeeKilograms = input.nextFloat();

        System.out.println("Milk price per litre:");
        float perLitreMilkPrice = input.nextFloat();

        System.out.println("Liters of milk:");
        float litersOfMilk = input.nextFloat();

        float coffeePrice = perKiloCoffeePrice * coffeeKilograms;
        float milkPrice = perLitreMilkPrice * litersOfMilk;

        float monthlyCost = perMonthElectricityCost + perMonthMachineRentalCost
            + coffeePrice + milkPrice;
        float monthlyIncome = numberOfCoffees * medianCoffeePrice;

        boolean buyCoffeeMachine = monthlyIncome > monthlyCost;
        System.out.printf("Should we buy the coffee machine? %b%n",
            buyCoffeeMachine);

        /*
        		if (monthlyIncome > monthlyCost) {
        			buyCoffeeMachine = true;
        			System.out.printf("Should we buy the coffee machine? %b%n", buyCoffeeMachine);
        		} else if (monthlyCost > monthlyIncome) {
        			buyCoffeeMachine = false;
        			System.out.printf("Should we buy the coffee machine? %b%n", buyCoffeeMachine);
        }
        */
    }
}
