import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter available balance:");
    float balance = input.nextFloat();

    System.out.println("Enter withdrawal amount:");
    float withdrawalAmount = input.nextFloat();

    System.out.println("Do you have a credit line? (true/false)");
    boolean creditLine = input.nextBoolean();

    if (withdrawalAmount > 600) {

      System.out.println("The maximum daily withdrawal is 600 €");

    } else if (withdrawalAmount <= 600) {

      if (withdrawalAmount <= 0) {
        System.out.println("Withdrawal not possible");
      } else if (withdrawalAmount > 0) {

        if (withdrawalAmount % 20 != 0) {
          System.out.println("Withdrawal amount must be a multiple of 20 €");
        } else if (withdrawalAmount % 20 == 0) {

          if (balance >= withdrawalAmount) {
            System.out.printf(
              "Please take your money%nYour new balance is now: %.2f €%nCommission: 0.00 €%n",
              balance - withdrawalAmount);
          } else if (balance < withdrawalAmount) {
            if (creditLine) {
              if ((balance + (float)300) < withdrawalAmount) {
                System.out.println("Withdrawal not possible");
              } else if ((balance + (float)300) >= withdrawalAmount) {
                System.out.printf(
                  "Please take your money%nYour new balance is now: %.2f €%nCommission: 5.00 €%n",
                  balance - withdrawalAmount);
              }
            } else if (!creditLine) {
              System.out.println("Withdrawal not possible");
            }
          }
        }

      }
    }

  }
}
