/* 
���԰� �������(+ - * / %)
*/

#include <stdio.h>		// printf(���), scanf(�Է�) �� �Լ� ���

int main_Arithmatic(void)
{
	int a = 10;		// ���� : 10�� ���� a �� ����(����)
	int b = 2;		// ����
	int sum = a + b;				// ���ϱ� ����
	printf("%d + %d = %d\n", a, b, sum);

									// ���� ����
	int sub = a - b;
	printf("%d - %d = %d\n", a, b, sub);

	int mul = a * b;
	printf("%d * %d = %d\n", a, b, mul);

	int div = a / b;
	printf("%d / %d = %d\n", a, b, div);

	int rem = a % b;		// ������ ���ϱ�� % ���
	printf("%d %% %d = %d\n", a, b, rem);		// "%" �� ��³������� �ϱ� ���� %% �� ����ؾ� ��

	/* ���� ���� ����
	a = a + b; a += b
	a = a - b; a -= b
	a = a * b; a *= b
	a = a / b; a /= b
	a = a % b; a %= b
	*/

	a += b; 
	printf("a = %d\n", a);
	a -= b;
	printf("a = %d\n", a);
	a *= b;
	printf("a = %d\n", a);
	a /= b;
	printf("a = %d\n", a);
	a %= b;
	printf("a = %d\n", a);

	return 0;
	
}