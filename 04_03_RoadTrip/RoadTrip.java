import java.util.LinkedHashMap;

public class RoadTrip {
  public static void main(String[] args) {
    float distanciaAnada = (float)347.8;
    float consumVehicle = (float)6.7;
    float preuGas = (float)1.92;
    float passatgers = (float)4.0; // byte
    float preuPeatgesAnada = (float)12.65;
    float preuMenjarAnada = (float)30.0; // byte
    float preuAparcament = (float)18.5;

    float distanciaTotal = distanciaAnada * 2;

    float fuelPerKm = (float)(6.7 / 100);
    float totalFuel = fuelPerKm * distanciaTotal;
    float totalFuelCost = (float)(totalFuel * 1.92);

    float preuPeatgesTotal = preuPeatgesAnada * 2;
    float preuMenjarTotal = preuMenjarAnada * 2;

    float totalTripCost =
      totalFuelCost + preuPeatgesTotal + preuMenjarTotal + preuAparcament;
    float tripCostPerPassenger = totalTripCost / passatgers;

    String header = "=========== ROAD TRIP ===========";
    String separator = "---------------------------------";
    String footer = "=================================";

    // Since Java 10, it is allowed to use `var outputStructure too`
    LinkedHashMap<String, Float> outputStructure =
      new LinkedHashMap<String, Float>();
    outputStructure.put(header, null);
    outputStructure.put("Round trip distance", distanciaTotal);
    outputStructure.put("Fuel needed", totalFuel);
    outputStructure.put("Fuel cost", totalFuelCost);
    outputStructure.put("Tolls", preuPeatgesTotal);
    outputStructure.put("Parking price", preuAparcament);
    outputStructure.put("Food", preuMenjarTotal);
    outputStructure.put("Total trip cost", totalTripCost);
    outputStructure.put("Passengers", passatgers);
    outputStructure.put("Cost per passenger", tripCostPerPassenger);
    outputStructure.put(footer, null);

    for (String key : outputStructure.keySet()) {
      String formatting = "%-20s%10.2f%n";

      if (outputStructure.get(key) == null) {
        System.out.printf("%s%n", key);
        continue;
      } else if (key.equals("Round trip distance")) {
        formatting = String.format("%s%s%n", "%-20s%10.2f km%n", separator);
      } else if (key.equals("Fuel needed")) {
        formatting = "%-20s%10.2f L%n";
      } else if (key.equals("Fuel cost") | key.equals("Food")) {
        formatting = String.format("%s%s%n", "%-20s%10.2f €%n", separator);
      } else if (key.equals("Passengers")) {
        formatting = "%-20s%10.0f%n";
      } else {
        formatting = "%-20s%10.2f €%n";
      }
      System.out.printf(formatting, key + ":", outputStructure.get(key));
    }
  }

}
