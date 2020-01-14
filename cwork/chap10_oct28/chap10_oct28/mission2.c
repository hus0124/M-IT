/* 도전 2. 프로그램 사용자로부터 두 개의 정수를 입력 받아서 구구
    단을 출력하는 프로그램을 작성해 보자.
    예를 들어,	2, 5를 입력 받으면 2단~5단까지 출력
		6, 3을 입력 받으면 3단~6단까지 출력
*/

#include <stdio.h>

int main_mission2(void)
{
	int num1, num2;
	printf("두 개의 정수를 입력 하세요 : ");
	scanf("%d %d", &num1, &num2);

	if (num1 > num2)
	{
		for (int i = num2; i <= num1; i++)
		{
			printf("%d단\n", i);
			for (int j = 1; j < 10; j++)
			{
				printf("%d * %d = %2d\n", i, j, i * j);
			}
			printf("\n");
		}
	}
	else
	{
		for (int i = num1; i <= num2; i++)
		{
			printf("%d단\n", i);
			for (int j = 1; j < 10; j++)
			{
			printf("%d * %d = %2d\n", i, j, i * j);
			}
			printf("\n");
		}
	}
	return 0;
}
