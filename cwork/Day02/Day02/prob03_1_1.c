/* 문제1
두 수 입력 후 뺄셈과 곱셉 결과를 출력*/

#include <stdio.h>

int main_0311(void)
{// 두 수를 입력 받는다
// 변수 두 개를 선언한다

	int a, b;
	printf("두 개의 정수 :");
	scanf("%d %d", &a, &b);

// 연산결과 출력

	printf("%d - %d = %d\n\n", a, b, a - b);
	printf("%d * %d = %d\n\n", a, b, a * b);

	return 0;
}