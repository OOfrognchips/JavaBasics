import java.util.Scanner;

public class AreaRectangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter side A:");
    float sideA = input.nextFloat();

    System.out.println("Enter side B:");
    float sideB = input.nextFloat();

    System.out.println("Enter units:");
    String units = input.next();

    String formula = Float.toString(sideA * sideB);

    int uselessCharactersIndex = formula.indexOf("00", formula.indexOf(".", 0));

    if (uselessCharactersIndex == -1) {
      System.out.printf("Area = %s %s^2%n", formula, units);
    } else {
      String formulaUselessSubstring =
        formula.substring(uselessCharactersIndex, formula.length());
      String finalFormulaString = formula.replace(formulaUselessSubstring, "");
      System.out.printf("Area = %s %s^2%n", finalFormulaString, units);

    }
  }
}
