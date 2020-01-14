/* 조건문 : 
1. if, else if, else

2. switch 문

if(조건){ 조건 만족 시 실행내용 }
조건 불만족 시 프로그램은 if 문을 건너뛰고 내려간다

*/

#include <stdio.h>

int main_if(void)
{
	/*int num;
	printf("정수입력 : ");
	scanf("%d", &num);

	if (num < 0)
		printf("입력 값은 0보다 작다.\n");
	else if (num > 0)
		printf("입력 값은 0보다 크다.\n");
	else 
		printf("입력 값은 0이다\n"); */

	int i;
		
	for (i = 0; i < 31; i++)
	{
		if (i % 3 == 0 && i % 5 == 0) // 15의 배수
		{
			printf("%d(15)\n", i);
		}
		else if (i % 3 == 0)		// else if는 15의 배수가 아닌 3의 배수 (15의 배수는 첫 번째 조건에 들어감). 포함되길 원하면 그냥 if
		{
			printf("%d(3)\n",i);
		}
	}
	printf("\n\n");
	
	for (i = 0; i < 31; i++)
	{
		if (i % 3 == 0 && i % 5 == 0) // 15의 배수
		{
			printf("%d(15)\n", i);
		}
		if (i % 3 == 0)		// 3의 배수. 15 배수도 포함됨. 그냥 if니까
		{
			printf("%d(3)\n", i);
		}
	}
	return 0;
}
