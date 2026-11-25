import java.util.Scanner;

public class ClosestTo21 {

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        boolean notValidInput = true, P1eliminated = false,
            P2eliminated = false;
        int numericInput = 0, P1storage = 0, P2storage = 0;

        System.out.println("PLAYER 1");
        for (byte i = 1; i <= 3; i++) {
            System.out.printf("Enter the value of card %d (1-12):%n", i);
            while (notValidInput) {
                numericInput = input.nextInt();

                if (numericInput >= 1 & numericInput <= 12) {
                    P1storage += numericInput;
                    notValidInput = false;
                } else if (numericInput < 1 | numericInput > 12) {
                    System.out.println(
                        "Invalid card. Please enter a number between 1 and 12:");
                }
            }
            notValidInput = true;

            if (i == 3) {
                System.out.printf("Total for Player 1: %d%n", P1storage);

                if (P1storage > 21) {
                    System.out
                        .println("Player 1 went over 21 and is eliminated!");
                    P1eliminated = true;
                }
            }
        }

        System.out.printf("%nPLAYER 2%n");
        for (byte i = 1; i <= 3; i++) {
            System.out.printf("Enter the value of card %d (1-12):%n", i);
            while (notValidInput) {
                numericInput = input.nextInt();

                if (numericInput >= 1 & numericInput <= 12) {
                    P2storage += numericInput;
                    notValidInput = false;
                } else if (numericInput < 1 | numericInput > 12) {
                    System.out.println(
                        "Invalid card. Please enter a number between 1 and 12:");
                }
            }
            notValidInput = true;

            if (i == 3) {
                System.out.printf("Total for Player 2: %d%n", P2storage);

                if (P2storage > 21) {
                    System.out
                        .println("Player 2 went over 21 and is eliminated!");
                    P2eliminated = true;
                }
            }
        }

        input.close();

        System.out.printf("%nFINAL RESULT%n");
        if (P1eliminated & P2eliminated) {
            System.out.println("Both players went over 21. No winner!");
        } else if (P1eliminated) {
            System.out.println("Player 2 wins");
        } else if (P2eliminated) {
            System.out.println("Player 1 wins");
        } else if (!P1eliminated & !P2eliminated) {
            if (P1storage == P2storage) {
                System.out.printf("It's a draw! Both have %d points%n",
                    P1storage);
            } else if (P1storage > P2storage) {
                System.out.printf("Player 1 wins with %d points!%n", P1storage);
            } else if (P2storage > P1storage) {
                System.out.printf("Player 2 wins with %d points!%n", P2storage);
            }
        }

    }

}
