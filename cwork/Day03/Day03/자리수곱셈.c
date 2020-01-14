#include <stdio.h>

int main_success(void)

{
	
	int num1, num2;
	scanf("%d", &num1);
	scanf("%d", &num2);

	int B1, B2, B3;

	B1 = num2 % 10;				//¿œ
	B2 = (num2 % 100) / 10;		//Ω 
	B3 = num2 / 100;			//πÈ

	printf("%d\n", num1 * B1);
	printf("%d\n", num1 * B2);
	printf("%d\n", num1 * B3);
	printf("%d\n", num1 * num2);

	return 0;
}