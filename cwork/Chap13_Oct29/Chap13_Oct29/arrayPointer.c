/*
�迭�� ������
*/

#include <stdio.h>

int main_arpt(void)
{
	int num = 10;					// ����
	int* ptr = &num;				// ������ ����
	printf("num = %d\n", num);		// ���� num �� ����ؼ� ���
	printf("num = %d\n", *ptr);		// ������ ������ ���ؼ� num �� ���
	 // *ptr : ������ ���� ptr�� ����� �ּҰ� ����Ű�� ������ ����
	 // ptr : ������ ������ ��. �� ���� num�� �ּ�

	int arr[4] = { 5, 10, 15, 20 };
	for (int i = 0; i < 4; i++)
	{
		printf("arr[%d]�� �� : %d,  &arr[%d] = %p\n", i, arr[i], i, &arr[i]);
		// arr[i] : �迭 arr�� i��° ��
		// &arr[i] : �迭 arr�� i��° ���� �ּ�
		
	}
	// ������ ������ ����ؼ� �����ϱ�
	int* parr = arr;			// arr ��ü�� �迭�� �ּ�. & ��ȣ ���� �ʿ� ����.
	int* p2 = &arr[0];			// arr = arr[0] ���� �� ������.
	for (int i = 0; i < 4; i++)
	{
		printf("*(parr + %d)�� �� : %d, parr + %d = %p\n", i, *(parr + i), i, parr + i);
	}
	 // arr[i] �� *(parr + i) �� ���� ��, ���� ǥ��.
	 // &arr[i] = parr + i
	return 0;
}