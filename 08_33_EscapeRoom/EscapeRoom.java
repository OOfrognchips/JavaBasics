import java.util.Scanner;

public class EscapeRoom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of keys:");
        byte numberOfKeys = input.nextByte();

        System.out.println("Final riddle solved? (true/false)");
        boolean finalRiddleSolved = input.nextBoolean();

        input.close();

        String result = numberOfKeys >= 3
            ? (finalRiddleSolved == true ? "Door unlocked! Escape successful!"
                : "Door unlocked! Still trapped!")
            : "Not enough keys! Still trapped!";
        System.out.println(result);
    }

}
