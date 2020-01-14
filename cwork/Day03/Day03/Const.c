/*
const : constant 상수의 약자
상수는 변하지 않는 수

*/

#include <stdio.h>
int add(const int a, const int b)
{
	int main_const(void)
		; {
		int num = 10;		//변수
		num = 20;		// 변수는 변경 가능

		const int Count = 20;			// 상수로 간주한다. 상수는 관례적으로 대문자, 단어 연결은 언더바 이용
		// Count = 30; 이 부분 에러. 상수 변경 못함

		int num2 = 40;
		int sum = add(num, num2);



		return 0;
	}
}