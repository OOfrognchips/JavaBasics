import java.util.Scanner;

public class TotalSumOfCards {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;
        int totalCardsP1 = 0, totalCardsP2 = 0, dummyUserInput = 0;

        System.out.println("PLAYER 1");
        for (byte i = 1; i <= 4; i++) {
            System.out.printf("Enter the value of card %d for player 1:%n", i);

            while (notValidInput) {
                dummyUserInput = input.nextInt();

                if (dummyUserInput >= 1 & dummyUserInput <= 12) {
                    totalCardsP1 += dummyUserInput;
                    notValidInput = false;
                } else if (dummyUserInput < 1 | dummyUserInput > 12) {
                    System.out.println("Wrong card, please enter 1..12:");
                }

            }
            notValidInput = true;
        }

        System.out.printf("%nPLAYER 2%n");
        for (byte i = 1; i <= 4; i++) {
            System.out.printf("Enter the value of card %d for player 2:%n", i);

            while (notValidInput) {
                dummyUserInput = input.nextInt();

                if (dummyUserInput >= 1 & dummyUserInput <= 12) {
                    totalCardsP2 += dummyUserInput;
                    notValidInput = false;
                } else if (dummyUserInput < 1 | dummyUserInput > 12) {
                    System.out.println("Wrong card, please enter 1..12:");
                }
            }
            notValidInput = true;
        }

        input.close();

        System.out.printf("%nRESULTS%n");
        System.out.printf("Total cards Player 1: %d%n", totalCardsP1);
        System.out.printf("Total cards Player 2: %d%n", totalCardsP2);

        if (totalCardsP1 > totalCardsP2) {
            System.out.println("Player 1 has won!");
        } else if (totalCardsP1 < totalCardsP2) {
            System.out.println("Player 2 has won!");
        } else if (totalCardsP1 == totalCardsP2) {
            System.out.println("It is a draw.");
        }
    }

}
