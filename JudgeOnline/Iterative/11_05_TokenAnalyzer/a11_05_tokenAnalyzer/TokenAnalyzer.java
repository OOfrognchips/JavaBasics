package a11_05_tokenAnalyzer;

import java.util.Scanner;

public class TokenAnalyzer {

    public static void main(String[] arguments) {

        Scanner input = new Scanner(System.in);

        String suspiciousToken = "", rejectedTokens = "", smallTokens = "",
            bigTokens = "";
        int rejectedTokensCount = 0, smallTokensCount = 0, bigTokensCount = 0;

        while (true) {
            System.out.println("Enter Token ID:");
            int tokenID = input.nextInt();

            if (tokenID >= 64500 & tokenID <= 66700) {
                suspiciousToken += tokenID;
                break;
            } else if (tokenID <= 1000) {
                if (!rejectedTokens.isEmpty()) {
                    rejectedTokens += ", ";
                }

                rejectedTokens += tokenID;
                rejectedTokensCount += 1;
                continue;
            } else if (tokenID > 1000 & tokenID < 100000) {
                if (!smallTokens.isEmpty()) {
                    smallTokens += ", ";
                }

                smallTokens += tokenID;
                smallTokensCount += 1;
                continue;
            } else if (tokenID >= 100000) {
                if (!bigTokens.isEmpty()) {
                    bigTokens += ", ";
                }

                bigTokens += tokenID;
                bigTokensCount += 1;
                continue;
            }
        }

        input.close();

        System.out.printf("%nAnalysis statistics:%n");
        System.out.printf("AI ALERT! Suspicious token detected: %s%n",
            suspiciousToken);

        if (smallTokensCount == 0) {
            System.out.printf("Tokens smaller than 100000: %d%n",
                smallTokensCount);
        } else if (smallTokensCount != 0) {
            System.out.printf("Tokens smaller than 100000: %d (%s)%n",
                smallTokensCount, smallTokens);
        }

        if (bigTokensCount == 0) {
            System.out.printf("Tokens bigger or equal than 100000: %d%n",
                bigTokensCount);
        } else if (bigTokensCount != 0) {
            System.out.printf("Tokens bigger or equal than 100000: %d (%s)%n",
                bigTokensCount, bigTokens);
        }

        if (rejectedTokensCount == 0) {
            System.out.printf("Rejected tokens: %d%n", rejectedTokensCount);
        } else if (rejectedTokensCount != 0) {
            System.out.printf("Rejected tokens: %d (%s)%n", rejectedTokensCount,
                rejectedTokens);
        }

    }

}
