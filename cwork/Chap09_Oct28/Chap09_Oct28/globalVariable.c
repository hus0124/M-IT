/*
�������� ; ��𼭵��� ���� ����
ũ��(��) : ������ ũ�� -> �ʹ� ���� �ʰ�
*/

#include <stdio.h>

int num = 10;		// ���ϳ����� ������ ��� ���� (���� �Լ����� ������ ���)

void callFuncOne()
{
	num = 50;		// ���������̹Ƿ� ��� �Լ������� ���� ����.
	printf("num = %d\n", num);
	int var1 = num + 30;		// ��������. �ϳ��� �Լ������� �ӽ÷� �Ҵ��ؼ� ����ϴ� ���
}
int main_globalvariable(void)
{
	printf("num = %d\n", num);		// num �� ���������̹Ƿ� ���� ����
	
	int num2 = 20;			      // num �� ��������. ���������� ���� �̸��� ��� �� �ϴ°� ����. �򰥸���.
	printf("num = %d\n", num2);

	callFuncOne();

	return 0;
}