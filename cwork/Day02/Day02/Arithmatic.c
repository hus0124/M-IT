/* 
대입과 산술연산(+ - * / %)
*/

#include <stdio.h>		// printf(출력), scanf(입력) 등 함수 사용

int main_Arithmatic(void)
{
	int a = 10;		// 대입 : 10을 변수 a 에 대입(저장)
	int b = 2;		// 대입
	int sum = a + b;				// 더하기 연산
	printf("%d + %d = %d\n", a, b, sum);

									// 빼기 연산
	int sub = a - b;
	printf("%d - %d = %d\n", a, b, sub);

	int mul = a * b;
	printf("%d * %d = %d\n", a, b, mul);

	int div = a / b;
	printf("%d / %d = %d\n", a, b, div);

	int rem = a % b;		// 나머지 구하기는 % 사용
	printf("%d %% %d = %d\n", a, b, rem);		// "%" 를 출력내용으로 하기 위해 %% 를 사용해야 함

	/* 복합 대입 연산
	a = a + b; a += b
	a = a - b; a -= b
	a = a * b; a *= b
	a = a / b; a /= b
	a = a % b; a %= b
	*/

	a += b; 
	printf("a = %d\n", a);
	a -= b;
	printf("a = %d\n", a);
	a *= b;
	printf("a = %d\n", a);
	a /= b;
	printf("a = %d\n", a);
	a %= b;
	printf("a = %d\n", a);

	return 0;
	
}