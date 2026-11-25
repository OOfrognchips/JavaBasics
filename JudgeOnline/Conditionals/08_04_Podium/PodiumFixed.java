import java.util.Scanner;

public class PodiumFixed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the score of the first athlete:");
        byte score1 = input.nextByte();

        System.out.println("Enter the score of the second athlete:");
        byte score2 = input.nextByte();

        System.out.println("Enter the score of the third athlete:");
        byte score3 = input.nextByte();

        System.out.println("Enter \"asc\" or \"desc\":");
        String ordererType = input.next().toLowerCase();

        input.close();

        byte dummyReferenceNumber = score1;
        if (ordererType.equals("asc")) {
            if (dummyReferenceNumber < score2) {
                dummyReferenceNumber = score2;
                if (dummyReferenceNumber < score3) {
                    System.out.printf("Podium: %d %d %d%n", score1, score2,
                        score3);
                } else if (dummyReferenceNumber > score3) {
                    System.out.printf("Podium: %d %d %d%n", score1, score3,
                        score2);
                }
            } else if (dummyReferenceNumber > score2) {
                dummyReferenceNumber = score1;
                if (dummyReferenceNumber < score3) {
                    System.out.printf("Podium: %d %d %d%n", score2, score1,
                        score3);
                } else if (dummyReferenceNumber > score3) {
                    System.out.printf("Podium: %d %d %d%n", score2, score3,
                        score1);
                }
            }
        } else if (ordererType.equals("desc")) {
            if (dummyReferenceNumber < score2) {
                dummyReferenceNumber = score2;
                if (dummyReferenceNumber < score3) {
                    System.out.printf("Podium: %d %d %d%n", score3, score2,
                        score1);
                } else if (dummyReferenceNumber > score3) {
                    System.out.printf("Podium: %d %d %d%n", score2, score3,
                        score1);
                }
            } else if (dummyReferenceNumber > score2) {
                dummyReferenceNumber = score1;
                if (dummyReferenceNumber < score3) {
                    System.out.printf("Podium: %d %d %d%n", score3, score1,
                        score2);
                } else if (dummyReferenceNumber > score3) {
                    System.out.printf("Podium: %d %d %d%n", score1, score3,
                        score2);
                }
            }
        }
    }

}
