/* 서식문자 : 데이터의 형식 정해서 출력 가능하게 한다

*/

#include <stdio.h>

int main_Formchar(void)

{
	int num = 100;

	printf("num=%d, %#x, %#o\n", num, num, num);
	
	double d1 = 0.0000456;

	printf("d1=%f(%%f), %e(%%e), %g(%%g)\n", d1, d1, d1);		// % 표시 원하면 %% 두 번 표기

	printf("%s\n", "대한민국");

	int* pa = &num;

	printf("pa=%p\n", pa);		// %p : 변수의 주소 출력

	int ch = 'r';
	printf("ch=%c\n", ch);		// %c 는 한 문자 
	return 0;
}