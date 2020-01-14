/*
register 변수 
CPU 내에 존재하는 레지스터 중에 하나를 사용
따라서 실행속도가 빠른 함수가 필요할 때 사용한다
*/

#include <stdio.h>

int accumulate(int n)
{
	register int sum = 0;		// register 변수. 속도 빠름. 빠른 연산 수행 가능.
								// 자주 사용되는 함수에서 빠른 연산을 수행할 때 필요.
	for (int i = 1; i <= n; i++)
		sum += i;
		return sum;
}

int main_register(void)
{
	// 1부터 10까지 합을 구한다면
	int result = accumulate(10);
	printf("결과 = %d\n", result);
	return 0;
}