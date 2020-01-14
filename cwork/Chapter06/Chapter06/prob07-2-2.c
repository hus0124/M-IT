/*
*
0 *
0 0 *
0 0 0 *
0 0 0 0 *
참고로 5행에 걸쳐서 출력이 이루어지고, 행이 더해질 때마다 0문자의 수가 증가한다는 특징을
기반으로 while문의 중첩을 구성하면 된다.

*/


#include <stdio.h>

int main_0722(void)

{
	int i, j;
	i = 0;
	while (i < 5)		//i는 0~4까지 
	{
		j = 0;		//j의 용도는 0을 출력하는 횟수
		while (j++ < i)
		{
			printf("0 ");
		}

		printf("*\n");
		i++;
	}

	return 0;
}