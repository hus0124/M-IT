/*
const : 상수로 지정한다. 변경 못 하도록 한정 지을 때
*/

#include <stdio.h>

void callFunction(const int* ptr)	// 함수 내에서 *ptr 상수 선언. 
{
	// *ptr = 50; 이런식으로 함수 내에서 값 변경 안됨.
}

void function2(int* const ptr)	//함수 내에서 ptr 상수 선언.
{
	// ptr = &num2; 이런 식으로 함수 내에서 포인터의 주소 변경 안됨
}

int main_constpointer(void)
{
	int num = 10;		// 현재 10으로 변수에 넣은 값을 뒤에서 변경하지 못하게 하고 싶다.
	num = 20;

	const int var1 = 20;		// 초기화 값을 뒤에서 수정하지 못하게 한다.
	//var1 = 30; 에러난다.
	
	const int* ptr = &num;		// 저장된 내용(포인터가 가리키는 값)을 변경 불가능하게 한다.
	// *ptr = 30; 에러난다

	int* const pnum = &num;		// 포인터의 주소 변경이 불가.
	// pnum = &var1; 에러난다

	callFunction(&num);

	function2(&num);

	return 0;
}