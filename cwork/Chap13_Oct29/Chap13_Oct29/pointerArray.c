/*
포인터 배열
배열 : 기본 데이터타입 (int, char, float, double) 동일한 데이터를 여러개 묶어서 저장
변수 : 데이터를 저장
포인터 변수 : 주소를 저장
*/

#include <stdio.h>
int main(void)
{
	int num1 = 20;
	int num2 = 30;
	int num3 = 40;

	// 배열 
	int narr[3] = { 20, 30, 40 };

	int* ptr1 = &num1;
	int* ptr2 = &num2;
	int* ptr3 = &num3;

	//포인터 변수로도 배열 만들 수 있다
	int* parr[3] = { &num1, &num2, &num3 };		//포인터 배열 : 주소 저장하는 배열

	char* com[4] = { "add", "sub", "mul", "div" };

	for (int i = 0; i < 3; i++)
	{
		printf("*parr[%d] = %d\n", i, *parr[i]);
	}
	for (int i = 0; i < 4; i++)
	{
		printf("*com[%d] = %s\n", i, com[i]);
	}
	return 0;
}