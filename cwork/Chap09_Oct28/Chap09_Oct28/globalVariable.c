/*
전역변수 ; 어디서든지 접근 가능
크기(양) : 적당한 크기 -> 너무 많지 않게
*/

#include <stdio.h>

int num = 10;		// 파일내에서 어디든지 사용 가능 (여러 함수에서 접근할 경우)

void callFuncOne()
{
	num = 50;		// 전역변수이므로 어느 함수에서도 접근 가능.
	printf("num = %d\n", num);
	int var1 = num + 30;		// 지역변수. 하나의 함수내에서 임시로 할당해서 사용하는 경우
}
int main_globalvariable(void)
{
	printf("num = %d\n", num);		// num 이 전역변수이므로 접근 가능
	
	int num2 = 20;			      // num 이 지역변수. 전역변수와 같은 이름을 사용 안 하는게 좋다. 헷갈린다.
	printf("num = %d\n", num2);

	callFuncOne();

	return 0;
}