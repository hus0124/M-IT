#include <stdio.h>

int main(void)
{
	int arr[10];
	int num;
	int* fptr = &arr[0];	// �迭�� ó������ 
	int* bptr = &arr[9];	// �迭�� �ڿ�������
	int front = 0;
	int back = 9;

	printf("�� 10���� ���� �Է�\n");

	for (int i = 0; i < 10; i++)
	{
		printf("�Է� : ");
		scanf("%d", &num);
		
		if (num % 2 == 0)
			*bptr-- = num;
		// arr[back--] = num;
		else
			*fptr++ = num;
		// arr[front++] = num;
	}
	printf("�迭 ����� ��� : ");
	for (int i = 0; i < 10; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	return 0;
}