/*
문제 2
0이상 100이하의 정수 중에서 짝수의 합을 출력하는 프로그램을 구현하되, do-while문 기반으
로 구현해보자. 참고로 덧셈의 결과는 2560이 되어야 한다.

*/

#include <stdio.h>

int main_dowhile(void)
{
	int i = 0;		// 반복문 실행. 0 2 4 6 8 ...100 식으로 숫자 증가
	int sum = 0;

	do 
	{
		sum += i;
		i += 2;		// 이게 sum 보다 뒤에 와야 결과 제대로 나온다. 
	} while (i <= 100);
	
	printf("%d", sum);


	return 0;
}