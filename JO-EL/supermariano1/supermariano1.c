#include <stdlib.h>
#include <stdio.h>

#include <errno.h>
#include <limits.h>

int main() {

	unsigned short int casesToProcess = 0;
	unsigned long int userInputNumbers[100];
	char userInput[20] = "";
	char *endpointer;

	if (scanf("%hu", &casesToProcess) != 1 || casesToProcess > 100) {  // Returns the number 1 when successfully reading the input
		return 1;
	}

       	for (unsigned short int i = 0; i < casesToProcess; i++) {
		if (scanf("%19s", userInput) != 1) {
			return 1;
		}

		// userInputNumbers[i] = atoi(userInput);
		userInputNumbers[i] = strtol(userInput, &endpointer, 10);
	}

	for (unsigned short int i = 0; i < casesToProcess; i++) {
		if (userInputNumbers[i] < 1000) {
			printf("MUY\n");
		} else if (userInputNumbers[i] >= 1000) {
			printf("MUCHO\n");
		} else if (endpointer == userInput || *endpointer != '\0' ||
            errno == ERANGE || userInputNumbers[i] < 0 || userInputNumbers[i] > USHRT_MAX) {

            printf("COSA\n");
            continue;
        }

	}

	printf("MUCHAS GRACIAS\n");
	return 0;
}
