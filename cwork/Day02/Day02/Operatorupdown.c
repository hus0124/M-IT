/*
����, ���� : ���� ���� 1��ŭ ������Ű�ų� ���ҽ�Ű�� ���
++num ; num = num + 1, ������ �Ŀ���
num++ ; num = num + 1, ������ ������
*/

#include <stdio.h>

int main_Operatorupdown(void)
{
	int num = 20;
	int b;

	printf("num = %d\n", num);		// num = 20
	
	b = num++;		// b = 20
	printf("b = %d, num = %d\n", b, num);		// b = 20, num = 21

	b = ++num;		// b = 22
    printf("b = %d, num = %d\n", b, num);		// num = 22, b = 22
	


	return 0;

}