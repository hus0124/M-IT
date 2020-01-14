/*
문제 2. 두 개의 정수를 입력 받아서 두 수의 차를 출력하는 프로그
	램을 작성해 보자. 단 무조건 큰 수에서 작은 수를 뺀 결과를
	출력해야 한다.
*/

#include <stdio.h>

int main_0812(void)
{
	int num1, num2;
	printf("두 개의 정수를 입력하세요 : ");
	scanf("%d %d", &num1, &num2);

	if (num1 > num2)
	{
		printf("두 정수의 차 = %d", num1 - num2);
	}
	else if (num1 < num2)
	{
		printf("두 정수의 차 = %d", num2 - num1);
	}

	else printf("두 정수의 차 = 0");
		
	return 0;
}