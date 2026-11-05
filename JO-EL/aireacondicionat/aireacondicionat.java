import java.util.Scanner;

public class aireacondicionat {

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        int[] storage = new int[7];

        for (byte i = 0; i <= 6; i++) {
            int degrees = input.nextInt();
            storage[i] = degrees;
        }

        // int degrees = input.nextInt();

        input.close();

        /*
        if (degrees == 0 | degrees == 180) {
        			System.out.println("BRONCA");
        		} else if (degrees != 0 | degrees != 180) {
        			System.out.println("OK");
        }
        */

        for (byte i = 0; i < storage.length; i++) {
            // if (degrees <= Math.pow(2, 31) & degrees >= Math.pow(-2, 31)) {
            if (storage[i] == 0 | storage[i] == 180) {
                System.out.println("BRONCA");
            } else if (storage[i] != 0 | storage[i] != 180) {
                System.out.println("OK");
            }
            // }

        }

    }

}
