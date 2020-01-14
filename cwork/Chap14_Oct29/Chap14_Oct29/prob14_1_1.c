/*
문제 1. 변수 num에 저장된 값의 제곱을 계산하는 함수를 정의하고,
	이를 호출하는 main 함수를 작성해보자. 단, 여기서는 다음 두
	가지 형태로 함수를 정의해야 한다.
	- Call-by-value 기반의 SquareByValue 함수
	- Call-by-reference 기반의 SquareByReference 함수

	SquareByValue : return 값에 제곱을 반환
	SquareByReference : 매개변수의 값을 변경하도록 요구

*/

#include <stdio.h>

int squareByValue(int n)
{
	return n * n;
}

void squareByReference(int* n)
{
	//int tmp = *n;
	//*n = tmp * tmp;
	*n = *n * *n;
}

int main_1411(void)
{
	int num = 5;
	printf("%d의 제곱 = %d\n", num, squareByValue(num));
	squareByReference(&num);
	printf("제곱 : %d\n", num);  // num이 5 였는데 주소값 호출로 값이 변경된다.
	
	return 0;
}