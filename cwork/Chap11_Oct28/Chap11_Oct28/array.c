/*
1차원 배열 쓰는 법
데이터타입 배열 이름[ 크기 ]; (ex : int arrDim [ 8 ] )

데이터 타입 : int char double long long float short long double
배열 이름 : 변수 이름과 같은 작명을 한다.
크기 : 필요한 만큼 선언

*/

#include <stdio.h>

int main_array(void)	// 지역변수는 stack에 저장되고 초기화 하지 않으면 쓰레기 값이 저장된다.
{
	char carr[10];		// 문자입력, 통신할 때 "abc" (3처럼 보이지만) -> "abc\0" (실제로는 4) char은 1 자리를 \0가 차지함.
	short sarr[20];
	int narr[30] = { 10, 20 };		// narr[0] = 10, narr[1] = 20, narr[2~29] 는 0이 들어간다
	double darr[20];		// 쓰레기값(어떤 값인지 모름)

	narr[10] = 20;
	// 배열은 반복문 사용에 용이하다.

	for (int i = 0; i < 30; i++)
		narr[i] = 2 * i;
	// sizeof : 메모리에서 몇 바이트를 차지하느냐? 

	printf("narr 메모리 크기 = %d\n", sizeof(narr));
	
	for (int i = 0; i < 30; i++)
		printf("narr[%d] = %d\n", i, narr[i]);

	return 0;
}