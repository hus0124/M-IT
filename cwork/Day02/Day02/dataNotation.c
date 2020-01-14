/* 
데이터 표현 방식 : 2진수 8진수 10진수 16진수

0b1000 : 이진수
0145 : 8진수 (0 ~ 7까지 사용)
1234 : 10진수 (0 ~ 9까지 사용)
0x123 : 16진수 (0 ~ 9 , 대소문자 상관없이 A ~ F 사용)

*/

#include <stdio.h>

int main_dataNotation(void)
{
	int num = 0b10101010;		// 이진수 0b 로 시작
	printf("%d\n", num);		// 결과는 10진수로 나옴
	num = 01234567;				// 8진수 표현방법, 숫자 0으로 시작
	printf("%d\n", num);
	num = 1234567;				// 10진수 표현방법
	printf("%d\n", num);
	num = 0x1234abc;			// 16진수 표현방법
	printf("%d\n", num);

	int a = 0b00000101, b = 0b11111011;
	printf("%f", a + b);
	return 0;
}