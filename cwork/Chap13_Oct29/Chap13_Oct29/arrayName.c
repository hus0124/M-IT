/*
�迭�� ������
�迭 : ������ ũ���� �����͸� �����ؼ� ���
int arr[3] : 

�迭�� �̸� : �迭�� ó�� ����� �ּҸ� ��Ÿ����.
arr[i] : arr[0] ... arr[2]
arr[i]�� �ּ� : &arr[i]

�迭�� �������� ��

�迭�� �̸� : ��� (�޸𸮸� �����ϸ� ������ �ּҰ��� ������.)
              �迭 �̸��� ���� �Ұ���

������ ���� : ����(����Ű�� ����� ���� ������)

������ : �迭�̸��� ������ ������ �ּҸ� ������.
������ : �ּҰ� ������ �����Ѱ�? -> ������ ������ ����

*/

#include <stdio.h>

int main_arrayName(void)
{
	int arr[3] = { 0, 1, 2 };

	printf("arr = %p\n", arr);
	
	for (int i = 0; i < 3; i++)
	{
		printf("arr[%d] = %d, arr[i]�� �ּ� = %p\n", i, arr[i], &arr[i]);	// �迭�� ���� ����
	}
	
	int* parr = arr;	// ������ ���� : �迭 arr�� �ּҰ��� �����Ѵ�. arr ��ü�� �ּҶ� & �� ����.

	for (int i = 0; i < 3; i++)	// parr ���� �����ϸ鼭 �迭�� ����
	{
		printf("*(parr+ %d) = %d, parr + i = %p, parr = %p\n", i, *(parr + i), parr + i, parr);
	}
	
	// arr[i] : *(parr + i) ���� ǥ��, ���� ȣȯ�ؼ� ����� �� �ִ�.

	for (int i = 0; i < 3; i++)		// parr ���� ������ ���鼭 �迭�� ����
	{
		printf("*parr = %d, parr = %p\n", *parr, parr);
		parr++;
	}
	// for �Ⱦ��� �ٸ� ��

	int* eptr = &arr[2];
	for (; parr <= eptr; parr++)		// parr ���� ������ ���鼭 �迭�� ����
	{
		printf("*parr = %d, parr = %p\n", *parr, parr);
		parr++;
	}
	return 0;
}
