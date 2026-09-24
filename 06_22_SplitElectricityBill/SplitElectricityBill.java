import java.util.Scanner;

public class SplitElectricityBill {

  public static void main(String[] args) {
    // Input
    Scanner input = new Scanner(System.in);
    System.out.println("Number of people:");
    byte people = input.nextByte();

    //Scanner inputElectricityConsumption = new Scanner(System.in);
    System.out.println("Enter electricity consumption (kWh):");
    double electricityConsumption = input.nextDouble();

    //Scanner inputPrice = new Scanner(System.in);
    System.out.println("Enter price per kWh (€):");
    double price = input.nextDouble();

    //Scanner inputFixedMonthlyCharge = new Scanner(System.in);
    System.out.println("Enter fixed monthly charge (€):");
    double fixedMonthlyCharge = input.nextDouble();

    //Scanner inputTax = new Scanner(System.in);
    System.out.println("Enter tax (%):");
    double tax = input.nextDouble();

    input.close();

    // Output
    double energyCost = electricityConsumption * price;
    System.out
      .println("Energy cost = " + String.format("%.2f", energyCost) + " €");

    System.out.println(
      "Fixed charge = " + String.format("%.2f", fixedMonthlyCharge) + " €");

    double subtotal = energyCost + fixedMonthlyCharge;
    System.out.println("Subtotal = " + String.format("%.2f", subtotal) + " €");

    double taxMonetaryImport = (tax / 100) * subtotal;
    System.out
      .println("Tax = " + String.format("%.2f", taxMonetaryImport) + " €");

    double total = subtotal + taxMonetaryImport;
    System.out.println("Total = " + String.format("%.2f", total) + " €");

    double totalPerPerson = total / people;
    System.out.println(
      "Total per person = " + String.format("%.2f", totalPerPerson) + " €");
  }
}
