#include <stdio.h>

int main_floaterror(void)
{
	int i;
	float num = 0.0f;		// 0.0 (double) 0.0f(float)

	for (i = 1; i < 101; i++)
		num += 0.1f;

	printf("0.1�� 100�� ���� ���: %f\n", num);		// %f �� �Ǽ�(float ���� ����)

	double num2 = 0.0;		// 0.0 (double) 0.0f(float)

	for (i = 1; i < 101; i++)
		num2 += 0.1;

	printf("0.1�� 100�� ���� ���(����): %f\n", num2);		// %f �� �Ǽ�(float double ���� ����)

	return 0;
}