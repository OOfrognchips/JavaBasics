import java.util.Scanner;

public class IncreasingSequenceFixed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dummyNumber = 0;
        String output = "";
        boolean continueLogic = true;

        while (continueLogic) {
            System.out.println("Enter number:");
            int number = input.nextInt();

            if (number > dummyNumber) {
                output += " " + number;
                dummyNumber = number;
                continueLogic = true;
            } else if (number < dummyNumber | number == dummyNumber) {
                continueLogic = false;
                // break;
            }
        }

        input.close();

        System.out.printf("Sequence:%s%n", output);
    }
}
