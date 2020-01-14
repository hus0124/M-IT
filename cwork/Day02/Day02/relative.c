/*
관계연산자, 비교연산자
< > <= >= == !=
두 개의 크기를 비교한다
*/

#include <stdio.h>

int main_relative(void)
{
	int a = 20;		// 비교 : 참(0 아닌 값, 대표적으로 1, 2, -1 등), 거짓(0)
	if (a > 10)
		printf("10보다 큽니다.\n\n");
	else if (a <= 10)
		printf("10보다 작거나 같습니다.\n\n");

	printf("a > 10 : %d\n\n", a > 10);		// a = 20 > 10 이므로 참, 1 출력
	printf("a < 10 : %d\n\n", a < 10);      // a = 20 > 10 이므로 거짓, 0 출력
	return 0;
}