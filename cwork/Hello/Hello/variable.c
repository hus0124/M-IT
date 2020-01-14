#include <stdio.h>

int main6(void)
{
	// 5+6=11 출력을 하고 싶다면
	int num1 = 5;		// '=' : 대입연산자 (오른쪽에 있는 값을 왼쪽에 넣는다)
	int num2 = 6;		// 변수를 사용해서 중간 결과물을 저장한다 -> 목적 : 나중에 재사용하기 위해
	int sum = num1 + num2;
	
	printf("%d + %d = %d\n\n", num1, num2, sum);
	printf("5 + 6 = 11");
	return 0;
}
