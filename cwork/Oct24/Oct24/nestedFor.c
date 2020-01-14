/*
구구단 출력 2~9단, 매단 n*1~n*9 까지 
중첩 for 문 필요

*/
#include <stdio.h>

int main_nestedFor(void)
{
	int i, j;
	for (i =2; i < 10; i++)
	{
		printf("%d단\n", i);

		for (j = 1; j < 10; j++)
		{
			printf("%d * %d = %2d\n", i, j, i * j);
		}

		printf("\n");
	}

	return 0;
}