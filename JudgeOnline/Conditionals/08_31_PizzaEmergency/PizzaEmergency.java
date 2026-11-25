import java.util.Scanner;

public class PizzaEmergency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pizza diameter:");
        byte pizzaDiameter = input.nextByte();

        input.close();

        String result = pizzaDiameter >= 30 ? "Pizza for everyone!"
            : "You might need another pizza!";
        System.out.println(result);
    }

}
