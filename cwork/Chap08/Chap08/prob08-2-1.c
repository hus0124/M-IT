/*
문제 1. 구구단을 출력하되 짝수 단(2단, 4단, 6단, 8단)만 출력하
	도록 하자. 또한 2단은 2*2까지, 4단은 4*4까지, 6단은 6*6까지
	8단은 8*8까지 출력되도록 프로그램을 구현해 보자.
*/

#include <stdio.h>
int main_0821(void)
{
	int i, j;
	for (i = 2; i < 10; i++)
	{
		if (i % 2 != 0)
			continue;
		{
			printf("%d단\n", i);

			for (j = 1; j < 10; j++)
			{
				printf("%d * %d = %2d\n", i, j, i * j);
				if (j == i)  
				break;
			}
		}
		printf("\n");
	}
	return 0;
}