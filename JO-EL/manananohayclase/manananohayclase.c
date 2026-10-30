#include <stdio.h>

int main() {

	unsigned short int totalDays = 0, count = 0, maxCount = 0;
	unsigned char state = 'S';

	if (scanf("%hu", &totalDays) != 1) {  // Returns the number 1 when successfully reading the input
		return 1;
	}

	for (unsigned short int i = 0; i < totalDays; i++) {
		if (scanf(" %c", &state) != 1) {
			return 1;
		}

		if (state == 'S') {
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

	printf("%hu\n", maxCount);
	return 0;
}
