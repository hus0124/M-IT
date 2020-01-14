/*
구조체 배열과 포인터
기본 데이터 타입 : 정수형 실수형
배열 : int arr[10];
포인터 : int* ptr = &num;

구조체
struct point p[10];               구조체 배열
struct point* pptr = &p[0];       구조체 포인터

*/

#include <stdio.h>

struct point
{
	int xpos;
	int ypos;
};

int main_arraypoint(void)
{
	struct point p[2] = { 2, 4, 6, 8 } ;
	struct point* ptr = p;

	printf("p[0] (%d, %d)\n", p[0].xpos, p[0].ypos);		//변수의 멤버에 접근
	printf("p[0] (%d, %d)\n",(*ptr).xpos, (*ptr).ypos);
	printf("p[1] (%d, %d)\n", (ptr + 1)->xpos, (ptr + 1)->ypos);	//포인터를 사용해서 멤버에 접근 [ -> ] 기호 사용

	return 0;
}