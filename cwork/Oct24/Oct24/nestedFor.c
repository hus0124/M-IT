/*
������ ��� 2~9��, �Ŵ� n*1~n*9 ���� 
��ø for �� �ʿ�

*/
#include <stdio.h>

int main_nestedFor(void)
{
	int i, j;
	for (i =2; i < 10; i++)
	{
		printf("%d��\n", i);

		for (j = 1; j < 10; j++)
		{
			printf("%d * %d = %2d\n", i, j, i * j);
		}

		printf("\n");
	}

	return 0;
}