import java.util.Scanner;

public class Astrophotography {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Free space in MB:");
    int freeSpaceMB = input.nextInt();

    System.out.println("Battery level in %:");
    byte batteryLevelPercentage = input.nextByte();

    System.out.println("Humidity in %:");
    byte humidityLevelPercentage = input.nextByte();

    System.out.println("Wind speed in km/h:");
    byte windSpeedKmH = input.nextByte();

    System.out.println("Connected to external power (true/false):");
    boolean connectedToExternalPower = input.nextBoolean();

    boolean readyToTakePhoto;

    if (freeSpaceMB >= 250 & humidityLevelPercentage < 60
      & windSpeedKmH <= 10)
    {
      if (connectedToExternalPower) {
        readyToTakePhoto = true;
      } else if (!connectedToExternalPower & batteryLevelPercentage >= 20) {
        readyToTakePhoto = true;
      } else {
        readyToTakePhoto = false;
      }
    } else {
      readyToTakePhoto = false;
    }

    System.out.printf("Ready to take photo: %b%n", readyToTakePhoto);

  }

}
