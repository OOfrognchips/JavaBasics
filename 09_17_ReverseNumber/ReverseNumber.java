import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        byte i = 0;
        String output = "";

        while (notValidInput) {
            System.out.println("Enter number > 0:");
            int number = input.nextInt();

            if (number <= 0) {
                i++;
            } else if (number > 0) {
                while (number > 0) {
                    output += number % 10;
                    number = number / 10;
                }
                notValidInput = false;
            }
        }

        System.out.println(output);
    }
}
