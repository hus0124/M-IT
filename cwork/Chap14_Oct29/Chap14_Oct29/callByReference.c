/*
Call-by-value �� call-by-reference �� ����

call-by-value : �Լ��� ȣ���ϸ鼭 �Ű������� ���� ����
*/

#include <stdio.h>

int add2(int n1, int n2)		// �Ű����� n1, n2 : ���� ����ȴ�.
{
	return n1 + n2;
}

void swap_by_value(int a, int b)		// a = 30, b = 40. ���� ���� ����Ǿ� ���޵�.
{
	int tmp = a;
	a = b;
	b = tmp;						// ��ȯ ���� ���ļ� a = 40, b = 30 ���������...�۵��Ұ�
}

void swap_by_reference(int* a, int* b)		// ������ (���� a�� �ּҰ� ����Ǽ� ���޵�)
{
	int tmp = *a;	//tmp:30
	*a = *b;		//*a=40 -> main�Լ��� ���� a�� ���� 40
	*b = tmp;		//*b=30 -> b�� �� 30
}

void function(double* dp1, double* dp2)
{
	*dp1 = 9.1;
	*dp2 = 7.3;
}
int main_callbyreference(void)
{
	int a = 30;
	int b = 40;
	int sum = add2(a, b);
	printf("�� : %d\n", sum);
	
	int* aptr = &a;
	int* bptr = &b;

	//�Լ��� ȣ���ϸ鼭 main �Լ����� ������ ���� a, b�� ����� ���� ��ȯ�ϰ� �ʹٸ�

	printf("a = %d, b= %d\n", a, b);		// a = 30, b = 40
	swap_by_value(a, b);
	printf("a = %d, b= %d\n", a, b);		// a = 40, b = 30

	swap_by_reference(&a, &b);		// �Ű������� ���� �������� �ʰ� ������ �ּҸ� ����.
	printf("a = %d, b= %d\n", a, b);		// a = 40, b = 30
	

	double d1 = 1.2;
	double d2 = 2.4;
	printf("d1=%f, d2=%f\n", d1, d2);
	function(&d1, &d2);
	printf("d1=%f, d2=%f\n", d1, d2);
	return 0;
}