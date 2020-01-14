/* 함수 포인터
함수의 주소를 저장하고, 포인터를 사용해서 함수를 실행하는 방법 상의 주소를 저장
함수 : 
반환형 함수 이름(매개변수) {....}
함수 이름은 그 함수의 주소를 의미한다.
함수 포인터 
반환형 (*fptr) (매개변수)
*/

#include <stdio.h>

int add(int a, int b)
{
	return a + b;
}

int main_funcp(void)
{
	int a = 10, b = 20;
	int sum = add(a, b);
	printf("합 = %d\n", sum);

	//함수 포인터 사용 예 : 반환형 (*fptr)(매개변수)
	int (*fptr)(int, int) = add;		// add 함수의 주소 fptr 선언
	sum = fptr(30, 40);		// add(30, 40) 과 동일
	
	printf("함수 포인터 변수 이용한 합 = %d\n", sum);
	
	// 포인터 : 주소, 데이터 타입(int double 등)
	// 함수 포인터 : 주소, 반환형, 매개변수

	double d1 = 2.4;
	double* dptr = &d1;

	// *dptr = &a; 데이터 타입 달라서 불가능. 

	return 0;
}