import java.util.Scanner;

public class HighestScore {

  // Local Math.max method
  // Varargs (Java 5) create an array under the hood for all the variables used as parameters
  static int localMax(int... numbers) {
    // Asume the first number is the biggest
    int dummyNumber = numbers[0];

    // Quick operator to create a for-each loop
    for (int number : numbers) {
      // Override the value of the variable if the comparison results in a new bigger number
      if (dummyNumber > number) {
        continue;
      } else if (dummyNumber < number) {
        dummyNumber = number;
      }
    }
    return dummyNumber;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the score of the first player:");
    short score1 = input.nextShort();

    System.out.println("Enter the score of the second player:");
    short score2 = input.nextShort();

    System.out.println("Enter the score of the third player:");
    short score3 = input.nextShort();

    System.out.println("Enter the score of the fourth player:");
    short score4 = input.nextShort();

    System.out.printf("The highest score is: %d%n",
      localMax(score1, score2, score3, score4));
  }
}
