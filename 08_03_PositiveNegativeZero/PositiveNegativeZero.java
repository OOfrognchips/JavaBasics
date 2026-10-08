import java.util.Scanner;

public class PositiveNegativeZero {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int number = input.nextInt();

    if (number > 0) {
      System.out.printf("The number %d is positive%n", number);
    } else if (number < 0) {
      System.out.printf("The number %d is negative%n", number);
    } else if (number == 0) {
      System.out.printf("The number %d is zero%n", number);
    }
  }
}
