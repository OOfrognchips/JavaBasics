import java.util.Scanner;

public class FilmDuration {
  static short numericInputHelper(byte type, Scanner input)
    throws IllegalArgumentException
  {
    while (true) {
      try {
        if (type == 1) { // fps
          System.out.println("Frames per second (fps):");
          short fps = Short.parseShort(input.nextLine());
          // With an invalid value one of the two conditions must fail
          if (fps >= 0 & fps <= 150) {
            return fps;
          }
          System.err.println(
            "Error! Frames per second (fps) input must be a value between 0 and 150. Please input a valid value!");
        } else if (type == 2) { // duration
          System.out.println("Duration of film in minutes:");
          short duration = Short.parseShort(input.nextLine());
          if (duration >= 0 & duration <= 1000) {
            return duration;
          }
          System.err.println(
            "Error! Duration input must be a value between 0 and 1000. Please input a valid value!");
        } else {
          // In case of misuse of the method (probably will never happen though since it is only used internally)
          throw new IllegalArgumentException(
            "Invalid value used in the 'type' parameter of the 'numericInputHelper' method.");
        }
      } catch (NumberFormatException exception) {
        System.err.println("Please input a valid number!");
      }
    }
  }

  public static void main(String[] args) {
    // Input
    Scanner input = new Scanner(System.in);
    short fps = numericInputHelper((byte)1, input);
    short duration = numericInputHelper((byte)2, input);
    System.out.println("Name of the film:");
    String name = input.nextLine();

    input.close();

    // Output
    int convertedDuration = duration * 60;
    long totalFrames = fps * convertedDuration;
    System.out
      .println("Total frames of film \"" + name + "\" is " + totalFrames);
  }
}
