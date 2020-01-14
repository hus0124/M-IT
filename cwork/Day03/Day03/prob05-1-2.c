#include <stdio.h>

int main_05_1_2(void)
{
	double num1, num2;
	printf("실수 1 을 입력하세요 : ");
	scanf("%lf", &num1);
	printf("실수 2 을 입력하세요 : ");
	scanf("%lf", &num2);

	
	printf("사칙연산 결과값\n\n");
	printf("가산 : %f\n", num1 + num2);
	printf("감산 : %f\n", num1 - num2);
	printf("곱셈 : %f\n", num1 * num2);
	printf("나눔 : %f\n", num1 / num2);

	return 0;
}

