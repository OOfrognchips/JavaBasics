import java.util.Scanner;

public class PizzaCalculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the diameter of the first pizza (cm):");
    byte diameter1 = input.nextByte();

    System.out.println("Enter the diameter of the second pizza (cm):");
    byte diameter2 = input.nextByte();

    System.out.println("Enter the diameter of the third pizza (cm):");
    byte diameter3 = input.nextByte();

    if (diameter1 == diameter2 & diameter2 == diameter3
      & diameter1 == diameter3)
    {
      // if (diameter1 == diameter2 == diameter3) {
      System.out.println("All pizzas have the same size.");
    } else if (diameter1 != diameter2 & diameter2 != diameter3
      & diameter1 != diameter3)
    {
      System.out.println("All pizzas have different sizes.");
    } else if ((diameter1 == diameter2 & diameter1 != diameter3)
      | (diameter1 == diameter3 & diameter1 != diameter2)
      | (diameter2 == diameter3 & diameter1 != diameter2))
    {
      System.out.println("Two pizzas have the same size.");
    }
  }
}
