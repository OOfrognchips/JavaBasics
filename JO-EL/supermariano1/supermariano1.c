#include <stdio.h>

int main() {

	unsigned short int casesToProcess = 0;
	unsigned char output[50] = '\0';

	if (scanf("%hu", &casesToProcess) != 1) {  // Returns the number 1 when successfully reading the input
		return 1;
	}

	if (casesToProcess <= 100) {
	for (unsigned short int i = 0; i < casesToProcess; i++) {
		if (scanf("%c", &output) != 1) {
			return 1;
		}

		unsigned short int userInputNumber = atoi(output);

		if (output == 'S') {
			count = 0;
		} else if (state == 'N') {
			count++;
			if (count > maxCount) {
				maxCount = count;
			} else if (count <= maxCount) {
				continue;
			}
		}
	}
	}

	printf("%hu\n", maxCount);
	return 0;
}
