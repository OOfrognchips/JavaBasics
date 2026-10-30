// Works but the platform does not validate it completely

import java.util.Scanner;

public class manananohayclase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean notValidInput = true;

        while (notValidInput) {
            String inputTotalDays = input.nextLine();
            int totalDays = Integer.parseInt(inputTotalDays);

            if (totalDays < 1 | totalDays > 1000) {
                notValidInput = true;
                continue;
            } else if (totalDays >= 1 | totalDays <= 1000) {
                notValidInput = false;

                byte count = 0, dummyCount = 0, i = 1;
                String state = "S"; // Previous and new state
                // System.out.printf("i: none, cnt: %d, st: %s%n", count, state);

                while (i <= totalDays) {
                    // It is assumed the user is clever enough to introduce the correct input
                    // System.out.printf("i: %d, cnt: %d, st: %s, svd: %d%n", i, count, state, dummyCount);
                    String ifClass = input.nextLine();

                    if (!ifClass.equals("S") && !ifClass.equals("N")) {
                        continue;
                    } else if (ifClass.equals("S") | ifClass.equals("N")) {

                        if (i == 1) {
                            if (ifClass.equals("S")) {
                                state = "S";
                            } else if (ifClass.equals("N")) {
                                state = "N";
                                count += 1;
                            }
                        } else if (i != 1) {
                            if (ifClass.equals("S")) {
                                state = "S";
                            } else if (ifClass.equals("N")) {
                                if (state.equals("S")) {
                                    state = "N";
                                    dummyCount = count;
                                    // count = 0;
                                    // count += 1;
                                    count = 1;
                                } else if (state.equals("N")) {
                                    state = "N";
                                    count += 1;
                                }
                            }
                        }
                        i++;
                    }
                }

                input.close();

                if (dummyCount > count) {
                    System.out.println(dummyCount);
                } else if (dummyCount < count) {
                    System.out.println(count);
                } else if (dummyCount == count) {
                    System.out.println(count);
                }

                // System.out.println(dummyCount);
            }
        }

    }

}
