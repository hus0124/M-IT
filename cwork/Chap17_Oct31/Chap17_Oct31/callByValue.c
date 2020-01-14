/*
call by value 함수 호출하면서 값을 넘겨주어도 이것은 함수에 복사하는 것
메인 함수 값을 변경할 수는 없다
*/
#include <stdio.h>

void swap1(int n1, int n2)
{
	printf("n1 = %d, n2= %d\n", n1, n2);
	int tmp = n1;
	n1 = n2;
	n2 = tmp;
	printf("n1 = %d, n2= %d\n", n1, n2);
	
}

int main_callbyvalue(void)
{
	int a = 10, b = 20;

	printf("a = %d, b= %d\n", a, b);

	swap1(a, b);

	printf("a = %d, b= %d\n", a, b);
	return 0;
}