import java.util.Scanner;

public class IncreasingSequence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dummyNumber = 0;
        String output = "";

        while (true) {
            System.out.println("Enter number:");
            int number = input.nextInt();

            if (number > dummyNumber) {
                output += " " + number;
                dummyNumber = number;
            } else if (number < dummyNumber | number == dummyNumber) {
                break;
            }
        }

        input.close();

        System.out.printf("Sequence:%s%n", output);
    }
}
