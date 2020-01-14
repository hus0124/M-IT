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
	for (i = 0; i < 5; i++)			// * 표 출력 반복
	{
		for (j = 0; j < 5 - 1 - i; j++)		// 공백 2칸 씩 반복 출력. 8, 6, 4, 2, 0칸 패턴 존재. 
		{
			printf("  ");
		}
		for (j = 0; j < i; j++)		// '0 ' 반복출력
		{
			printf("0 ");
		}

		printf("*\n");
	}
	return 0;
}