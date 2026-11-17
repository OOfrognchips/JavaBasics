#include <stdio.h>
#include <string.h>

int main() {
	char userInput[30] = "";

	if (scanf("%29s", userInput) != 1) {
		return 1;
	}

	if (strcmp(userInput, "ALCALDE") == 0) {
		printf("LOS VECINOS\n");
	} else if (strcmp(userInput, "VECINOS") == 0) {
		printf("EL ALCALDE\n");
	} else {
		printf("M.RAJOY\n");
	}

	return 0;
}
