/*
���� 2. ����1������ ������ ���� ptr�� ����� ���� �����Ű�鼭
	�迭��ҿ� �����϶�� �Ͽ���. �׷��� �̹����� ������ ����
	ptr�� ����� ���� �����Ű�� �ʰ�, ptr�� ������� ��������
	�� �Ͽ�, �� ����� ��ȯ�ϴ� �ּҰ��� ���ؼ� ��� �迭���
	�� �����Ͽ� ���� 2�� ������Ű�� ������ �ۼ��غ���.
*/

#include <stdio.h>

int main_1312(void)
{
	int arr[5] = { 1, 2, 3, 4, 5 };
	int* ptr = arr;
	for (int i = 0; i < 5; i++)
	{
		*(ptr + i) += 2;
	}
	for (int i = 0; i < 5; i++)
	{
		printf("arr[%d] = %d\n", i, arr[i]);
	}
	return 0;
}