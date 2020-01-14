/*
증가, 감소 : 변수 값을 1만큼 증가시키거나 감소시키는 방법
++num ; num = num + 1, 선증가 후연산
num++ ; num = num + 1, 선연산 후증가
*/

#include <stdio.h>

int main_Operatorupdown(void)
{
	int num = 20;
	int b;

	printf("num = %d\n", num);		// num = 20
	
	b = num++;		// b = 20
	printf("b = %d, num = %d\n", b, num);		// b = 20, num = 21

	b = ++num;		// b = 22
    printf("b = %d, num = %d\n", b, num);		// num = 22, b = 22
	


	return 0;

}