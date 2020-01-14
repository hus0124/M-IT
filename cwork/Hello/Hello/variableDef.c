#include <stdio.h>

int main_variableDef(void)
{
	int var1 = 1;	// 변수 선언과 함께 초기화
	int var2;		// 변수 선언 후
	var2 = 20;		// 어떤 목적으로 사용할 때 초기값을 할당
	int var3 = var2 + 30;
	int sum = var3 + var1;

	printf("결과 = %d\n", sum);
	return  0;
}
