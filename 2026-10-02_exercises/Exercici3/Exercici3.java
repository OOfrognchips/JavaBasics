import java.util.Scanner;

public class Exercici3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter street number:");
    int streetNumber = Integer.parseInt(input.nextLine());

    System.out.println("Enter street name:");
    String streetName = input.nextLine();

    System.out.println("Enter city:");
    String city = input.nextLine();

    System.out.println("Enter country:");
    String country = input.nextLine();

    System.out.println("Enter postal code:");
    String postalCode = input.nextLine();

    System.out.printf("Your address is:%n%d %s%n%s%n%s%n%s%n", streetNumber,
      streetName, city, postalCode, country);
  }
}
