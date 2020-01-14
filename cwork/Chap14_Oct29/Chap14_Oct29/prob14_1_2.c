/*
문제 2. 세 변수에 저장된 값을 서로 뒤바꾸는 함수를 정의해보자.
	예를 들어서 함수의 이름이 Swap3라 하면, 다음의 형태로 함수
	가 호출되어야 한다.
	Swap3(&num1, &num2, &num3);

	그리고 함수호출의 결과로 num1에 저장된 값은 num2에, num2에
	저장된 값은 num3에, 그리고 num3에 저장된 값은 num1에 저장되
	어야 한다.
	*/

#include <stdio.h>

int Swap3(int* a, int* b, int* c)
{
	int tmp = *c;
	*c = *b;
	*b = *a;
	*a = tmp;
}

int main_1412(void)
{
	int num1 = 1, num2 = 2, num3 = 3;
	int* pnum1 = &num1;
	int* pnum2 = &num2;
	int* pnum3 = &num3;

	printf("num1 = %d, num2 = %d, num3 = %d\n\n", num1, num2, num3);

	Swap3(&num1, &num2, &num3);

	printf("Swap3 후 결과 : \n\n");
	printf("num1 = % d, num2 = % d, num3 = % d\n\n", num1, num2, num3);

	return 0;
}