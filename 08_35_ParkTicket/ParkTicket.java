import java.util.Scanner;

public class ParkTicket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Is it a weekday? (true/false)");
        boolean weekday = input.nextBoolean();

        input.close();

        boolean notTeenager = age < 12 ? true : false;

        String result = notTeenager == true
            ? (weekday == true ? "Ticket price: 5.00 €"
                : "Ticket price: 9.00 €")
            : (weekday == true ? "Ticket price: 15.00 €"
                : "Ticket price: 22.00 €");
        System.out.println(result);
    }
}
