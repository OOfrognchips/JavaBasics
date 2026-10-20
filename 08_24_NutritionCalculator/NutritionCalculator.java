import java.util.Scanner;

public class NutritionCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf(
            "Nutrition calculator:%n1. Calculate calories%n2. Calories per serving%n3. Daily calories%nChoose an option:%n");
        byte chosenOption = input.nextByte();

        switch (chosenOption) {
            case 1:
                System.out.println("Enter protein (g):");
                float protein = input.nextFloat();

                System.out.println("Enter carbohydrates (g):");
                float carbohydrates = input.nextFloat();

                System.out.println("Enter fat (g):");
                float fat = input.nextFloat();

                input.close();

                System.out.printf("Total calories: %.2f kcal%n",
                    (protein * 4) + (carbohydrates * 4) + (fat * 9));
                break;
            case 2:
                System.out.println("Enter calories per 100 g:");
                float calories = input.nextFloat();

                System.out.println("Enter serving size (g):");
                float servingSize = input.nextFloat();

                input.close();

                System.out.printf("Calories per serving: %.2f kcal%n",
                    (calories * servingSize) / 100);
                break;
            case 3:
                System.out.println("Enter age (years):");
                float age = input.nextFloat();

                System.out.println("Enter height (cm):");
                float height = input.nextFloat();

                System.out.println("Enter weight (kg):");
                float weight = input.nextFloat();

                System.out.println("Enter sex (M/F):");
                String sex = input.next().toUpperCase();

                float activityFactor;

                switch (sex) {
                    case "M":
                        System.out
                            .println("Enter activity factor (1.2 to 1.9):");
                        activityFactor = input.nextFloat();

                        input.close();

                        float formulaMen = (float)((10 * weight)
                            + (6.25 * height) - (5 * age) + 5) * activityFactor;
                        System.out.printf("Daily calories: %.2f kcal%n",
                            formulaMen);
                        break;
                    case "F":
                        System.out
                            .println("Enter activity factor (1.2 to 1.9):");
                        activityFactor = input.nextFloat();

                        input.close();

                        float formulaWomen =
                            (float)((10 * weight) + (6.25 * height) - (5 * age)
                                - 161) * activityFactor;
                        System.out.printf("Daily calories: %.2f kcal%n",
                            formulaWomen);
                        break;
                }
        }
    }
}
