/* 기본 데이터 타입 
정수 
실수
*/

#include <stdio.h>

int main_sizeofopertaor(void)
{
	// 데이터 파입의 크기 : sizeof() 연산자 -> 메모리의 점유 크기도 알 수 있다. 
	printf("char의 크기 : %d\n", sizeof(char));
	printf("short의 크기 : %d\n", sizeof(short));
	printf("int의 크기 : %d\n", sizeof(int));
	printf("long의 크기 : %d\n", sizeof(long));
	printf("long long의 크기 : %d\n", sizeof(long long));
	printf("float의 크기 : %d\n", sizeof(float));
	printf("double의 크기 : %d\n", sizeof(double));
	printf("long double의 크기 : %d\n", sizeof(long double));
	printf("int * 의 크기 : %d\n", sizeof(int*));

	char c = 128;		// 손실발생 -128~127 손실이란걸 알고 프로그래밍한다.
	
	short s = 124;		// -32xxx ~ 32xxx 표현 가능
	
	int num = 1234567;		//최소와 최대값 이상은 못 넣는다
							// 저장할 데이터의 크기를 예상해서 데이터 타입을 선정해야 함

	long long ll = 1234567890123;

	num = ll;

	float f1 = 0.1f;		//f float 의미 4 바이트 
	double d1 = 0.1;		// f를 생략하면 더블 8바이트, 실수 기본 데이터는 더블이다

	return 0;

}