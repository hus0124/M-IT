/*
���� 1. ���� num�� ����� ���� ������ ����ϴ� �Լ��� �����ϰ�,
	�̸� ȣ���ϴ� main �Լ��� �ۼ��غ���. ��, ���⼭�� ���� ��
	���� ���·� �Լ��� �����ؾ� �Ѵ�.
	- Call-by-value ����� SquareByValue �Լ�
	- Call-by-reference ����� SquareByReference �Լ�

	SquareByValue : return ���� ������ ��ȯ
	SquareByReference : �Ű������� ���� �����ϵ��� �䱸

*/

#include <stdio.h>

int squareByValue(int n)
{
	return n * n;
}

void squareByReference(int* n)
{
	//int tmp = *n;
	//*n = tmp * tmp;
	*n = *n * *n;
}

int main_1411(void)
{
	int num = 5;
	printf("%d�� ���� = %d\n", num, squareByValue(num));
	squareByReference(&num);
	printf("���� : %d\n", num);  // num�� 5 ���µ� �ּҰ� ȣ��� ���� ����ȴ�.
	
	return 0;
}