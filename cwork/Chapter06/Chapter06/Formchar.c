/* ���Ĺ��� : �������� ���� ���ؼ� ��� �����ϰ� �Ѵ�

*/

#include <stdio.h>

int main_Formchar(void)

{
	int num = 100;

	printf("num=%d, %#x, %#o\n", num, num, num);
	
	double d1 = 0.0000456;

	printf("d1=%f(%%f), %e(%%e), %g(%%g)\n", d1, d1, d1);		// % ǥ�� ���ϸ� %% �� �� ǥ��

	printf("%s\n", "���ѹα�");

	int* pa = &num;

	printf("pa=%p\n", pa);		// %p : ������ �ּ� ���

	int ch = 'r';
	printf("ch=%c\n", ch);		// %c �� �� ���� 
	return 0;
}