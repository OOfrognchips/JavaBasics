import java.util.Scanner;

public class supermariano3 {

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        input.close();

        if (userInput.equals("ALCALDE")) {
            System.out.println("LOS VECINOS");
        } else if (userInput.equals("VECINOS")) {
            System.out.println("EL ALCALDE");
        } else {
            System.out.println("M.RAJOY");
        }

    }

}
