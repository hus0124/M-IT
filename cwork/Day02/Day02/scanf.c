/* 
입력 함수 : 키보드로부터 데이터르르 입력 scanf 함수
*/

#include <stdio.h>

int main_scanf(void)
{
	int a = 10;
	// 데이터 입력
	printf("정수 : ");
	scanf("%d", &a);		// %d : 정수(decimal), &a : 변수의 주소를 지정
	printf("a = %d\n", a);
	
	int b;
	printf("정수(10 20) : ");
	scanf("%d%d", &a, &b);
	printf("a = %d, b = %d\n", a, b);
	return 0;

}