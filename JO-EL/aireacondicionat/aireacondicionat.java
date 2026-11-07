import java.util.Scanner;

public class aireacondicionat {

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        int arrayLength = input.nextInt();

        int[] storage = new int[arrayLength];

        for (byte i = 0; i < storage.length; i++) {
            int degrees = input.nextInt();
            storage[i] = degrees;
        }

        input.close();

        for (byte i = 0; i < storage.length; i++) {
            // if (degrees <= Math.pow(2, 31) & degrees >= Math.pow(-2, 31)) {
            if (storage[i] == 0 | storage[i] == 180 | storage[i] % 180 == 0) {
                System.out.println("OK");
            } else if (storage[i] != 0 | storage[i] != 180
                | storage[i] % 180 != 0)
            {
                System.out.println("BRONCA");
            }
            // }

        }

    }

}
