/*
������ ��°� �Է¿��� �ٸ� ���̸� ���̴� ���� ����
float double long double ���� ���� �ٸ���
*/
// #pragma warning(disable:4996)   4996 ���� ����

#include <stdio.h>

int main_inout(void)
{
	int num;
	printf("10���� ���� �Է� : ");
	scanf("%d", &num);
	printf("%d\t%#o\t%#x\n", num,num,num);

	printf("8���� ���� �Է� : ");
	scanf("%o", &num);
	printf("%d\t%#o\t%#x\n", num, num, num);

	printf("16���� ���� �Է� : ");
	scanf("%x", &num);
	printf("%d\t%#o\t%#x\n", num, num, num);

	double d1;
	float f1;
	printf("float ���� �Է� : ");
	scanf("%f", &f1);
	printf("%f\n",f1);

	printf("double ���� �Է� : ");
	scanf("%lf", &d1);
	printf("%f\n", d1);

	printf("���� ���� �Է� : ");
	scanf("%lf", &d1);
	printf("%f\n", d1);

	return 0;

}