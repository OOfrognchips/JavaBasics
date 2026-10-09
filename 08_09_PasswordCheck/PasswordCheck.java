import java.util.Scanner;

public class PasswordCheck {

  public static void main(String[] args) {
    final String password = "jupiter4321";

    Scanner input = new Scanner(System.in);

    for (byte i = 0; i < 3; i++) {
      System.out.println("Enter your password:");
      String passwordInput = input.next();

      if (i != 2 & !passwordInput.equals(password)) {
        System.out.println("Incorrect password. Try again.");
      } else if (i == 2 & !passwordInput.equals(password)) {
        System.out.println(
          "Your account is locked. Please contact your administrator.");
        break;
      } else if (passwordInput.equals(password)) {
        System.out.println("Access granted. Welcome!");
        break;
      }
    }
  }
}
