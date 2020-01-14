#include <stdio.h>

int main_floaterror(void)
{
	int i;
	float num = 0.0f;		// 0.0 (double) 0.0f(float)

	for (i = 1; i < 101; i++)
		num += 0.1f;

	printf("0.1을 100번 더한 결과: %f\n", num);		// %f 는 실수(float 문자 서식)

	double num2 = 0.0;		// 0.0 (double) 0.0f(float)

	for (i = 1; i < 101; i++)
		num2 += 0.1;

	printf("0.1을 100번 더한 결과(더블): %f\n", num2);		// %f 는 실수(float double 문자 서식)

	return 0;
}