#include <limits.h>
#include <stdio.h>

int main() {

	signed long long int userInput = 0;

	if (scanf("%lli", &userInput) != 1) {  // Returns the number 1 when successfully reading the input
		return 1;
	}

	if (userInput == LLONG_MAX) {
		printf("Error: unsigned integer overflow (wraparound)\n");
	        return 1;
	}

	printf("%lli\n", userInput + 1);
	return 0;
}
