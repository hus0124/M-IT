/*
const : ����� �����Ѵ�. ���� �� �ϵ��� ���� ���� ��
*/

#include <stdio.h>

void callFunction(const int* ptr)	// �Լ� ������ *ptr ��� ����. 
{
	// *ptr = 50; �̷������� �Լ� ������ �� ���� �ȵ�.
}

void function2(int* const ptr)	//�Լ� ������ ptr ��� ����.
{
	// ptr = &num2; �̷� ������ �Լ� ������ �������� �ּ� ���� �ȵ�
}

int main_constpointer(void)
{
	int num = 10;		// ���� 10���� ������ ���� ���� �ڿ��� �������� ���ϰ� �ϰ� �ʹ�.
	num = 20;

	const int var1 = 20;		// �ʱ�ȭ ���� �ڿ��� �������� ���ϰ� �Ѵ�.
	//var1 = 30; ��������.
	
	const int* ptr = &num;		// ����� ����(�����Ͱ� ����Ű�� ��)�� ���� �Ұ����ϰ� �Ѵ�.
	// *ptr = 30; ��������

	int* const pnum = &num;		// �������� �ּ� ������ �Ұ�.
	// pnum = &var1; ��������

	callFunction(&num);

	function2(&num);

	return 0;
}