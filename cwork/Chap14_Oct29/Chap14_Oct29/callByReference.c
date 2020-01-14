/*
Call-by-value 와 call-by-reference 의 차이

call-by-value : 함수로 호출하면서 매개변수로 값을 전달
*/

#include <stdio.h>

int add2(int n1, int n2)		// 매개변수 n1, n2 : 값이 복사된다.
{
	return n1 + n2;
}

void swap_by_value(int a, int b)		// a = 30, b = 40. 변수 값이 복사되어 전달됨.
{
	int tmp = a;
	a = b;
	b = tmp;						// 교환 과정 거쳐서 a = 40, b = 30 기대하지만...작동불가
}

void swap_by_reference(int* a, int* b)		// 포인터 (변수 a의 주소가 복사되서 전달됨)
{
	int tmp = *a;	//tmp:30
	*a = *b;		//*a=40 -> main함수의 변수 a의 값이 40
	*b = tmp;		//*b=30 -> b의 값 30
}

void function(double* dp1, double* dp2)
{
	*dp1 = 9.1;
	*dp2 = 7.3;
}
int main_callbyreference(void)
{
	int a = 30;
	int b = 40;
	int sum = add2(a, b);
	printf("합 : %d\n", sum);
	
	int* aptr = &a;
	int* bptr = &b;

	//함수를 호출하면서 main 함수에서 선언한 변수 a, b에 저장된 값을 교환하고 싶다면

	printf("a = %d, b= %d\n", a, b);		// a = 30, b = 40
	swap_by_value(a, b);
	printf("a = %d, b= %d\n", a, b);		// a = 40, b = 30

	swap_by_reference(&a, &b);		// 매개변수로 값을 전달하지 않고 변수의 주소를 전달.
	printf("a = %d, b= %d\n", a, b);		// a = 40, b = 30
	

	double d1 = 1.2;
	double d2 = 2.4;
	printf("d1=%f, d2=%f\n", d1, d2);
	function(&d1, &d2);
	printf("d1=%f, d2=%f\n", d1, d2);
	return 0;
}