import java.util.Scanner;

public class manananohayclase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte totalDays = input.nextByte();
        byte count = 0;
        byte maxCount = 0;

        for (byte i = 0; i < totalDays; i++) {
            String state = input.next();

            if (state.equals("S")) {
                count = 0;
            } else if (state.equals("N")) {
                count += 1;
                if (count > maxCount) {
                    maxCount = count;
                } else if (count <= maxCount) {
                    continue;
                }
            }
        }

        input.close();
        System.out.println(maxCount);
    }

}
