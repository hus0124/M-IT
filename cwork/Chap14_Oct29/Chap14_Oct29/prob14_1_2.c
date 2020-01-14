/*
���� 2. �� ������ ����� ���� ���� �ڹٲٴ� �Լ��� �����غ���.
	���� �� �Լ��� �̸��� Swap3�� �ϸ�, ������ ���·� �Լ�
	�� ȣ��Ǿ�� �Ѵ�.
	Swap3(&num1, &num2, &num3);

	�׸��� �Լ�ȣ���� ����� num1�� ����� ���� num2��, num2��
	����� ���� num3��, �׸��� num3�� ����� ���� num1�� �����
	��� �Ѵ�.
	*/

#include <stdio.h>

int Swap3(int* a, int* b, int* c)
{
	int tmp = *c;
	*c = *b;
	*b = *a;
	*a = tmp;
}

int main_1412(void)
{
	int num1 = 1, num2 = 2, num3 = 3;
	int* pnum1 = &num1;
	int* pnum2 = &num2;
	int* pnum3 = &num3;

	printf("num1 = %d, num2 = %d, num3 = %d\n\n", num1, num2, num3);

	Swap3(&num1, &num2, &num3);

	printf("Swap3 �� ��� : \n\n");
	printf("num1 = % d, num2 = % d, num3 = % d\n\n", num1, num2, num3);

	return 0;
}