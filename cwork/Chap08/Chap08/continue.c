/*
반복문에서 어떤 조건일 때 continue 아래 실행문을 생략하고 다음으로 계속 진입

0 ~ 20에서 3의 배수가 아닌 수를 출력
*/

#include <stdio.h>

int main_continue(void)
{
	for (int i = 0; i < 21; i++)
	{
		if (i % 3 == 0)
		{
			continue;	// for 문이 반복문이므로 3의 배수이면 프린트 실행 안하고 넘어감. 다시 위로 돌아가서 조건 반복.
		}
		printf("%d\n", i);
	}
	return 0;
}