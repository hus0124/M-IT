/*
call by reference 주소를 넘겨준다. 포인터 변수 사용
*/

#include <stdio.h>

void swap2(int* pa, int* pb)
{
	printf("*pa = %d, *pb= %d\n", *pa, *pb);
	
	int tmp = *pa;
	*pa = *pb;
	*pb = tmp;

	printf("*pa = %d, *pb = %d\n", *pa, *pb);
}

int main_callbyrefer(void)
{
	int a = 10, b = 20;
	printf("a = %d, b= %d\n", a, b);

	swap2(&a, &b);
		
	printf("a = %d, b= %d\n", a, b);

	return 0;
}