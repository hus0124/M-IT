/*
���� 1. ���̰� 5�� int�� �迭�� �����ؼ� ���α׷� ����ڷκ���
	�� 5���� ������ �Է� ����. �׸��� �Է��� ������ ������ ����
	�� ����ϵ��� ������ �ۼ��� ����.
	- �Էµ� ���� �߿��� �ִ밪
	- �Էµ� ���� �߿��� �ּҰ�
	- �Էµ� ������ ��

	1. �Է��� ���� �ް�
	[��Ʈ] scanf("%d", &arr[i]);
	2. �ִ밪�� �ּҰ�, ���� ���
*/

#include <stdio.h>

int main_prob11_1(void)

{
	int arr[5];	// int�� �迭 5��
	int max; 
	int min;
	int sum;

	for (int i = 0; i < 5; i++)	// ������ 5�� �Է� arr[0] ~ arr[4]���� 5��
	{
		scanf("%d", &arr[i]);
	}
	//ó�� �� arr[0]
	max = min = sum = arr[0];
	// ������ arr[1] ~ arr[4]�� �ݺ������� ó���Ϸ��� �ǵ�

	for (int i = 1; i < 5; i++)	 // ���ο� �ִ� �ּҰ��� �հ� ���ϱ� 
	{
		if (max < arr[i])
			max = arr[i];

		if (min > arr[i])
			min = arr[i];
		sum += arr[i];
	}
	printf("�ִ밪 = %d\n", max);
	printf("�ּҰ� = %d\n", min);
	printf("�հ� = %d\n", sum);
	return 0;
}
