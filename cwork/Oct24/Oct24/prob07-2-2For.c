#include <stdio.h>

int main_0722for(void)
{
	/* int i, j;
	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < i; j++)
		{
			printf("0 ");
		}
		
		printf("*\n");
	}*/

	int i, j;
	for (i = 0; i < 5; i++)			// * ǥ ��� �ݺ�
	{
		for (j = 0; j < 5 - 1 - i; j++)		// ���� 2ĭ �� �ݺ� ���. 8, 6, 4, 2, 0ĭ ���� ����. 
		{
			printf("  ");
		}
		for (j = 0; j < i; j++)		// '0 ' �ݺ����
		{
			printf("0 ");
		}

		printf("*\n");
	}
	return 0;
}