#include <stdio.h>

int main_05_1_2(void)
{
	double num1, num2;
	printf("�Ǽ� 1 �� �Է��ϼ��� : ");
	scanf("%lf", &num1);
	printf("�Ǽ� 2 �� �Է��ϼ��� : ");
	scanf("%lf", &num2);

	
	printf("��Ģ���� �����\n\n");
	printf("���� : %f\n", num1 + num2);
	printf("���� : %f\n", num1 - num2);
	printf("���� : %f\n", num1 * num2);
	printf("���� : %f\n", num1 / num2);

	return 0;
}

