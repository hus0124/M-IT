/*
구구단 결과를 배열에 저장
2~9단
gugu[10][10] : 2를 2에 3을 3에 직관적으로 연결하고 싶다면 0, 1은 안써서 메모리 낭비는 있겠지만 걱정할 만한 일은 아님.
*/

#include <stdio.h>

int main_twodim(void)
{
	int gugu[10][10];
	printf("%p\n", gugu);	//배열의 gugu[0][0] 주소

	for (int i = 2; i < 10; i++)
	{
		printf("%p\n", gugu[i]);	//i 한 행의 주소

		for (int j = 1; j < 10; j++)
		{
			gugu[i][j] = i * j;
		}
	}

	for (int i = 2; i < 10; i++)
	{
		printf("%d단\n", i);

		for (int j = 1; j < 10; j++)
		{
			printf("%d * %d = %2d\n", i, j, gugu[i][j]);
		}
		printf("\n");
	}

	return 0;
}