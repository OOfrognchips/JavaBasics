import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a year:");
    short inputYear = input.nextShort();

    boolean condition1 = inputYear % 4 == 0;
    boolean condition2 = inputYear % 100 != 0;
    boolean condition3 = inputYear % 400 == 0;

    if (condition1 & condition2) {
      System.out.println("true");
    } else if (condition3) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

  }
}
