/*
������ ����� �迭�� ����
2~9��
gugu[10][10] : 2�� 2�� 3�� 3�� ���������� �����ϰ� �ʹٸ� 0, 1�� �ȽἭ �޸� ����� �ְ����� ������ ���� ���� �ƴ�.
*/

#include <stdio.h>

int main_twodim(void)
{
	int gugu[10][10];
	printf("%p\n", gugu);	//�迭�� gugu[0][0] �ּ�

	for (int i = 2; i < 10; i++)
	{
		printf("%p\n", gugu[i]);	//i �� ���� �ּ�

		for (int j = 1; j < 10; j++)
		{
			gugu[i][j] = i * j;
		}
	}

	for (int i = 2; i < 10; i++)
	{
		printf("%d��\n", i);

		for (int j = 1; j < 10; j++)
		{
			printf("%d * %d = %2d\n", i, j, gugu[i][j]);
		}
		printf("\n");
	}

	return 0;
}