import java.util.Scanner;

public class TemperatureConversion {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter temperature in Celsius:");
    float temperatureC = input.nextFloat();

    input.close();

    float formula = temperatureC * (float)9 / (float)5 + (float)32;

    System.out.printf("Fahrenheits = %.2f%n", formula);
  }
}
