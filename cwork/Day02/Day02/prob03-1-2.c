#include <stdio.h>

int main_312(void)
{
	int num1, num2, num3;
	printf("num1: ");
	scanf("%d", &num1);
	
	printf("num2: ");
	scanf("%d", &num2);
	
	printf("num3: ");
	scanf("%d", &num3);

	int result = (num1 * num2) + num3;
	printf("num1 * num2 + num3 Á¤´äÀº %d\n\n", result);

	
	return 0;
}