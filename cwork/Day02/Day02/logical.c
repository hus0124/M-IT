/*
논리연산자 : && (And) || (Or) ! (Not)
두 개의 조건을 논리적으로 연산한다.
&& : 둘 다 참일 때 참
|| : 둘 중 하나가 참일 때 참
! : 부정, 반대 (참 -> 거짓,  거짓 -> 참)
*/

#include <stdio.h>

int main_logical(void)
{
	int age = 25;
	int gender = 1;		// 1은 남성, 0은 여성

	if (age >= 10 && age < 20)		// 나이 조건이 10대
		printf("10대\n\n");
	else if (gender == 1 || age > 40)
		printf("그냥\n\n");
	
	
	return 0;
}

