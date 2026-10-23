import java.util.Scanner;

public class ShowNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter X:");
        byte x = input.nextByte();

        System.out.println("Enter Y:");
        byte y = input.nextByte();

        input.close();

        while (x <= y) {
            // System.out.print(x + " ");
            System.out.printf("%d ", x);
            x++;
        }

    }
}
